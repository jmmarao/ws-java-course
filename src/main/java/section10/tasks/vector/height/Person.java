package section10.tasks.vector.height;

public class Person {
    private String name;
    private Integer age;
    private Double height;

    public Person(String name, Integer age, Double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getHeight() {
        return height;
    }
}
