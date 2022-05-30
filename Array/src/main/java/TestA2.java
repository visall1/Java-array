
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
public class TestA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Input Number = ");
        n=sc.nextInt();
        int i;
        double []score = new double[10];
        float []total =new float[10];
        float []avg=new float[10];
        String []Grade=new String[10];
        for(i=0;i<n;i++)
        {
            System.out.println("Input Score=");
            score[i]=sc.nextDouble();
            total[i]=(float) (i+score[i]);
            avg[i]=total[i]/n;
        }
        
        for(i=0;i<n;i++)
        {
            System.out.println("Total = "+total);
            System.out.println("Average = "+total[i]);
            System.out.println("Grade = "+Grade[i]);
        }
    }
    
}
