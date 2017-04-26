/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajogrupal;

import Excepciones.ExcepcionDiego;
import Excepciones.Exepcion_grupal;
import Interfaz.Anticonceptivos;
import Interfaz.Proteinas;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class TrabajoGrupal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion;
        Scanner SCMenu= new Scanner(System.in);
        System.out.print("Medicina\n"+"Seleccione una opción: \n"+"1)Proteinas\n"+"2)Anticonceptivo\n"+"Ingrese su opcion: " );
        opcion=SCMenu.nextInt();
        Proteinas proteina=new Proteinas();
        Anticonceptivos anticonceptivo=new Anticonceptivos();
        Scanner informacionGlobal= new Scanner(System.in);
        System.out.println("Ingrese el codigo del medicamento: ");
        String idMedicamento = informacionGlobal.nextLine();
        System.out.println("Ingrese el nombre del medicamento: ");
        String Nombre = informacionGlobal.nextLine();
        System.out.println("Ingrese el valor unitario de este medicamento: ");
        double valorUnitario = informacionGlobal.nextDouble();
        System.out.println("Ingrese la cantidad total a comprar: ");
        int Cantidad = informacionGlobal.nextInt();
        switch(opcion){
            case 1:
                try {
                    Scanner scProteinas= new Scanner(System.in);
                    System.out.println("Este producto es para ganar musculo: ");
                    String respuesta=scProteinas.nextLine();
                    ExcepcionDiego.ValoresSiNo(respuesta);
                    System.out.println("Ingrese el numero de vitaminas que contiene el medicamento: ");
                    int numero= scProteinas.nextInt();
                    JOptionPane.showMessageDialog(null, "Codigo del Medicamento: "+idMedicamento+"\nNombre del Medicamento: "+Nombre+"\nPrecio Unitario: "+valorUnitario+"\nCantidad: "+Cantidad+"\nValor total a pagar: "+(proteina.venderMedicamento(valorUnitario, Cantidad)));
                    JOptionPane.showMessageDialog(null, "Nota: Este medicamente contiene "+numero+" tipos de vitaminas."+"\nSirve para ganar musculo: "+respuesta);
                    break;
                } catch (ExcepcionDiego ex) {
                    System.out.println(ex);
                    break;
                }
            case 2:
                
                try {
                    Scanner scAnticonceptivo= new Scanner(System.in);
                    System.out.println("Ingrese el tipo de anticonceptivo: ");
                    String supervisonMedica=scAnticonceptivo.nextLine();
                    System.out.println("Necesita supervision medica: ");
                    String respuesta2= scAnticonceptivo.nextLine();
                    ExcepcionDiego.ValoresSiNo(respuesta2);
                    JOptionPane.showMessageDialog(null, "Codigo del Medicamento: "+idMedicamento+"\nNombre del Medicamento: "+Nombre+"\nPrecio Unitario: "+valorUnitario+"\nCantidad: "+Cantidad+"\nValor total a pagar: "+(proteina.venderMedicamento(valorUnitario, Cantidad)));
                    JOptionPane.showMessageDialog(null, "Nota: Este anticonceptivo es de tipo: "+supervisonMedica+"\nNecesita Supervision medica: "+respuesta2);
                } catch (ExcepcionDiego ex) {
                    System.out.println(ex);
                    break;
                }
            case 3:
                Scanner scantigripal2 = new Scanner(System.in);
                System.out.println("Ingrese el tipo de antigripal ");
                String tipo_medicamento= scantigripal2.nextLine();
                
                System.out.println("Ingrese el tipo de corticoides que contiene el medicamento");
                String respuesta_antigripal= scantigripal2.nextLine();
        {
            try {
                Exepcion_grupal.tipo_corticoides(respuesta_antigripal);
            } catch (Exepcion_grupal ex) {
                System.out.println(ex);
                break;
            }
        }

                
                

        }
    }
    
}
