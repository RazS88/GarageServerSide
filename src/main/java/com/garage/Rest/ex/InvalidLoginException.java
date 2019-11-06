package com.garage.Rest.ex;

/**
 *  Created by raz samari on 03.11.2019.
 */
@SuppressWarnings("serial")
public class InvalidLoginException extends Exception {
    public InvalidLoginException(String msg) {
        super(msg);
    }
}
