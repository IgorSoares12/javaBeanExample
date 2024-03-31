package br.com.igorsoares12;

import java.io.Serializable;

/*
 * @author: Igor Soares
 * @return Return a example of Java Bean
 * @version 1.0
 */

public class PersonBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public PersonBean () {
		
	}
	
	private int id;
	private String name;
	private int age;
	private String email;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
