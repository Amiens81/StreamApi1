package SecondTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
	public static void main(String[] args) {
		List<Person> person = new ArrayList<>();
		person.add(new Person("Alexandr", 33));
		person.add(new Person("Alexey", 28));
		person.add(new Person("Inga", 32));
		person.add(new Person("Svetlana", 22));
		person.add(new Person("Petr", 38));
		person.add(new Person("Polina", 25));
		person.add(new Person("Andrej", 23));
		person.add(new Person("Oksana", 29));
		person.add(new Person("Oleg", 18));
		person.add(new Person("Alina", 34));
		System.out.println("Первый вариант. Список людей старше 30 ");
		person.stream().filter(el -> el.getAge() > 30).forEach( System.out::println);
		List<Person> personOver30 = person.stream().filter(el -> el.getAge() > 30).collect(Collectors.toList());
		System.out.println("Второй вариант вывода. Люди старше 30: \n" + personOver30);
		List<Person> personOver = person.stream().filter(el -> el.getAge() > 30).toList();
		System.out.println("Третий вариант вывода. Люди старше 30: \n" + personOver);

	}
}