package EstruturaAtv.Aula14.Atv01;

import EstruturaAtv.Aula11.Atv01.Lista;
import EstruturaAtv.Aula11.Atv02.Pacientes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Pacientes patients = new Pacientes();
        Deque<Patient> attendedPatients = new ArrayDeque<>();
        Deque<Patient> unattendedPatients = new ArrayDeque<>();
        byte patientsToAttend = 1;
        Lista patientGroup;
        while (true) {
            patients.generateGroupOfPatients();
            patientGroup = patients.getListOfPatients();
            for (byte counter = 0; counter < patientsToAttend; counter++) {
                attendedPatients.addLast((Patient) patientGroup.removeFirst());
                patients.getListOfPatients().removePos(patients.getPositionHighestPriorityPatient());	
                
            
                if (attendedPatients.size() == 100) {
                    
                    break;
                }
                                    
    
            }
            if (patientsToAttend < 10 || (patients.getListOfPatients().size() == 5 && attendedPatients.size() == 100)) {
                patientsToAttend++;}
                while (!patients.getListOfPatients().isEmpty()) {
                    unattendedPatients.addLast((Patient)patients.getListOfPatients().getFirst().getData());
                    patients.getListOfPatients().removeFirst();
                }
                if (attendedPatients.size() == 100)
                    break;
        }
         System.out.println("#### Pacientes atendidos ####");
        for (byte c = 0; c < attendedPatients.size(); c++)
            System.out.println((c + 1) + "ª\n" + attendedPatients.size());
        System.out.println("\n\n");
        System.out.println("#### Pacientes não atendidos ####");
        for (byte c = 0; c < unattendedPatients.size(); c++)
            System.out.println((c + 1) + "ª\n" + unattendedPatients.size());
    }
}