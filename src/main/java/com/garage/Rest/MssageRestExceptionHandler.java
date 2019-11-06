package com.garage.Rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.garage.Controllers.AdminController;
import com.garage.Controllers.LoginController;
import com.garage.Controllers.UserController;
import com.garage.Controllers.ex.ConnectionException;
import com.garage.Rest.ex.InvalidListException;
import com.garage.Rest.ex.InvalidLoginException;
import com.garage.Rest.ex.SystemMalfunctionException;

/**
 *  Created by raz samari on 03.11.2019.
 */
@ControllerAdvice(assignableTypes = { LoginController.class,AdminController.class,UserController.class})
public class MssageRestExceptionHandler {
	
	@ExceptionHandler(InvalidLoginException.class)
	@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
	@ResponseBody
	public MssageEroorRsponse handleUnauthrized(InvalidLoginException ex) {
		return MssageEroorRsponse.now(HttpStatus.UNAUTHORIZED,String.format("unauthroized : %s", ex.getMessage()));
	}
	
	@ExceptionHandler(ConnectionException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ResponseBody
	public MssageEroorRsponse handleUnauthrized(ConnectionException ex) {
		return MssageEroorRsponse.now(HttpStatus.BAD_REQUEST,String.format("bad request: %s", ex.getMessage()));
	}

	@ExceptionHandler(InvalidListException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ResponseBody
	public MssageEroorRsponse handleUnauthrized(InvalidListException ex) {
		return MssageEroorRsponse.now(HttpStatus.BAD_REQUEST,String.format("bad request : %s", ex.getMessage()));
	}
	
	@ExceptionHandler(SystemMalfunctionException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ResponseBody
	public MssageEroorRsponse  handleUnauthrized(SystemMalfunctionException ex) {
		return MssageEroorRsponse .now(HttpStatus.BAD_REQUEST,String.format("bad request: %s", ex.getMessage()));
	}
	
}
