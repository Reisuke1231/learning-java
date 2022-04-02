public class StudentProfile {
    String firstName;
    String lastName;
    String declaredMajor;
    double gpa;
    int expectedYearTograduate;

    public StudentProfile(String firstName, String lastName, String declaredMajor, double gpa, int expectedYearTograduate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.declaredMajor = declaredMajor;
        this.gpa = gpa;
        this.expectedYearTograduate = expectedYearTograduate;
    }

    public void incrementExpectedGraduationyear() {
        this.expectedYearTograduate = this.expectedYearTograduate + 1;
    }
}
