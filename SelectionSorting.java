package DSA;

public class SelectionSorting {

	public static void main(String[] args) {
		int arr[]= {50,3,63,27,2};
		for(int i=0;i<arr.length-1;i++) 
		{
			int mins_index=i;
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[j]<arr[mins_index]) 
				{
					mins_index=j;
				}
			}
				int temp=arr[mins_index];
				arr[mins_index]=arr[i];
				arr[i]=temp;
			
		}
		for (int i=0; i<arr.length;i++) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 

	}

}
