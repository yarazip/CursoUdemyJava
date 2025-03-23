package fundamentos;

public class WrapperAula2 {
	public static void main(String[] args) {
		
		
		//byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 1000; //int
		Long l = 1000000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i *3);
		System.out.println(l /3.0);
		
		Float f = 123.10f;
		System.out.println(f);
		
		Double d = 1233.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c + "...");
		
		

		
	}

}
