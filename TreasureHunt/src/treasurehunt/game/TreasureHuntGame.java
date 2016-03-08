package treasurehunt.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import treasurehunt.objects.TreasureMap;

public class TreasureHuntGame {

	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("Are you ready to play??");
	      String command = br.readLine();
	      
	      while (!command.equalsIgnoreCase("yes") && !command.equalsIgnoreCase("no"))
	      {
	    	  System.out.println("Are you ready to play?? Yes or No?");
	    	  command = br.readLine();
	      }
	      if (command.equalsIgnoreCase("yes"))
	      {
	      System.out.println("Nice!");
	      
	      TreasureMap theMap = new TreasureMap(5);
	      
	      System.out.println("Map of size " + theMap.getMapSize() + " created!");
	      }
	}
}
