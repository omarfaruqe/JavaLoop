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
		int count = 1;
		while(!(dice1 == dice2)){
			// we need to re-roll
			int dice1 = rollDice();
			int dice2 = rollDice();		
			count = count + 1;	
		}
		return count;
	}


}