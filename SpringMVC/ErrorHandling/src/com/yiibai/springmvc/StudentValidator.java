package com.yiibai.springmvc;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Student.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "name", "required.name","Field name is required.");

        ValidationUtils.rejectIfEmpty(errors,
                "age","required.age","年龄不能为空！");

        ValidationUtils.rejectIfEmpty(errors,
                "id","required.id","编号不能为空");

    }
}