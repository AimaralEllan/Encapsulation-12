import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ENCAPSULATION Инкапсуляция

        Student student = new Student();
        /*student.name="Aimaral";
        student.surname="Ellanova";
        student.age=19;

        System.out.println(student.name);
        System.out.println(student.surname);
        System.out.println(student.age);*/
        /*student.getName("Aimaral");
        System.out.println(student.setName());
        student.getSurname("Ellanova");
        System.out.println(student.setSurname());
        student.getAge(2003);
        System.out.println(student.setAge());
        student.getCity("Bishkek");
        System.out.println(student.setCity());

        System.out.println("_____________________________________");

        Student student1=new Student();
        student1.getName("Yntymak");
        System.out.println(student1.setName());
        student1.getSurname("Jenishbekov");
        System.out.println(student1.setSurname());
        student1.getAge(2002);
        System.out.println(student1.setAge());
        student1.getCity("Toktogul");
        System.out.println(student1.setCity());*/

        Scanner input=new Scanner(System.in);
        /*Rectangle rectangle=new Rectangle();
        rectangle.getWith(input.nextByte());
        rectangle.getLength(input.nextInt());
        System.out.println(rectangle.setWith());
        System.out.println(rectangle.setLength());
        rectangle.area();*/

        Pupil pupil=new Pupil();
        System.out.println("Write your Name: ");
        pupil.getName(input.nextLine());
        System.out.println("Write your Surname: ");
        pupil.getSurname(input.nextLine());
        System.out.println("Write your Age: ");
        pupil.getAge(input.nextInt());

        System.out.println("Write your Courses");
        String[] courses=new String[5];
        for (int i = 0; i < courses.length; i++) {
            courses[i]=input.nextLine();
        }
        //pupil.setCourses(courses);

        System.out.println(pupil.setName());
        System.out.println(pupil.setSurname());
        System.out.println(pupil.setAge());
        System.out.println(Arrays.toString(pupil.setCourses()));
    }
}