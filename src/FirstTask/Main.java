package FirstTask;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
	List<String> list = Arrays.asList("Апельсин", "Арбуз", " Ананас", "Говядина", "Баранки", "Гречка",
			"Баклажан", "Виноград", "Ветчина", "Вишня");
	Scanner scanner = new Scanner(System.in);
	//todo Первый вариант через динамический scanner
		System.out.println("Введите одну букву с А до В включительно, с которой может начинаться слово!");

	String str2 = scanner.nextLine().trim().toUpperCase();
	long counter = list.stream()
			.map(String::strip)
			.filter(el ->  el.startsWith(str2))
			.count();
		System.out.println("Первый вариант. В списке с буквы " + str2 + " начинается " + counter + " слова");

		scanner.close();

		//todo Второй вариант статический
		long count = list.stream()
				.map(String::strip)
				.filter(str -> str.charAt(0) == 'А')
				.count();

		System.out.println("Второй вариант. В списке с буквы А начинается " + count + " слова.");

	}

}