package be.proximus.app.mus.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import be.proximus.app.mus.dto.UdmResponse;

@RestController
public class IndexController {
	
	private static final Logger LOG = LoggerFactory.getLogger(IndexController.class);
	
	@Autowired
	@Qualifier("plainRestTemplate")
	private RestTemplate restTemplate;
	
	@GetMapping(value = "/")
	public ResponseEntity index() {
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@GetMapping(value = "/validateMobile")
	public ResponseEntity<UdmResponse> validateMobile() {
        UdmResponse quote = restTemplate.getForObject("http://jba-i1-int.web.bc:10007/jaxws-udm-bl-1.0/UDMRestService/scim/v2/AssignedProducts/?context=AP&type=MOBILE&value=0499102030", UdmResponse.class);
        LOG.info(quote.toString());
		return new ResponseEntity<UdmResponse>(quote, HttpStatus.OK);
	}

}
