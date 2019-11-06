package com.garage.Rest.ex;

/**
 *  Created by raz samari on 03.11.2019.
 */
@SuppressWarnings("serial")
public class SystemMalfunctionException extends Exception{

	public SystemMalfunctionException(String msg) {
		super(msg);
	}
}
