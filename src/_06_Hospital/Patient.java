package _06_Hospital;

public class Patient {

	boolean caredFor = false;
	boolean assigned = false;

	public boolean feelsCaredFor() {
		return caredFor;
	}
	
	public void checkPulse() {
		caredFor = true;
	}

}
