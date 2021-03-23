public class Lecture4{
	public static void main(String[] args) {
		System.out.println("Print this");
		System.out.println("And this");
		System.out.println("Again this");				
	}

	public void chorus(){
		// print out 4 lines of chorus
		System.out.println("Once I had a love and it was a gas");
		System.out.println("Soon turned out had a heart of glass");
		System.out.println("Seemed like the real thing, only to find much o' mistrust");
		System.out.println("Love's gone behind");	

		//Function Calling
		playMusic();
	}

	boolean playButton = true; // true or false
	// Define a function playMusic() below.
	// This should print out: "Music is playing" when playButton is true
	// and "Music is paused" when playButton is false.

	public void playMusic(){
		if(playButton){
			System.out.println("Music is playing");
		}else{
			System.out.println("Music is paused");
		}
	}

	public void greeting(String location){
		// Greet a specific location
		System.out.println("Hello, " + location);
	}
	// Test call would be greeting("Rajshahi");

	public void weatherInterpreter(int temperature){
		if(temperature > 30){
			System.out.println("It's hot outside!");
		} else if(temperature < 5){
			System.out.println("Brr, consider wearing a jacket.");
		} else{
			System.out.println("Not too hot, not too cold.");
		}
	}
	//Test Calling
	// weatherInterpreter(4); ->
	// weatherInterpreter(28); ->

}



/*
Lyrics: Blondie Once
Songwriters: Christopher Stein / Deborah Harry
The Disco Song lyrics © BMG Rights Management
Artist: Blondie
Album: Plastic Letters
Released: 1977
Genre: New Wave/Post-Punk

Once I had a love and it was a gas
Soon turned out to be a thing of the past
Seemed like the real thing, only to find much o' mistrust
Love's gone behind

Once I had a love and it was divine
Soon found out I was losing my mind
It seemed like the real thing but I was so blind
Much o' mistrust

Love's gone behind
In between what I find is pleasing and
I'm feeling fine Love is so confusing,
there's no peace of mind

If I fear I'm losing you
It's just no good, you teasing like you do
Once I had a love and it was a gas
Soon turned out to be a thing of the past

Seemed like the real thing,
Only to find much o' mistrust
Love's gone behind
Lost inside

Adorable illusion and I cannot hide
I'm the one you're using please don't push me aside
We coulda made it cruising yeah
Yeah, riding high on love's true bluish light

Once I had a love and it was a gas
Soon turned out to be a pain in the ass
Seemed like the real thing only to find much o' mistrust
Love's gone behind
*/