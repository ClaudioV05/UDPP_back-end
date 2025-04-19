package com.udpp.app.domain.usecase;

import com.udpp.app.domain.constant.Directory;
import com.udpp.app.domain.constant.Symbol;
import com.udpp.app.port.input.DirectoryUseCasePort;
import com.udpp.app.port.input.UnicodeUseCasePort;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class DirectoryUseCase implements DirectoryUseCasePort {

    private final UnicodeUseCasePort unicodeService;

    public DirectoryUseCase(UnicodeUseCasePort unicodeService) {
        this.unicodeService = unicodeService;
    }

    @Override
    public void generateDefault() {
        String targetDirectory = this.getTargetDir();
        int lastSlashIndex = this.unicodeService.getLastIndexOf(targetDirectory, Symbol.DOUBLE_BACK_SLASH);
        String rootPath = (lastSlashIndex != -1) ? this.unicodeService.setSubstring(targetDirectory, 0, lastSlashIndex) : targetDirectory;
        this.generateAppDir(this.getAppDir(rootPath));
    }

    private void generateAppDir(Path rootApp) {
        try {
            Files.createDirectories(rootApp);
        } catch (IOException e) {
            // put log here
             System.err.println("Failed to create directory: " + e.getMessage());
        }
    }

    private Path getAppDir(String rootPath) {
        Path path = Paths.get(rootPath);
        return path.resolve(Directory.APP);
    }

    private String getTargetDir() {
        Path targetPath = Paths.get(System.getProperty(Directory.USER_DIRECTORY), Directory.TARGET);
        return targetPath.toAbsolutePath().toString();
    }
}