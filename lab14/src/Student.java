import java.util.Objects;

public class Student implements Test {
    private int id;
    private double average;

    public Student(int id, double average) {
        this.id = id;
        this.average = average;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", average=" + average +
                '}';
    }

    public static void binfind(Test[] test, int first, int last, double item) {
        long start = System.currentTimeMillis();
        int position;
        int comparisonCount = 1;    // подсчитывает количество сравнений

        // находим индекс среднего элемента массива
        position = (first + last) / 2;

        while ((test[position].getAverage() != item) && (first <= last)) {
            comparisonCount++;
            if (test[position].getAverage() > item) {  // если число заданного для поиска
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println("Бинарный поиск: " + item + " является " + ++position + " элементом в массиве");
            long finish = System.currentTimeMillis();
            long timeConsumedMillis = finish - start;
            System.out.println("Время поиска: " + timeConsumedMillis + " мc");
        } else {
            System.out.println("Элемент не найден в массиве");
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Double.compare(student.average, average) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, average);
    }

    public static void linfind(Test[] test, int average) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            if (test[i].getAverage() == average) {
                System.out.println("Линейный поиск: " + average + " является " + (i + 1) + " элементом в массиве ");
                long finish = System.currentTimeMillis();
                long timeConsumedMillis = finish - start;
                System.out.println("Время поиска: " + timeConsumedMillis + " мc");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Test[] test = new Student[5];
        test[0] = new Student(1, 3.45);
        test[1] = new Student(2, 3.61);
        test[2] = new Student(3, 4.89);
        test[3] = new Student(4, 4.35);
        test[4] = new Student(5, 5);

        binfind(test, 1, 5, 5);
        linfind(test, 5);

    }
}