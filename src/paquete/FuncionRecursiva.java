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
public class FuncionRecursiva {
    
    public void ciclo(int x)
    {
        if(x <= 20)
        {
            System.out.print(x + " ");
            
            ciclo(x + 1);
        }
    }
    
}
