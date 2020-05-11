package com.validation;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PersonForm {

	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getCommPreference() {
		return commPreference;
	}

	public void setCommPreference(String commPreference) {
		this.commPreference = commPreference;
	}

	//@NotEmpty(message = "First Name is required")
	@NotEmpty
	@NotBlank
	@NotNull
	private String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@NotEmpty(message = "Last name is required")
	private String lastName;

	@NotEmpty(message = "Email is required")
	@Email
	private String email;

	@NotEmpty(message = "Phone number is required")
	@Pattern(regexp = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message = "Mobile number is invalid")
	private String mobilePhone;

	@Past
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthday;

	//@NotEmpty(message = "Communication preference is required")
	//private String commPreference;
	
	@NotEmpty(message = "Communication preference is required")
    @CommPreference
    private String commPreference;
    

}
