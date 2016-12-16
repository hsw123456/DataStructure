package com.hsw.datasturctor;
import static java.lang.Math.*;
/**
 * 一个模拟保存整数节点的二叉节点
 * 
 * @author Administrator
 * 
 */
public class BinaryIntNode {

	public Integer element;
	public  BinaryIntNode left;// 左节点
	public BinaryIntNode right;// 右节点

	public int getElement() {
		return element;
	}

	public void setElement(Integer element) {
		this.element = element;
	}

	public BinaryIntNode getLeft() {
		return left;
	}

	public void setLeft(BinaryIntNode left) {
		this.left = left;
	}

	public BinaryIntNode getRight() {
		return right;
	}

	public void setRight(BinaryIntNode right) {
		this.right = right;
	}
	
	public BinaryIntNode(){
		this(null, null, null);
	}
	public BinaryIntNode(Integer data){
		this(data,null,null);
	}
	
	public BinaryIntNode(Integer element, BinaryIntNode left, BinaryIntNode right) {
		super();
		this.element = element;
		this.left = left;
		this.right = right;
	}
	
	/**
	 * 返回当前节点的模：定义为这个节点的后代（包括自己）的数量
	 * @param t：当前节点的引用
	 * @return
	 */
	public static int size(BinaryIntNode t){
		if(t== null)
			return 0;
		else {
			return 1 + size(t.left)+ size(t.right);
		}
	}
	/**
	 * 
	 * @param t
	 * @return：当前节点的高度：左右子树的最大高度+1-->Max(height(leftNode),height(rightNode))+1;
	 */
	public static int height(BinaryIntNode t){
		if(t == null)
			return -1;
		else
			return 1+max(height(t.left), height(t.right));
	}
	
	/**
	 * 返回以当前节点为根的树的拷贝
	 * @return
	 */
	public BinaryIntNode duplicate(){
		
		return null;
	}
	//前序遍历
	public void printPreOredr(){
		System.out.println(element);//Node
		if(left !=null){
			left.printPreOredr();//Left
		}
		if(right !=null){
			right.printPreOredr();//Right
		}
	}
	//中序遍历
	public void printInOredr(){
		if(left != null){
			left.printInOredr();//Left
		}
		System.out.println(element);//Node
		if(right !=null){
			right.printInOredr();//Right
		}
	}
	//后序遍历
	public void printPostOredr(){
		if(left != null)
			left.printPostOredr();//Left
		if(right != null)
			right.printPostOredr();//Right
		System.out.println(element);//Node
	}
	
	
	

}
