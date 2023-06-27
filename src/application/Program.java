package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Set<Product> set = new HashSet<>();
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));

		for (Product p : set) {
			System.out.println(p.getName() + ", " + p.getPrice());
		}

		Product prod = new Product("Notebook", 1200.0);
		// vai dar falso pq a minha classe nao tem a implementação do hashCodeEquals
		System.out.println(set.contains(prod));
	}
}