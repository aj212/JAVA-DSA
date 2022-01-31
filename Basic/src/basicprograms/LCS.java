package basicprograms;

public class LCS {
    public  int sequence(char a[],char b[],int i, int j) {
    	int arr[][]=new int [i+1][j+1];
    	for(int y=0;y<i;y++) {
    		for(int z=0;z<j;z++) {
    			if(i==0||j==0) {
    				arr[i][j]=0;
    			}
    			else if(a[i-1]==b[i-1]){
    				arr[i][j]=arr[i-1][j-1]+1;
    			}
    			else{
    				arr[i][j]=max(arr[i - 1][j], arr[i][j - 1]);
    			}
    		}
    	}
    	return arr[i][j];
    }
    public int max(int a, int b) {
    	return ((a>b)?a:b);
    }
    public static void main(String[] args) {
    	LCS s= new LCS();
    	 String my_str_1 = "MNSQR";
         String my_str_2 = "PSQR";
         char[] a = my_str_1.toCharArray();
         char[] b = my_str_2.toCharArray();
         int c = a.length;
         int d = b.length;
         System.out.println("The length of the longest common subsequence is"+ " " + s.sequence(a, b, c, d));
	}
}


