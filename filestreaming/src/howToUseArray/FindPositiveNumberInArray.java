package howToUseArray;

import java.util.HashSet;
import java.util.Set;

public class FindPositiveNumberInArray {
	public static int findOnePositiveNumber(int A[]) {
		int j=0, i=0;
		int N = A.length;
		Set<Integer> set = new HashSet<Integer>();
		for (int a : A) {
		    if (a > 0) {
		        set.add(a);
		    }
		}
		for ( i = 1; i <= N ; i++) {
		    if (!set.contains(i)) {
		        j=i;
		        i = N + 1;
		        return j;
		    }
		}
		return i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1, 1, 1, 3};
		System.out.println("Positive number" + FindPositiveNumberInArray.findOnePositiveNumber(A));
	}

}
