package com.rest.webservices.users;

import java.util.Date;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {
private Integer id;
@Size(min = 2, message="Name should have minimum 2 characters")
private String name;
@Past
private Date birth_date;

public User(Integer id, String name, Date birth_date) {
	super();
	this.id = id;
	this.name = name;
	this.birth_date = birth_date;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getBirth_date() {
	return birth_date;
}
public void setBirth_date(Date birth_date) {
	this.birth_date = birth_date;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", birth_date=" + birth_date + "]";
}

}
