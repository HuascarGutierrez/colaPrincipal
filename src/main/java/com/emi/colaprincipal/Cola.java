/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emi.colaprincipal;

/**
 *
 * @author huasc
 */
public final class Cola {
    Nodo entrada;
    Nodo salida;
    int cantidad;
    public Cola()
    {
        this.entrada = null;
        this.salida = null;
        this.cantidad = 0;
    }
    public Cola (String[] datos)
    {
        for(int i=0;i<datos.length;i++)
            this.poner(datos[i]);
    }
    public void poner()
    {
        Nodo nuevo = new Nodo();
        if(salida == null)
        {
            entrada = nuevo;
            salida = nuevo;
        }
        else
        {
            entrada.siguiente = nuevo;
            entrada = entrada.siguiente;
        }
        cantidad++;
    }
    public void poner(String x)
    {
        Nodo nuevo = new Nodo(x);
        if(salida == null)
        {
            entrada = nuevo;
            salida = nuevo;
        }
        else
        {
            entrada.siguiente = nuevo;
            entrada = entrada.siguiente;
        }
        cantidad++;
    }
    public void sacar()
    {
        if (salida !=null)
        {
            salida = salida.siguiente;
            cantidad--;
        }
        else
        {
            System.out.println("No hay datos en la cola");
        }
    }
    public void mostrar()
    {
        Nodo actual = salida;
        if(salida != null)
        {
            while(actual !=null)
            {
                actual.mostrar();
                actual=actual.siguiente;
            }
        }
        else
        {
            System.out.println("No hay datos en la cola");
        }
    }
    public void buscar(String dato1)
    {
        Nodo actual = salida;
        int contador=1;
        if (cantidad >0)
        {
            System.out.println("Se encuentra en la posicion: ");
            while(actual!=null)
            {
                if (actual.dato.equals(dato1))
                {
                    System.out.println(contador);
                }
                contador++;
                actual=actual.siguiente;
            }
        }
        else
        {
            System.out.println("No tiene datos en la cola");
        }
    }
    public void vector (int tamano)
    {
        for (int i=0;i<tamano;i++)
        {
            Nodo nuevo = new Nodo();
            this.poner(nuevo.dato);
        }
        System.out.println("el vector es:");
        this.mostrar();
    }
    public void vRenombrar(int posicion,String dato)
    {
        Nodo actual = salida;
        for(int i=0;i<posicion;i++)
            actual = actual.siguiente;
        actual.dato = dato;
        System.out.println("Se renombro exitosamente");
        this.mostrar();
    }
}
