package com.mostafa.exceptions;

public class EverNumberExceptions extends Exception{
	@Override
    public String getMessage() {
        return "You cannot input an even number.";
    }

}