package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {

	public abstract void doMedicine();
	
	public abstract void holdList(ArrayList <Patient> l);
	
	public abstract void assignPatient(Patient t) throws DoctorFullException;
	
	public abstract ArrayList <Patient> getPatients();
	
}
