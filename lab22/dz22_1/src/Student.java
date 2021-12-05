import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

    private int IDNumber;
    private String name;
    private Date birthDate;
    private double[] points;
    private double gpa;

    public Student(int IDNumber, String name, Date birthDate) {
        this.IDNumber = IDNumber;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Student(int IDNumber, String name, Date birthDate, double[] points) {
        this.IDNumber = IDNumber;
        this.name = name;
        this.birthDate = birthDate;
        this.points = points;
        if (points != null && points.length > 0) {
            for (double point : points) {
                this.gpa += point;
            }
            this.gpa /= points.length;
        }
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate(String format) {
        if (format.equals("small")) {
            DateFormat dateFormat = new SimpleDateFormat("dd MM yy");
            return dateFormat.format(birthDate);
        }
        if (format.equals("medium")) {
            DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            return dateFormat.format(birthDate);
        }
        if (format.equals("full")) {
            DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
            return dateFormat.format(birthDate);
        }
        throw new IllegalArgumentException("Unknown argument: " + format);
    }

    public double[] getPoints() {
        return points;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "IDNumber=" + IDNumber +
                ", name='" + name + '\'' +
                ", birthDate=" + getBirthDate("medium") +
                ", gpa=" + gpa +
                '}';
    }
}