package paquete;
import paquete.FuncionRecursiva;

public class Clase_Principal {
    
    public static void main (String [] args)
    {
        System.out.println("Funcion Recursiva");
        
        FuncionRecursiva FR;
        FR = new FuncionRecursiva();
        
        FR.ciclo(1);
        
        System.out.println("\n___________________________________________________");
       
        System.out.println("Secuencia Fubonacci");
        
        //Una secuencia fubonacci se puede hacer con los cilos For, while y do while
        
        int a = 1;
        int b = 0;
        int c;
        
        System.out.println("Con For");
        
        for(int i = 0; i <= 10; i++)
        {
            if(a <= 60)
            {
                System.out.print(a + " ");
                
                c = a;
                a = a + b;
                b = c;
            }
        }
        
        System.out.println("\nCon While");
        
        int x = 1;
        int y = 0;
        int z;
        
        while(true)
        {
            if(x  > 60)
            {
                break;
            }
            
            System.out.print(x + " ");
            
            z = x;
            x = x + y;
            y = z;
        }
        
        System.out.println("\nCon Do While");
        
        int q = 1;
        int w = 0;
        int e;
        int r = 0;
        
        do
        {
            if(r < 10)
            {
                System.out.print(q + " ");
                
                e = q;
                q = q + w;
                w = e;
            }
            
            r++;
            
        }while(r < 10);
        
        
        
        
    }
    
}
