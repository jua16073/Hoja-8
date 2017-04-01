
public class Pacientes<K> implements Comparable<K>{
	String nombre;
	String enfermedad;
	String grado;
	
	
	Pacientes (String nombre, String enfermedad, String grado){
		this.nombre=nombre;
		this.enfermedad= enfermedad;
		this.grado= grado;
	}
	
	@Override
	public int compareTo(K o) {
		return grado.compareTo(o.toString());
	}
	
}
