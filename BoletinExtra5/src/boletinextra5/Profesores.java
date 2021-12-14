
package boletinextra5;

import javax.swing.JOptionPane;


public class Profesores {
   
    private String codigo;
    private String nome;
    private float categoria;
    private float estudosPost;
    private float antiguedade;
    private float horasTraballo;
    private double soldoBruto;
    private float bonifEstudos;
    private float bonifAntiguedade;
    private double afp=0.13;
    private double seguridade=0.05;
    private double soldoNeto;
   
    public void Profesores (){
    codigo=JOptionPane.showInputDialog("Introduzca codigo del Trabajador: ");
    horasTraballo=Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas ha trabajado?"));
    categoria=Integer.parseInt(JOptionPane.showInputDialog("Introduza que tipo de cargo ten o profesor \n 1.Principal  2.Asociado  3.Auxiliar"));
    if ( categoria==1){
        soldoNeto=25.00*horasTraballo;
        JOptionPane.showMessageDialog(null, "Tu sueldo neto es de: "+ soldoNeto);
        estudosPost=Integer.parseInt(JOptionPane.showInputDialog("Introduzca sí posee alguno de estos títulos postgrado \n 1.Master  2.Doctorado  3.Ambos  4.Ninguno"));
        if(estudosPost==1){
            antiguedade=Integer.parseInt(JOptionPane.showInputDialog("Cuantos años lleva trabajando? "));
            if (antiguedade<7){
                soldoBruto=soldoNeto+(soldoNeto*0.17)+(soldoNeto*0.05);
            }
            else{
                soldoBruto=soldoNeto+(soldoNeto*0.17)+(soldoNeto*0.07);
            }
        }
        else if(estudosPost==2){
            antiguedade=Integer.parseInt(JOptionPane.showInputDialog("Cuantos años lleva trabajando? "));
            if (antiguedade<7){
                soldoBruto=soldoNeto+(soldoNeto*0.20)+(soldoNeto*0.05);
            }
            else{
                soldoBruto=soldoNeto+(soldoNeto*0.20)+(soldoNeto*0.07);
            }
        
        }
        else if(estudosPost==3){
            antiguedade=Integer.parseInt(JOptionPane.showInputDialog("Cuantos años lleva trabajando? "));
            if (antiguedade<7){
                soldoBruto=soldoNeto+(soldoNeto*0.25)+(soldoNeto*0.05);
            }
            else{
                soldoBruto=soldoNeto+(soldoNeto*0.25)+(soldoNeto*0.07);
            }
        
        }
        else if(estudosPost==0){
            antiguedade=Integer.parseInt(JOptionPane.showInputDialog("Cuantos años lleva trabajando? "));
            if (antiguedade<7){
                soldoBruto=soldoNeto+(soldoNeto*0.05);
            }
            else{
                soldoBruto=soldoNeto+(soldoNeto*0.07);
            }
        }
        
    }
     if ( categoria==2){
        soldoNeto=18.00*horasTraballo;
        JOptionPane.showMessageDialog(null, "Tu sueldo neto es de: "+ soldoNeto);
        estudosPost=Integer.parseInt(JOptionPane.showInputDialog("Introduzca sí posee alguno de estos títulos postgrado \n 1.Master  2.Doctorado  3.Ambos  4.Ninguno"));
        if(estudosPost==1){
            antiguedade=Integer.parseInt(JOptionPane.showInputDialog("Cuantos años lleva trabajando? "));
            if (antiguedade<7){
                soldoBruto=soldoNeto+(soldoNeto*0.10)+(soldoNeto*0.04);
            }
            else{
                soldoBruto=soldoNeto+(soldoNeto*0.10)+(soldoNeto*0.06);
            }
        }
        else if(estudosPost==2){
            antiguedade=Integer.parseInt(JOptionPane.showInputDialog("Cuantos años lleva trabajando? "));
            if (antiguedade<7){
                soldoBruto=soldoNeto+(soldoNeto*0.15)+(soldoNeto*0.04);
            }
            else{
                soldoBruto=soldoNeto+(soldoNeto*0.15)+(soldoNeto*0.06);
            }
        
        }
        else if(estudosPost==3){
            antiguedade=Integer.parseInt(JOptionPane.showInputDialog("Cuantos años lleva trabajando? "));
            if (antiguedade<7){
                soldoBruto=soldoNeto+(soldoNeto*0.20)+(soldoNeto*0.04);
            }
            else{
                soldoBruto=soldoNeto+(soldoNeto*0.20)+(soldoNeto*0.06);
            }
        
        }
        else if(estudosPost==0){
            antiguedade=Integer.parseInt(JOptionPane.showInputDialog("Cuantos años lleva trabajando? "));
            if (antiguedade<7){
                soldoBruto=soldoNeto+(soldoNeto*0.04);
            }
            else{
                soldoBruto=soldoNeto+(soldoNeto*0.06);
            }
        }
        
    }
      if ( categoria==3){
        soldoNeto=15.00*horasTraballo;
        JOptionPane.showMessageDialog(null, "Tu sueldo neto es de: "+ soldoNeto);
        estudosPost=Integer.parseInt(JOptionPane.showInputDialog("Introduzca sí posee alguno de estos títulos postgrado \n 1.Master  2.Doctorado  3.Ambos  4.Ninguno"));
        if(estudosPost==1){
            antiguedade=Integer.parseInt(JOptionPane.showInputDialog("Cuantos años lleva trabajando? "));
            if (antiguedade<7){
                soldoBruto=soldoNeto+(soldoNeto*0.08)+(soldoNeto*0.02);
            }
            else{
                soldoBruto=soldoNeto+(soldoNeto*0.08)+(soldoNeto*0.05);
            }
        }
        else if(estudosPost==2){
            antiguedade=Integer.parseInt(JOptionPane.showInputDialog("Cuantos años lleva trabajando? "));
            if (antiguedade<7){
                soldoBruto=soldoNeto+(soldoNeto*0.12)+(soldoNeto*0.02);
            }
            else{
                soldoBruto=soldoNeto+(soldoNeto*0.12)+(soldoNeto*0.05);
            }
        
        }
        else if(estudosPost==3){
            antiguedade=Integer.parseInt(JOptionPane.showInputDialog("Cuantos años lleva trabajando? "));
            if (antiguedade<7){
                soldoBruto=soldoNeto+(soldoNeto*0.02)+(soldoNeto*0.02);
            }
            else{
                soldoBruto=soldoNeto+(soldoNeto*0.02)+(soldoNeto*0.05);
            }
        
        }
        else if(estudosPost==0){
            antiguedade=Integer.parseInt(JOptionPane.showInputDialog("Cuantos años lleva trabajando? "));
            if (antiguedade<7){
                soldoBruto=soldoNeto+(soldoNeto*0.02);
            }
            else{
                soldoBruto=soldoNeto+(soldoNeto*0.05);
            }
        }
        
    }

JOptionPane.showMessageDialog(null, "Este es su sueldo final: "+(soldoBruto-(soldoBruto*afp)-(soldoBruto*seguridade)));
 
}

    
}
    