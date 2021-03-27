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
}