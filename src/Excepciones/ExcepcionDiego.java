/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author DELL
 */
public class ExcepcionDiego extends Exception{

    public ExcepcionDiego(String message) {
        super(message);
    }
    
    public static void ValoresSiNo(String respuesta)throws ExcepcionDiego{
        if(!(respuesta.equals("SI") || respuesta.equals("NO"))){
            throw new ExcepcionDiego("Recuerde que solo se admiten 'SI' o 'NO'");

        }
    }
    
    
    public static void enfermedad_que_impide_tomat_proteinas(String respuesta)throws ExcepcionDiego{
        if(!(respuesta.equals("DIABETICOS") || respuesta.equals("INTOLERANTES LACTOSA"))){
             
            throw new ExcepcionDiego("Recuerde que solo se admiten 'DIABETES' o 'INTOLERANCIA LACTOSA'");
           
        }
    }
}
