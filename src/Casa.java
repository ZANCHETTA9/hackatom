public class Casa {
    private String endereco;
    private int numero;
    private String bairro;
    private int cep;
    private Agua agua;
    private Gas gas;
    private Energia energia;

    public void consultarConsumo(){
        System.out.println(" O Gasto atual de agua é de : " + agua.getGasto_agua() + " E sua meta é de : " + agua.getMeta());

        System.out.println(" O Gasto atual de energia é de : " + energia.getGasto_energia() + " E sua meta é de : " + energia.getMeta());

        System.out.println(" O Gasto atual de gas é de : " + gas.getGasto_gas() + " E sua meta é de : " + gas.getMeta());
    }

    public Agua getAgua() {
        return agua;
    }

    public void setAgua(Agua agua) {
        this.agua = agua;
    }

    public Gas getGas() {
        return gas;
    }

    public void setGas(Gas gas) {
        this.gas = gas;
    }

    public Energia getEnergia() {
        return energia;
    }

    public void setEnergia(Energia energia) {
        this.energia = energia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
}
