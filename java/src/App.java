import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String[] names = {"Emmanuel Achana", "Kofi Yeboah", "John Wayne", "Bruce Banner", "Bruce Wayne", "Danny Rand", "Jake Peralta", "Luke Cage", "Mike Ross"};

        for(String name: names){
            System.out.println(name);
        }

        int[] priceOfPen = new int[5];
	    Scanner in = new Scanner(System.in);
        
	    for(int i = 0; i < priceOfPen.length; i++)
	        priceOfPen[i] = in.nextInt();

	    for(int i = 0;i < priceOfPen.length; i++)
		    System.out.print(priceOfPen[i] + " ");

        in.close();

    }
}
