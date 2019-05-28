package parque;

public class ValorNoValidoExcepcion extends Exception{
    public ValorNoValidoExcepcion(){
        super("Valor fuera de limites, ingrese un numero valido.");
    }
}
