
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
public class TFunc_case {
    Scanner sc = new Scanner(System.in);
    int []a=new int [50];
    int n,i,op=0,b=0;
    void Input()
    {
        System.out.println("Input Element Of array = ");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Input Value of Array =");
            a[i]=sc.nextInt();
        }
    }
    void Output()
    {
        for(i=0;i<n;i++)
        {
            System.out.println("Input Number of Array ="+a[i]); 
        }
    }
    void Search()
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
    }
    void Update()
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
        
    }
    void Sort()
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
    }
    void Delete()
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
             }
        }
        if(b==0)
        {
            System.out.println("Value Not Found ....!");
        }
    }
    public TFunc_case()
    {
        do
        {
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
                    Input();
                    break;
                case 2:
                    Output();
                    break;
                case 3:
                    Search();
                    break;
                case 4:
                    Update();
                    break;
                case 5:
                    Sort();
                    break;
                case 6:
                    Delete();
                    break;
                default: System.exit(0);
            }
        }while(op !=0);
    }
    public static void main(String[] args) {
        new TFunc_case();
    }
    
}
