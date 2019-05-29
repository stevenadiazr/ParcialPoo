package parque;

import java.util.ArrayList;
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
            System.out.println("Ingrese la rueda a la que desea ingresar: \n1. Gusanito. \n2 Chicago. \n3. Montania Rusa \n0.Salir");
            try{
                opcion= in.nextInt();
                switch(opcion){
                    case 1:
                        gusanito();
                        break;
                        
                    case 2:
                        chicago();
                        break;    
                    case 3:
                        montaniaRusa();
                        break;
                    case 0:
                        
                        continuar=false;
                        break;
                            
                }
                
                
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
    
    public static void gusanito(){
        int opc = 0;
        int personas = 0;
        boolean continuar = true;
        Gusanito g=new Gusanito();
        ArrayList<ArrayList<Boolean>> carritoGusanito=new ArrayList<>();
        ArrayList<Boolean> asientos=new ArrayList<>();
        int cantCarritos;
        cantCarritos = 12;
        inicializarMatriz(carritoGusanito, asientos, cantCarritos);
       
        do{
            System.out.println("Seleccione la accion que desea realizar: \n1. Agregar personas. \n2. Mostrar asientos. \n3. Ver ganancias. \n0. Salir.");
            try{
                opc = in.nextInt();
                if (opc< 0 && opc >3){
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
        if(opc== 1){
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
                g.agregarAsientos(asientos, asientos, cantCarritos, personas);
        } else{
            switch(opc){
                case 2:
                    g.mostrarAsientos(asientos, asientos);
                case 3:
                    g.mostrarGanancia(asientos, asientos, personas);
            }
        }
    }
    
    public static void montaniaRusa(){
        int opcion = 0;
        int personas = 0;
        boolean continuar = true;
        ArrayList<ArrayList<Boolean>> carritoMontania=new ArrayList<>();
        ArrayList<Boolean> asientos=new ArrayList<>();
        Rusa ru= new Rusa();
        int cantCarritos;
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
            ru.agregarAsientos(asientos, asientos, cantCarritos, personas);
        }else{
            switch(opcion){
                case 2:
                    ru.mostrarAsientos(asientos, asientos);
                case 3:
                    ru.mostrarGanancia(asientos, asientos, personas);
            }
        }
    }
    
    public static void chicago(){
        int opcion = 0;
        int personas = 0;
        boolean continuar = true;
        int cantCarritos;
        cantCarritos = 24;
        ArrayList<ArrayList<Boolean>> carritoChicago=new ArrayList<>();
        ArrayList<Boolean> asientos=new ArrayList<>();
        Chicago c=new Chicago();
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
            c.agregarAsientos(asientos, asientos, cantCarritos, personas);
        }else{
            switch(opcion){
                case 2:
                    c.mostrarAsientos(asientos, asientos);
                case 3:
                    c.mostrarGanancia(asientos, asientos, personas);
            }
        }
    }
    
    public static void inicializarMatriz(ArrayList<ArrayList<Boolean>> carrito, ArrayList<Boolean> asientos, int cantCarritos){
        asientos.add(true);
        asientos.add(true);
        for(int i = 0; i < cantCarritos; i++){
            carrito.add(asientos);
        }
    }
}
