package EstruturaAtv.Aula11.Atv02;

import EstruturaAtv.Aula11.Atv01.Main;//To use the method generateRandomNumber().
import EstruturaAtv.Aula11.Atv01.SimplyLinkedList;
import EstruturaAtv.Aula11.Atv01.Cell;

public class Pacientes {
    private SimplyLinkedList groupOfPatients;
    
    public Pacientes(){
        this.groupOfPatients=new SimplyLinkedList();
    }
    
    public void generateGroupOfPatients(){
        //The proportion will be: 1 pregnant, 1 breastfeeding, 1 especial needs,3 older than 60 and 5 normal.
        if(!this.groupOfPatients.isEmpty()) this.groupOfPatients.clean();
        this.groupOfPatients.addEnd((new Patient('F',this.generateRandomAge(17,12),this.generateNewId(),true,false,false)));
        //Pregnant
        
        this.groupOfPatients.addEnd((new Patient('F',this.generateRandomAge(17,50),this.generateNewId(),false,true,false)));
        //Breastfeeding
        
        this.groupOfPatients.addEnd((new Patient(this.generateRandomGender(),this.generateRandomAge(5,60),this.generateNewId(),false,false,true)));
        //Especial needs
        
        for(byte counter=0;counter<3;counter++){//3 older than 60.
            this.groupOfPatients.addEnd((new Patient(this.generateRandomGender(),this.generateRandomAge(61,90),this.generateNewId(),false,false,false)));    
        }
        for(byte counter=0;counter<4;counter++){//4 normal.
            this.groupOfPatients.addEnd((new Patient(this.generateRandomGender(),this.generateRandomAge(5,60),this.generateNewId(),false,false,false)));
        }
    }
    
    private int generateNewId(){
        int newId=Main.generateRandomNumber(1000,10000);
        if(this.groupOfPatients.isEmpty()) return newId;
        while(this.generatedIdIsRepited(newId)) newId=Main.generateRandomNumber(1000,10000);
        return newId;
    }
    
    private char generateRandomGender(){
        int auxNum=Main.generateRandomNumber(0,1);
        return auxNum==1?'M':'F';
    }
    
    private int generateRandomAge(int from,int to){
        return Main.generateRandomNumber(from, to);
    }
    
    public Cell[] getGroup(){return this.groupOfPatients.getCells();}
    
    public SimplyLinkedList getListOfPatients(){return this.groupOfPatients;}
    
    public Patient getHighestPriorityPatient(){
        if(this.groupOfPatients.isEmpty()) return null;
        else if(this.groupOfPatients.size()==1) return (Patient) (this.groupOfPatients.getFirst().getData());
        return (Patient) (this.groupOfPatients.getCell(this.getPositionHighestPriorityPatient()).getData());
    }
    
    public int getPositionHighestPriorityPatient(){
        if(this.groupOfPatients.isEmpty()) return -1;
        else if(this.groupOfPatients.size()==1) return 1;
        int posHighest=0;
        for(byte counter=0;counter<this.groupOfPatients.size();counter++){
            if(counter==0) posHighest=0;
            else if(((Patient)this.groupOfPatients.getCell(counter).getData()).getPriority()>
                        ((Patient) this.groupOfPatients.getCell(posHighest).getData()).getPriority()) posHighest=counter;
        }
        return posHighest;
    }
    
    private boolean generatedIdIsRepited(int id){
        if(this.groupOfPatients==null) return false;
        if(this.groupOfPatients.isEmpty()) return false;
        Cell[] patients=this.groupOfPatients.getCells();
        for(Cell throughPatients:patients) if(((Patient)throughPatients.getData()).getId()==id) return true;
        return false;
    }
}
