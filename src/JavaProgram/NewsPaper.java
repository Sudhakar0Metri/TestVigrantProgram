package JavaProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class NewsPaper {
	
	
	public static double TOISUM;
	public static double HINDUSUM;
	public static double ETSUM;
	public static double BMSUM;
	public static double HTSUM;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double inputValue = scan.nextDouble();
		scan.close();
		double[] TOIarr = {3,3,3,3,3,5,6};
		double[] HINDUarr = {2.5,2.5,2.5,2.5,2.5,4,4};
		double[] ETarr = {4,4,4,4,4,4,10};
		double[] BMarr = {1.5,1.5,1.5,1.5,1.5,1.5,1.5};
		double[] HTarr = {2,2,2,2,2,4,4};
		
		TOISUM = arraySUM(TOIarr);
		HINDUSUM = arraySUM(HINDUarr);
		ETSUM = arraySUM(ETarr);
		BMSUM = arraySUM(BMarr);
		HTSUM = arraySUM(HTarr);
		HashMap<Double, String> hP = new HashMap<>();
		hP.put(TOISUM, "TOI");
		hP.put(HINDUSUM, "HINDU");
		hP.put(ETSUM, "ET");
		hP.put(BMSUM, "BM");
		hP.put(HTSUM, "HT");
		
		double[] collect = {TOISUM,HINDUSUM,ETSUM,BMSUM,HTSUM};
		for (int i = 0; i < collect.length; i++) {
			for (int j = 0; j < collect.length; j++) {
				if(collect[i]+collect[j]<=inputValue)
				{
					if(i!=j) {
						ArrayList<String> alist = new ArrayList<String>();
						alist.add(hP.get(collect[i]));
						alist.add(hP.get(collect[j]));
						System.out.print(alist);
					} 
					
				}
			}
		}
	}
		
		public static double arraySUM(double[] calculate)
		{
			double sum=0;
			for (int i = 0; i < calculate.length; i++) {
				sum = sum+calculate[i];
			}
			
			return sum;
			
		}
		
		
		
		
		
	

}
