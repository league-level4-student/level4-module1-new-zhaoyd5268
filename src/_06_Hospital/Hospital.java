package _06_Hospital;

import java.util.ArrayList;

public class Hospital {

	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();

	public void addDoctor(Doctor d) {
		doctors.add(d);
	}

	public void addPatient(Patient p) {
		patients.add(p);
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void assignPatientsToDoctors() throws DoctorFullException {
		for (int i = 0; i < doctors.size(); i++) {
			if (patients.size() == 0) {
				break;
			}
			for (int j = 0; j < 3; j++) {
				System.out.println("adding");
				if (patients.size()>0) {
					doctors.get(i).assignPatient(patients.get(0));
					patients.remove(0);
				} else {
					break;
				}
				
			}


			}
		}
	}