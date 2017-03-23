package com.spring.pack07.valid;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by zhangjinye on 2017/3/23.
 */
public class PersonValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "name", "名称不能为空");
        Person p = (Person) target;
        if (p.getAge() < 0) {
            e.rejectValue("age", "年龄不能<0");
        } else if (p.getAge() > 100) {
            e.rejectValue("age", "年龄不能>100");
        }
    }
}
