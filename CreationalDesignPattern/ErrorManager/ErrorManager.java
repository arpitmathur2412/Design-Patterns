package com.CreationalDesignPattern.ErrorManager;
import java.util.ArrayList;
import java.util.List;

public class ErrorManager {
    private static ErrorManager soleInstance;
    private List<String> errors;

    private ErrorManager() {
        errors = new ArrayList<>();
    }

    public static ErrorManager getInstance() {
        if (soleInstance == null) {
            soleInstance = new ErrorManager();
        }
        return soleInstance;
    }

    public void addError(String error) {
        errors.add(error);
    }

    public List<String> getErrors() {
        return errors;
    }
}
