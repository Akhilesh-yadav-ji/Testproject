package com.jpa.test;

import javax.annotation.processing.Generated;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan

public class User {
	@Id
	@Generated(value= Generated.AUTO)
	private int id;

}
