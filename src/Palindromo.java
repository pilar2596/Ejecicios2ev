/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pilar
 */
public class Palindromo {
       
        
        static String palindromo2 = "dabale arroz a la zorra el abad";
    /**
     * @param args the command line arguments
     */
    public static  void main(String[] args) {
       // System.out.println();
       if(comprueba(palindromo2.replace(" ", "")) ==true){
           System.out.println("Es un palindromo");
       }
       else{
           System.out.println("No es un palindromo");
       }
    }
    
    
    
    public static boolean comprueba (String cadena){
        
      StringBuilder builder = new StringBuilder(cadena);
      
      String cadenaInvertida =builder.reverse().toString();
      
      if(cadena.equals(cadenaInvertida)){
          return true;
      }
        
        return false;
        
    }
     
    
}
