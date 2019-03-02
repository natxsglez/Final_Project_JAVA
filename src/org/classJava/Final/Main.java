package org.classJava.Final;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("              _\r\n" + 
				"             | |\r\n" + 
				"             | |===( )   //////\r\n" + 
				"             |_|   |||  | o o|\r\n" + 
				"                    ||| ( c  )                  ____\r\n" + 
				"                     ||| \\= /                  ||   \\_\r\n" + 
				"                      ||||||                   ||     |\r\n" + 
				"                      ||||||                ...||__/|-\"\r\n" + 
				"                      ||||||             __|________|__\r\n" + 
				"                        |||             |______________|\r\n" + 
				"                        |||             || ||      || ||\r\n" + 
				"                        |||             || ||      || ||\r\n" + 
				"------------------------|||-------------||-||------||-||-------\r\n" + 
				"                        |__>            || ||      || ||\r\n" + 
				"\r\n" + 
				"" + "¡Bienvenido a Coffee & Code!\n"
				+ "¿Cuántas bebidas deseas ordenar?\n");
		int amount_beverages = (scan.nextInt());
		if(amount_beverages <= 0) {
			System.out.printf("¡Gracias por tu preferencia!");
			System.exit(0);
		}
		
		double total_bill = 0;
		double []coffee_prices = {
				(double) 36.56,
				(double) 42.34,
				(double) 51.7200 
				};
		double []tea_prices = {
				(double) 20.99,
				(double) 25.83, 
				(double) 30.11
				};
		double []frappuccino_prices = {
				(double) 45.35, 
				(double) 54.67, 
				(double) 64.81
				};
		
		String []bev_names = new String[amount_beverages];
		String []bev_size = new String[amount_beverages];
		String []bev_types = new String[amount_beverages];
		String []bev_milk = new String[amount_beverages];
		
		double []bev_price = new double[amount_beverages];
		double []milk_price = new double[amount_beverages];
		
		for(int i = 0; i < amount_beverages; i++) 
		{
			System.out.printf("Ingresa el tipo de bebida('C' para Café, 'T' para Té o 'F' para Frappuccino): ");
			String bev_name = scan.next();

			if(bev_name.contains("C")) {
				Coffee coffee = new Coffee();
				coffee.setName(bev_name);
				bev_names[i] = "CAFE";
				
				System.out.printf("Ingresa el tamaño de la bebida('1' para Chico, '2' para Mediano o '3' para Grande): ");
				coffee.setSize(scan.nextInt());
				
				if(coffee.getSize() == 1) 
				{
					coffee.setPrice(coffee_prices[0]);
					bev_size[i] = "CHICO";
					bev_price[i] = coffee.getPrice();
					total_bill += coffee.getPrice();
					
				}
				else if(coffee.getSize() == 2) 
				{
					coffee.setPrice(coffee_prices[1]);
					bev_size[i] = "MEDIANO";
					bev_price[i] = coffee.getPrice();
					total_bill += coffee.getPrice();
					
				}
				else if(coffee.getSize() == 3) 
				{
					coffee.setPrice(coffee_prices[2]);
					bev_size[i] = "GRANDE";
					bev_price[i] = coffee.getPrice();
					total_bill += coffee.getPrice();
				}
				
				System.out.printf("Ingresa el tipo de grano(Moka, Robusta o Excelsa): ");
				coffee.setGrain(scan.next());
				bev_types[i] = coffee.getGrain().toUpperCase();
				
				System.out.printf("¿Con leche?('S' para Sí o 'N' para No): ");
				String with_milk = scan.next();
				if(with_milk.contains("S")) 
				{
					coffee.setWith_milk(true);
					bev_milk[i] = "CON LECHE";
					milk_price[i] = 3;
					total_bill += 3;
				}
				else {
					coffee.setWith_milk(false);
					bev_milk[i] = "SIN LECHE";
					milk_price[i] = 0;
				}
			}
			
			else if(bev_name.contains("T")) {
				Tea tea = new Tea();
				tea.setName(bev_name);
				bev_names[i] = "TE";
				
				System.out.printf("Ingresa el tamaño de la bebida('1' para Chico, '2' para Mediano o '3' para Grande): ");
				tea.setSize(scan.nextInt());
				
				if(tea.getSize() == 1) 
				{
					tea.setPrice(tea_prices[0]);
					bev_size[i] = "CHICO";
					bev_price[i] = tea.getPrice();
					total_bill += tea.getPrice();
					
				}
				else if(tea.getSize() == 2) 
				{
					tea.setPrice(tea_prices[1]);
					bev_size[i] = "MEDIANO";
					bev_price[i] = tea.getPrice();
					total_bill += tea.getPrice();
					
				}
				else if(tea.getSize() == 3) 
				{
					tea.setPrice(tea_prices[2]);
					bev_size[i] = "GRANDE";
					bev_price[i] = tea.getPrice();
					total_bill += tea.getPrice();
				}
				
				System.out.printf("Ingresa el tipo de té(Manzanilla, Verde o Limón): ");
				tea.setLeaf(scan.next());
				bev_types[i] = tea.getLeaf().toUpperCase();
				
				System.out.printf("¿Con leche?('S' para Sí o 'N' para No): ");
				String with_milk = scan.next();
				if(with_milk.contains("S")) 
				{
					tea.setWith_milk(true);
					bev_milk[i] = "CON LECHE";
					milk_price[i] = 3;
					total_bill += 3;
				}
				else {
					tea.setWith_milk(false);
					bev_milk[i] = "SIN LECHE";
					milk_price[i] = 0;
				}
			}
			
			else if(bev_name.contains("F")) {
				Frappuccino frappuccino = new Frappuccino();
				frappuccino.setName(bev_name);
				bev_names[i] = "FRAPP";
				
				System.out.printf("Ingresa el tamaño de la bebida('1' para Chico, '2' para Mediano o '3' para Grande): ");
				frappuccino.setSize(scan.nextInt());
				
				if(frappuccino.getSize() == 1) 
				{
					frappuccino.setPrice(frappuccino_prices[0]);
					bev_size[i] = "CHICO";
					bev_price[i] = frappuccino.getPrice();
					total_bill += frappuccino.getPrice();
					
				}
				else if(frappuccino.getSize() == 2) 
				{
					frappuccino.setPrice(frappuccino_prices[1]);
					bev_size[i] = "MEDIANO";
					bev_price[i] = frappuccino.getPrice();
					total_bill += frappuccino.getPrice();
					
				}
				else if(frappuccino.getSize() == 3) 
				{
					frappuccino.setPrice(frappuccino_prices[2]);
					bev_size[i] = "GRANDE";
					bev_price[i] = frappuccino.getPrice();
					total_bill += frappuccino.getPrice();
				}
				
				System.out.printf("Ingresa el tipo de crema(Caramelo, Chips o Normal): ");
				frappuccino.setCream(scan.next());
				bev_types[i] = frappuccino.getCream().toUpperCase();
				
				System.out.printf("¿Con leche?('S' para Sí o 'N' para No): ");
				String with_milk = scan.next();
				if(with_milk.contains("S")) 
				{
					frappuccino.setWith_milk(true);
					bev_milk[i] = "CON LECHE";
					milk_price[i] = 3;
					total_bill += 3;
				}
				else {
					frappuccino.setWith_milk(false);
					bev_milk[i] = "SIN LECHE";
					milk_price[i] = 0;
				}
			}
			
			
		}
		
		System.out.printf("\n\n    TICKET DE COMPRA\n\n");
		System.out.printf("PRODUCTO\tPRECIO\n");
		for(int i = 0; i < amount_beverages; i++)
		{
			System.out.printf(
			bev_names[i] + "\t\t" + bev_price[i] + "\n" 
			+ bev_types[i] + "\n"
			+ bev_size[i] + "\n"
			+ bev_milk[i] + "\t" + milk_price[i] + "\n\n");
		}
		System.out.printf("TOTAL\t\t");
		System.out.printf("$%.2f\n\n", total_bill);
		System.out.printf("¡GRACIAS POR TU PREFERENCIA!");
		scan.close();
	}
}
