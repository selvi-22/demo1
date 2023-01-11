package com.chainsys.java8.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductTest {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "Laptop", 30000));
		productList.add(new Product(2, "Mobile", 10000));
		productList.add(new Product(3, "HP Laptop", 30000));
		productList.add(new Product(4, "Tablet", 45000));
		productList.add(new Product(5, "Monitor", 3000));
		
		System.out.println(productList);
		List<Integer> productPriceList = new ArrayList<Integer>();
		for (Product products : productList) {
			//System.out.println(products);
			
			if (products.price < 30000) {
				productPriceList.add(products.price);
			}

		}
		System.out.println(productPriceList);
	}

}
