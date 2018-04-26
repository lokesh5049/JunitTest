package com.lk.dynamicprogramming.ahocorasicAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AhoCorasick {

	static final int ALPHABET_SIZE = 26;
	Node[] nodes;

	int nodeCount;

	public static class Node {
		int parent;
		char charFromParent;
		int suffLink = -1;
		int[] childern = new int[ALPHABET_SIZE];
		int[] transection = new int[ALPHABET_SIZE];
		boolean leaf;
		{
			Arrays.fill(childern, -1);
			Arrays.fill(transection, -1);
		}
		@Override
		public String toString() {
			return "Node [parent=" + parent + ", charFromParent=" + charFromParent + ", suffLink=" + suffLink
					+ ", childern=" + Arrays.toString(childern) + ", transection=" + Arrays.toString(transection)
					+ ", leaf=" + leaf + "]";
		}

	}

	public AhoCorasick(int maxNodes) {
		// TODO Auto-generated constructor stub
		nodes = new Node[maxNodes];
		nodes[0] = new Node();
		nodes[0].suffLink = 0;
		nodes[0].parent = -1;
		nodeCount = 1;

	}

	public void addString(String s) {

		int cur = 0;
		for (char ch : s.toCharArray()) {
			int c = ch - 'a';
			System.out.println(c);
			if (nodes[cur].childern[c] == -1) {
				nodes[nodeCount] = new Node();
				nodes[nodeCount].parent = cur;
				nodes[nodeCount].charFromParent = ch;
				nodes[cur].childern[c] = nodeCount++;

			}
			cur = nodes[cur].childern[c];
			System.out.println(cur);
		}
		nodes[cur].leaf = true;
		System.out.println(Arrays.toString(nodes));

	}

	public int suffLink(int nodeIndex) {
		Node node = nodes[nodeIndex];
		if (node.suffLink == -1) {
			node.suffLink = node.parent == 0 ? 0 : transection(suffLink(node.parent), node.charFromParent);
		}
		return node.suffLink;

	}

	public int transection(int nodeIndex, char ch) {

		int c = ch - 'a';
		Node node = nodes[nodeIndex];
		if (node.transection[c] == -1) {
			node.transection[c] = node.childern[c] != -1 ? node.childern[c]
					: (nodeIndex == 0 ? 0 : transection(suffLink(nodeIndex), ch));
		}
		return node.transection[c];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AhoCorasick ahoCorasick=new AhoCorasick(1000);
		ahoCorasick.addString("abc");
		ahoCorasick.addString("abcde");
		String s="abcabcdabcdabcabc";
		int node =0;
		List<Integer> position= new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			node=ahoCorasick.transection(node, s.charAt(i));
			if(ahoCorasick.nodes[node].leaf){
				position.add(i);
				
			}
				
		}
		System.out.println(position);
	}

}
