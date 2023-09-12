package simulacro1;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Registrar {
    public static void mostrarInformacion(ArrayList<Persona> personas) {
        int totalPersonas = personas.size();
        int mayoresDeEdad = 0;
        int menoresDeEdad = 0;
        
        for (int i = 0; i <totalPersonas; i++) {
        	Persona persona = personas.get(i);
        	if(persona.getEdad()>= 18) {
        		mayoresDeEdad++;
        	}else {
        		menoresDeEdad++;
        	}
        }
        
        JOptionPane.showMessageDialog(null, "Total personas registradas: " + totalPersonas +
                "\nCantidad de personas ingresadas: " + totalPersonas +
                "\nCantidad de personas mayores de edad: " + mayoresDeEdad +
                "\nCantidad de personas menores de edad: " + menoresDeEdad);
}
}

class Persona{
	private String nombre;
	private String documento;
	private int edad;
	private String Profesion;
	
	public Persona(String nombre, String documento, int edad, String Profesion) {
		this.nombre = nombre;
		this.documento = documento;
		this.edad = edad;
		this.Profesion = Profesion;
	}
	
	public int getEdad() {
		return edad;
	}
}