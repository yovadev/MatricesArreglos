/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricesarreglos;

/**
 *
 * @author Yova
 */
public class MatricesArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int  matriz[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
       
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                System.out.println (matriz[x][y]);
                }
              }
       
    }
    
}
