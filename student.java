class Student{
    int rollno;
    void getRoll(int r){
        rollno=r;
    }
    void showRoll(){
        System.out.println("Roll No: " + rollno);
    }
}
class Test extends Student{
    int sub1, sub2;
    void getMarks(int s1, int s2){
        sub1 = s1;
        sub2 = s2;
    }
    void showMarks(){
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
    }
}
class Result extends Test{
    void displayResult(){
        int total = sub1 + sub2;
        System.out.println("Total Marks: " + total);
    }
}
public class student{
    public static void main(String[] args){
        Result r = new Result();
        r.getRoll(101);
        r.getMarks(80, 90);
        r.showRoll();
        r.showMarks();
        r.displayResult();
    }
}
