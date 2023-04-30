import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        boolean continueEnteringStudents = true;

        while(continueEnteringStudents){
            System.out.println("Please enter students name, wage, and hours worked");
            String info = in.nextLine();
            String[] parts = info.split(",");
            String name = parts[0].trim();
            int wage = Integer.parseInt(parts[1].trim());
            int hours = Integer.parseInt((parts[2]).trim());
            Student student = new Student(name, wage, hours);
            students.add(student);

            System.out.println("Enter Q to quit. Enter continue to continue");
            String quitInpuit = in.nextLine();
            if (quitInpuit.equalsIgnoreCase("Q")) {
                continueEnteringStudents = false;
            }
        }

        for (Student student: students){
            System.out.println(student.getName() + "'s salary is " + " " + student.getSalary());
        }
    }
}

