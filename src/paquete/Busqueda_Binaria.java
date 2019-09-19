/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author herna
 */
public class Busqueda_Binaria {
    
    public int busquedaB(int [] array, int valor)
    {
        int izq = 0;
        int der = array.length -1;
        int centro = (izq + der)/2;
        boolean cond = false;
        
        while(izq <= der && !cond)
        {
            centro = (izq + der)/2;
            
            if(array[centro] == valor)
            {
                cond = true;
            }
            else
            {
                if(array[centro] < valor)
                {
                    izq = centro + 1;
                }
                else
                {
                    der = centro - 1;
                }
            }
        }
        
        if(cond == true)
        {
            return centro;
        }
        return -1;
    }
    
}
