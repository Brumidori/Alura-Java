 public class Conexao implements AutoCloseable {

        public Conexao() {
            System.out.println("Abrindo conexao");
        }

        public void close() {
            System.out.println("Fechando conexao");
        }

        public void leDados() {
            System.out.println("Recebendo dados");
            throw new IllegalStateException(); //unchecked
        }

        public void fecha() {
            System.out.println("Fechando conexao");
        }
    }

