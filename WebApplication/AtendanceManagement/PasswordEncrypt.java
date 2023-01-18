package controller;

import java.security.SecureRandom;

public class PasswordEncrypt {
	public static void main(String[] args) {
	public String passEncrypt(String password) {
		
	
	String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
	byte[] salt = new byte[16];
	new SecureRandom().nextBytes(salt);
	String saltString = Base64.getEncoder().encodeToString(salt);
	}
}
}