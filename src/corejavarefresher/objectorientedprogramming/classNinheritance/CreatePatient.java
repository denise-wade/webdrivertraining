package corejavarefresher.objectorientedprogramming.classNinheritance;

public class CreatePatient
{
	public static void main(String[] args)
	{
		Patient patient1; 
		patient1 = new Patient("Aaron Evans", 45, "Hypochondria");
		
		Patient patient2 = new Patient("Kelsey Evans", 99);
		
		
		System.out.println(patient1.getName() + " has " + patient1.getDiagnosis());
		System.out.println(patient2.getName() + " has " + patient2.getDiagnosis());
		
		patient1.dischargePatient();
		
		System.out.println("number of patients: " + Patient.getNumberOfPatients());
	}
}
