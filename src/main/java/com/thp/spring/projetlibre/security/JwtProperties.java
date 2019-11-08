package com.thp.spring.projetlibre.security;

public class JwtProperties {
	private JwtProperties() {
	}

	public static final String SECRET = "vintud@talan.com";
	public static final long EXPIRATION_TIME = 864_000_000;// 10 jours
//	public static final long EXPIRATION_TIME = 1_000;// 1 sec

	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String HEADER_STRING = "Authorization";

}
