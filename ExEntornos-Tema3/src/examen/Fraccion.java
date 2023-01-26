package examen;

// Esta es la clase que define una fracción
/**
 * 
 * @author bsanchez
 *
 */
public class Fraccion {
	// Esta variable es el Numerador
	/**
	 * 
	 */
	private int numerador;

	// Esta variable es el Denominador
	/**
	 * 
	 */
	private int denominador;

	// Constructor por defecto
/**
 * 
 */
	public Fraccion() { // debe generar el valor neutro que es 0/1
		numerador = 0;
		denominador = 1;

	}

	// Constructor con parámetros
	/**
	 * 
	 * @param num
	 * @param den
	 */
	public Fraccion(int num, int den) {
		// debo evitar crear fracciones con 0 en el divisor
		this.numerador = num;
		if (den == 0) {
			this.denominador = 1;
		}else {
			this.denominador = den;
		}
		// devuelvo la fracci�n simplificada
		simplificar();
	}

	// Constructor copia
	/**
	 * 
	 * @param fracc
	 */
	public Fraccion(final Fraccion fracc) {
		numerador = fracc.numerador;
		denominador = fracc.denominador;
	}

	// getters y setters
/**
 * 
 * @param num
 */
	public void setNum(int num) {
		this.numerador = num;

	}
	//n se devuelve el numerador
/**
 * 
 * @return
 */
	public int getNum() {
		return numerador;

	}
	//Se devulve el denominador
/**
 * 
 * @param den
 */
	public void setDen(int den) {
		this.denominador = den;
	}
/**
 * 
 * @return
 */
	public int getDen() {
		return denominador;
	}

	// Cálculo del máximo común divisor por el algoritmo de Euclides
	
	/**
	 * 
	 * @return
	 */
	private int maxComunDivisor() {
		int absolutoNum = Math.abs(numerador); // valor absoluto del numerador
		int absolutoDeno = Math.abs(denominador); // valor absoluto del denominador
		if (absolutoDeno == 0) {
			
		}
		int simplificador;
		while (absolutoDeno != 0) {
			simplificador = absolutoNum % absolutoDeno;
			absolutoNum = absolutoDeno;
			absolutoDeno = simplificador;
		}
		return absolutoNum;
	}

	// método para simplificar fracciones
	/**
	 * 
	 */
	public void simplificar() {
		int numero = maxComunDivisor();
		numerador = numerador / numero;
		denominador = denominador / numero;
	}

	// Método toString
/**
 * 
 */
	public String toString() {
		return numerador + "/" + denominador;
		
		

	}

	// se suman las fracciones
	/**
	 * 
	 * @param fracc
	 * @return
	 */
	public Fraccion sumar(Fraccion fracc) {
		Fraccion aux = new Fraccion();
		int cruce1 = numerador * fracc.denominador;
		int cruce2 = denominador * fracc.numerador;
		aux.numerador = cruce1 + cruce2;
		aux.denominador = denominador * fracc.denominador;
		aux.simplificar();
		return aux;

	}

	// Se restan las fracciones

	/**
	 * 
	 * @param fracc
	 * @return
	 */
	public Fraccion restar(Fraccion fracc) {
		Fraccion aux = new Fraccion();
		int cruce1 = numerador * fracc.denominador;
		int cruce2 = denominador * fracc.numerador;
		aux.numerador = cruce1 - cruce2;
		aux.denominador = denominador * fracc.denominador;
		aux.simplificar();
		return aux;

	}

//Multiplicar fracciones

	/**
	 * 
	 * @param fracc
	 * @return
	 */
	public Fraccion multiplicar(Fraccion fracc) {
		Fraccion aux = new Fraccion();
		aux.numerador = numerador * fracc.numerador;
		aux.denominador = denominador * fracc.denominador;
		aux.simplificar();
		return aux;

	}

//Dividir fracciones

	/**
	 * 
	 * @param fracc
	 * @return
	 */
	public Fraccion dividir(Fraccion fracc) {
		Fraccion aux = new Fraccion();
		aux.numerador = numerador * fracc.denominador;
		aux.denominador = denominador * fracc.numerador;
		aux.simplificar();
		return aux;

	}

}
