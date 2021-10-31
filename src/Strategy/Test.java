package Strategy;
import java.util.Scanner;
public class Test {
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  
	    System.out.println("choisissez un nombre pour une stratégie (1:Bubble , 2:Insetion , 3:Merge ,4:Quick )");

	    String strat = myObj.nextLine();  // Read user input
		int[] array= {1,4,5,9,2,2,1,7};
		Context ctx;
		switch (strat){
			case "1" :{
				ctx =new Context(new BubbleSort());
			    System.out.println("Votre strategie est: Bubble "); 

				break;}
			case "2":{
				ctx =new Context(new InsertionSort());
			    System.out.println("Votre strategie est: Insertion "); 
				break;}
			case "3":{
				ctx =new Context(new MergeSort());
			    System.out.println("Votre strategie est: Merge "); 

				break;}
			case "4":{
				ctx =new Context(new QuickSort()); 
			    System.out.println("Votre strategie est: Quick "); 

				break;}
			default :
			    System.out.println("Votre strategie est: default  Quick "); 

				ctx =new Context(new QuickSort());}
		
		ctx.arrange(array);
		printArray(array);
		
	}

}
