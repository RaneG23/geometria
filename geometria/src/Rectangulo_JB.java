
/**
 * @author Jose A. Bonmatí Garrido
 * @version 1.2
 *
 */
public class Rectangulo_JB extends FiguraGeometrica_JB {
	private double l1;
	private double l2;
	
	/**
	 * @param tipoFigura El tipo de figura
	 * @param lG El lado grande del rectangulo
	 * @param lP El lado pequeño del rectangulo
	 */
	public Rectangulo_JB(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	@Override
	public double area() {
		return l1 * l2;
	}
	
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
