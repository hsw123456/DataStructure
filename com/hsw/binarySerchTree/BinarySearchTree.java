package com.hsw.binarySerchTree;

public class BinarySearchTree {
	
	protected Node root;

	public BinarySearchTree() {
		root = null;
	}
	
	public void insert(int x){
		root = insert(x,root);
	}
	
	public void remove(int x){
		root = remove(x,root);
	}
	
	public void removeMin(){
		root = removeMin(root);
	}
	
	public Integer findMin(){
		return elementAt(findMin(root));
	}
	
	public Integer findMax(){
		return elementAt(findMax(root));
	}
	
	public Integer find(int x){
		return elementAt(find(x,root));
	}
	
	public void makeEmpty(){
		root  = null;
	}
	
	public boolean isEmpty(){
		return root== null;
	}

	private Node find(int x, Node t) {
		while(t != null){
			if(t.element> x){
				t = t.leftChild;
			}else if (t.element <x) {
				t = t.rightChild;
			}else {
				return t;
			}
		}
		
		return null;
	}

	private Node findMax(Node t) {
		if(t != null){
			while(t.rightChild != null)
				t= t.rightChild;
		}
		
		return t;
	}
	
	//返回该节点的值
	private Integer elementAt(Node t) {
		return t == null? null:t.element;
	}

	private Node findMin(Node t) {
		if(t != null){
			while(t.leftChild != null)
				t= t.leftChild;
		}
		
		return t;
	}

	protected Node removeMin(Node t) {
		if( t== null)
			throw new RuntimeException("Tree is empty, doesn's find the minst Number");
		 if(t.leftChild != null){
			 t.leftChild = removeMin(t.leftChild);
			 return t;
		 }
		 
		 return t.rightChild;
	}

	protected Node remove(int x, Node t) {
		
		return null;
	}

	protected Node insert(int x, Node t) {
		if(t== null){
			t = new Node(x);
		}else if (t.element >x) {
			t.leftChild = insert(x, t.leftChild);
		}else if (t.element <x) {
			t.rightChild = insert(x, t.rightChild);
		}
		return t;
	}
	
	

}
