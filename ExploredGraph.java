import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;
import java.util.function.Function;

/**
 * 
 */

/**
 * @author your name(s) here.
 * Extra Credit Options Implemented, if any:  (mention them here.)
 * 
 * Solution to Assignment 6 in CSE 373, Winter 2016
 * University of Washington.
 * 
 * Starter code v1.1 provided by Steve Tanimoto, February 25, 2016.
 * This code requires Java version 8 or higher.
 *
 */

// Here is the main application class:
public class ExploredGraph {
	Set<Vertex> Ve; // collection of explored vertices
	Set<Edge> Ee;   // collection of explored edges
	private int veNum;
	private int eeNum;

	public ExploredGraph() {
		Ve = new LinkedHashSet<Vertex>();
		Ee = new LinkedHashSet<Edge>();
		initialize();
	}

	public void initialize() {
		veNum = 0;
		eeNum = 0;
	}
	public int nvertices() {
		return veNum;
	} 
	
	public int nedges() {
		return eeNum;
	}
	
	public void dfs(Vertex vi, Vertex vj) {
		
	} // Implement this.
	
	public void bfs(Vertex vi, Vertex vj) {
		
	} // Implement this.
	
	public ArrayList<Vertex> retrievePath(Vertex vi) {
		return null;
	} // Implement this.
	
	public ArrayList<Vertex> shortestPath(Vertex vi, Vertex vj) {
		return null;
	} // Implement this.
	
	public Set<Vertex> getVertices() {
		return Ve;
	}
	
	public Set<Edge> getEdges() {
		return Ee;
	} 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExploredGraph eg = new ExploredGraph();
		// Test the vertex constructor: 
		Vertex v0 = eg.new Vertex("[[4,3,2,1],[],[]]");
		System.out.println(v0);
		// Add your own tests here.
		// The autograder code will be used to test your basic functionality later.

	}

	class Vertex {
		Stack[] pegs; // Each vertex will hold a Towers-of-Hanoi state.
		// There will be 3 pegs in the standard version, but more if you do extra credit option A5E1.

		// Constructor that takes a string such as "[[4,3,2,1],[],[]]":
		public Vertex(String vString) {
			String[] parts = vString.split("\\],\\[");
			pegs = new Stack[3];
			for (int i=0; i<3;i++) {
				pegs[i] = new Stack();
				try {
					parts[i]=parts[i].replaceAll("\\[","");
					parts[i]=parts[i].replaceAll("\\]","");
					ArrayList al = new ArrayList(Arrays.asList(parts[i].split(",")));
					System.out.println("ArrayList al is: "+al);
					Iterator it = al.iterator();
					while (it.hasNext()) {
						Object item = it.next();
						System.out.println("item is: "+item);
						Integer diskInteger = new Integer((String)item);
						pegs[i].push(diskInteger);
					}
				}
				catch(Exception e) {}
			}		
		}
		public String toString() {
			String ans = "[";
			for (int i=0; i<3; i++) {
				ans += pegs[i].toString().replace(" ", "");
				if (i<2) { ans += ","; }
			}
			ans += "]";
			return ans;
		}
	}

	class Edge {
		public Edge(Vertex vi, Vertex vj) {
			// Add whatever you need to here.
		}
	}

	class Operator {
		private int i, j;

		public Operator(int i, int j) {
			this.i = i;
			this.j = j;
		}


		@SuppressWarnings("rawtypes")
		Function getPrecondition() {
			// TODO: return a function that can be applied to a vertex (provided
			// that the precondition is true) to get a "successor" vertex -- the
			// result of making the move.
			return new Function() {
				@Override
				public Object apply(Object vertex) {
					return false;
				}
			};
		}

		@SuppressWarnings("rawtypes")
		Function getTransition() {
			// TODO: should return a function that can be applied to a vertex
			// (provided that the precondition is true) to get a "successor"
			// vertex -- the result of making the move.
			return new Function() {
				@Override
				public Object apply(Object vertex) {
					return null;
				}
			};
		}

		public String toString() {
			// TODO: return a string good enough
			// to distinguish different operators
			return "";
		}
	}

}