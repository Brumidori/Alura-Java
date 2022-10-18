// herdado de RuntimeException nao é checado pelo compilador
public class MyException extends RuntimeException{

    public MyException(String message){
        super(message);
    }
}
