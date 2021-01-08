package endTermHomeWork.homework4.chapter7.p17;

public class entity {
    private String name;
    private long grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getGrade() {
        return grade;
    }

    public void setGrade(long grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "entity{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
