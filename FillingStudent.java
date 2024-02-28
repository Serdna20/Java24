import java.util.Scanner;
import java.util.Arrays; 
public class FillingStudent {

    static class Student {
        String name;
        int age;
        
        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many students does your class have?");
        int studentAmount = sc.nextInt();
        Student[] studentList = new Student[studentAmount];
        /* -- This is bugged rn
        Arrays.fill(studentList, "Placeholder"); 
        for (int studentIndex=0; studentIndex < studentAmount; studentIndex++) {
            System.out.println("Enter the name of student #"+(studentIndex+1));
            studentList[studentIndex].name = sc.nextLine();
            System.out.println("Enter their age:");
            studentList[studentIndex].age = sc.nextInt();
        }
        
        for (int index=0; index < studentAmount; index++) {
            System.out.println(studentList[index].name+" - "+studentList[index].age);
        }
        
        */        
        sc.close();
    }
}
