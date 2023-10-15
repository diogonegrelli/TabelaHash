
public class Cliente <T>{
    private int idCliente;
    private String nomeCliente;
    Cliente leftNode;
    Cliente rightNode;

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

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
