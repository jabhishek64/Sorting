
public class YourWish {
	
	static void bubbleSort(int[] arr) 
	{
		int n = arr.length;  
	
		int temp = 0;  
        for(int i=0; i < n; i++){  
                for(int j=1; j < (n-i); j++){  
                        if(arr[j-1] > arr[j]){  
                              //swap elements  
                               temp = arr[j-1];  
                               arr[j-1] = arr[j];  
                               arr[j] = temp;
                        }
                }
        }
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={3,60,35,2,45,320,5};  
        bubbleSort(arr);
        for(int i=0; i < arr.length; i++)
        {  
        	
            System.out.print(arr[i] + " ");

	}

}
}