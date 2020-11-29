package Test5;

public class Student {
    String c;
    String name;
    int number;
    String gender;
    public Student(String c, String name, int number, String gender) {
    }
    public void setC(String c) {
        this.c = c;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    public String toString() {
        return "班级: " + c + " 姓名: " + name + " 学号: " + number + " 性别: " + gender+"\n";
    }
}