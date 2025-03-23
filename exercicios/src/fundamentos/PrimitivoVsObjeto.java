package fundamentos;

//import java.sql.Wrapper;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		
		String s = new String ("Texto");
		s.toUpperCase();
		
		//wrappers quer dizer aquilo que envolve
		//são a versão objeto do tipo primitivo
		int a =123;
		System.out.println(a);
	}
	
}
