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
        if (tabelaHash[pos].getIdCliente() == -1) {
            tabelaHash[pos] = cliente;
        }

    }

    public void inserirClienteTratado (Cliente cliente) {
        int idCliente = cliente.getIdCliente();
        int pos = funcaoHash(idCliente);
        while (true) {
            if (tabelaHash[pos].getIdCliente() == -1 || tabelaHash[pos].getIdCliente() == -2) {
                tabelaHash[pos] = cliente;
                break;
            } else {
                if (pos == size - 1){
                    pos = 0;
                } else{
                    pos += 1;
                }
            }
        }
    }


    public Cliente buscarCliente(int chave){
        int pos = funcaoHash(chave);
        if (tabelaHash[pos].getIdCliente() == -1) {
            return null;}
        else{
            return tabelaHash[pos];
        }
    }

    public Cliente buscarClienteTratado (int chave) {
        int pos = funcaoHash(chave);
        Cliente clienteEncontrado;
        while (true) {
            if (tabelaHash[pos].getIdCliente() == chave) {
                clienteEncontrado = tabelaHash[pos];
                System.out.println("Cliente encontrado!");
                break;
            } else if(tabelaHash[pos].getIdCliente() == -2) {
                pos += 1;
            } else if(tabelaHash[pos].getIdCliente() == -1){
                System.out.println("Cliente não inserido na tabela!");
                clienteEncontrado = null;
                break;
            } else {
                pos += 1;
            }
        }
        return clienteEncontrado;
    }

    public Cliente removerCliente(int chave){
        int pos = funcaoHash(chave);
        return null;
    }

    public Cliente removerClienteTratado(int chave) {
        Cliente disponivel = new Cliente(-2, " ");
        int pos = funcaoHash(chave);
        Cliente clienteRemovido;
        while (true) {
            if (tabelaHash[pos].getIdCliente() == chave) {
                clienteRemovido = tabelaHash[pos];
                tabelaHash[pos] = disponivel;
                System.out.println("Cliente removido com sucesso!");
                break;
            } else if(tabelaHash[pos].getIdCliente() == -2) {
                pos += 1;
            } else if(tabelaHash[pos].getIdCliente() == -1) {
                System.out.println("Cliente não inserido na tabela!");
                clienteRemovido = null;
                break;
            } else {
                pos += 1;
            }
        }
        return clienteRemovido;
    }

    public Cliente[] getTabelaHash() {
        return tabelaHash;
    }
}
