import java.util.Scanner;
// import java.util.Arrays;

public class TestingOOP {

    static class Student {
        String name;
        int age;
        
        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many students does your class have?");
        int studentAmount = scanner.nextInt();
        
        // Creates the student array according to the provided amount
        Student[] studentList = new Student[studentAmount];
        
        // Placeholder values for the student array
        // Arrays.fill(studentList, new Student("Placeholder", 0));        
        for (int index=0; index < studentAmount; index++) {
            studentList[index] = new Student("Placeholder", 1);
        }
        
        // Update the values according to user input
        for (int studentIndex=0; studentIndex < studentAmount; studentIndex++) {
            System.out.println("Enter the name of student #"+(studentIndex+1));
            studentList[studentIndex].name = scanner.next();
            System.out.println("Enter their age:");
            studentList[studentIndex].age = scanner.nextInt();
        }
        
        // Output all the values
        for (int index=0; index < studentAmount; index++) {
            System.out.println(studentList[index].name+" - "+studentList[index].age);
        }
                      
        scanner.close();
    }
}
