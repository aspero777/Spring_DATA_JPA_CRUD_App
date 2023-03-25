package org.example.spring.util;

import javax.validation.Validator;
import org.springframework.validation.Errors;
public interface PersonValidators extends Validator {
    boolean supports(Class<?> aClass);

    void validate (Object o, Errors errors);
}
