package calculadora;

/** Esta clase contiene la implementación final de cada operación disponible en la calculadora.
 * Debe contener un método público de instancia por cada método de la interfaz CalculadoraGUI.ICalculadora.
 * Para evitar confusiones, se recomienda que cada uno de los métodos citados anteponga 'implementacion' al
 * nombre del método de CalculadoraGUI.ICalculadora. Por ejemplo: si se desea crear el método que implementa
 * la suma, su nombre en esta clase será 'implementacionSumar'.
 */
public class OperacionesCalculadora {
	private double ur;
	private double mem;

	public double implementacionSumar(double operando1, double operando2) {
		ur = operando1 + operando2;
		return ur;
	}
	public double implementacionRestar(double operando1, double operando2) {
		ur = operando1 - operando2;
		return ur;
	}
	public double implementacionMultiplicar(double operando1, double operando2) {
		ur = operando1 * operando2;
		return ur;
	}
	public double implementacionDividir(double operando1, double operando2) throws Exception {
		if(operando2 == 0)
			if(operando1 == 0) throw new Exception("Indeterminacion");
			else throw new Exception("Indeterminacion");
		ur = operando1 / operando2;
		return ur;
	}
	double implementacionUR() { return ur; }
	void implementacionML() { mem = 0; }
	void implementacionMA() { mem += ur; }
	double implementacionMO() { return mem; }
	double implementacionCuadrado(double operando) {
		ur = operando * operando;
		return ur;
	}

}
