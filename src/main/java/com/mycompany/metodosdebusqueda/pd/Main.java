package com.mycompany.metodosdebusqueda.pd;

public class Main {
    private static final int numeros[] = {1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90,100};
    private static int resul = BusquedaBinaria(numeros,numeros.length-1,0,80);
    private static int resul2 = BusquedaLineal(numeros,100);
    
    public static void main(String[] args){
        mostrarResultados();
    }
    private static void mostrarResultados(){
        if(resul == -1){
            System.out.println("\nBusqueda Binaria \nEl Numero que busca no se encontró en el Array");
        }else{
            System.out.println("\nBusqueda Binaria \nEl Numero fué encontrado en el indice: " + resul);
        }
        if(resul2 == -1){
            System.out.println("\nBusqueda Lineal \nEl Numero que busca no se encontró en el Array");
        }else{
            System.out.println("\nBusqueda Lineal \nEl Numero fué encontrado en el indice: " + resul2);
        }
    }
    private static int BusquedaBinaria(int[] array,int right, int left, int objetive){
        if(right>=left){
            int m = left + (right-left)/2;
            if(objetive == array[m]){
                return m;
            }else if(objetive>array[m]){
                if(objetive == array[right]){
                    return right;
                }else{
                    return BusquedaBinaria(array,right-1,m+1,objetive);
                }
            }else{
                if(objetive == array[left]){
                    return left;
                }else{
                    return BusquedaBinaria(array,m-1,left+1,objetive);
                }
            }
        }
        return -1;
    }
    private static int BusquedaLineal(int[] array, int objetive){
        int posicion = -1;
        for(int x=0;x<array.length;x++){
            if(objetive==array[x]){
                posicion = x;
                break;
            }
        }
        return posicion;
    }
}