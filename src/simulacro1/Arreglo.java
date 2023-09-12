package simulacro1;

import javax.swing.JOptionPane;

public class Arreglo {
    public static void main(String[] args) {
        
        int tamano = 5;

      
        int[] arreglo1 = new int[tamano];
        int[] arreglo2 = new int[tamano];
        int[] arregloResultado = new int[tamano];

      
        for (int i = 0; i < tamano; i++) {
            String input = JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1) + " del primer arreglo:");
            arreglo1[i] = Integer.parseInt(input);
        }

    
        for (int i = 0; i < tamano; i++) {
            String input = JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1) + " del segundo arreglo:");
            arreglo2[i] = Integer.parseInt(input);
        }

      
        for (int i = 0; i < tamano; i++) {
            arregloResultado[i] = arreglo1[i] + arreglo2[i];
        }

  
        mostrarArreglo("Arreglo 1:", arreglo1);
        mostrarArreglo("Arreglo 2:", arreglo2);
        mostrarArreglo("Arreglo Resultante (suma de Arreglo 1 y Arreglo 2):", arregloResultado);
    }


    public static void mostrarArreglo(String mensaje, int[] arreglo) {
        String arregloStr = mensaje + "\n";

        for (int elemento : arreglo) {
            arregloStr += elemento + " ";
        }

        JOptionPane.showMessageDialog(null, arregloStr);
    }
}