import java.util.Scanner;
import java.util.*;

public class Sort {
		public static void main(String args[])
		{
			int a[]={10,2,5,68,4,89,33,24,890,00};
			for(int i=0;i<9;i++)
			{
				for(int j=i+1;j<10;j++)
				{
					if(a[i]>a[j])
					{
						int hold=a[j];
						a[j]=a[i];
						a[i]=hold;
					}
				}
			}
			for(int i=0;i<10;i++)
				System.out.print(a[i]+" ");
		}

	}


