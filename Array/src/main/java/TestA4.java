
import java.util.Scanner;
public class TestA4 {

    Scanner sc = new Scanner(System.in);
    int id[] = new int[100];
    String name[] = new String[100];
    String sex[] = new String[100];
    float s1[] = new float[100];
    float s2[] = new float[100];
    float s3[] = new float[100];
    float total[] = new float[100];
    float avg[] = new float[100];
    String Grade[] = new String[100];
    int i, n = 0, op = 0, b = 0;

    void Input() {
        System.out.println("Input N=");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            System.out.println(" ============= I N P U T =============");
            System.out.println("Input Id=");
            id[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("Input Name=");
            name[i] = sc.nextLine();
            System.out.println("Input Gander[M/F]=");
            sex[i] = sc.next();
            System.out.println("Input Score1=");
            s1[i] = sc.nextFloat();
            System.out.println("Input Score2=");
            s2[i] = sc.nextFloat();
            System.out.println("Input Score3=");
            s3[i] = sc.nextFloat();
            total[i] = s1[i] + s2[i] + s3[i];
            avg[i] = total[i] / 3;
            if (avg[i] >= 90 && avg[i] < 100) {
                Grade[i] = "A";
            } else if (avg[i] >= 80 && avg[i] < 90) {
                Grade[i] = "B";
            } else if (avg[i] >= 70 && avg[i] < 80) {
                Grade[i] = "C";
            } else if (avg[i] >= 60 && avg[i] < 70) {
                Grade[i] = "D";
            } else if (avg[i] >= 500 && avg[i] < 60) {
                Grade[i] = "E";
            } else {
                Grade[i] = "F";
            }
        }
    }

    void Output() {
        System.out.println("============== O U T P U T =============");
        for (i = 0; i < n; i++) {

            System.out.println("ID = " + id[i]);
            System.out.println("Name = " + name[i]);
            System.out.println("Gander = " + sex[i]);
            System.out.println("Score1 = " + s1[i] + "\nScore2 = " + s2[i] + "\nScore3 = " + s3[i]);
            System.out.println("Total score = " + total[i]);
            System.out.println("Average = " + avg[i]);
            System.out.println("Grade = " + Grade[i]);
            System.out.println("====================================");
        }
    }

    void Search() {
        System.out.println("Input Id To Search =");
        int search = sc.nextInt();
        for (i = 0; i < n; i++) {
            if (search == id[i]) {
                System.out.println("ID = " + id[i]);
                System.out.println("Name = " + name[i]);
                System.out.println("Gander = " + sex[i]);
                System.out.println("Score1 = " + s1[i] + "\nScore2 = " + s2[i] + "\nScore3 = " + s3[i]);
                System.out.println("Total score = " + total[i]);
                System.out.println("Average = " + avg[i]);
                System.out.println("Grade = " + Grade[i]);
                b = 1;

            }
        }
        if (b == 0) {
            System.out.println("Search Not Found...!");
        }
    }

    void Update() {
        System.out.println("Input Id To Update =");
        int sid = sc.nextInt();
        for (i = 0; i < n; i++) {
            if (sid == id[i]) {
                System.out.println("Input new Id=");
                id[i] = sc.nextInt();
                sc.nextLine();
                System.out.println("Input new Name=");
                name[i] = sc.nextLine();
                System.out.println("Input new Gander[M/F]=");
                sex[i] = sc.next();
                System.out.println("Input new Score1=");
                s1[i] = sc.nextFloat();
                System.out.println("Input new Score2=");
                s2[i] = sc.nextFloat();
                System.out.println("Input new Score3=");
                s3[i] = sc.nextFloat();
                total[i] = s1[i] + s2[i] + s3[i];
                avg[i] = total[i] / 3;
                if (avg[i] >= 90 && avg[i] < 100) {
                    Grade[i] = "A";
                } else if (avg[i] >= 80 && avg[i] < 90) {
                    Grade[i] = "B";
                } else if (avg[i] >= 70 && avg[i] < 80) {
                    Grade[i] = "C";
                } else if (avg[i] >= 60 && avg[i] < 70) {
                    Grade[i] = "D";
                } else if (avg[i] >= 500 && avg[i] < 60) {
                    Grade[i] = "E";
                } else {
                    Grade[i] = "F";
                }

            }
        }
        if (b == 0) {
            System.out.println("Search Not Found...!");
        }
    }

    public TestA4() {
        do {
            System.out.println("1 << Input");
            System.out.println("2 << Output");
            System.out.println("3 << Search");
            System.out.println("4 << Update");
            System.out.println("Choose one option =");
            op = sc.nextInt();
            switch (op) {
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
                default:
                    System.exit(0);
            }

        } while (op != 0);

    }

    public static void main(String[] args) {
        new TestA4();
    }

}
