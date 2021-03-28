public class LoopsInJava{

	/**
	* makes a single beep sound
	*/	
	public void beep(){
		// makes a single beep sound
	}

	/**
	* @return true if alarm is on, false if off
	*/	
	public boolean checkAlarm(){
		return true;
	}
	
	/**
	* keep beeping untool snoozed
	*/
	public void alarm(){
		boolean on = checkAlarm();
		if(on){
			beep();
			on = checkAlarm();
		}
		if(on){
			beep();
			on = checkAlarm();
		}
		if(on){
			beep();
			on = checkAlarm();
		}
		// ....		
	}

	public void alarm(){
		boolean on = checkAlarm();
		while(on){
			beep();
			on = checkAlarm();
		}
	}

	public void rainingStatus(){
		while(isRaining){
	   		System.out.println("It's still raining outside!");
	   		isRaining = checkWeather();
		}
		System.out.println("Now it's not raining anymore");		
	}


	// Yahtzee (roll 5 dice and all showup with same face)
	public int rollDice(){
		double randomNumber = Math.random();
		randomNumber = randomNumber * 6;
		randomNumber = randomNumber + 1;
		int randomInt = (int) randomNumber;
		return randomInt;
	}
	public int keepRooling(){
		int dice1 = rollDice();
		int dice2 = rollDice();
		int dice3 = rollDice();		
		int count = 1;
		while(!(dice1 == dice2 && dice2 == dice3)){  // dice1 == dice2 == dice3 will show compiler error
			// we need to re-roll
			int dice1 = rollDice();
			int dice2 = rollDice();	
			int dice3 = rollDice();	
			count = count + 1;	
		}
		return count;
	}

	public int keepRolling() {
	    int dice1 = rollDice();
	    int dice2 = rollDice();
	    int dice3 = rollDice();
	    int dice4 = rollDice();
	    int dice5 = rollDice();    
	    int count = 1;
	    while (!(dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)) {
	        //we need to re-roll
	        dice1 = rollDice();
	        dice2 = rollDice();
	        dice3 = rollDice();
	        dice4 = rollDice();
	        dice5 = rollDice();         
	        count = count + 1;
	    }
	    return count;
	}


	public void raiseAlarm(int numberOfWarnings){
		int count = 1;
		while(count <= numberOfWarnings){
			System.out.println("Warning");
			count = count + 1;
		}	
	}

	public void raiseAlarm(int numberOfWarnings){
		for(int count = 1; count <= numberOfWarnings; count++){
			System.out.println("Warning # " + count);
		}	
	}


	public int countBlocks(int levels){
		int totalBlocks = 0;
		for(int count = 1; count <= levels; count++){
			totalBlocks = totalBlocks + totalBlocks * totalBlocks;
		}
		return totalBlocks;
	}

	/**
	 * adds the numbers 15 + 16 + ...... + 20
	 * @return the total sum
	 */
	public int addNumbers(){
		int sum = 0;
		for(int startingNumber = 15; startingNumber <= 20; startingNumber++){
			sum = sum + startingNumber;
		}
		return sum;
	}

	public void countingDown(){
		for(int count = 1; count <= 5; count++){
			System.out.println(count);
		}

		for(int count = 5; count >= 0; count--){
			System.out.println(count);
		}
	}

	/**
	 * Wifi Search
	 */
	public void searchWifi(){
		for(int count = 1; count <=10; count++){
			boolean wifiAvailable = checkWifi();
			if(wifiAvailable){
				System.out.println("Wifi found");
				break;
			}
		}
	}


	/**
	 * Rolls a dice till you get a 6 then you win 
	 * but if you get a 3 you lose
	 * @return true if you win, false otherwise
	 */
	public boolean rollASix(){
		int dice = rollDice();
		while(dice != 6){
			dice = rollDice();
			if(dice == 3){
				break;
			}
		}
		if(dice == 6){
			return true;
		}else{
			return false;
		}
	}


	public int martingale(){
		int money = 1000;
		int target = 1200;
		int bet = 10;
		while(money > bet){    //while (money>bet && money<target)
			boolean win = play();
			if(win){
				money = money + bet;
				bet = 10;
			}else{
				money = money - bet;
				bet = bet * 2;
			}
			if(money >= target){
				break;
			}
		}
		return money;
	}
	public boolean play(){
		if((int) Math.random() * 5 == 0){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		double fractionNumbers[] = {4.0, 6.3, 3.75, 5.1, 9.99};
		double sum = fractionNumbers[0] + fractionNumbers[3];
		System.out.println(sum);

		String newsOutlet[] = {"abc", "bbc", "CNN", "CBS", "AP", "NBC", "FOX", "npr", "Sky", "Aljazeera"};
		System.out.println(newsOutlet[2]);

		double lucky = Math.random();
		//Multiply by 10 to get a fractional number between 0 - 10
		lucky = lucky * 10;
		//cast to integer
		int luckyIndex = (int)lucky;
		System.out.println(newsOutlet[luckyIndex]);

		System.out.println(newsOutlet[20]); // will throw an ArrayIndexOutOfBoundsException
		if(20 < newsOutlet.length){
			System.out.println(newsOutlet[20]);
		}
	}

	/**
	 * Calculate the average temperature
	 * @param temparatures array of temperature
	 * @return double average value of temperature
	 */
	public double calculateAverate(double temparatures[]){
		int size = temparatures.length;
		double total = 0;
		for(int count = 0; count < size; count++){
			total = total + temparatures[count];
		}
		double average = total / size;
		return average;
	}

	/**
	 * Searches an array of speed
	 * for the fastest (smallest) value.
	 * @param speed array of speeds 
	 * @return double the fastest speed found
	 */
	public double searchMinimum(double speed[]){
		int size = speed.length;
		double min = speed[0];
		for(int count = 1; count < size; count++){
			if(speed[count] < min){
				min = speed[count];				
			}
		}
		return min;
	}

	/*
	You should implement the function String findLongestName(String [] names) 
	which takes an array of Strings as an input containing a list of names, 
	and return the String that has the longest name.

	To do so, try to follow these steps:
	The first step is to calculate and store the length of the input array, 
	this is done using names.length; and store that in an integer variable.

	Then create a new String called longestName that will store the longest name in the array of names, 
	initialize it with the first name in the array, that is names[0].

	Next, you should create a for loop that will compare every name in the array using names[i] against the longestName. 
	Only replace the longestName value if the names[i] is longer .

	Finally, return the longestName variable as the return value of the function 
	*/

	public String findLongestName(String names[]){
		int size = names.length;
		String longestName = names[0];
		for(int count = 1; count < size; count++){
			if(names[count].length() > longestName.length()){
				longestName = names[count];
			}
		}
		return longestName;
	}

	/**
	 * This method will average marks of any specific subject
	 * @param grades 2D grades array containing marks for couple of sujects of some students
	 * @return average of any subject's marks
	 */
	public double subjectAverage(int grades[][]){
		int total = 0;
		for(int column = 0; column < 5; column++){
			total = total + grades[1][column];
		}
		double average = total / 5.0;
		return average;
	}	

	public double sandraAverage(int grades[][]){
		int subjects = grades.length;
		int total = 0;
		for(int count = 0; count <subjects; count++){
			total = total + grades[count][2];
		}
		double average = total / (double)subjects;
		return average;
	}
	
	public double studentAverage(int grades[][], int student){
		int subjects = grades.length;
		int total = 0;
		for(int row = 0; row <subjects; row++){
			total = total + grades[row][student];
		}
		double average = total / (double)subjects;
		return average;
	}
}