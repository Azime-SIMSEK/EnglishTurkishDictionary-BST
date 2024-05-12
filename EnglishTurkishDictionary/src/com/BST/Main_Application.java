package com.BST;
import java.util.*;

public class Main_Application {

	public static void main(String[] args) {

		int number;
		String word;
		String turkishEquivalent;
		String meaning;
		
		Tree BST=new Tree();
		BST.root=BST.insert(BST.root, "large "," genis"," eni cok olan");
		BST.root=BST.insert(BST.root, "false "," yanlis"," bir kurala bir ilkeye bir gercege uymama durumu");
		BST.root=BST.insert(BST.root, "set off "," tetiklemek "," harekete gecirmek");
		BST.root=BST.insert(BST.root, "carry on "," surdurmek "," devam ettirmek");
		BST.root=BST.insert(BST.root, "look after "," bakmak "," goz kulak olmak");
		BST.root=BST.insert(BST.root, "break down "," bozulmak "," bozma işine konu olmak");
		BST.root=BST.insert(BST.root, "temporal "," gecici "," kisa ve belli bir sure icin olan");
		
		try (Scanner scanner = new Scanner(System.in)) {
			while(true) {
			System.out.println("\nPlease enter a number between 1-6 :");
			System.out.println(" 1) Insert a new node : ");
			System.out.println(" 2) Search for a word : ");
			System.out.println(" 3) Print in-order : ");
			System.out.println(" 4) Print post-order : ");
			System.out.println(" 5) Print pre-order : ");
			System.out.println(" 6) Exit : ");
			
			number= scanner.nextInt();
			
			if(number==1) {
				System.out.println("Please enter word:");
				word=scanner.next();
				System.out.println("Please enter turkishEquivalent:");
				turkishEquivalent=scanner.next();
				System.out.println("Please enter meaning:");
				meaning=scanner.next();
		
				BST.root=BST.insert(BST.root,word,turkishEquivalent,meaning);
				
			}
			if(number==2) {
				scanner.nextLine();
				System.out.println("Please enter the word you want to look up:");
				word=scanner.nextLine();
				BST.root=BST.search(word);
				
			}
			if(number==3) {
				System.out.print("		---InOrder--- \n");
				BST.inOrder(BST.root);
				
			}if(number==4) {
				System.out.println("	  ---PostOrder--- \n");
				BST.postOrder(BST.root);
			}
			if(number==5) {
				System.out.print("		---PreOrder--- \n");
				BST.preOrder(BST.root);
			}
			if(number==6) {
				System.exit(0);
			}
			if(number<1 || number>6){
				System.out.println("Wrong number!!!Please enter a number between 1-6 : ");
			}	
  }
		}
	}
}