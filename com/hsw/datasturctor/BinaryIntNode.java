package com.hsw.datasturctor;

/**
 * һ��ģ�Ᵽ�������ڵ�Ķ���ڵ�
 * 
 * @author Administrator
 * 
 */
public class BinaryIntNode {

	private Integer element;
	private BinaryIntNode left;// ��ڵ�
	private BinaryIntNode right;// �ҽڵ�

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
	
	public BinaryIntNode(Integer element, BinaryIntNode left, BinaryIntNode right) {
		super();
		this.element = element;
		this.left = left;
		this.right = right;
	}
	
	/**
	 * ���ص�ǰ�ڵ��ģ������Ϊ����ڵ�ĺ���������Լ���������
	 * @param t����ǰ�ڵ������
	 * @return
	 */
	public static int size(BinaryIntNode t){
		
		return 0;
	}
	/**
	 * 
	 * @param t
	 * @return����ǰ�ڵ�ĸ߶ȣ��������������߶�+1-->Max(height(leftNode),height(rightNode))+1;
	 */
	public static int height(BinaryIntNode t){
		return 0;
	}
	
	/**
	 * �����Ե�ǰ�ڵ�Ϊ�������Ŀ���
	 * @return
	 */
	public BinaryIntNode duplicate(){
		
		return null;
	}
	//ǰ�����
	public void printPreOredr(){
		System.out.println(element);//Node
		if(left !=null){
			left.printPreOredr();//Left
		}
		if(right !=null){
			right.printPreOredr();//Right
		}
	}
	//�������
	public void printInOredr(){
		if(left != null){
			left.printInOredr();//Left
		}
		System.out.println(element);//Node
		if(right !=null){
			right.printInOredr();//Right
		}
	}
	//�������
	public void printPostOredr(){
		if(left != null)
			left.printPostOredr();//Left
		if(right != null)
			right.printPostOredr();//Right
		System.out.println(element);//Node
	}
	
	
	

}
