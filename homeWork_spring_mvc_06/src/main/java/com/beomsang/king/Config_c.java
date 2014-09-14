package com.beomsang.king;

import java.util.ArrayList;

import model_p.Student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config_c {
	
	@Bean
	ArrayList<Student> list()
	{
		ArrayList<Student> list = new ArrayList<>();
		/*
		list.add(new Student("장동건", 88, 1));
		list.add(new Student("장북건", 68, 2));
		list.add(new Student("장남건", 79, 3));
		list.add(new Student("장서건", 91, 4));
		list.add(new Student("장중건", 55, 5));
		*/
		return list;
	}
}
