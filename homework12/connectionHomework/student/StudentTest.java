package endTermHomeWork.homework12.connectionHomework.student;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StudentTest {
    public static void main(String[] args) throws IOException {
        Set<Student> students=new TreeSet<>();
        File file=new File("C:\\Users\\HC\\Desktop\\20-21 Academic Year\\Java\\javaTextbookExercises\\src\\connectionHomework\\student\\student.txt");
        PrintWriter output=new PrintWriter(file);
        Scanner scanner = new Scanner(System.in);
        int i=1;
        String id;
        String name;
        int age;
        int info;
        while (true){
            System.out.println("Beginning.......");

            System.out.println("student "+i);
            System.out.print("please enter the id: ");
            id=scanner.next();
            System.out.print("please enter the name: ");
            name=scanner.next();
            System.out.print("please enter the age: ");
            age=scanner.nextInt();

            Student student=new Student();
            student.setName(name);
            student.setAge(age);
            student.setId(id);
            students.add(student);

            System.out.println("enter 0 to exit...");
            System.out.println("enter other to continue...");
            info=scanner.nextInt();
            if(info==0){
                break;
            }
            i++;
        }

        Iterator<Student> iterator=students.iterator();
        while (iterator.hasNext()){
            int j=1;
            Student student=iterator.next();
            System.out.println("student"+j+": "+" id:"+student.getId()+" name: "+student.getName()+" age: "+student.getAge());
            output.println("student"+j+": "+" id:"+student.getId()+" name: "+student.getName()+" age: "+student.getAge());
            j++;
        }
        output.close();
    }
}
