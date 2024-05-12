package com.BST;

public class Node {
    String word;
    String turkishEquivalent;
    String meaning;
    Node left;
    Node right;
  

public Node (String word,String turkishEquivalent,String meaning) {
	
	  this.word=word;
	  this.turkishEquivalent=turkishEquivalent;
	  this.meaning=meaning;
	   
	  left=null;
	  right =null;
			  
  }
}
