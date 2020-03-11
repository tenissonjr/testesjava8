package br.usp.calculosalario.util;

import java.math.BigDecimal;

public class CalculadoraSalarioUtil {

	private static final int NUMERO_CASAS_DECIMAS = 2;
	
	public static BigDecimal ZERO = arred(BigDecimal.ZERO);

	public static BigDecimal arred(BigDecimal valor) {
		if (valor!=null) {
			return valor.setScale(NUMERO_CASAS_DECIMAS, BigDecimal.ROUND_HALF_UP);
		}
		
		return valor;
	}
	
	public static BigDecimal arred(double valor) {
			return arred(toBigDecimal(valor));
	}

	
	public static BigDecimal toBigDecimal(double d) {
		return arred( BigDecimal.valueOf(d));
	}	
	
	public static BigDecimal adicionaDecimo(BigDecimal valor) {
		return arred( valor.add(BigDecimal.valueOf(0.01)));
	}	

	public static BigDecimal subtraiDecimo(BigDecimal valor) {
		return arred( valor.subtract(BigDecimal.valueOf(0.01)));
	}	
	
}
