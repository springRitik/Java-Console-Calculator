import java.util.Scanner;

public class Calculator{

public static int add(int a, int b){
    return a+b;
}

public static int substraction(int a, int b){
    return a-b;
}

public static int multiply(int a, int b){
    return a*b;
}

public static double divide(int a, int b){
    if (b==0){
        System.out.println("Can not devide by 0");
}
return  (double)a/b;

}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Boolean continuecalculator = true;

    while (continuecalculator) {
        System.out.println("choose operation");
System.out.println(" 1. for addition (+) ");
System.out.println(" 2. for substraction (-) ");
System.out.println(" 3. for multiply (*) ");
System.out.println(" 4. for divide (/) ");
System.out.println(" 5. for exist ");
          int choice = scanner.nextInt();
        if (choice == 5) {
            continuecalculator = false;
            System.out.println("Existing Calculator");
            break;
}
System.out.println("enter number1");
int num1 = scanner.nextInt();

System.out.println("enter number2");
int num2 = scanner.nextInt();

        switch (choice) {
            case 1:
                System.err.println("addition is" +add(num1,num2));
                break;
        
                case 2:
                System.err.println("substraction is" +substraction(num1,num2));
                break;

                case 3:
                System.err.println("multiplication is" +multiply(num1,num2));
                break;

                case 4:
                System.err.println("divide is" +divide(num1,num2));
                break;

            default:
            System.out.println("invalid choice");
                break;
        }
    }

    scanner.close();
 }

        
}  