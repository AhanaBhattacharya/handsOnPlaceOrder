package com.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OderPlaceController {
	@Autowired
	userRepository repo;
	
	
	@GetMapping("/hey")
	public String hello() {
		return "wow";
	}
	
	/*@ResponseBody
	@PostMapping( "/order/{token}")
	public void calculateDiscount(@RequestBody(required = false) Response request) {
		JwtUtil util = new JwtUtil();
		if(util.validateToken(request.getJwtToken(), request.getUsername())) {
			System.out.println("verified");
			orderPlace();
		}
}*/
	//@ResponseBody
	@GetMapping("/order/{token}")
	public String cal(@PathVariable String token) {
		System.out.println(token);
		//hello();
		return "wow";
	}

    @GetMapping
	private void orderPlace() {
		// TODO Auto-generated method stub
		System.out.println("placed");
	}
}