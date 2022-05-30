
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
public class ArrayII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n = 0, op = 0;
        String student[][][] = new String[10][10][10];
        do {
            System.out.println("============== M E N U ===============");
            System.out.println("1 >> Input");
            System.out.println("2 >> Output");
            System.out.println("3 >> Search");
            System.out.println("4 >> Update");
            System.out.println("=======================================");
            System.out.println("Choose one = ");
            op = sc.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Input N =");
                    n = sc.nextInt();
                    for (i = 0; i < n; i++) {
                        System.out.println("Input ID=");
                        student[0][i][n] = sc.next();
                        System.out.println("Input Name=");
                        student[1][i][n] = sc.next();
                        System.out.println("Input Gander=");
                        student[2][i][n] = sc.next();
                        System.out.println("Input Score=");
                        student[3][i][n] = sc.next();
                    }
                }
                break;
                case 2: {
                    for (i = 0; i < n; i++) {
                        System.out.println("ID  =" + student[0][i][n]);
                        System.out.println("Name  =" + student[1][i][n]);
                        System.out.println("Gander  =" + student[2][i][n]);
                        System.out.println("Score  =" + student[3][i][n]);
                    }
                }
                break;
                case 3: {
                    String search;
                    System.out.println("Input ID to search =");
                    search = sc.next();
                    for (i = 0; i < n; i++) {
                        if (search.equals(student[0][i][n])) {
                            System.out.println("ID  =" + student[0][i][n]);
                            System.out.println("Name  =" + student[1][i][n]);
                            System.out.println("Gander  =" + student[2][i][n]);
                            System.out.println("Score  =" + student[3][i][n]);
                        }
                    }
                }
                break;
                case 4: {
                    String search;
                    System.out.println("Input ID to Update =");
                    search = sc.next();
                    for (i = 0; i < n; i++) {
                        if (search.equals(student[0][i][n])) {
                            System.out.println("Input New ID=");
                            student[0][i][n] = sc.next();
                            System.out.println("Input New Name=");
                            student[1][i][n] = sc.next();
                            System.out.println("Input new Gander =");
                            student[2][i][n] = sc.next();
                            System.out.println("Input New Score =");
                            student[3][i][n] = sc.next();
                        }
                    }
                }
                break;
            }
        } while (op != 0);
    }

}
