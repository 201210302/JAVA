public class Student{
    int studentNum;
    String name;
    String major;
    int phoneNum;

    public Student(int studentNum, String name,String major,int phoneNum){
        this.studentNum=studentNum;
        this.name=name;
        this.major=major;
        this.phoneNum=phoneNum;
    }

    public int getstudentNum(){
        return studentNum;
    }
    public int setstudentNum(){
        return studentNum;
    }

    public String setname(){
        return name;
    }
    public String getname(){
        return name;
    }

    public String setmajor(){
        return major;
    }
    public String getmajor(){
        return major;
    }

    public int getphoneNum(){
        return phoneNum;
    }
    public int setphoneNum(){
        return phoneNum;
    }

    public void info1(){ System.out.println("학생의 학번 이름 전공,전화번호를 입력하세요 :"+this.studentNum + this.name + this.major + this.phoneNum)}
    public void info2(){ System.out.println("학생의 학번 이름 전공,전화번호를 입력하세요 :"+this.studentNum + this.name + this.major + this.phoneNum)}
    public void info3(){ System.out.println("학생의 학번 이름 전공,전화번호를 입력하세요 :"+this.studentNum + this.name + this.major + this.phoneNum)}

    System.out.println("입력된 학생들의 정보는 다음과 같습니다.")
    


}
