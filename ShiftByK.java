
public class ShiftByK {

	public static int[] swap(int[] a, int l, int r) {
		int t = a[l];
		a[l] = a[r];
		a[r] = t;
		return a;
	}
	public static int[] reverseArray(int[] a, int l, int r) {
		for(int i = l ;i <= (l+r)/2; i++) {
			a= swap(a, i, (l+r)-i);
		}
//		for(int ele: a) {
//			System.out.print(ele + " ");
//		}
//		System.out.println();
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,3,4,5,6,7};
		int k = 3;
		int n = arr.length;
		arr = reverseArray(arr, 0, n-1);
		arr = reverseArray(arr, 0, k-1);
		arr = reverseArray(arr, k, n-1);
		for(int ele: arr) {	
			System.out.print(ele + " ");
		}
	}
}
