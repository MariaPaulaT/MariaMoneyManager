package com.app.moneyManager.mariaMoneyManager.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private String lastName;
	@Column
	private String mail;
	@Column
	private String password;
	
	protected User() {
		
	}
	
	public User(int id, String name, String lastName, String mail, String password) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.mail = mail;
		this.password = password;
	}

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
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", lastName=" + lastName + ", mail=" + mail + ", password="
				+ password + "]";
	}
	
}
