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
	

}
