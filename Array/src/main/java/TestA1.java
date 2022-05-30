
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class TestA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Input N=");
        n=sc.nextInt();
       int []id= new int[n];
       String [] name= new String[n];
       double [] score=new double[n];
  
        for(int i=0;i<n;i++)
        {
            System.out.println("Input ID: ");
            id[i]=sc.nextInt();
            System.out.println("Input Name: ");
            name[i]=sc.next();
            System.out.println("Input Score:");
            score[i]=sc.nextDouble();
        }
        sc.close();
        for(int i=0;i<n;i++)
        {
            System.out.println("....................................");
            System.out.println("ID : "+id[i]);
            System.out.println("Name: "+name[i]);
            System.out.println("Score: "+score[i]+"\n");
        }
    }
    
}
