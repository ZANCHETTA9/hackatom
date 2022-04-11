
public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa();
        Pessoa pessoa1 = new Pessoa();
        Gas gas = new Gas();
        Agua agua = new Agua();
        Energia energia = new Energia();

        casa1.setEndereco("Rua capitao Nascimento de Jesus almeida pinto");
        casa1.setNumero(666);
        casa1.setCep(40028922);
        casa1.setBairro("Casa do chapeu preto");
        agua.setGasto_agua(250);
        agua.setMeta(500);
        casa1.setAgua(agua);

        energia.setGasto_energia(300);
        energia.setMeta(600);
        casa1.setEnergia(energia);

        gas.setGasto_gas(120);
        gas.setMeta(200);
        casa1.setGas(gas);

        pessoa1.setNomeCompleto("Eliza Agostinho Zanchetta");
        pessoa1.setCasa(casa1);
        pessoa1.setCpf(789565345);
        pessoa1.setDataDeNascimento("24/04/1989");
        pessoa1.getCasa().consultarConsumo();



    }
}
