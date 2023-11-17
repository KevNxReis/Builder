public class CasaBuilder {
    private Casa casa;
    public void novaCasa(){
        this.casa = new Casa();
    }
    public void buildPortas(int qtd){
        casa.setPortas(qtd);
    }
    public void buildJanelas(int qtd){
        casa.setJanela(qtd);
    }
    public void buildComodo(int qtd){
        casa.setComodos(qtd);
    }
    public void buildPiscina(){
        casa.setPiscina(true);
    }
    public void buildJardim(){
        casa.setJardim(true);
    }
    public void buildGaragem(){
        casa.setGaragem(true);
    }

    public Casa getCasa(){
        return casa;
    }
}














