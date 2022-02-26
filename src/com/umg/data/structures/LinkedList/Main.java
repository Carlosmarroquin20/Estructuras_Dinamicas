package com.umg.data.structures.LinkedList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		DoublyLinkedList<String> ListNode = new DoublyLinkedList<String>();
		
        System.out.println("║═════════════════════════════════════║");
		System.out.println("║              Bienvenid@s            ║");
		System.out.println("║═════════════════════════════════════║");
        System.out.println("────────────────────────────────────────");
		System.out.println("-Ingresa la opcion que a la que quieras-");
		System.out.println("────────────────────────────────────────");
		System.out.println(" 1)  Insertar al inicio");
        System.out.println("────────────────────────────────────────");
		System.out.println(" 2)  Insertar al final");
        System.out.println("────────────────────────────────────────");
		System.out.println(" 3)  Recorrer hacia adelante");
        System.out.println("────────────────────────────────────────");
		System.out.println(" 4)  Recorrer hacia atras");
        System.out.println("────────────────────────────────────────");
		System.out.println(" 5)  Mostrar el tamaño de la lista");
        System.out.println("────────────────────────────────────────");
		System.out.println(" 6)  Mostrar si la lista este vacia");
        System.out.println("────────────────────────────────────────");
		System.out.println(" 7)  Buscar elemento por valor");
        System.out.println("────────────────────────────────────────");
		System.out.println(" 8)  Buscar elemento por indice");
        System.out.println("────────────────────────────────────────");
		System.out.println(" 9)  Borrar un elemento");
        System.out.println("────────────────────────────────────────");
		System.out.println(" 10) Salir");
        System.out.println("────────────────────────────────────────");
		Scanner sc = new Scanner(System.in); 
		int Elecc = sc.nextInt();
			
			switch(Elecc) {
		    case 1:
                System.out.println("────────────────────────────────────────");
		    	System.out.println("Insertar Inicio");
		    	System.out.println("────────────────────────────────────────");
                System.out.println("");
		    	System.out.println("Agregar dato 1");
		    	String DataInicio1 = sc.next();
                System.out.println("────────────────────────────────────────");
		    	System.out.println("Agregar dato 2");
		    	String DataInicio2 = sc.next();
                System.out.println("────────────────────────────────────────");
		    	System.out.println("Agreguar dato 3");
		    	String DataInicio3 = sc.next();
                System.out.println("────────────────────────────────────────");
		    	System.out.println("────────────────────────────────────────");
		    	System.out.print("Desea mostrar la lista?");
                System.out.println("");
                System.out.println("1) SI");
                System.out.println("2) NO");
                System.out.println("────────────────────────────────────────");
                int option = sc.nextInt();
		    	ListNode.insertAtHead(DataInicio1);
		    	ListNode.insertAtHead(DataInicio2);
		    	ListNode.insertAtHead(DataInicio3);
		    	
                if(option==1){
                    ListNode.traverseForward();
                }else{
                    System.out.println("");
                    System.out.println("║═════════════════════════════════════║");
                    System.out.println("║            GRACIAS ADIOS            ║");
                    System.out.println("║═════════════════════════════════════║");
                    System.out.println("");  
                }
		    	
		    	break;
		    
		    case 2:
                System.out.println("────────────────────────────────────────");
		    	System.out.println("Insertar Final ");
		    	System.out.println("────────────────────────────────────────");
		    	System.out.println("Agregar dato 1");
		    	String DataInicio11= sc.next();
                System.out.println("────────────────────────────────────────");
		    	System.out.println("Agregar dato 2");
		    	String DataInicio22 = sc.next();
                System.out.println("────────────────────────────────────────");
		    	System.out.println("Agregar dato 3");
		    	String DataInicio33 = sc.next();
                System.out.println("────────────────────────────────────────");
		    	System.out.println("────────────────────────────────────────");
		    	System.out.print("  Desea mostrar la lista?");
                System.out.println("");
                System.out.println("1) SI");
                System.out.println("2) NO");
                System.out.println("────────────────────────────────────────");
                int option2 = sc.nextInt();
		    	ListNode.insertAtTail(DataInicio11);
		    	ListNode.insertAtTail(DataInicio22);
		    	ListNode.insertAtTail(DataInicio33);
		    	
                if(option2==1){
                    ListNode.traverseBackward();
                }else{
                    System.out.println("");
                    System.out.println("║═════════════════════════════════════║");
                    System.out.println("║            GRACIAS ADIOS            ║");
                    System.out.println("║═════════════════════════════════════║");
                    System.out.println("");   
                }
            
		    	break;
		    	
		    case 3:
                System.out.println("────────────────────────────────────────");
		    	System.out.println("Recorrer Para Adelante");
		    	System.out.println();
                System.out.println("────────────────────────────────────────");
		    	System.out.println("Agregue un dato 1");
		    	String DataInicio111= sc.next();
                System.out.println("────────────────────────────────────────");
		    	System.out.println("Agregue un dato 2");
		    	String DataInicio222 = sc.next();
                System.out.println("────────────────────────────────────────");
		    	System.out.println("Agregue un dato 3");
		    	String DataInicio333 = sc.next();
                System.out.println("────────────────────────────────────────");
		    	System.out.println("");
		    	ListNode.insertAtHead(DataInicio111);
		    	ListNode.insertAtHead(DataInicio222);
		    	ListNode.insertAtHead(DataInicio333);
		    	
		    	ListNode.traverseForward();
		    	break;
		    	
		    case 4:
                System.out.println("────────────────────────────────────────");
		    	System.out.println("Recorrer Para Atras");
		    	System.out.println();
                System.out.println("────────────────────────────────────────");
				System.out.println("Agregar dato 1");
		    	String Data41= sc.next();
                System.out.println("────────────────────────────────────────");
		    	System.out.println("Agregar dato 2");
		    	String Data42 = sc.next();
                System.out.println("────────────────────────────────────────");
		    	System.out.println("Agregar dato 3");
		    	String Data43 = sc.next();
                System.out.println("────────────────────────────────────────");
		    	System.out.println("");
		    	ListNode.insertAtHead(Data41);
		    	ListNode.insertAtHead(Data42);
		    	ListNode.insertAtHead(Data43);
	
		    	ListNode.traverseBackward();
		    	break;
		    	
		    case 5:
                System.out.println("────────────────────────────────────────");
		    	System.out.println("             Tamaño lista               ");
                System.out.println("────────────────────────────────────────");
		    	System.out.println("Agregar dato 1");
		    	String Data51= sc.next();
                System.out.println("────────────────────────────────────────");
		    	System.out.println("Agregar dato 2");
		    	String Data52 = sc.next();
                System.out.println("────────────────────────────────────────");
		    	System.out.println("Agregar dato 3");
		    	String Data53 = sc.next();
                System.out.println("────────────────────────────────────────");
		    	System.out.println("");
		    	ListNode.insertAtHead(Data51);
		    	ListNode.insertAtHead(Data52);
		    	ListNode.insertAtHead(Data53);
		    	
		    	ListNode.traverseForward();
		    	
		    	int SizeList = ListNode.size();

		    	System.out.println("El tamaño de la lista es: " + SizeList);
		    	break;
		    	
		    case 6:
                System.out.println("────────────────────────────────────────");
		    	System.out.println("Por mostrar si la lista estuviese vacia");
                System.out.println("────────────────────────────────────────");
		    	System.out.println("Desea ingresar datos?");
		    	System.out.println("1.- Si || 2.- No");
		    	System.out.println("");
		    	int Data = sc.nextInt();
		    	
		    	if (Data == 1) {
					System.out.println("────────────────────────────────────────");
		    		System.out.println("Agregar dato 1");
			    	String Data61 = sc.next();
					System.out.println("────────────────────────────────────────");
			    	System.out.println("Agregar dato 2");
			    	String Data62 = sc.next();
					System.out.println("────────────────────────────────────────");
			    	System.out.println("Agregar dato 3");
			    	String Data63 = sc.next();
					System.out.println("────────────────────────────────────────");
			    	System.out.println("");
			    	
			    	ListNode.insertAtHead(Data61);
			    	ListNode.insertAtHead(Data62);
			    	ListNode.insertAtHead(Data63);
			    	
			    	ListNode.traverseForward();
			    	
		    		Boolean Equals = ListNode.isEmpty();
		    		System.out.println("?La lista est? vac?a? " + Equals);
		    	} else {
		    		Boolean Equals = ListNode.isEmpty();
		    		System.out.println("?La lista est? vac?a? " + Equals);
		    	}
		    	break;
		    	
		    case 7:
				System.out.println("────────────────────────────────────────");	
		    	System.out.println("Buscar elemento por valor");
		    	System.out.println("");
				System.out.println("────────────────────────────────────────");
		    	System.out.println("Agregar un dato 1");
		    	String Data71 = sc.next();
				System.out.println("────────────────────────────────────────");
		    	System.out.println("Agregar un dato 2");
		    	String Data72 = sc.next();
				System.out.println("────────────────────────────────────────");
		    	System.out.println("Agregar un dato 3");
		    	String Dato73 = sc.next();
				System.out.println("────────────────────────────────────────");
		    	System.out.println("");
		    	ListNode.insertAtHead(Data71);
		    	ListNode.insertAtHead(Data72);
		    	ListNode.insertAtHead(Dato73);
		    	ListNode.traverseForward();

		    	System.out.println("");
				System.out.println("────────────────────────────────────────");
		    	System.out.println("Agrega dato que deseas buscar:");
				System.out.println("────────────────────────────────────────");
		    	int Look = sc.nextInt();
		    	
		    	if (Look == 1) {
		    		ListNode.searchByValue(Data71);
					System.out.println("────────────────────────────────────────");
		    		System.out.println("El valor es: " + Data71);
					System.out.println("────────────────────────────────────────");
		    	} else if (Look == 2) {
		    		ListNode.searchByValue(Data72);
					System.out.println("────────────────────────────────────────"); 
		    		System.out.println("El valor es: " + Data72);
					System.out.println("────────────────────────────────────────");
		    	} else {
		    		ListNode.searchByValue(Dato73);
					System.out.println("────────────────────────────────────────");
		    		System.out.println("El valor es: " + Dato73);
					System.out.println("────────────────────────────────────────");
		    	}
		    	break;
		    	
		    case 8:
				System.out.println("────────────────────────────────────────");	
		    	System.out.println("Buscar elemento por indice");
				System.out.println("────────────────────────────────────────");
		    	System.out.println("");
				System.out.println("────────────────────────────────────────");
		    	System.out.println("Agregar dato 1");
		    	String Data81 = sc.next();
				System.out.println("────────────────────────────────────────");
		    	System.out.println("Agregar dato 2");
		    	String Data82 = sc.next();
				System.out.println("────────────────────────────────────────");
		    	System.out.println("Agregar dato 3");
		    	String Data83 = sc.next();
		    	System.out.println("");
		    	ListNode.insertAtHead(Data81);
		    	ListNode.insertAtHead(Data82);
		    	ListNode.insertAtHead(Data83);
		    	
		    	ListNode.traverseForward();

		    	System.out.println();
				System.out.println("────────────────────────────────────────");
		    	System.out.println("Agrega dato que deseas buscar:");
				System.out.println("────────────────────────────────────────");
		    	int LookIndex = sc.nextInt();
		    	
		    	if (LookIndex == 1) {
		    		ListNode.searchByIndex(0); 
		    		System.out.println("El indice es: " + Data81);
		    	} else if (LookIndex == 2) {
		    		ListNode.searchByIndex(1); 
		    		System.out.println("El indice es: " + Data82);
		    	} else {
		    		ListNode.searchByIndex(2);
		    		System.out.println("El indice es: " + Data83);
		    	}
		    	break;
		    	
		    case 9:
				System.out.println("────────────────────────────────────────");
		    	System.out.println("Borrar un elemento");
				System.out.println("────────────────────────────────────────");
		    	System.out.println();
				System.out.println("────────────────────────────────────────");
		    	System.out.println("Agregar dato 1");
		    	String Data91 = sc.next();
				System.out.println("────────────────────────────────────────");
		    	System.out.println("Agregar dato 2");
		    	String Data92 = sc.next();
				System.out.println("────────────────────────────────────────");
		    	System.out.println("Agregar dato 3");
		    	String Data93 = sc.next();
				System.out.println("────────────────────────────────────────");
		    	System.out.println("");
		    	ListNode.insertAtHead(Data91);
		    	ListNode.insertAtHead(Data92);
		    	ListNode.insertAtHead(Data93);
		    	
		    	ListNode.traverseForward();

		    	System.out.println();
				System.out.println("────────────────────────────────────────");
		    	System.out.println("Ingrese el indice a eliminar:");
				System.out.println("────────────────────────────────────────");
		    	int DelteLayer = sc.nextInt();
		    	
		    	if (DelteLayer == 1) {
		    		ListNode.deleteFromPosition(1); 
		    	} else if (DelteLayer == 2) {
		    		ListNode.deleteFromPosition(2); 
		    	} else {
		    		ListNode.deleteFromPosition(3); 
		    	}
		    	
		    	System.out.println();
		    	ListNode.traverseForward();
		    	break;

            case 10:
			System.out.println("");
			System.out.println("║═════════════════════════════════════║");
			System.out.println("║           Eso es todo GG            ║");
			System.out.println("║═════════════════════════════════════║");
			System.out.println("");
                break;
			}		
	}
	
}
