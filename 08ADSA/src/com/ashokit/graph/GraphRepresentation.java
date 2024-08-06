package com.ashokit.graph;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class GraphRepresentation {

	//Employee[] empArray= new EMployee[];
	//empArray[0]=new Employee();
	
	//int i;
	//Employee e;
	LinkedList[] adjList= null;//Adjecency List
	//l[0]=null
	GraphRepresentation(int noOfVertex){
		adjList= new LinkedList[noOfVertex];
		for (int i = 0; i < noOfVertex; i++) {
			adjList[i]= new LinkedList<>();
		}
	}
	
	public void add(int vertex,int adjVertex) {//0,1
		adjList[vertex].add(adjVertex);
	}
	
	public void DFS(int vertex) {
		Stack<Integer> stack=new Stack<>();
		stack.add(vertex);//0
		Set<Integer> s= new HashSet<>();
		while(!stack.isEmpty()) {
			Integer ver=stack.pop();//I am visiting the vertex
			s.add(ver);
			System.out.print(ver+"->");
			//Now explore the vertex means findout all the adjcent vertexes for 0;
			LinkedList l= adjList[ver];
			Iterator<Integer> itr= l.iterator();
			while (itr.hasNext()) {
				Integer integer = (Integer) itr.next();
				if(!s.contains(integer)) {
					stack.add(integer);
					s.add(integer);
				}
			}
			
		}
	}
	
	public void BFS(int vertex) {
		Queue<Integer> q=new LinkedList<>();
		q.add(vertex);
		Set<Integer> s= new HashSet<>();
		while(!q.isEmpty()) {
			Integer ver=q.poll();//I am visiting the vertex
			s.add(ver);
			System.out.print(ver+"-> ");
			//Now explore the vertex means findout all the adjcent vertexes for 0;
			LinkedList l= adjList[ver];
			Iterator<Integer> itr= l.iterator();
			while (itr.hasNext()) {
				Integer integer = (Integer) itr.next();
				if(!s.contains(integer)) {
					q.add(integer);
					s.add(integer);
				}
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		GraphRepresentation g= new GraphRepresentation(5);
		g.add(0,1);//from 0 you can go to 1
		g.add(0,2);//from 0 you can go to 2
		g.add(1,0);
		g.add(1,3);
		g.add(1,4);
		g.add(2,0);
		g.add(2,3);
		g.add(3,1);
		g.add(3,2);
		g.add(3,4);
		g.add(4,1);
		g.add(4,2);
		g.BFS(3);
		System.out.println("Depth first Search tranersal is ");
		g.DFS(0);
		
		
	}
	
}
