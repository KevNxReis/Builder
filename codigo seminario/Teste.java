public class Teste {
    public static void main(String[] args) {
        CasaBuilder construtora = new CasaBuilder();
        construtora.novaCasa();
        construtora.buildComodo(5);
        construtora.buildPortas(3);
        construtora.buildJardim();
        construtora.buildPiscina();

        Casa casa = construtora.getCasa();

        System.out.println(casa.getJanela());
        System.out.println(casa.getJardim());
    }
}
