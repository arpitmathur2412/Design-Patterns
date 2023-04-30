package com.Practice.Singleton;
import java.util.*;

public class ErrorManager {
    private static ErrorManager soleinstance;
    private List<String> errors;
    private ErrorManager(){
        errors=new ArrayList<>();
    }

    public static ErrorManager getInstance(){
        if(soleinstance==null) {
            soleinstance=new ErrorManager();
        }
        return soleinstance;
    }

    public void addError(String error){
        errors.add(error);
    }

    public void getErrors(){
        System.out.println(errors);
    }
}
