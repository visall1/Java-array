
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
public class TestA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[100];
        int i,n = 0,op=0,b=0;
        do{
            
            System.out.println("=============== M E N U============");
            System.out.println("1 >> Input");
            System.out.println("2 >> Output");
            System.out.println("3 >> Search");
            System.out.println("4 >> Update");
            System.out.println("5 >> Sort");
            System.out.println("6 >> Delete");
            System.out.println("=====================================");
            System.out.println("Choose One Option =");
            op = sc.nextInt();
            switch(op)
            {
                case 1:
                {
                    System.out.println("Input N=");
                    n=sc.nextInt();
                    for(i=0;i<n;i++)
                    {
                        System.out.println("Input Number of Array =");
                        a[i]=sc.nextInt();
                    }
                }break;
                case 2:
                {
                    for(i=0;i<n;i++)
                    {
                        System.out.println("Input Number of Array ="+a[i]); 
                    }
                }break;
                case 3:
                {
                    System.out.println("Input number to Search Vualue=");
                    int search=sc.nextInt();
                    for(i=0;i<n;i++)
                    {
                        if(search == a[i])
                        {
                            System.out.println("Search Found on index ="+i);
                            b=1;
                        }
                     
                    }
                    if(b==0)
                    {
                        System.out.println(search +" Search Not Found..! ");
                    }
                }break;
                case 4:
                {
                    System.out.println("Input number to Update Vualue=");
                    int search=sc.nextInt();
                    for(i=0;i<n;i++)
                    {
                        if(search == a[i])
                        {
                            System.out.println("Input New array =");
                            a[i]=sc.nextInt();
                            b=1;
                        }
                     
                    }
                    if(b==0)
                    {
                        System.out.println(search +" Search Not Found..! ");
                    }
                }break;
                case 5:
                {
                    int j;
                    int temp;
                    for(i=0;i<n;i++)
                    {
                        for(j=i+1;j<n;j++)
                        {
                            if(a[i] < a[j])
                            {
                                temp=a[i];
                                a[i]=a[j];
                                a[j]=temp;
                            }
                        }
                    }
                    System.out.println("Sort Success");
                    for(i=0;i<n;i++)
                    {
                        System.out.println("Input Number of Array ="+a[i]); 
                    }
                }break;
                case 6:
                {
                    int del;
                    int j;
                    System.out.println("Input To Delete =");
                    del=sc.nextInt();
                    for(i=0;i<n;i++)
                    {
                        if(del == a[i])
                        {
                            for(j=i;j<n;j++)
                            {
                                a[j]=a[j+1];
                            }
                            n-=1;
                            b=1;
                          break;
                        }
                    }
                    if(b==0)
                    {
                        System.out.println("Value Not Found ....!");
                    }
                }break;
                default: break;
            }
        }while(op != 0);
    }

    private static void System(String cls) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
