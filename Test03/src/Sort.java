import java.util.Scanner;
import java.util.*;

public class Sort {
		public static void main(String args[])
		{
			System.out.println("Please input 10 nums:");
			int[] a=new int[10];
			Scanner inputscan=new Scanner((System.in));
			for(int i=0;i<10;i++)
				a[i]=inputscan.nextInt();
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
			System.out.println("\nÅÅĞòºóÊı×é£º");
			for(int i=0;i<10;i++)
				System.out.print(a[i]+" ");
		}

	}


