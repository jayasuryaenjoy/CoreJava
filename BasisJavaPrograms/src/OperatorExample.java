
public class OperatorExample {

	public static void main(String[] args) {
		// int x=10;
		// System.out.println(x++);//10 (11)
		// System.out.println(++x);//12
		// System.out.println(x--);//12 (11)
		// System.out.println(--x);//10
		//
		// int a=10;
		// int b=10;
		// System.out.println(a++ + ++a);//10+12=22
		// System.out.println(b++ + b++);//10+11=21
		//
		// boolean c=true;
		// boolean d=false;
		// System.out.println(~a);//-13 (minus of total positive value which starts from
		// 0)
		// System.out.println(~b);//13 (positive of total minus, positive starts from 0)
		// System.out.println(!c);//false (opposite of boolean value)
		// System.out.println(!d);//true

		// int a=10;
		// int b=5;
		// System.out.println(a+b);//15
		// System.out.println(a-b);//5
		// System.out.println(a*b);//50
		// System.out.println(a/b);//2
		// System.out.println(a%b);//0
		// System.out.println(10*10/5+3-1*4/2);
		// //100/5+3-1*4/2-->20+3-1*2--->20+3-2-->23-2-->21
		//
		// System.out.println(10<<2);//10*2^2=10*4=40
		// System.out.println(10<<3);//10*2^3=10*8=80
		// System.out.println(20<<2);//20*2^2=20*4=80
		// System.out.println(15<<4);//15*2^4=15*16=240
		// System.out.println(10>>2);//10/2^2=10/4=2
		// System.out.println(20>>2);//20/2^2=20/4=5
		// System.out.println(20>>3);//20/2^3=20/8=2
		//
		//
		// //For positive number, >> and >>> works same
		// System.out.println(20>>2);
		// System.out.println(20>>>2);
		// //For negative number, >>> changes parity bit (MSB) to 0
		// System.out.println(-20>>2);
		// System.out.println(-20>>>2);

		// int x = 10;
		// int y = 12;
		// if (x + y > 20) {
		// System.out.println("x + y is greater than 20");
		// } else {
		// System.out.println("x + y is greater than 20");
		// }
		//
		// String city = "Delhi";
		// if (city == "Meerut") {
		// System.out.println("city is meerut");
		// } else if (city == "Noida") {
		// System.out.println("city is noida");
		// } else if (city == "Agra") {
		// System.out.println("city is agra");
		// } else {
		// System.out.println(city);
		// }

		String address = "Delhi, India";

		if (address.endsWith("India")) {
			if (address.contains("Meerut")) {
				System.out.println("Your city is Meerut");
			} else if (address.contains("Noida")) {
				System.out.println("Your city is Noida");
			} else {
				System.out.println(address.split(",")[0]);
			}
		} else {
			System.out.println("You are not living in India");
		}

		int num = 2;
		switch (num) {
		case 0:
			System.out.println("number is 0");
			break;
		case 1:
			System.out.println("number is 1");
			break;
		default:
			System.out.println(num);
		}

		int sum = 0;
		for (int j = 1; j <= 10; j++) {
			sum = sum + j;
		}
		System.out.println("The sum of first 10 natural numbers is " + sum);

		String[] names = { "Java", "C", "C++", "Python", "JavaScript" };
		System.out.println("Printing the content of the array names:\n");
		for (String name : names) {
			System.out.println(name);
		}

		int i = 0;
		System.out.println("Printing the list of first 10 even numbers \n");
		while (i <= 10) {
			System.out.println(i);
			i = i + 2;
		}
		
		
		do {    
			System.out.println(i);    
			i = i + 2;    
			}while(i<=10);    

	}
}
