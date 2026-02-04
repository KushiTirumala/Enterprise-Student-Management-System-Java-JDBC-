public class Student {
    private int id;
    private String name;
    private String rollNumber;
    private String course;
    private int age;

    public Student() {}

    public Student(String name, String rollNumber, String course, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
        this.age = age;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public String getRollNumber() { return rollNumber; }
    public String getCourse() { return course; }
    public int getAge() { return age; }
}
