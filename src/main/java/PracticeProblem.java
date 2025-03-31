public class PracticeProblem {

	public static int[] compareSearch(int[] arr, int num){
		int[] out = {0,0};
		int count = 1;
		int countAg =1;
		int low = 0;
		int high = arr.length-1;

		while (low<=high){
			int mid = (low+high)/2;

			if (num == arr[mid]){
				out[1] = count;
				low = arr.length;
			}
			else if (num<arr[mid]){
				high = mid-1;
				count ++;
			}
			else if (num>arr[mid]){
				low = mid+1;
				count ++;
			}
			if (low==high){
				out[1] = count;
			}
		}


		for (int i =0; i<arr.length; i++){
			if (arr[i]==num){
				i = arr.length;
				out[0]=countAg;
			}
			else{
				
				countAg++;
			}
			if (i==arr.length-1){
				out[0]=countAg-1;
			}
		}

		return out;
	}
	

	public static int[] compareStringSearch(String[] arr, String text){
		int[] out = {0,0};
		int low=0;
		int high = arr.length-1;
		int count = 1;
		int countAg=1;
		while (low<=high){
			int mid = (low+high)/2;

			if (text.equals(arr[mid])){
				out[1] = count;
				low = arr.length;
			}
			else {
				low = mid+1;
			}
			if (low==high){
				out[1] = count;
			}
		}


		for (int i =0; i<arr.length; i++){
			if (arr[i].equals(text)){
				out[0]=countAg;
				i = arr.length;
			}
			else {
				countAg++;
			}
			if(i==arr.length-1){
				out[0]=countAg;
			}
		}
		return out;
	}
}
