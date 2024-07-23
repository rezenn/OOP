public class test{
    public static void main(String[] args) {
        Student s1 = new Student("312", "Ram", 3.33);
        s1.updateGPA(3.76); // Use setter method
        s1.printProfile();
      }
}
class Student {

    private String studentID;

    private String name;

    private double gpa;

 

    public Student(String studentID, String name, double gpa) {

        this.studentID = studentID;

        this.name = name;

        this.gpa = gpa;

    }
    public void updateGPA(double newGPA) {

        this.gpa = newGPA;

    }
    public void printProfile() {

        System.out.println("Student ID: " + studentID);

        System.out.println("Name: " + name);

        System.out.println("GPA:" + gpa);

    }

}

