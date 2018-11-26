package com.jlc.online.ws;

import java.util.List;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class StudentClient {

	public static void main(String[] args) {

		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);

		// 1. Add the Student
		System.out.println("\n **** AllStudents****");
		String url1 = "http://www.jlcindia.com/services/student/add/";
		url1 = url1 + "sri" + "/" + "sri@jlc.com" + "/" + 11111;
		WebResource webres = client.resource(url1);
		webres.post();
		System.out.println("\n **** AllStudents****");

//		// 2.Get All the Students
		System.out.println("\n **** GET AllStudents****");
		String url2 = "http://www.jlcindia.com/services/student/getall";
		WebResource webres2 = client.resource(url2);
		Students sts = webres2.get(Students.class);
		List<StudentTO> list = sts.getStudent();
		System.out.println("No of Records :" + list.size());
		for (StudentTO sto : list) {
			System.out.println(sto);
		}
		System.out.println("\n ****Student By id****");
		// 3. Get student by sid
		
		
		String url3 = "http://www.jlcindia.com/services/student/getbyid/";
		url3 = url3 + "1";
		WebResource webres3 = client.resource(url3);
		StudentTO sto = webres3.get(StudentTO.class);
		System.out.println(sto);
	}

}