import java.util.Scanner;

class Homework3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Scanner sc= new Scanner(System.in);
        int num,max,min,i,j;

        System.out.print("몇 개의 수를 입력할 예정인가요?");
        num = scanner.nextInt();
        int array[]=new int[num];

        System.out.print("수를 입력하세요");

        for (i=0; i<num;i++){
            array[i]=scanner.nextInt();
        }

        max=array[0];
        min=array[0];

        for (j=0; j<num;j++){
            if (max<array[j]){
                max=array[j];
            }
        }
        for(j=0;j<num;j++){
            if (min>array[j]){
                min=array[j];
            }
        }

        System.out.println("최대값:" + max);
        System.out.println("최소값:" + min);

    }

}
