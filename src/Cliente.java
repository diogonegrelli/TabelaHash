
public class Cliente {
    private int idCliente;
    private String nomeCliente;

    public Cliente(int idCliente, String nomeCliente){
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
    }

    public int getIdCliente(){
        return idCliente;
    }
    public String getNomeCliente(){
        return nomeCliente;
    }


}
