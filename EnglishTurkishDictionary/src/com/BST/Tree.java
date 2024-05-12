package com.BST;

public class Tree {

	Node root;
	
	public Tree() {
		root=null;
	}
	
	Node newNode (String word,String turkishEquivalent,String meaning) {
		root=new Node(word, turkishEquivalent, meaning);
		return root;
	}
	
	Node insert(Node root,String word,String turkishEquivalent,String meaning) {
		if(root!=null) {
			if(word.compareTo(root.word)<0) 
				root.left=insert(root.left,word,turkishEquivalent,meaning);
			else 
				root.right=insert(root.right,word,turkishEquivalent,meaning);
		}
			else
				root=newNode(word,turkishEquivalent,meaning);
			return root;
		}
	
	Node search(String word) {
        return Searching(root, word);
    }
	
	Node Searching(Node root,String word){
		
		if(root!=null){
			int comparison = word.compareTo(root.word);
			if(comparison==0) {
				System.out.println("Found");
				System.out.println(word+"  =  "+root.turkishEquivalent+"  =  "+root.meaning);
			return root;
			}
			else if(comparison<0)
				return Searching(root.left,word);
			else {
				return Searching(root.right,word);
			}
		}
		else if(root==null ) {
			System.out.println("Word not found in the binary search tree");
		}
		return null;
		 
	}	
	
	
	void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.println(root.word+"  =  "+root.turkishEquivalent+"  =  "+root.meaning);
			inOrder(root.right);
		}
	}
	
	
    void postOrder(Node root) {
    	if(root!=null) {
    		postOrder(root.left);
    		postOrder(root.right);
    		System.out.println(root.word+"  =  "+root.turkishEquivalent+"  =  "+root.meaning);
    	}
    }
	
    
	void preOrder(Node root) {
		if(root!=null) {
			System.out.println(root.word+"  =  "+root.turkishEquivalent+"  =  "+root.meaning);
			preOrder(root.left);
			preOrder(root.right);
			
		}
	}
}
