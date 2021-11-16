
package boletinextra3_2;

import javax.swing.JOptionPane;

public class FechaValida {
    
    public void esFechaValida(){
        int dia;
        int mes;
        int año;
        boolean validez;
        do{
            año=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca un año: "));
            if (año>=1600 && año<=3000){
               
                    validez=true;
            }
            else{
                    JOptionPane.showMessageDialog(null, "El año no es valido.");
                    validez=false;
                }
            
        }while (validez==false);
        
        do{
            mes=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el mes: "));
            if (mes>=1 && mes<=12){
                validez=true;
            }
            else{
                JOptionPane.showMessageDialog(null, "El mes no es valido.");
                validez=false;
            }
            
        }while (validez==false);
        switch (mes) {
            case 2:
                if(año%4==0 || año%400==0){
                    do{
                        dia=Integer.parseInt(JOptionPane.showInputDialog("Escribe un día del mes: "));
                        if (dia>=1 && dia<=29){
                            validez=true;
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "El día no es valido.");
                            validez=false;
                        }
                        
                    }while(validez==false);
                }
                else{
                    do{
                        dia=Integer.parseInt(JOptionPane.showInputDialog("Escribe un día del mes: "));
                        if (dia>=1 && dia<=28){
                            validez=true;
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "El día no es valido.");
                            validez=false;
                        }
                        
                    }while(validez==false);
                }   break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                do{
                    dia=Integer.parseInt(JOptionPane.showInputDialog("Escribe un día del mes: "));
                    if (dia>=1 && dia<=31){
                        validez=true;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "El día no es valido.");
                        validez=false;
                    }
                    
                }while(validez==false);
                break;
            default:
                do{
                    dia=Integer.parseInt(JOptionPane.showInputDialog("Escribe un día del mes: "));
                    if (dia>=1 && dia<=30){
                        validez=true;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "El día no es valido.");
                        validez=false;
                    }
                    
                }while(validez==false);
                break;
        }
        JOptionPane.showMessageDialog(null, "La fecha es: "+dia+"/"+mes+"/"+año);
    }
}
