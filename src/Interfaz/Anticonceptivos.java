/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author DELL
 */
public class Anticonceptivos implements Medicamentos{

    @Override
    public double venderMedicamento(double precioUnitario, int cantidad) {
        double precioTotal;
        precioTotal=precioUnitario*cantidad;
        return precioTotal;
    }
    
}
