package e1;

public class EncapsulatedStudent02 {
    private String studentName;
    private int average;
    private int grade;
    private double gpa;

    public EncapsulatedStudent02(String studentName, int average, int grade, double gpa) {
        this.studentName = studentName;
        this.average = average;
        this.grade = grade;
        this.gpa = gpa;
    }

    public String toString() {
        return "Student Name: " + studentName +
        "\nAverage: " + average +
        "\nGrade: " + grade +
        "\nGPA: " + gpa;
    }

    public int setGpa(int gpa) {
        this.gpa = gpa;
        return gpa;
    }

}