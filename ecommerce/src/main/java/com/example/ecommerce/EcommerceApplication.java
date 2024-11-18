package com.example.ecommerce;

import com.example.ecommerce.domain.Category;
import com.example.ecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	@Autowired
	CategoryRepository categoryRepository;

	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("----Teste Repository----");
//			Category category = new Category();
//			category.setName("Informática");
//			category.setDescription("IFRN.com");
//			categoryRepository.save(category);
			List<Category> categories = categoryRepository.findAll();
			for (Category category : categories) {
				System.out.println(category.getName());
			}
		};
	};
}
