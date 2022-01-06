package activities;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] randomarray= {9,1,3,10,4,2,0};
		System.out.print("Original Array  >>");
		printarray(randomarray);
		sortarray(randomarray);
		System.out.println();
		System.out.print("Sorted Array  >>");
		printarray(randomarray);
		
		
	}
	static void printarray(int[] arrnum)
	{
		for(int i=0;i<arrnum.length;i++)
		{
			System.out.print(arrnum[i]+" ");
		}
	}
	
	static void sortarray(int[] arnum)
	{
		for(int i=0;i<arnum.length;i++)
		{
			for(int j=i+1;j<arnum.length;j++)
			{
				int temp;
				if(arnum[i]>arnum[j])
				{
				temp=arnum[i];
				arnum[i]=arnum[j];
				arnum[j]=temp;	
				}
			}
			
		}
	}

}
