package com.example.ecommerce.mapper;

import com.example.ecommerce.domain.Category;
import com.example.ecommerce.domain.Product;
import com.example.ecommerce.domain.dto.category.CategoryRequestDTO;
import com.example.ecommerce.domain.dto.category.CategoryResponseDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-04T20:06:51-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryResponseDTO toResponseDTO(Category category) {
        if ( category == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String description = null;
        List<Product> products = null;

        id = category.getId();
        name = category.getName();
        description = category.getDescription();
        List<Product> list = category.getProducts();
        if ( list != null ) {
            products = new ArrayList<Product>( list );
        }

        CategoryResponseDTO categoryResponseDTO = new CategoryResponseDTO( id, name, description, products );

        return categoryResponseDTO;
    }

    @Override
    public Category toEntity(CategoryRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Category category = new Category();

        category.setName( dto.name() );
        category.setDescription( dto.description() );

        return category;
    }

    @Override
    public List<CategoryResponseDTO> toDTOList(List<Category> categories) {
        if ( categories == null ) {
            return null;
        }

        List<CategoryResponseDTO> list = new ArrayList<CategoryResponseDTO>( categories.size() );
        for ( Category category : categories ) {
            list.add( toResponseDTO( category ) );
        }

        return list;
    }

    @Override
    public void updateEntityFromDTO(CategoryRequestDTO dto, Category category) {
        if ( dto == null ) {
            return;
        }

        if ( dto.name() != null ) {
            category.setName( dto.name() );
        }
        if ( dto.description() != null ) {
            category.setDescription( dto.description() );
        }
    }
}
