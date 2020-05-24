package com.itsb.nuucells;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class AppOverviewController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String sayHello() {
		return "Hello!";
	}

}
