package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.CategoryDTO;
import com.laptrinhjavaweb.entity.CategoryEntity;

@Component
public class CategoryConverter {

	public CategoryDTO toCategoryDTO(CategoryEntity categoryEntity) {
		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setCode(categoryEntity.getCode());
		categoryDTO.setCreatedBy(categoryEntity.getCreatedBy());
		categoryDTO.setCreatedDate(categoryEntity.getCreatedDate());
		categoryDTO.setId(categoryEntity.getId());
		categoryDTO.setModifiedBy(categoryEntity.getModifiedBy());
		categoryDTO.setModifiedDate(categoryEntity.getModifiedDate());
		categoryDTO.setName(categoryEntity.getName());
		return categoryDTO;
	}
	
}
