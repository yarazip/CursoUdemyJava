package classe;

public class DataTeste {
	public static void main(String[] args) {
		//19/12/2004
		Data d1 =new Data();
//		niver.dia =19;
//		niver.mes =12;
//		niver.ano =2004;
		
		var d2 = new Data (19,12,2004);
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
			
		
	}

}
