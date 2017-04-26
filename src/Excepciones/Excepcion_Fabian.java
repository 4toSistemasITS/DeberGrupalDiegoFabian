/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Bianca Valentina
 */
public class Excepcion_Fabian extends Exception{
    
    public Excepcion_Fabian(String message){
        super(message);
        
    }
    
    public static void enfermedad_que_impide_tomat_proteinas(String respuesta)throws Excepcion_Fabian{
        if(!(respuesta.equals("DIABETICOS") || respuesta.equals("INTOLERANTES LACTOSA"))){
             
            throw new Excepcion_Fabian("Recuerde que solo se admiten 'DIABETES' o 'INTOLERANCIA LACTOSA'");
           
        }
    }
}
