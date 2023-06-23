import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your party affiliation: Democrat [D], Republican [R], Independent [I]?");
        String partyAffiliation = in.next();
        if( partyAffiliation.equalsIgnoreCase ("D"))
        {
            System.out.println("You get a Democratic Donkey");
        }
        else if( partyAffiliation.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant");
        }
        else if( partyAffiliation.equalsIgnoreCase("I"))
        {
           System.out.println("You get an Independent Man");
        }
        else
        {
            System.out.println("You get Other");
        }



    }
}