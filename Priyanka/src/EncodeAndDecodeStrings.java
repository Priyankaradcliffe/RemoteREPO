import java.io.IOException;

import org.apache.commons.codec.binary.Base64;

public class EncodeAndDecodeStrings {
	public static void main(String[] args) throws InterruptedException, IOException {
	
		String str = "p34";
		byte[] encodedstring = Base64.encodeBase64(str.getBytes());
		System.out.println("Encoded String is " +new String(encodedstring));
	
		byte[] decodedstring = Base64.decodeBase64(encodedstring);
		System.out.println("Decoded String is " +new String(decodedstring));
	}
	
	
	
	
}
