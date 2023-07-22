package _06_Hospital;

import java.util.ArrayList;

class GeneralPractitioner extends Doctor {

	ArrayList <Patient> newList = new ArrayList <Patient> ();
	
	@Override
	public void doMedicine() {
		for(int i = 0; i < newList.size(); i++) {
			newList.get(i).checkPulse();
		}
		
	}

	@Override
	public void holdList(ArrayList <Patient> l) {
		
	}

	@Override
	public void assignPatient(Patient t) throws DoctorFullException {
		// TODO Auto-generated method stub
		if (newList.size() < 3) {
	 		newList.add(t);
		} else {
			throw new DoctorFullException();
		}

	}

	@Override
	public ArrayList <Patient> getPatients() {
			return newList;
	}
	
	public boolean performsSurgery() {
		return false;
	}
	
	public boolean makesHouseCalls() {
		return true;
		
	}

}
