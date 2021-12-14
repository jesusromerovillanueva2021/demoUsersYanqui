package com.example.demoUsersYanqui.utils;

import org.springframework.beans.BeanUtils;

import com.example.demoUsersYanqui.dto.YanquiUserDto;
import com.example.demoUsersYanqui.entity.YanquiUser;

public class AppUtils {
	public static YanquiUserDto entityToDto(YanquiUser yanquiUser) {
		YanquiUserDto yanquiUserDto=new YanquiUserDto();
		BeanUtils.copyProperties(yanquiUser, yanquiUserDto);
		return yanquiUserDto;
	}
	
	public static YanquiUser dtoToEnity(YanquiUserDto yanquiUserDto) {
		YanquiUser yanquiUser=new YanquiUser();
		BeanUtils.copyProperties(yanquiUserDto, yanquiUser);
		return yanquiUser;
	}
}
