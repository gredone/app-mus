package be.proximus.app.mus.controller;


import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.google.common.util.concurrent.RateLimiter;

import be.proximus.app.mus.constants.ResultConstants;
import be.proximus.app.mus.dto.UpdateMobileRequestDto;
import be.proximus.app.mus.dto.UpdateMobileResponseDto;
import be.proximus.app.mus.entity.Session;
import be.proximus.app.mus.service.SessionService;

@RestController
public class UpdateMobileController extends ResponseEntityExceptionHandler {
	
	private static final Logger LOG = LoggerFactory.getLogger(UpdateMobileController.class);
	
	@Autowired
	private RateLimiter rateLimiter;
	
	@Autowired
	private SessionService sessionService;
	
	@PostMapping(value="/updateMobile", produces = { "application/xml", "text/xml" }, consumes = MediaType.ALL_VALUE)
	public UpdateMobileResponseDto updateMobile(@RequestBody @Valid UpdateMobileRequestDto updateMobileRequest){
		if(rateLimiter.tryAcquire()){
			LOG.warn("lock is free");
		} else {
			LOG.warn("you can't exceed 7 requests per second, please wait");
			rateLimiter.acquire();
			LOG.warn("lock became free");
		}
		UpdateMobileResponseDto updateMobileResponse = null;
		try{
			LOG.info("new updateMobile request : " + updateMobileRequest);
			java.util.Optional<Session> session = sessionService.findBySessionId(updateMobileRequest.getSessionId());
			if(session.isPresent()){
				LOG.info("updateMobile - MSISDN "+session.get().getMsisdn()+""
						+ " was found and has subscription for the session-id :"+session.get().getSessionId());
					updateMobileResponse = new UpdateMobileResponseDto(
							ResultConstants.OPERATION_SUCCESSFUL, 
							session.get().getMsisdn(), 
							session.get().getSessionId());
			} else {
				LOG.error("updateMobile - cannot find this session id : "+updateMobileRequest.getSessionId());
				updateMobileResponse = new UpdateMobileResponseDto(
						ResultConstants.MSISDN_UNAVAILABLE, 
						null, 
						updateMobileRequest.getSessionId());
			}
		} catch (Exception e){
			LOG.error("updateMobile - "+updateMobileRequest+" - "+e.getMessage());
			return new UpdateMobileResponseDto(
					ResultConstants.INTERNAL_OPERATOR_ERROR, 
					null, 
					updateMobileRequest.getSessionId());
		}
		return updateMobileResponse;
	}
}


