package com.hudl.util;

import java.security.Key;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;



import com.hudl.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLECIT_WAIT = 10;
	
	public String getEncryptedKey(String password) {
		String encrypt = null;
		try {
		 String key = "Bar12345Bar12345";
		 Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
		 Cipher cipher = Cipher.getInstance("AES");
		 cipher.init(Cipher.ENCRYPT_MODE, aesKey);
		 byte[] encrypted = cipher.doFinal(password.getBytes());
		 Base64.Encoder encoder = Base64.getEncoder();
		 encrypt = encoder.encodeToString(encrypted);
		}catch(Exception e) {

		}
		 return encrypt;
		}

		public String decryptedKey (String encryptedKey) {
		String decrypted = null;
		try {
		Cipher cipher = Cipher.getInstance("AES");
		String key = "Bar12345Bar12345";
		Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
		   Base64.Decoder decoder = Base64.getDecoder();
		   cipher.init(Cipher.DECRYPT_MODE, aesKey);
		   decrypted = new String(cipher.doFinal(decoder.decode(encryptedKey)));
		   
		}catch (Exception e) {

		}
		      return decrypted;
		}

}
