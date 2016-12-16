package com.hsw.datasturctor;

/**
 * 模拟以整数为节点的二叉树
 * @author Administrator
 *
 */
public class BinaryIntTree {
	
	private BinaryIntNode root;//根节点的引用

	public BinaryIntNode getRoot() {
		return root;
	}
	

	public void setRoot(BinaryIntNode root) {
		this.root = root;
	}


	public BinaryIntTree() {
		root = null;
	}
	
	public BinaryIntTree(int rootItem){
		root = new BinaryIntNode(rootItem,null,null);
	}
	
	/**
	 * 返回二叉树的模
	 * @param rootItem
	 */
	public int size(){
		return BinaryIntNode.size(root);
	}
	/**
	 * 返回二叉树的高度
	 * @return
	 */
	public int height(){
		return BinaryIntNode.height(root);
	}
	
	//对树的三种遍历方式的实现
	//前序遍历
	public void printPreOrder(){
		if(root != null)
			root.printPreOredr();
	}
	//中序遍历
	public void printInOrder(){
		if(root != null)
			root.printInOredr();
		
	}
	//后续遍历
	public void printPostOrder(){
		if(root != null)
			root.printPostOredr();
		
	}
	
	//清空树
	public void makeEmpty(){
		root  = null;
	}
	//判断树是否为空
	public boolean isEmpty(){
		return root == null;
	}
	//合并两颗树,并重讲一个新树
	public void merge(Integer rootItem,BinaryIntTree t1, BinaryIntTree t2){
		if(t1.root == t2.root && t1.root != null){
			throw new IllegalArgumentException();
		}
		
		root = new BinaryIntNode(rootItem, t1.root, t2.root);
		if(this != t1){
			t1.root = null;
		}
		
		if(this != t2){
			t2.root = null;
		}
	}
	

}
