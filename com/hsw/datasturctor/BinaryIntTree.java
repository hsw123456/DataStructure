package com.hsw.datasturctor;

/**
 * ģ��������Ϊ�ڵ�Ķ�����
 * @author Administrator
 *
 */
public class BinaryIntTree {
	
	private BinaryIntNode root;//���ڵ������

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
	 * ���ض�������ģ
	 * @param rootItem
	 */
	public int size(){
		return BinaryIntNode.size(root);
	}
	/**
	 * ���ض������ĸ߶�
	 * @return
	 */
	public int height(){
		return BinaryIntNode.height(root);
	}
	
	//���������ֱ�����ʽ��ʵ��
	//ǰ�����
	public void printPreOrder(){
		if(root != null)
			root.printPreOredr();
	}
	//�������
	public void printInOrder(){
		if(root != null)
			root.printInOredr();
		
	}
	//��������
	public void printPostOrder(){
		if(root != null)
			root.printPostOredr();
		
	}
	
	//�����
	public void makeEmpty(){
		root  = null;
	}
	//�ж����Ƿ�Ϊ��
	public boolean isEmpty(){
		return root == null;
	}
	//�ϲ�������,���ؽ�һ������
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
