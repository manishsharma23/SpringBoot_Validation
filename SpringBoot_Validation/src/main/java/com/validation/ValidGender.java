package com.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = { ValidGenderValidator.class })
public @interface ValidGender {

	String genderType();

	String message() default "Gender is not valid";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
