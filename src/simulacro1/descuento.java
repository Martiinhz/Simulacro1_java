package simulacro1;
import java.util.HashMap;

import javax.swing.JOptionPane;
public class descuento {
	public static void main (String [] args) {
		HashMap<String, Double> descuentos = new HashMap<>();
		HashMap<String, Double> tablaDescuentos = new HashMap<>();
		
		tablaDescuentos.put("Estrato 1 y 2", 0.02);
		tablaDescuentos.put("Estrato 3 y 4", 0.04);
		tablaDescuentos.put("Estrato 5", 0.08);
		tablaDescuentos.put("Estrato 6", 0.1);
		
		while(true) {
			String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
			if(nombre==null) {
				break;
			}
			
			int estrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su estrato"));
			
			if(tablaDescuentos.containsKey(estrato));{
				double porcentajeDescuento = tablaDescuentos.get(estrato);
				
				double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario parcero"));
				
				double descuento = salario * porcentajeDescuento;
				descuentos.put(nombre, descuento);
			}
				JOptionPane.showConfirmDialog(null, "Estrato no valido");
			}
			
		}
		
	}

