package paquete;
import paquete.FuncionRecursiva;
import paquete.Torre_Hanoi;
import java.util.Scanner;
import java.util.ArrayList;

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
        
        System.out.println("\n__________________________________");
        
        System.out.println("Divide y Venceras");
        
        System.out.print("Esta funcion es muy importante, es cuando yo tengo un problema demaciado grande y no se como solucionarlo");
        System.out.println("\nUna forma de solucionar este problema es dividiendolo en sub problemas, y solucionar cada sub problema dividido");
        System.out.println("Y una vez solucionado cada subproblema, volvemos a unir cada subproblema para sacar una unica soluacion a mi problema original");
        System.out.println("Esta funcion generalmente se utiliza para el ordenamiento de Array");
        
        System.out.println("__________________________________");
        
        System.out.println("Torre de Hanoi");
        
        int n = 0;
        Scanner escribe = new Scanner (System.in);
        Torre_Hanoi TH;
        TH = new Torre_Hanoi();
        
        System.out.println("Por favor escribe el numero de Discos");
        
        n = escribe.nextInt();
        
        TH.TorreH(n, 1, 2, 3);
        
        System.out.println("_________________________________________");
        
        System.out.println("ArrayList");
        //Vamos a ver el funcionamiento del arraylist y lo primero que vamos a aclarar es que es una lista totalmente dinamica
        
        /*Empleado ListaEmpleado [] = new Empleado[4];
        
        ListaEmpleado [0] = new Empleado ("Ana",  23, 1200);
        ListaEmpleado [1] = new Empleado ("Nick", 25, 1500);
        ListaEmpleado [2] = new Empleado ("Rick", 30, 2000);
        ListaEmpleado [3] = new Empleado ("Rock", 30, 2000);
        */
        
        ArrayList <Empleado> ListaEmpleado = new ArrayList <Empleado>();
        
        //ListaEmpleado.ensureCapacity(13);// el ensureCapacity es un metodo muy importante por que yo puedo definir la capaidad de mi ArrayList
        
        ListaEmpleado.add(new Empleado("Nick", 25, 1500)); //Metodo add nos permite añadir un elemento a mi ArrayList
        ListaEmpleado.add(new Empleado("Stiven", 19, 1000 ));
        ListaEmpleado.add(new Empleado("Jorge", 20, 1100));
        ListaEmpleado.add(new Empleado("Jartha", 24, 1600));
        ListaEmpleado.add(new Empleado("Manuel", 19, 1000 ));
        ListaEmpleado.add(new Empleado("Cristiam", 20, 1100));
        ListaEmpleado.add(new Empleado("Robaerto", 24, 1600));
        ListaEmpleado.add(new Empleado("Carlos", 19, 1000 ));
        ListaEmpleado.add(new Empleado("Kalathras", 20, 1100));
        ListaEmpleado.add(new Empleado("Makoto", 24, 1600));
        ListaEmpleado.add(new Empleado("Hanako", 26, 1200));
        ListaEmpleado.add(new Empleado("Destructor", 28, 2000));
        ListaEmpleado.add(new Empleado("KalathrasConSombrero", 20, 1100));
        ListaEmpleado.add(new Empleado("Leon", 36, 2600));
        
        ListaEmpleado.set(3, new Empleado("Kaneki", 23, 3000)); //podemos modificar x elementos en n indice de mi ArrayList
        
        System.out.println("En el inidece 3 se encuentra = " + ListaEmpleado.get(3).dameDatos()); //el metodo get es para buscar un elemento que este en x posicion de mi ArrayList
        
        ListaEmpleado.remove(12); //con este metodo podemos eliminar un elemento de mi ArrayList
        
        ListaEmpleado.trimToSize(); // Borra el recolector de basura para optimizar recursos en la Memoria Ram
        
        
        
        System.out.println("La cantidad de elementos que tienes en la lista es de: " + ListaEmpleado.size()); //Metodo size para saber la cpaacidad de mi ArrayList
        
        
        
        for(Empleado h : ListaEmpleado)
        {
            System.out.println(h.dameDatos());
        }
        
        
    }
    
}
class Empleado
{
    public Empleado(String nombre, int edad, int salario)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    public String dameDatos()
    {
        return "El empleado se llama " + nombre + " tiene " + edad + " años y tiene un salario de: " + salario;
    }
    
    private String nombre;
    private int edad;
    private int salario;
}
