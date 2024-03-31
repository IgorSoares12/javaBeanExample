package br.com.igorsoares12.application;

import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.igorsoares12.PersonBean;

public class Application {

	public static void main(String[] args) {
		try {
			Gson gson =  new GsonBuilder().create();
			PersonBean person = new PersonBean();
			person.setId(2);
			person.setName("David"); 
			person.setAge(30);
			person.setEmail("david@example.com");
			
			String json = gson.toJson(person);
			System.out.println("JSON created: " + json);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Data read from JSON and deserialized with the Person class
		try (FileReader reader = new FileReader("C:\\temp\\Person.json")) {
			Gson gson =  new GsonBuilder().create();
			PersonBean person = gson.fromJson(reader, PersonBean.class);
			
			System.out.println("Data read from JSON and deserialized with the Person class: ");
			System.out.println("* Id: " + person.getId());
			System.out.println("* Name: " + person.getName());
			System.out.println("* Age: " + person.getAge());
			System.out.println("* E-mail: " + person.getEmail());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
