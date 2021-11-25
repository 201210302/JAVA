import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

class Homework8 {

    public static void main(String[] args) {
        HashMap<String,String> db =new HashMap<String,String>();
        db.put("myld","myPass");
        db.put("myld2","myPass2");
        db.put("myld3","myPass3");

        System.out.println("id와 password를 입력해주세요");
        System.out.printf("id:");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();

        if (db.containsKey(id)){
            System.out.printf("password:");
            Scanner scanner1 = new Scanner(System.in);
            String pw = scanner.next().trim();
            System.out.printf("%s %s", db.get(id), pw);
            if(db.get(id).equals(pw)){
                System.out.println("id와 비밀번호가 일치합니다");
            }
            else System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
        }
        else System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");

    }
}
