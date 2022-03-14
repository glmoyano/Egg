package servicio;

import entidad.Nif;
import java.util.Scanner;


public class NifServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Nif crearNif(){
        
        Nif n1 = new Nif();
        
        System.out.println("Ingrese su dni");
        n1.setDni(leer.nextLong());
        
        int calculoletra = (int)n1.getDni()%23;
        
        char vector[] = new char[23];
        vector[0]= 'T';
        vector[1]= 'R';
        vector[2]= 'W';
        vector[3]= 'A';
        vector[4]= 'G';
        vector[5]= 'M';
        vector[6]= 'Y';
        vector[7]= 'F';
        vector[8]= 'P';
        vector[9]= 'D';
        vector[10]= 'X';
        vector[11]= 'B';
        vector[12]= 'N';
        vector[13]= 'J';
        vector[14]= 'Z';
        vector[15]= 'S';
        vector[16]= 'Q';
        vector[17]= 'V';
        vector[18]= 'H';
        vector[19]= 'L';
        vector[20]= 'C';
        vector[21]= 'K';
        vector[22]= 'E';
        
        
        for (int i = 0; i < vector.length ; i++) {
            if(i == calculoletra){
                n1.setLetra(vector[i]);
            }
        }
        
        return n1; 
    }
    
    public void mostrar(Nif n1){
        System.out.println(n1.getDni()+"-"+n1.getLetra());
    }

}
