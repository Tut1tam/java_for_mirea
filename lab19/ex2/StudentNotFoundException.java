package ex2;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String name) {
        super("Студент с ФИО "+ name + " не найден!");
    }
}
