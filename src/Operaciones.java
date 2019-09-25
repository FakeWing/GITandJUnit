
public class Operaciones {

	// trabajando en la rama slave

	public int sumar(int A, int B) {
		if (A == 0 || B == 0) {
			return 0;
		} else {
			return A + B;
		}

	}

	public int restar(int A, int B) {
		if (B > A) {
			return 0;
		} else {
			return A - B;
		}

	}

	public int multiplicar(int A, int B) {
		return A * B;
	}

	public int dividir(int A, int B) {
		return A / B;
	}

}
