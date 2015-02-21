package com.ashim.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstPageController
{
	@RequestMapping("/first.html")
	public String showFirstPage(Map<String, Object> map)
	{
		return "first";
	}
}