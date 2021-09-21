public class Homework1 {
    import java.util.Scanner;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();
        System.out.println('정수를 입력하세요: %d \n',num1);
        System.out.println('현재까지 정수 입력된 정수의 합은: %d 입니다.\n',num1);
        int num2= sc.nextInt();
        System.out.println('정수를 입력하세요: %d \n',num2);
        System.out.println('현재까지 정수 입력된 정수의 합은: %d 입니다.\n',num1+num2);
        int num3= sc.nextInt();
        System.out.println('정수를 입력하세요: %d \n',num3);
        System.out.println('현재까지 정수 입력된 정수의 합은: %d 입니다.\n',num1+num2+num3);
        int num4= sc.nextInt();
        System.out.println('정수를 입력하세요: %d \n',num4);
        System.out.println('현재까지 정수 입력된 정수의 합은: %d 입니다.\n',num1+num2+num3+num4);
        int num5= sc.nextInt();
        System.out.println('정수를 입력하세요: %d \n',num5);
        System.out.println('현재까지 정수 입력된 정수의 합은: %d 입니다.\n',num1+num2+num3+num4+num5);
    }
}
