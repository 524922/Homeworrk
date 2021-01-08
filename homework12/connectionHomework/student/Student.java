package endTermHomeWork.homework12.connectionHomework.student;

public class Student implements Comparable {
    private String id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o){
        if(!(o instanceof Student)){
            throw  new RuntimeException("Not the Object of 'Student'");
        }
        Student student=(Student) o;
        if(this.age>student.age){
            return 1;
        }
        if(this.age==student.age){
            return this.name.compareTo(student.name);
        }
        return -1;
    }
}
