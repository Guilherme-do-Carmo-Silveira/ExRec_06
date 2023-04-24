package controller;

public class RetornoController {

	public RetornoController() {
		super();
	}

	public int CalculaDig(String[] vt, int tamvt, String var, int qtd) {
		if(tamvt == 0) {
			return qtd;
		}else {
			tamvt--;
			if(vt[tamvt].contains(var)) {
				qtd++;
			}
		}
		return CalculaDig(vt, tamvt, var, qtd);
	}
}