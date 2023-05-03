public class GerenciamentoImpressora {
    private static GerenciamentoImpressora instance;
    private  GerenciamentoImpressora(){
        System.out.println("GerenciamentoImpressora criado com sucesso.");
    }

    public static synchronized  GerenciamentoImpressora getInstance() {
        if (instance == null) {
            instance = new GerenciamentoImpressora();
        }
        return instance;
    }
    @Override
    public Object clone()  throws CloneNotSupportedException{
        throw  new CloneNotSupportedException();
    }
}
