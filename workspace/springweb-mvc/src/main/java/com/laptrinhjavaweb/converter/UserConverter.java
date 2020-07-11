package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.entity.UserEntity;

@Component
public class UserConverter {

	public UserDTO toUserDTO(UserEntity userEntity) {
		UserDTO userDTO = new UserDTO();
		userDTO.setCreatedBy(userEntity.getCreatedBy());
		userDTO.setCreatedDate(userEntity.getCreatedDate());
		userDTO.setFullName(userEntity.getFullName());
		userDTO.setId(userEntity.getId());
		userDTO.setModifiedBy(userEntity.getModifiedBy());
		userDTO.setPassword(userEntity.getPassword());
		userDTO.setUserName(userEntity.getUserName());
		return userDTO;
	}
	
}
