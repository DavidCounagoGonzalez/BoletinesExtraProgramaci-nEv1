
package boextra_2;


public class Conta {
    
private String cliente;
private String numConta;
private double interese;
private double saldo;
    
//Constructores
public Conta(String cliente, String numConta, double interese, double saldo){
    this.cliente=cliente;
    this.numConta=numConta;
    this.interese=interese;
    this.saldo=saldo;
}

    public Conta() {
    }

//Métodos de acceso
public String getCliente(){
    return cliente;
}
public void setCliente(String cliente){
    this.cliente=cliente;
}
public String getNum(){
    return numConta;
}
public void setNum(String numConta){
    this.numConta=numConta;
}
public double getInterese(){
    return interese;
}
public void setInterese(double interese){
    this.interese=interese;
}
public double getSaldo(){
    return saldo;
}
public void setSaldo(double saldo){
    this.saldo=saldo;
}
//Métodos
public void Ingreso(double ingreso){
    double aumento=saldo+ingreso;
    System.out.println("Su saldo a aumentado a : "+ aumento+ "€");
}
public void Reintegro(double reintegro){
    double decremento=saldo-reintegro;
    System.out.println("Su saldo a disminuido a : "+decremento+ "€");
}
public void Transferencia(String conta2, double importe,double saldo1, double saldo2){
    System.out.println("La primera cuenta traspasará: "+importe+"€ ,por lo que se quedará con "+(saldo1-importe)+"€ y el saldo de la segunda cuenta aumentará a "+(saldo2+importe)+"€" );
}
}
