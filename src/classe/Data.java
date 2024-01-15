package classe;

public class Data {
	
	int dia = 1;
	int mes = 1;
	int ano = 1970;
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d\n", dia, mes, ano);
	}
	
	// este tipo de método não funcionará em uma página de web, em uma aplicação de celular e etc.
	void DataFormatada() {
		System.out.print(obterDataFormatada());
	}
	
	Data(Integer dia, Integer mes, Integer ano){
		this.dia = dia;
		this.mes = mes;
		this.ano  = ano;		
	}
}
