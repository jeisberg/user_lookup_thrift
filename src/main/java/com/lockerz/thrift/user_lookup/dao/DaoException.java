package com.lockerz.thrift.user_lookup.dao;

public class DaoException extends Exception {

	private static final long serialVersionUID = 1L;

	public DaoException() {
		// call parent
		super();
	}
	
	public DaoException(String message) {
		// call parent
		super(message);
	}
}
