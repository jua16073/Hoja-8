import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Principal {
	VectorHeap<String> vect= new VectorHeap();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Principal x= new Principal();
		System.out.println(x.lectura());

	}
	
	String lectura() throws IOException{
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
		String palabras[]= pal.split(",");
		int x=0;
		while(x<3){
			vect.add(palabras[x]);
			System.out.println(palabras[x]);
			x++;
		}
	}

}
