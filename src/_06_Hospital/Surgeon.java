package _06_Hospital;

import java.util.ArrayList;

class Surgeon extends Doctor {

	
	@Override
	public void doMedicine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void holdList(ArrayList <Patient> l) {
	}

	@Override
	public void assignPatient(Patient t) {
		// TODO Auto-generated method stub
	}

	@Override
	public ArrayList <Patient> getPatients() {
		return null;
	}

	public boolean performsSurgery() {
		return true;
	}
	
	public boolean makesHouseCalls() {
		return false;
		
	}
}
