package March;
import java.util.*;
public class isThisStudentValid {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int A1, A2, S1, S2;
        double G1, G2;
        String name1;
        String name2;
        System.out.println("Student 1: What is your name? ");
        name1 = input.next();
        System.out.println("Student 1: What is your ACT score? ");
        A1 = input.nextInt();
        System.out.println("Student 1: What is your SAT score? ");
        S1 = input.nextInt();
        System.out.println("Student 1: What is your GPA? ");
        G1 = input.nextDouble();
        System.out.println("Student 2: What is your name? ");
        name2 = input.next();
        System.out.println("Student 2: What is your ACT score? ");
        A2 = input.nextInt();
        System.out.println("Student 2: What is your SAT score? ");
        S2 = input.nextInt();
        System.out.println("Student 2: What is your GPA? ");
        G2 = input.nextDouble();
        int n1 = 1;
        int n2 = 1;
        if(A1 == A2){
            System.out.println("They have the same ACT score.");
        }else if(A1 > A2){
            System.out.println(name1+" has a better ACT score.");
            n1 = n1+1;
        } else{
            System.out.println(name2+" has a better ACT score.");
            n2 = n2+1; 
        }
        if(S1 == S2){
            System.out.println("They have the same SAT score.");
        }else if(S1 > S2){
            System.out.println(name1+" has a better SAT score.");
            n1 = n1+1;
        } else{
            System.out.println(name2+" has a better SAT score."); 
            n2 = n2+1;
        }
        if(G1 == G2){
            System.out.println("They have the same GPA.");
        }else if(G1 > G2){
            System.out.println(name1+" has a better GPA.");
            n1 = n1+1;
        } else{
            System.out.println(name2+" has a better GPA.");
            n2 = n2+1; 
        }
        if(n1 == n2){
            System.out.println("These students are too similar to determine who is greater.");
        } else if(n1 > n2){
            System.out.println(name1+" is more qualified to be accepted.");
        } else{
            System.out.println(name2+" is more qualified to be accepted.");
        }
}
}
