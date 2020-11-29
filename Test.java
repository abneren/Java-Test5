package Test5;
import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)  {
        Scanner f = new Scanner(System.in);
        Student i1 = new Student("wu", "wu", 0, "wu");
        System.out.println("请依次输入班级，姓名，学号，性别：");
        String i2 = f.next();
        i1.setC(i2);
        String i3 = f.next();
        i1.setName(i3);
        int i4 = f.nextInt();
        i1.setNumber(i4);
        String i5 = f.next();
        i1.setGender(i5);
        try {
            BufferedReader in = new BufferedReader(new FileReader("E:\\B.txt"));
            String str = in.readLine();
            String regex = "(.{7})";
            str = str.replaceAll(regex,"$1，");
            StringBuffer sb = new StringBuffer(str);
            for (int i =15;i<289;i=i+17) {
                sb.replace(i, i + 1, "。\n");
            }
            System.out.println(sb);
            System.out.println(i1);
            FileWriter writer = new FileWriter("E:/A.txt");
            writer.write(String.valueOf(i1));
            writer.write(String.valueOf(sb));
            writer.flush();
            writer.close();
            System.out.println("文件写入成功!");
            Scanner k = new Scanner(System.in);
            String[] ai = str.split("");
            System.out.println("1为查询字，2为查询词，3为结束:");
            s:
            for (int w = 0; w < 9999; w++) {
                int v = k.nextInt();
                switch (v) {
                    case 1:
                        System.out.println("请输入您要查询的字:");
                        Scanner h = new Scanner(System.in);
                        String h1 = h.nextLine();
                        int a=0;
                        for (int i = 0; i < str.length(); i++) {
                            if(Objects.equals(ai[i], h1)){
                                a++;
                            }
                        }
                        System.out.println("字数为: "+a);
                        System.out.println("1为查询字，2为查询词，3为结束:");
                        break;
                    case 2:
                        System.out.println("请输入您要查询的词:");
                        Scanner r = new Scanner(System.in);
                        String r1 = r.nextLine();
                        int count = 0;
                        int index = 0;
                        while ((index = str.indexOf(r1, index)) != -1) {

                            index = index + r1.length();
                            count++;
                        }
                        System.out.println("字数为: "+count);
                        System.out.println("1为查询字，2为查询词，3为结束:");
                        break;
                    case 3:
                        break s;

                }
            }

        } catch (Exception e) {
            System.out.println("出现错误!");
        }
    }
}