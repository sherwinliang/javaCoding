package com.sherwin;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Decode {
	
	public TreeNode decode(String encodeStr){
		String[] encodeStrArray = encodeStr.split(",");
		LinkedList<TreeNode> nodeList = new LinkedList<TreeNode>();
		
		//Construct a map that contains all treenode
		Map<String, TreeNode> nodeMap = new HashMap<String, TreeNode>();
		for (String singleNodeStr : encodeStrArray){
			if (!"".equals(singleNodeStr)){
				String keyStr = singleNodeStr.split(":")[0];
				String nodeStr = singleNodeStr.split(":")[1];
				if ("#".equals(nodeStr)){
					nodeMap.put(keyStr, null);
				} else {
					nodeMap.put(keyStr, new TreeNode(Integer.parseInt(nodeStr)));
				}			
			}
		}
		
		//Build the relationship inside treenode map
		TreeNode root = nodeMap.get("0");
		nodeList.add(root);
		int index = 1;
		while(!nodeList.isEmpty()){
			TreeNode node = nodeList.poll();
			if (node == null)
				continue;
			if (index == nodeMap.size())
				break;
			node.left = nodeMap.get(Integer.toString(index));
			nodeList.add(node.left);
			index++;
			if (index == nodeMap.size())
				break;
			node.right = nodeMap.get(Integer.toString(index));
			index++;
			nodeList.add(node.right);
		}
		return root;
	}

}
