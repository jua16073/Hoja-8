/**
 * Esta es la clase encargada de manejar la informacion de los pacientes que ingresaran al hospital 
 * @author Jose Pablo Viana - 16091
 * @author Rodrigo Juarez - 16073
 * @since 03/04/2017
 * @version 1.0
 * @param K
 */
public class Pacientes<K> implements Comparable<K>{
	String nombre;
	String enfermedad;
	String grado;
	
	
	/**
	 * Constructor con parámetros de la clase Paciente 
	 * @param nombre
	 * @param enfermedad
	 * @param grado
	 */
	Pacientes (String nombre, String enfermedad, String grado){
		this.nombre=nombre;
		this.enfermedad= enfermedad;
		this.grado= grado;
	}
	
	/**
	 * Get del atributo grado 
	 * @return grado
	 */
	public String getGrado(){
		return this.grado;
	}
	
	/**
	 * Método que compara lexicográficamente que valor es mayor 
	 */
	@Override
	public int compareTo(K o) {
		return grado.compareTo(o.toString());
	}
	
	/**
	 * Método toString de la clase Paciente
	 */
	public String toString(){
		return grado + " " + enfermedad + " " + nombre;
	}
	
}
