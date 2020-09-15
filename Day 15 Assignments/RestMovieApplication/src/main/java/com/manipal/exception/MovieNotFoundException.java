package com.manipal.exception;

public class MovieNotFoundException extends RuntimeException {

	// we did RUNTIME Exception , to make it UNCHECKED.
	// so that we dont have to handle it by ourself.
		public MovieNotFoundException (String message) {
			super(message);
		}
		
}
