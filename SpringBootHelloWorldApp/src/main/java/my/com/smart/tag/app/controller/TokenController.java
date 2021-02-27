package my.com.smart.tag.app.controller;

import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class TokenController {

	@RequestMapping("/helloWorld")
	public String hello() {
		return "Hello World";
	}
}
