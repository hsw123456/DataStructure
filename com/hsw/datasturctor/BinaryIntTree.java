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
	

}
