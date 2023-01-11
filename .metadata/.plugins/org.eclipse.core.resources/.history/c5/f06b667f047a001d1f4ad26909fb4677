package com.chainsys.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ProductTest2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "Laptop", 30000));
		productList.add(new Product(2, "Mobile", 10000));
		productList.add(new Product(3, "HP Laptop", 30000));
		productList.add(new Product(4, "Tablet", 45000));
		productList.add(new Product(5, "Monitor", 3000));

		List<Product> productList1 = new ArrayList<Product>();
		productList1.add(new Product(1, "cable", 30000));
		productList1.add(new Product(2, "TV", 10000));
		productList1.add(new Product(3, "Lenovo ", 30000));
		productList1.add(new Product(4, "Tablet", 45000));
		productList1.add(new Product(5, "Monitor", 3000));

		long count = productList.stream().count();
		System.out.println(count);

		System.out.println(productList1.stream().anyMatch(p -> p.name.equals("Laptop")));

		Stream.iterate(5, element -> element + 1).limit(2).forEach(System.out::println);
	}

}
