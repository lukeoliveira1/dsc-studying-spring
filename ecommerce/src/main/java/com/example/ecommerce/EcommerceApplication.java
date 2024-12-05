package com.example.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

//	@Autowired
//	CategoryRepository categoryRepository;

//	@Bean
//	CommandLineRunner commandLineRunner() {
//		return args -> {
//			System.out.println("----Teste Repository----");
//			Category category = new Category();
//			category.setName("Informática");
//			category.setDescription("IFRN.com");
//			categoryRepository.save(category);
//			List<Category> categories = categoryRepository.findAll();
//			for (Category category : categories) {
//				System.out.println(category.getName());
//			}
//		};
//	};
}
