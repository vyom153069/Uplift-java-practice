
//Sorted 2D array/ArrayList  is given and you have to find the target element

public class SolutionSorted {
	public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
	    if(a == null || a.size() == 0 || a.get(0).size() == 0) {
            return 0;
	    }
        int m = a.size();
        int n = a.get(0).size();
        int start = 0;
        int mid, x, y;
        int end = m * n - 1;
        while(start <= end) {
            mid = (start + end)/2;
            x = mid/n;
            y = mid % n;
            if(a.get(x).get(y) == b) {
                return 1;
            } else if(a.get(x).get(y) < b) {
                start=mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
	}
}
