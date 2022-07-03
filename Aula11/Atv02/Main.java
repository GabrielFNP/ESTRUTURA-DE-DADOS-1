package EstruturaAtv.Aula11.Atv02;

import EstruturaAtv.Aula11.Atv01.SimplyLinkedList;

public class Main {
    public static void main(String[] args) {
        
        Pacientes patients = new Pacientes(); 
        SimplyLinkedList attendedPatients = new SimplyLinkedList();
        SimplyLinkedList unattendedPatients = new SimplyLinkedList();
        byte patientsToAttend = 1;
        while (true) {
            patients.generateGroupOfPatients();
            for (byte counter = 0; counter < patientsToAttend; counter++) {
                attendedPatients.addEnd(patients.getHighestPriorityPatient());// Attending the patient that has the
                                                                              // highest priority coefficient.
                patients.getListOfPatients().removePos(patients.getPositionHighestPriorityPatient());// Once they were
                                                                                                     // attended, it's
                                                                                                     // needed to remove
                                                                                                     // the patient from
                                                                                                     // the patients to
                                                                                                     // attend.
                if (attendedPatients.size() == 100) {
                    /*
                     * This is the moment when we've to close the establishment and finish the
                     * attendances for a day.
                     * Although we've to add the last 5 patients to unattendedPatients and finally,
                     * break the while sta-
                     * tement.
                     */
                    break;// 15 repetition, 5 patients already added. 5 others, not. It just stops it.
                }
            }
            if (patientsToAttend < 10 || (patients.getListOfPatients().size() == 5 && attendedPatients.size() == 100)) {
                patientsToAttend++;// This second logic sentece (surrounded by parentheses), will be true in the
                                   // last repetition of this while statement.
                while (!patients.getListOfPatients().isEmpty()) {
                    unattendedPatients.addEnd(patients.getListOfPatients().getFirst().getData());
                    patients.getListOfPatients().removeFirst();
                }
                if (attendedPatients.size() == 100)
                    break; // Here, all things we had to perform were perfomed. So, we can break it all.
            }
        }
        System.out.println("#### Pacientes atendidos ####");
        for (byte c = 0; c < attendedPatients.size(); c++)
            System.out.println((c + 1) + "ª\n" + attendedPatients.getCell(c).getData());
        System.out.println("\n\n");
        System.out.println("#### Pacientes não atendidos ####");
        for (byte c = 0; c < unattendedPatients.size(); c++)
            System.out.println((c + 1) + "ª\n" + unattendedPatients.getCell(c).getData());
    }
}