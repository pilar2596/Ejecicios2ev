/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pilar
 */
public class FiestaArdilla {
    
     public boolean fiestaArdillas (int numeroBellotas, boolean finDeSemana){
       
      
     if(numeroBellotas <=40 && (!finDeSemana)){
         return false;
         
     }
     if (numeroBellotas >=40 &&(finDeSemana)){
         return true;
             
             }
     else{
       return false;
    }
    }
    
      int [] fiestaArdillas = {40,50,60,30,70};
      
}
