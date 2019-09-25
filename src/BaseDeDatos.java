import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
	
	public Dato agregar(Dato d) {
		System.out.print("Agrega un objeto a la base de datos emulada");
		return d;
	}
	
	public Dato eliminar(Dato d) {
		System.out.print("Elimina un objeto a la base de datos emulada");
		return d;
	}
	public List<Dato> listar(Dato d) {
		List<Dato> lista = new ArrayList<>();
		System.out.print("retorna una lista de objetos de la base de datos emulada");
		return lista;
	}
	public Dato modificar(Dato d) {
		System.out.print("Modifica un objeto a la base de datos emulada");
		return d;
	}

}
