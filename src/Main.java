import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Student myStudent=new Student("Nana",19,2019);
        String name=myStudent.getName();
        double id=myStudent.getId();
        double year=myStudent.getYear();
        System.out.println(name);
        System.out.println(id);
        System.out.println(year);
        Temperature myT2=new Temperature(0,'C');
        Temperature myT1=new Temperature('C');
        Temperature myT=new Temperature(0);
        System.out.println(myT1.degreesF(45));
        System.out.println(myT2.degreesC(47));
        System.out.println(myT.degreesC(12));
        System.out.println(myT.degreesF(24));
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите сторону квадрата:");
        double a=scanner.nextDouble();
        Square newSquare=new Square(a);
        System.out.println(newSquare);
        Square newSquare1=new Square(a);
        System.out.println("Периметр="+newSquare1.myP(a));
        Square newS=new Square(a);
        System.out.println("Площадь="+newS.myS(a));
        Square newD=new Square(a);
        System.out.println("Длина="+newD.myD(a));




    }
}