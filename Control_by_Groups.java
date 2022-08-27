public class Grouping {

	public static void main(String[] args) {

		int N = 8;
		int[] A = new int[N];
    
		for (int i = 0; i < A.length; i++) {
			  A[i] = i;
		}
    
		for (int i = 0; i < A.length; i++) {
			  int j = (int) (Math.random() * (N - i) + i);
			  int tmp = A[i];
        A[i] = A[j];
			  A[j] = tmp;
		}
    
		System.out.printf("%10s", "ID");
    
		for (int i = 0; i < A.length; i++) {
        System.out.printf("%3d", i);
		}
    
		System.out.println();
    
		System.out.printf("%10s", "Contactee");
    
		for (int i = 0; i < A.length; i++) {
        System.out.printf("%3d", A[i]);
		}
    
		System.out.println();
		
    int gid = 0;
    boolean[] visited = new boolean[N];
		
    System.out.println("Output: ");
    
    for (int i = 0; i < N; i++) {
        if (visited[i]) continue;
        System.out.printf("Group %d: ", gid);
        int target = i;
        int curr = target;
        do {
            System.out.printf("%d ", curr);
            curr = A[curr];
            visited[curr] = true;
            } 
        while (curr != target);
            gid++;
			
      System.out.println();
   }

 }

}
