package com.udpp.app.domain.usecase;

import com.udpp.app.port.input.ValidationUseCasePort;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ValidationUseCase implements ValidationUseCasePort {

    @SuppressWarnings({"deprecation"})
    @Override
    public List<String> getErrorMessages(BindingResult bindingResult) {
        List<String> result = new ArrayList<>();

        if (this.existErrorMessages(bindingResult)) {
            result = bindingResult.getAllErrors()
                    .stream()
                    .map(error -> {
                        var defaultMessage = error.getDefaultMessage();
                        if (error instanceof FieldError) {
                            var fieldError = (FieldError) error;
                            return String.format("%s %s", fieldError.getField(), defaultMessage);
                        } else {
                            return defaultMessage;
                        }
                    })
                    .collect(Collectors.toList());
        }

        return result;
    }

    private boolean existErrorMessages(BindingResult bindingResult) {
        return bindingResult.hasErrors();
    }
}