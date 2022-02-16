package clase;

import java.util.ArrayList;
import java.util.Iterator;

public class PruebaArrayList {
	
	public static void verLista(ArrayList<Integer> lista) {
		System.out.print("[");
		for(int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i));
			if(i < lista.size() - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	
	public static void borrarMaximo(ArrayList<Integer> lista) {
		
		Integer max = Integer.MIN_VALUE;
		int iMax = -1;
		
		for(int i = 0; i < lista.size(); i++) {
			if(max < lista.get(i)) {
				max = lista.get(i);
				iMax = i;
			}
		}
		
		if(iMax != -1) {
			lista.remove(iMax);
		}
	}
	
	public static void borrarMinimo(ArrayList<Integer> lista) {
		
		Integer min = Integer.MAX_VALUE;
		int iMin = -1;
		
		for(int i = 0; i < lista.size(); i++) {
			if(min > lista.get(i)) {
				min = lista.get(i);
				iMin = i;
			}
		}
		
		if(iMin != -1) {
			lista.remove(iMin);
		}
	}
	
	
	public static void verMayoresDe(ArrayList<Integer> lista, int numBase) {
		
		Iterator<Integer> it = lista.iterator();
		ArrayList<Integer> lista2;
		lista2 = new ArrayList<Integer>();
		
		while(it.hasNext()) {
			Integer numLista = (Integer)it.next();
			if(numLista > numBase) {
				lista2.add(numLista);
			}
		}
		
		System.out.println(lista2);
	}
	
	public static void main(String[] args) {
		
		
//		System.out.println(lista);
		
		System.out.println("BORRAR MAX");
		
		ArrayList<Integer> lista;
		lista = new ArrayList<Integer>();
		
		for(int cont = 1; cont <= 10; cont++) {
			lista.add((int) (Math.random()*101));
		}
		
		for(int cont = 1; cont <= 5; cont++) {
			borrarMaximo(lista);
			verLista(lista);
		}
		
		System.out.println("BORRAR MIN");
		
//		Elimina todos los valores de la lista
		lista.clear();
		
//		Crear la lista
		for(int cont = 1; cont <= 10; cont++) {
			lista.add((int) (Math.random()*101));
		}
		
//		Borrar minimos
		for(int cont = 1; cont <= 5; cont++) {
			borrarMinimo(lista);
			verLista(lista);
		}
		
		lista.clear();
		
//		Crear la lista
		for(int cont = 1; cont <= 10; cont++) {
			lista.add((int) (Math.random()*101));
		}
		
		verMayoresDe(lista, 20);
		
	}
}
