package classe;
//import java.util.Date;

public class Equals {
	public static void main(String[] args) {
		 Usuarios u1 = new Usuarios();
		 u1.nome ="Pedro Silva";
		 u1.email = "pedro.silva@email.com";
		 
		 Usuarios u2 = new Usuarios();
		 u2.nome ="Pedro Silva";
		 u2.email = "pedro.silva@email.com";
		 
		 System.out.println(u1==u2);
		 System.out.println(u1.equals(u2));
		 System.out.println(u2.equals(u1));
	
		 System.out.println(new Data());
	}
}
