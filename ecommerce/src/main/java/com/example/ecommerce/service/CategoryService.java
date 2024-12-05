package com.example.ecommerce.service;

import com.example.ecommerce.domain.Category;
import com.example.ecommerce.domain.dto.category.CategoryRequestDTO;
import com.example.ecommerce.domain.dto.category.CategoryResponseDTO;
import com.example.ecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryResponseDTO create(CategoryRequestDTO requestDataDTO) {
        Category category = new Category();
        category.setName(requestDataDTO.name());
        category.setDescription(requestDataDTO.description());

        Category newCategory = categoryRepository.save(category);
        return new CategoryResponseDTO(newCategory.getId(), newCategory.getName(), newCategory.getDescription(), newCategory.getProducts());
    }

    public CategoryResponseDTO getById(Long id) {
        Category category = categoryRepository.findById(id).orElse(null);
        assert category != null;
        return new CategoryResponseDTO(category.getId(), category.getName(), category.getDescription(), category.getProducts());
    }

    public List<CategoryResponseDTO> list() {
        List<Category> categories = categoryRepository.findAll();
        List<CategoryResponseDTO> categoriesDTO = new ArrayList<>();

        for (Category category : categories) {
            CategoryResponseDTO categoryDTO = new CategoryResponseDTO(category.getId(), category.getName(), category.getDescription(), category.getProducts());
        }

        return categoriesDTO;
    }

    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }

    public CategoryResponseDTO update(Long id, CategoryRequestDTO body) {
        Category category = categoryRepository.findById(id).orElse(null);
        if (category != null) {
            category.setName(body.name());
            category.setDescription(body.description());
            categoryRepository.save(category);
            return new CategoryResponseDTO(category.getId(), category.getName(), category.getDescription(), category.getProducts());
        }
        return null;
    }

//    public associateProductInCategory
//    public removeProductOfCategory
}
