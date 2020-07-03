/*
Zavala Concha Silvia Nallely
 */


import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class CUBO
{

    /**
     * @param args the command line arguments
     */
    static Scanner entrada =new Scanner (System.in);
    public static void main(String[] args)
    {
        // TODO code application logic here
        int cifra,rc;
        
        
        
       System.out.println("ingrese cifra:");
       cifra = entrada.nextInt();
       rc =(int) Math.pow (cifra,(double)1.0 / 3.0);
       if (rc* rc * rc == cifra)
           System.out.println("La cifra SI es un cubo");
       else
           System.out.print("La cifra NO es un cubo");
    }
    
}
