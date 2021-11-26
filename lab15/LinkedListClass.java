package lab15;
import java.util.LinkedList;

public class LinkedListClass{

    public static void main(String[] args) {

        LinkedList<String> states = new LinkedList<String>();

        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.addLast("Great Britain"); // добавляем на последнее место
        states.addFirst("Spain"); // добавляем на первое место
        states.add(1, "Italy"); // добавляем элемент по индексу 1

        System.out.printf("List has %d elements \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Portugal");
        for(String state : states){

            System.out.println(state);
        }
        // проверка на наличие элемента в списке
        if(states.contains("Germany")){

            System.out.println("List contains Germany");
        }

        states.remove("Germany");
        states.removeFirst(); // удаление первого элемента
        states.removeLast(); // удаление последнего элемента

        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        people.remove(1); // удаление второго элемента

        for(Person p : people){

            System.out.println(p.getName());
        }
        Person first = people.getFirst();
        System.out.println(first.getName()); // вывод первого элемента
    }
}
class Person{

    private String name;
    public Person(String value){

        name=value;
    }
    String getName(){return name;}
}
