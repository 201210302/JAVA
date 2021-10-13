import java.util.Scanner;

class Homework4 {
    int gcd(int m, int n){
        if(m==0){ return m;}
        else if (m%n==0){ return n;}
        else {
            m=m%n;
            return gcd(n,m);}
    }

    public static void main(String[] args){
        int num1,num2;
        System.out.println("두 수를 입력하세요");
        Scanner sc1= new Scanner(System.in); // sc.nextInt() 사용해야되나
        num1=sc1.nextInt();
        Scanner sc2= new Scanner(System.in);
        num2=sc2.nextInt(); // 한줄에 두수를 넣는 법 , 두수 입력받는 방법 다른것있나

        Homework4 GCD= new Homework4();
        System.out.printf("두수의 최대 공약수는 %d",GCD.gcd(num1,num2));
    }
}
