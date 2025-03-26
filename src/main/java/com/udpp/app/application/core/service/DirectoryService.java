package com.udpp.app.application.core.service;

import com.udpp.app.application.core.constant.DirectoryConst;
import com.udpp.app.application.core.constant.SymbolConst;
import com.udpp.app.application.ports.DirectoryServicePort;
import com.udpp.app.application.ports.UnicodeServicePort;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class DirectoryService implements DirectoryServicePort {

    private final UnicodeServicePort unicodeService;

    public DirectoryService(UnicodeServicePort unicodeService) {
        this.unicodeService = unicodeService;
    }

    @Override
    public void generateDefault() {
        String targetDirectory = this.getTargetDir();
        int lastSlashIndex = this.unicodeService.getLastIndexOf(targetDirectory, SymbolConst.DOUBLE_BACK_SLASH);
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
        return path.resolve(DirectoryConst.APP);
    }

    private String getTargetDir() {
        Path targetPath = Paths.get(System.getProperty(DirectoryConst.USER_DIRECTORY), DirectoryConst.TARGET);
        return targetPath.toAbsolutePath().toString();
    }
}