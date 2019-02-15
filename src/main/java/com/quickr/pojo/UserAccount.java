package com.quickr.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="userAccount")
public class UserAccount {
	@Id
	String emailId;
String userName;

long phoneNumber;
String password;
public UserAccount() {

	
}
public UserAccount(String emailId, String userName, long phoneNumber, String password) {

	this.emailId = emailId;
	this.userName = userName;
	this.phoneNumber = phoneNumber;
	this.password = password;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [emailId=" + emailId + ", userName=" + userName + ", phoneNumber=" + phoneNumber + ", password="
			+ password + "]";
}




}
