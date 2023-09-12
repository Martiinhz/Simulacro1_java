package simulacro1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ModelRegis {

	 public static void main (String [] args) {
		 ArrayList<Persona> personas = new ArrayList<>();
		 
		 while(true) {
			 agregarPersona(personas);
			 int opcion= JOptionPane.showConfirmDialog(null, "Quiere ingresar otra persona? ", null, JOptionPane.YES_NO_OPTION);
			 if(opcion!=JOptionPane.YES_NO_OPTION) {
				 break;
			 }
		 }
		 
		 Registrar.mostrarInformacion(personas);
	 }
	 
	 public static void agregarPersona(ArrayList<Persona> personas) {
		 String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona");
		 String documento = JOptionPane.showInputDialog("Ingrese el documento de la persona");
		 int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona"));
		 String profesion = JOptionPane.showInputDialog("Ingrese la profesion de la persona");
		 
		 personas.add(new Persona(nombre,documento,edad,profesion));
}
}
