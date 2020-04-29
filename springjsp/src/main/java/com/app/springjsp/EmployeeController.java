package com.app.springjsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class EmployeeController {
	
	@RequestMapping("/Welcome")
	@ResponseBody
	public String Welcome()
	{
		return "welcome";
	}

}
