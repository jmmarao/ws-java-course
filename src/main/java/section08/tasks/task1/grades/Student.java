package section08.tasks.task1.grades;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade() {
        double weight1 = 30.0;
        double weight2 = 35.0;
        double weight3 = 35.0;

        return (weight1 * grade1 + weight2 * grade2 + weight3 * grade3) / (weight1 + weight2 + weight3);
    }

    public String approved() {
        if (finalGrade() >= 60.0)
            return "PASS";
        return "FAILED";
    }

    public double missingPoints() {
        if (approved().equals("FAILED"))
            return 60.0 - finalGrade();
        return 0.0;
    }
}
