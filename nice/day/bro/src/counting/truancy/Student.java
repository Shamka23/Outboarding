import java.util.Objects;

public class Student {
    private String name;
    private String faculty;
    private Integer year;

    public Student(String name, String faculty, Integer year) {
        this.name = name;
        this.faculty = faculty;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", faculty='" + faculty + '\'' +
                '}';
    }

    public Integer getYear() {
        return year;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
               Objects.equals(faculty, student.faculty) &&
               Objects.equals(year, student.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, faculty, year);
    }


}
