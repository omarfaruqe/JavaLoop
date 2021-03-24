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

}