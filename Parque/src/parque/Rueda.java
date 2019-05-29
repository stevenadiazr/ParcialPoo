/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parque;

import java.util.ArrayList;

public class Rueda {
    protected double precio;
    protected int ncarritos;

    
    public void agregarAsientos(ArrayList<Boolean> carritos, ArrayList <Boolean> asientos, int ncarritos, int personas){
      try{       
        for (int i = 0; i < carritos.size(); i++) {
            for (int j = 0; j < asientos.size(); j++) {
                    if (asientos.get(j)==true && personas == 1) {
                        asientos.set(i, false);        
                            } else if (asientos.get(j)==true && asientos.get(j)==true && personas ==2) {
                                asientos.set(j, false);
                                asientos.set(i, false);
                            } else if (asientos.get(i)==false && asientos.get(i)==true){
                                throw new ParejaNoJuntaExcepcion();
                            }
                        }
                }
                
            }catch(ParejaNoJuntaExcepcion pnj){
                System.out.println(pnj.getMessage());
            }
    }
        
    
    
    public void mostrarAsientos(ArrayList<Boolean> carritos, ArrayList <Boolean> asientos){
        for (int i = 0; i < carritos.size(); i++) {
            for (int j = 0; j < asientos.size(); j++) {
                System.out.println("Vagon #" + i + "[" + asientos.get(j) + asientos.get(j+1)+ "]");
            }
            
        }
    }
    
    public void mostrarGanancia(ArrayList<Boolean> carritos, ArrayList <Boolean> asientos, int personas){
        double ganancia=0;
        for (int i = 0; i < carritos.size(); i++) {
            for (int j = 0; j < asientos.size(); j++) {
                ganancia+=(precio*personas);
            }
            
        }
        System.out.println("Ganancia =" + ganancia);
        
    }
    
}
