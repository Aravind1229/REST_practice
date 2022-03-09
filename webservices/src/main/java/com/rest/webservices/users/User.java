package com.rest.webservices.users;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(description = "All details about the user")
@Entity
public class User {
@Id
@GeneratedValue
private Integer id;
@ApiModelProperty(notes="Name should have minimum 2 characters")
@Size(min = 2, message="Name should have minimum 2 characters")
private String name;
@ApiModelProperty(notes="Birth date should be in the past")
@Past
private Date birth_date;
@OneToMany(mappedBy = "user")
private List<Post> posts;

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
public List<Post> getPosts() {
	return posts;
}
public void setPosts(List<Post> posts) {
	this.posts = posts;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", birth_date=" + birth_date + "]";
}

}
