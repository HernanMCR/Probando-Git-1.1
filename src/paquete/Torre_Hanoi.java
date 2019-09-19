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
public class Torre_Hanoi {
    
    public void TorreH(int discos, int inicio, int intermedio, int fin)
    {
        if(discos == 1)
        {
            System.out.println("Mueva el disco que esta en la columna" + " " + inicio + " "+ "y coloquela en la columna" + " " + fin);
        }
        else
        {
            TorreH(discos -1, inicio, fin, intermedio);
            System.out.println("Mueva el disco que esta en la columna" + " " + inicio + " "+ "y coloquela en la columna" + " " + fin);
            TorreH(discos -1, intermedio, inicio, fin);
        }
    }
    
}
