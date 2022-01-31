package basicprograms;
import java.util.Scanner;
public class dijkstra {
	public static void dijakstra(int [][]adjmatrix) {
	int v=adjmatrix.length;
	boolean visited[]=new boolean[v];
	int distance[]=new int [v];
	distance[0]=0;
	for(int i=1;i<v;i++) {
		distance[i]=Integer.MAX_VALUE;
	}
	for(int i=0;i<v-1;i++) {
		int minVertex=findMinVertex(distance,visited);
		visited[minVertex]=true;
		for(int j=0;j<v;j++) {
			if(adjmatrix[minVertex][j]!=0 && !visited[j] && distance[minVertex]!=Integer.MAX_VALUE) {
				int newDist=distance[minVertex]+adjmatrix[minVertex][j];
				if(newDist<distance[j]) {
					distance[j]=newDist;
				}
			}
		}
	}
	for(int i=0;i<v;i++) {
	System.out.println(i+" "+distance[i]);
	}
	}
	
	public static int findMinVertex(int distance[],boolean visited[]) {
		int minVertex=-1;
		for(int i=0;i<distance.length;i++) {
			if(!visited[i] && (minVertex== -1 || distance[i]<distance[minVertex])) {
				minVertex=i;
			}
		}
		return minVertex;
	}
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int v=s.nextInt();
	int e=s.nextInt();
	int adjmatrix[][]=new int[v][v];
	for(int i=0;i<e;i++) {
		int v1=s.nextInt();
		int v2=s.nextInt();
		int weight=s.nextInt();
		adjmatrix[v1][v2]=weight;
		adjmatrix[v2][v1]=weight;
	}
	dijakstra(adjmatrix);
}
}
