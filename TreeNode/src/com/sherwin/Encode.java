package com.sherwin;

public class Encode {
	
	public String encode(TreeNode root){
		int key = 0;
		StringBuffer encodeStr = new StringBuffer();
		encode(root, key, encodeStr);
		return encodeStr.toString();
	}
	
	private void encode(TreeNode node, int key, StringBuffer encodeStr){
		if (node == null){
			encodeStr.append(key + ":" + "#,");
			return;
		}
	
		encode(node.left, key*2 + 1, encodeStr);

		encodeStr.append(key + ":" + node.val + ",");	

		encode(node.right, key*2 + 2, encodeStr);
	}
}
