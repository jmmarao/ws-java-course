package section10.tasks.vector.approved;

public class Student {
    private String name;
    private Double firstSemesterGrade;
    private Double secondSemesterGrade;

    public Student(String name, Double firstSemesterGrade, Double secondSemesterGrade) {
        this.name = name;
        this.firstSemesterGrade = firstSemesterGrade;
        this.secondSemesterGrade = secondSemesterGrade;
    }

    public boolean isApproved() {
        return (firstSemesterGrade + secondSemesterGrade) / 2 >= 6.0;
    }

    public String getName() {
        return name;
    }
}
