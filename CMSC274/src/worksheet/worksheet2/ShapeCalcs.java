package worksheet.worksheet2;

import java.util.Scanner;

public class ShapeCalcs {
	public class A {
		public String a = "1";

		public A() {
			System.out.print("2");
		}
	}

	public class B extends A {
		public B() {
			System.out.print("3");
		}

		public void printA() {
			a = "4";
			System.out.print(this.a + super.a);
		}

		public void main(String[] args) {
			new B().printA();
		}
	}
}