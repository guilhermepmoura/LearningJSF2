package com.luv2code.jsf.validatedemo;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class StudentOne {
	private String firstName;
	private String lastName;
	private String email;
	private String postalCode;
	public int freePasses;
	public String phoneNumber;
	private String courseCode;
	
	
	public StudentOne() {
		
	}
	public int getFreePasses() {
		return freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	public void validateCourseCode(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		
		if(value == null) {
			return;
		}
		String data = value.toString();
		
		if(!data.startsWith("LUV")) {
			FacesMessage message = new FacesMessage("Course code must start with LUV"); 
			throw new ValidatorException(message);
		}
	}
	
	
	
	
	

}
