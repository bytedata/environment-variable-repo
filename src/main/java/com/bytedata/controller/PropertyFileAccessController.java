package com.bytedata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytedata.beans.PropertyAccessBean;
import com.bytedata.beans.PropertyAccessValue;

@RestController
@RequestMapping("/access")
public class PropertyFileAccessController {

	@Autowired
	PropertyAccessBean propertyAccessBean;
	@GetMapping("/file")
	public PropertyAccessValue accessPropertyFile() {
		return new PropertyAccessValue(propertyAccessBean.getAddress(), propertyAccessBean.getEmail());
	}
}
