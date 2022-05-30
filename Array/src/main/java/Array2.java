/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] stringArray = new String[5];
        stringArray[0]="ETEC";
        stringArray[1]="IT";
        stringArray[2]="Professional";
        stringArray[1]="Training";
        stringArray[2]="Center";
        System.out.println("stringArray output");
        for(int i=0;i<stringArray.length;i++)
        {
            System.out.println(stringArray[i]);
        }
        
    }
    
}
