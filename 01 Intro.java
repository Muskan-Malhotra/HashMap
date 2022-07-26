import java.util.*;

class Intro {

  public static void main(String[] args)
  {
    HashMap< String, Integer> hm = new HashMap< >();
    hm.put("India", 1391);
    hm.put("China", 1398);
    hm.put("USA", 329);
    hm.put("Indonesia", 268);

    //Printing the get(key) when key exists
    System.out.println("Value for India " + hm.get("India"));

    //Printing the get(key) when kkey doesn't exist
    System.out.println("Value for Utopia " + hm.get("Utopia"));

    //check if the key exists or not


  }
}