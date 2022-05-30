import java.util.*;
public class Array5 {
    int i;
    Scanner sc = new Scanner(System.in);
    void Input(int a[],int n)
    {
        for(i=0;i<n;i++)
        {
            System.out.println("Input Array = ");
            a[i]=sc.nextInt();
        }
    }
    void Output(int a[],int n)
    {
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+"   ");
        }
    }
    int search(int a[],int n)
    {
        int svalue;
        int index=-1;
        System.out.println("Input Value to search = ");
        svalue=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==svalue)
            {
                index=i;
                break;
            }
        }
        return index;
    }
    void Update(int a[],int n)
    {
        int nvalue;
        int index=search(a,n);
        if(index==-1)
        {
            System.out.println("............Search Not Found............");
        }
        else{
            System.out.println("Input New Value = ");
            nvalue=sc.nextInt();
            a[index]=nvalue;
            System.out.println("Update Completed...........!");
        }
    }
    void Delete(int []a,int n)
    {
        int index=search(a,n);
        if(index==-1)
        {
            System.out.println(".............Search Not Found............");
        }
        else{
            for(i=index;i<n;i++)
            {
                a[i]=a[i+1];
            }
            n-=1;
            Output(a,n);
        }
    }
    void Sort(int []a,int n)
    {
        int t,j;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
    }
    public Array5()
    {
        int a[]=new int[100];
        String st = null;
        int n=0,op,i;
        do{
            System.out.println("1. Input\n");
            System.out.println("2. Output\n");
            System.out.println("3. Search\n");
            System.out.println("4. Update\n");
            System.out.println("5. Delete\n");
            System.out.println("6. Sort\n");
            System.out.println("Choose one option=");
            op=sc.nextInt();
            switch(op)
            {
                case 1:
                {
                    System.out.println("Input N=");
                    n=sc.nextInt();
                    Input(a,n);
                }break;
                case 2:
                {
                    Output(a,n);
                }break;
                case 3:
                {
                    int index=search(a,n);
                    if(index==-1)
                    {
                        System.out.println("Sesrch Not Found ...!");
                    }
                    else{
                        System.out.println("Search round at " + index);
                    }
                }break;
                case 4:
                {
                    Update(a,n);
                }break;
                case 5:
                {
                    Delete(a,n);
                }break;
                case 6:
                {
                    Sort(a,n);
                }
                
            }
           
        }while(op != 0);
    }
    public static void main(String[] args) {
        new Array5();
    }
    
}
