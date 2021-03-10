package view;

import controller.Matriz;

public class Principal extends Matriz {

	public Principal(int i) {
		super(i);
		
	}

	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			Thread t = new Matriz(i);
			t.start();
			}
		for (int j = 0; j < 5; j++) {
			Thread t = new Matriz(j);
			t.start();
		}
		
	}

}
