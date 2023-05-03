public class Impress {
    public static void main(String[] args) {


        GerenciamentoImpressora obj1 = GerenciamentoImpressora.getInstance();
        GerenciamentoImpressora obj2 = GerenciamentoImpressora.getInstance();

        if (obj1==obj2) {
            System.out.println("Possuem a mesma instância.");
        }
    }
}