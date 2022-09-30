package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){

        char char1 = 'Z';
        int int1 = char1;
        int int2 = (int) 44e-1f;
        int int3 = (int) 5.5f;
        int int4 = Integer.valueOf(012);
        int int5 = Integer.decode("0xface");
        int int6 = (int) 80L;
        int int7 = (int) 8.88e1;
        int int8 = (int) 99.9;
        int sum = int1+int2+int3+int4+int5+int6+int7+int8;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner4 = new Scanner(System.in);
        int num1 = scanner4.nextInt();
        int num2 = scanner4.nextInt();
        int plus = num1 + num2;
        System.out.println(plus);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scanner5 = new Scanner(System.in);
        int x = scanner5.nextInt();
        int y = scanner5.nextInt();
        System.out.println("Before Swap:");
        System.out.println("x: y: After Swap:");
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scanner6 = new Scanner(System.in);
        int n1 = scanner6.nextInt();
        int n2 = scanner6.nextInt();
        if (n1 > n2) {
            System.out.println("n1: n2: n1 > n2");
        } else if (n2 > n1) {
            System.out.println("n1: n2: n2 > n1");
        } else {
            System.out.println("n1: n2: n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scanner7 = new Scanner(System.in);
        int salary = scanner7.nextInt();
        if (salary < 0 || salary >= 100000) {
            System.out.println("Enter annual Revenue: Invalid Revenue");
        } else if (salary >= 0 && salary < 20000) {
            System.out.println("Enter annual Revenue: Poor Sales Revenue");
        } else if (salary >= 20000 && salary < 50000) {
            System.out.println("Enter annual Revenue: Average Sales Revenue");
        } else if (salary >= 50000 && salary < 80000) {
            System.out.println("Enter annual Revenue: Good Sales Revenue");
        } else if (salary >= 80000 && salary < 100000) {
            System.out.println("Enter annual Revenue: Excellent Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){

    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}