package JavaLearning;

import java.util.ArrayList;

public class Customer {

	public ArrayList<String> doSearch(String categoryName) {
		System.out.println("Searching the product: " + categoryName);
		ArrayList<String> prodList = new ArrayList<String>();

		switch (categoryName) {
		case "Apple":
			prodList.add("Macbook");
			prodList.add("Apple Products");
			prodList.add("Iphone");
			break;

		case "Samsung":
			prodList.add("Samsung tablet");
			prodList.add("Samsung Phone");
			prodList.add("samsung Ipod");
			break;

		case "Sony":
			prodList.add("Sony Vaio");
			prodList.add("Sony Phone");
			prodList.add("Sony tablet");

			break;

		default:
			System.out.println("Your category/Product is not available");
			break;
		}
		
		return prodList;

	}

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		ArrayList<String> appleList = c1.doSearch("Apple");
		System.out.println(appleList.size());
		System.out.println(appleList);
		
		ArrayList<String> sonyList = c1.doSearch("Sony");
		System.out.println(sonyList.size());
		System.out.println(sonyList);
		
		for(String e : sonyList) {
			System.out.println(e);
		}
		
		ArrayList<String> prestigeList  = c1.doSearch("Prestige");
		System.out.println(prestigeList.size());
		System.out.println(prestigeList);
		

	}

}
