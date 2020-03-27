
public class CalculadoraVer {

	private int num1,num2;

	public CalculadoraVer(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int suma() {
		int resultado=num1+num2;
		return resultado;
	}
	
	public int resta() {
		int resultado=num1-num2;
		return resultado;
	}
	
}
