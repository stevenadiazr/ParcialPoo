package parque;

public class ParejaNoJuntaExcepcion extends Exception{
    public ParejaNoJuntaExcepcion(){
        super("No se han podido encontrar asientos juntos.");
    }
}
