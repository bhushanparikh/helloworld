/**
 * 
 */
package com.aikwarium.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bhushan
 *
 */
@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello")
	public String sayHello() {
		return "Hello World!";
	}
}
