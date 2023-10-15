import java.util.Hashtable;

public class TabelaHash {

    Cliente tabelaHash [] = new Cliente[12];
    int size = tabelaHash.length;

    public void iniciarTabela(Cliente vazio){
        for (int i =0; i< size ; i++){
            tabelaHash[i] = vazio;
        }
    }

    public int funcaoHash(int chave){
        return (chave % size);
    }

    public void inserirCliente(Cliente cliente){
        int idCliente = cliente.getIdCliente();
        int pos = funcaoHash(idCliente);
        if (tabelaHash[pos] == null);
            tabelaHash[pos] = cliente;

    }

    public Cliente buscarCliente(int chave){
        int pos = funcaoHash(chave);
        if (tabelaHash[pos].getIdCliente() ==-1) {
            return null;}
        else{
            return tabelaHash[pos];
        }
    }

    public Cliente removerCliente(int chave){
        int pos = funcaoHash(chave);
        return null;
    }

    public Cliente[] getTabelaHash() {
        return tabelaHash;
    }
}
