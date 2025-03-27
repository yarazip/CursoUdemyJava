package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String>fila = new LinkedList<>();
		
		fila.add("Ana");
		fila.add("Bia");
		fila.add("Carlos");
		fila.add("Daniel");
		fila.add("Rafaela");
		fila.add("Gui");
		
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		//fila.size() - tamanho da fila
		//fila.clear()- limpa a fila
		//fila.isEmpty() - pra saber se a fila está ou não vazia
		//fila.contains()- oara saber se um objeto está ou não contido
		
		
		//poll e remjove obtem o próximo elemento da fila
		System.out.println(fila.poll()); //pra chamar a fila
		System.out.println(fila.remove());//não funciona quando anlista estiver vazia
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());

		
	}
}

