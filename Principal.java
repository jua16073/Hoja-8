/** 
 * @author Rodrigo Juarez - 16073
 * @author Jose Pablo Viana - 16091
 * @since 03/04/2017
 * @version 1.0
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

public class Principal {
	
	VectorHeap<String> vect= new VectorHeap<String>();
	Pacientes<String> paciente;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Principal x= new Principal();
		x.lectura();
		x.Ordenar();

	}
	
	public String lectura() throws IOException{
		String a = ""; 
	
		JFileChooser archivo = new JFileChooser();
		archivo.showOpenDialog(null);
		BufferedReader reader = new BufferedReader(new FileReader(archivo.getSelectedFile().getPath()));
		String pal;
		
		while(reader.ready()){
			while ((pal=reader.readLine())!= null){
				a=a+" "+pal;
				llenar(pal);
				
			}
			//String w=tree.find(new Association<String, String>("yes","si")).toString();
			return a;
			
		}
		return a;
	}
	
	public void llenar(String pal){
		String [] palabras= pal.split(",");
		paciente = new Pacientes<String>(palabras[0],palabras[1], palabras[2]);
		vect.add(paciente.toString());
			
	}
	
	public void Ordenar(){
		String respuesta;
		int x = vect.size();
		
		for (int i=0; i<x; i++){
			respuesta = vect.remove();
			int y = i +1;
			System.out.println("Paciente numero "+ y + ": "+ respuesta);
		}
	}
	

}
