
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Array4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] a=new int[100];
        Random ran = new Random();
        int n=20;
        System.out.println("intArray output ( version 2)");
        for(int i=0;i<n;i++)
        {
            a[i]=ran.nextInt(100)+1;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"  ");
        }
    }
    
}
