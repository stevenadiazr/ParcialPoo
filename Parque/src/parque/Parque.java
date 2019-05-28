package parque;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Parque {
    static Scanner in = new Scanner(System.in); 
    public ArrayList<boolean[]> carritoMontania;
    public ArrayList<boolean[]> carritoChicago;
    public ArrayList<boolean[]> carritoGusanito;
    public boolean[] asientos = new boolean[] {true, true};
    public int cantCarritos;
    
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
    
    public void gusanito(){
        int opcion = 0;
        int personas = 0;
        boolean continuar = true;
        cantCarritos = 12;
        inicializarMatriz(carritoGusanito, asientos, cantCarritos);
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
            //llama a la funcion agregar
        } else{
            switch(opcion){
                case 2:
                    // llama a mostrar asiento
                case 3:
                    // llama a mostrar ganancia
            }
        }
    }
    
    public void montaniaRusa(int cantPersonas){
        int opcion = 0;
        int personas = 0;
        boolean continuar = true;
        cantCarritos = 24;
        inicializarMatriz(carritoMontania, asientos, cantCarritos);
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
            //llama funcion agregar
        }else{
            switch(opcion){
                case 2:
                    // llama a mostrar asiento
                case 3:
                    // llama a mostrar ganancia
            }
        }
    }
    
    public void chicago(int cantPersonas){
        int opcion = 0;
        int personas = 0;
        boolean continuar = true;
        cantCarritos = 24;
        inicializarMatriz(carritoChicago, asientos, cantCarritos);
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
            //llamar funcion agregar
        }else{
            switch(opcion){
                case 2:
                    // llama a mostrar asiento
                case 3:
                    // llama a mostrar ganancia
            }
        }
    }
    
    public static void inicializarMatriz(ArrayList<boolean[]> carrito, boolean[] asientos, int cantCarritos){
        for(int i = 0; i < cantCarritos; i++){
            carrito.add(asientos);
        }
    }
}
