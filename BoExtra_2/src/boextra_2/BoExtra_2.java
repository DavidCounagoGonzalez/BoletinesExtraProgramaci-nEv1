
package boextra_2;

import java.util.Scanner;

public class BoExtra_2 {
    static double saldo1;
    static double saldo2;
    static double importe;

    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        System.out.println("Introduce el saldo de la cuenta que hará el traspaso: ");
        saldo1=datos.nextDouble();
        System.out.println("Introduce cuál será el valor del importe: ");
        importe=datos.nextDouble();
        System.out.println("Introduce el saldo de la cuenta que recibe el traspaso: ");
        saldo2=datos.nextDouble();
        
        Conta conta1=new Conta();
        conta1.setSaldo(saldo1);
        
        Conta conta2=new Conta();
        conta2.setSaldo(saldo2);
        
        conta1.Transferencia("Conta2", importe,saldo1,saldo2);

    }
}
