package com.ashokit.problems;


import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

class Pair {
    Node node;
    int col;

    public Pair(Node node, int col) {
        this.node = node;
        this.col = col;
    }
}

public class VerticalOrderTraversal {
    public List<List<Integer>> verticalTraversal(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Map<Integer, List<Integer>> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {
            int size = queue.size();
            Map<Integer, List<Integer>> levelMap = new HashMap<>();
            for (int i = 0; i < size; i++) {
                Pair pair = queue.poll();
                Node node = pair.node;
                int position = pair.col;

                if (!levelMap.containsKey(position)) {
                    levelMap.put(position, new ArrayList<>());
                }
                levelMap.get(position).add(node.val);

                if (node.left != null) {
                    queue.add(new Pair(node.left, position - 1));
                }
                if (node.right != null) {
                    queue.add(new Pair(node.right, position + 1));
                }
            }

            for (int col : levelMap.keySet()) {
                if (!map.containsKey(col)) {
                    map.put(col, new ArrayList<>());
                }
                List<Integer> nodes = levelMap.get(col);
                Collections.sort(nodes);
                map.get(col).addAll(nodes);
            }
        }

        for (int col : map.keySet()) {
            result.add(map.get(col));
        }

        return result;
    }
    
    public static void main(String[] args) {
        // create a binary tree
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        // perform vertical order traversal
        VerticalOrderTraversal v = new VerticalOrderTraversal();
        List<List<Integer>> result = v.verticalTraversal(root);

        // print the result
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
   
}


