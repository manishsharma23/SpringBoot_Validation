package com.validation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidGenderValidator implements ConstraintValidator<ValidGender, String> {
	private static final Map<String, List> availabeGender;
	static {
		availabeGender = new HashMap<>();
		availabeGender.put("male", Arrays.asList("male", "male"));
	}
	public String genederType;

	public String getGenederType() {
		return genederType;
	}

	public void setGenederType(String genederType) {
		this.genederType = genederType;
	}

	@Override
	public void initialize(ValidGender constraintAnnotation) {
		this.setGenederType(constraintAnnotation.genderType());
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		List gender = ValidGenderValidator.availabeGender.get(genederType);
		if (gender == null || gender.isEmpty()) {
			return false;
		}
		for (Object genderf : gender) {
			if (genderf.equals(value)) {
				return true;
			}
		}
		return false;
	}
}