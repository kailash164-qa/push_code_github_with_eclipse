package mmc.com.app;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < 3; i++) {

			int j, first = arr[0];

			for (j = 0; j < arr.length - 1; j++) {

				arr[j] = arr[j + 1];

			}

			arr[j] = first;

		}

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}
		
		
		
		
		
		List<String> list = Arrays.asList("Apple","Pune","kol","Amar","Hhh");
		
		
		Optional<String> d = list.stream().filter(x->x.startsWith("A")).findFirst();
	
		System.out.println(d.get());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
