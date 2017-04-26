/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Invtado
 */
public class Exepcion_grupal extends Exception{
    
    public Exepcion_grupal(String message){
        super(message);
    }
    public static void tipo_corticoides(String respuesta)throws Exepcion_grupal{
        if(!(respuesta.equals("NATURAL") || respuesta.equals("CORTITOSINA"))){
            
            throw new Exepcion_grupal("Recuerde que solo puede ir NATURAL o CORTITOSINA" );
           
        }
    }
}
