
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pilar
 */
public class Maximo {
    
      public int[] maximo (int [] listaNumeros){
        int [] numerosMaximos = {0,0};
        
        for (int i=0; i<listaNumeros.length; i++){
            if (numerosMaximos [0] < listaNumeros[i]){
                numerosMaximos [1] = numerosMaximos [0];      
                numerosMaximos [0] = listaNumeros[i];
                
            }
            
            else if (numerosMaximos [0] < listaNumeros[i]) {
                numerosMaximos [0] = listaNumeros[i];
                
            }
        }
        
        return numerosMaximos;
        
          
    }
      
      
         public static void main(String[] args) {
       
        
       
        
        
        int [] listaNumeros = {50,31,27,2,5,99};
        int [] listaNumeros2 = {150,31,27,2,5,99};
        
       
        
        
        
 
       
         
       
        
    }
        
      
    
}
