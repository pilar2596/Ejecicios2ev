
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
public class Anagrama {
    
    
    public static void main(String[] args) {
 
 
        String frase1="amor";
        String frase2="mora";
        String frase1Limpia="";
        String frase2Limpia="";
        String fraseOrdenada1="";
 
        frase1Limpia=limpiar(frase1);
        frase2Limpia=limpiar(frase2);
 
        frase1Limpia=frase1Limpia.toUpperCase();
        frase2Limpia=frase2Limpia.toUpperCase();
 
 
        System.out.println(""+frase1Limpia+"n"+frase2Limpia);
 
        fraseOrdenada1=orden(frase1Limpia);
        System.out.println(""+fraseOrdenada1);
 
       
 
 
}
    public static String limpiar(String f){
        String fraseLimpia="";
 
        for (int x=0; x < f.length(); x++) {
  if (f.charAt(x) != ' '&& f.charAt(x) != ','){
 
      fraseLimpia=fraseLimpia+f.charAt(x);
  }
 
}
  return fraseLimpia;
 
    }
 

    public static String orden(String frase){
 
         char[] a_frase= frase.toCharArray();
     
         Arrays.sort(a_frase);
     
         String s_frase = new String(a_frase);
         
         System.out.println(s_frase); //Si quieres elimina esta linea, solo imprime la linea ya ordenada
 
         return s_frase;
     }


    
}
