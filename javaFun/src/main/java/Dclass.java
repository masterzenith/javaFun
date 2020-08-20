public class Dclass {
	private int cadence;
	private int gear;
	private int speed;

	public Dclass(int startGear, int startCadence, int startSpeed ){
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;
	}

	public int getCadence(){
		return cadence;
	}

	public void setCadence(int newValue) {
		cadence = newValue;
	}

	public int getGear(){
		return gear;
	}

	public void setGear(int newValue){
		gear = newValue;
	}

	public int getSpeed(){
		return speed;
	}

	public void setSpeed(int newValue){
		speed = newValue;
	}

	public void applyBrake(int decrement) {
		speed -= decrement;
	}
}
