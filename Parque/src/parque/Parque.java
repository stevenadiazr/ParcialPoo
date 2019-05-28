package parque;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Parque {
    static Scanner in = new Scanner(System.in); 
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        boolean continuar = true;
        int opcion = 0; 
        int rueda = 0;  
        do{
            System.out.println("Ingrese la rueda a la que desea ingresar: \n1. Gusanito. \n2 Chicago. \n3. Montania Rusa");
            try{
                rueda = in.nextInt();
                if(rueda < 1 && rueda > 3){
                    throw new ValorNoValidoExcepcion();
                }
                continuar = false;
            }catch(InputMismatchException ime){
                System.out.println("Ingrese un numero entero correcto.");
            }catch(ValorNoValidoExcepcion vnv){
                System.out.println(vnv.getMessage());
            }finally{
                in.nextLine();
            }
        }while(continuar);
    }
    
    public static void gusanito(int cantPersonas){
        int opcion = 0;
        int personas = 0;
        boolean continuar = true;
        do{
            System.out.println("Seleccione la accion que desea realizar: \n1. Agregar personas. \n2. Mostrar asientos. \n3. Ver ganancias. \n0. Salir.");
            try{
                opcion = in.nextInt();
                if (opcion < 0 && opcion >3){
                    throw new ValorNoValidoExcepcion();
                } else{
                    continuar = false;
                }
            }catch(InputMismatchException ime){
                System.out.println("Ingrese un numero entero correcto.");
            }catch(ValorNoValidoExcepcion vnv){
                System.out.println(vnv.getMessage());
            }finally{
                in.nextLine();
            }
        } while(continuar);
        if(opcion == 1){
            do{
                System.out.println("Ingrese cantidad de personas, siendo 2 el maximo: ");
                try{
                    personas = in.nextInt();
                    if(personas < 1 && personas > 2){
                        throw new ValorNoValidoExcepcion();
                    }
                }catch(InputMismatchException ime){
                    System.out.println("Ingrese un numero entero correcto.");
                }catch(ValorNoValidoExcepcion vnv){
                    System.out.println(vnv.getMessage());
                }finally{
                    in.nextLine();
                }
            }while(continuar);
        }
    }
}
