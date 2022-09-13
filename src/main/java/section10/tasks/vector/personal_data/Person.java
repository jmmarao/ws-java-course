package section10.tasks.vector.personal_data;

public class Person {
    private Character gender;
    private Double height;

    public Person(Character gender, Double height) {
        this.gender = gender;
        this.height = height;
    }

    public Character getGender() {
        return gender;
    }

    public Double getHeight() {
        return height;
    }
}
