import java.util.HashMap;

public class Album {
	
	public static void main(String[] args){
		HashMap<String, String> album = new HashMap<String, String>();
		album.put("The Smelly Feet Hip Hop", "May I have your attention please? I'm not afraid (I'm not afraid) To blow a raspberry (to blow a raspberry) Everybody (everybody) Come take my nose (come take my nose) We'll walk through my bed together, through the storm Whatever weather, cold or warm");
		album.put("The Podgy Chins", "his thighs are short, chins podgy, lips are slimy. There's food on his t-shirt already, sister's roast dinner. He's nervous but on the surface he looks calm and ready to be a unicorn");
		album.put("A Charming Kinda Psychiatrist", "They get on with life as a psychiatrist, They're a charming kinda type, they like walking the dog and train spotting, they like to contemplate lights");
		album.put("Like An Ugly Apple", "I heard there was a secret apple, That Rich knew about and it pleased the pilot, but you don't really care for Brads, do ya?");
		album.put("When Your Life is Full of Condescending Debts and Rats", "Your life doesn't have to end, Sing with Daniel Radcliffe, Dance with Paul Gascoigne, And put a curse on Selena Gomez, Oh Selena Gomez, Your life is condescending, But get out and land a major film deal");

		String songTitle = album.get("The Smelly Feet Hip Hop");
		System.out.print(songTitle);
	}

}