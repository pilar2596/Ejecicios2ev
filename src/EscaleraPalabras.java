/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author pilar
 */
public class EscaleraPalabras {
     int chivato=0;
    public boolean chequea(char[][] matriz) {
        for(int i=1; i<matriz.length;i++){
            for(int u=0;u<matriz[i].length;u++){
                if(matriz[i][u] != matriz[i-1][u]){
//                    System.out.println("no son iguales " + chivato);
                    chivato ++;
                }
            }
        }
//        System.out.println(chivato);
        if(chivato > matriz.length || chivato < matriz.length-1){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] prueba1 = {{'P', 'A', 'T', 'A'},
                            {'P', 'A', 'T', 'O'},
                            {'R', 'A', 'T', 'O'},
                            {'G', 'A', 'T', 'O'},
                            {'G', 'A', 'T', 'A'}};

        char[][] prueba2 = {{'P', 'A', 'T', 'A'},
                            {'P', 'A', 'T', 'O'},
                            {'R', 'A', 'T', 'O'},
                            {'R', 'E', 'T', 'O'},
                            {'R', 'O', 'T', 'O'}};
        
        char[][] prueba3 = {{'P', 'A', 'T', 'A'},
                            {'P', 'R', 'T', 'O'},
                            {'R', 'O', 'T', 'O'},
                            {'G', 'A', 'T', 'O'},
                            {'P', 'U', 'T', 'O'}};
        
        char[][] prueba4 = {{'P', 'A', 'T', 'A'},
                            {'P', 'A', 'T', 'O'},
                            {'R', 'A', 'T', 'O'},
                            {'R', 'A', 'T', 'O'},
                            {'R', 'U', 'T', 'O'}};
        
        System.out.println("PRUEBA1 es: " +new EscaleraPalabras().chequea(prueba1));
        System.out.println("PRUEBA2 es: " +new EscaleraPalabras().chequea(prueba2));
        System.out.println("PRUEBA3 es: " +new EscaleraPalabras().chequea(prueba3));
        System.out.println("PRUEBA4 es: " +new EscaleraPalabras().chequea(prueba4));

    }

    
}
