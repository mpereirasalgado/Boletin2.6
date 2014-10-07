
package boletin2.pkg6;

import java.util.Scanner;

/**@author Micael*/
public class Boletin26 
{
    public static void main(String[] args) 
    {
       float pagado, tarifa;
       System.out.println("Calculo del descuento aplicado\nIntroducir el precio del producto:");
       Scanner dato = new Scanner(System.in);
       tarifa=dato.nextFloat();
       System.out.println("Introducir cantidad pagada:");
       pagado=dato.nextFloat();
       System.out.println("el descuento aplicado en la compra a sido del "+((tarifa-pagado)/tarifa)*100+" % ");
       
    }
    
}
