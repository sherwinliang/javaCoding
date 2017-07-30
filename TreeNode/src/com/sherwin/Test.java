package com.sherwin;

public class Test {
	
	public static void main(String args[]){
		Encode encode = new Encode();
		Decode decode = new Decode();
//		TreeNode root = new TreeNode(0);
//		root.left = new TreeNode(1);
//		root.right = new TreeNode(2);
//		root.left.left = new TreeNode(3);
//		root.left.right = new TreeNode(4);
//		root.left.right.right = new TreeNode(10);
//		root.right.left = new TreeNode(5);
//		root.right.right = new TreeNode(6);
		
		String testStr = "7:#,3:3,8:#,1:1,9:#,4:4,21:#,10:10,22:#,0:0,11:#,5:5,12:#,2:2,13:#,6:6,14:#,";
		System.out.println("testStr: " + testStr);
		TreeNode root = decode.decode(testStr);
		String encodeStr = encode.encode(root);
		System.out.println("encodeStr: " + encodeStr);
		
	}

}
