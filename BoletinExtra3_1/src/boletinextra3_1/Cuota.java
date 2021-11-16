
package boletinextra3_1;

import javax.swing.JOptionPane;

public class Cuota {
    
    public void Cuota(){
        int socio;
        float cuota=800;
        int edad;
        
        do{
            edad=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca la edad del cliente: \n (Introducir 0 cerrará el programa)"));
            if (edad>65){
                JOptionPane.showMessageDialog(null, "Pagará: "+ (cuota-cuota*0.4));
            }
            else if (edad<21){
                if (edad==0){
                }
                else{
                    socio=Integer.parseInt(JOptionPane.showInputDialog(null,"Es socio del club? \n SI=1 NO=0"));
                    switch (socio){
                        case 0:
                            JOptionPane.showMessageDialog(null, "Pagará: "+(cuota-cuota*0.2));
                            break;
                        case 1:
                            JOptionPane.showMessageDialog(null, "Pagará: "+(cuota-cuota*0.45));
                            break;
                        default:
                            
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Pagará: "+ cuota);
            }
        }while (edad!=0);
        JOptionPane.showMessageDialog(null, "Hasta la próxima.");
    }
    
}
