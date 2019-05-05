package com.sathya.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="employees")

public class Employee {
@Id
private int id;
@Column(length=12)

private String name;
@Lob
private Blob image;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Blob getImage() {
	return image;
}
public void setImage(Blob image) {
	this.image = image;
}




}
