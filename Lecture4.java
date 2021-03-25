public class Lecture4{
	public static void main(String[] args) {
		// System.out.println("Print this");
		// System.out.println("And this");
		// System.out.println("Again this");	
		
		// random number between 0 and (almost) 1
		double randomNumber = Math.random();

		// change range from 0 to (almost) 10
		randomNumber = randomNumber * 10; 

		// cast to integer (ignore decimal part) i.e. 9.985 becomes 9
		int randomInt = (int) randomNumber;
		System.out.println("Random number between 0 and 10: " + randomInt);
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

	/**
	 * This function will just print Hello and then the location given to it.
	 * @param location greeting location
	 * @return this function will return nothing
	 */
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

	public void admission(/* What will be the parameter here */){
		if(height > 120){
			System.out.println("You pass the height requirements.");
		} else{
			System.out.println("Sorry, you do not pass.");
		}
	}
	//Test Call
	//admission(130.5);

	public void printPhoto(int width, int height, boolean inColor){
		System.out.println("Width = " + width + " cm");
		System.out.println("Height = " + height + " cm");
		if(inColor){
			System.out.println("Print is full color.");
		} else{
			System.out.println("Print is black and white.");
		}
	}
	// Test call
	// printPhoto(30, 40, true);
	// printPhoto(30, true, 40); // order is important.

	public void likePhoto(int currentLikes, String comment, boolean like){
		// prints out comment and who is commenting
		System.out.println("Feedback: " + comment);
		if(like){
			// increase number of likes by 1
			currentLikes = currentLikes + 1;
		}
		System.out.println("Number of likes: " + currentLikes);
	}
	//Test call 
	// likePhoto(    ); // question 


	public int rollDice(){
		double randomNumber = Math.random();
		randomNumber = randomNumber * 6;
		randomNumber = randomNumber + 1;
		int randomInt = (int) randomNumber;
		return randomInt;
	}
	// Test call
	//int rollOne = rollDice();
	// int rollTwo = rollDice();


	public int rollDiceWithSides(int sides){
		double randomNumber = Math.random();
		randomNumber = randomNumber * sides;
		randomNumber = randomNumber + 1;
		int randomInt = (int) randomNumber;
		return randomInt;
	}
	// something changed
	// Test call
	//int rollOne = rollDiceWithSides();
	// int rollTwo = rollDiceWithSides();
}