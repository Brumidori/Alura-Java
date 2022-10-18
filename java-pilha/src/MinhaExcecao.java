// herdado de Exception é checado pelo compilador
public class MinhaExcecao extends Exception{

    public MinhaExcecao(String message){
        super(message);
    }
}
