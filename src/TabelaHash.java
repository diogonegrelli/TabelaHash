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

    public void inserirCliente1(Cliente cliente){
        int idCliente = cliente.getIdCliente();
        int pos = funcaoHash(idCliente);
        if (tabelaHash[pos].getIdCliente() == -1);
            tabelaHash[pos] = cliente;
    }

    public Cliente buscarCliente(int chave) {
        int pos = funcaoHash(chave);
        if (tabelaHash[pos].getIdCliente() == -1) {
            System.out.println("Objeto não encontrado!");
        } else {
            if (tabelaHash[pos].getIdCliente() == chave) {
                System.out.println("Item encontrado!");
            }
        }
        return tabelaHash[pos];
    }

    public Cliente removerCliente(int chave){
        int pos = funcaoHash(chave);
        if (tabelaHash[pos].getIdCliente() == -1){
            System.out.println("Falha na remoção, item não encontrado!");
            return null;
        }
        else{
            if(tabelaHash[pos].getIdCliente() == chave){
                System.out.println("Cliente: "+ tabelaHash[pos].getIdCliente() +"-"+ tabelaHash[pos].getNomeCliente());
                System.out.println("Removido com sucesso!");
                tabelaHash[pos].setIdCliente(-2);
                tabelaHash[pos].setNomeCliente(" ");
            }
        }
        return tabelaHash[pos];
    }

    public void printarTabela(){
        System.out.println("--------------------");
        System.out.println("Tabela Hash CLientes");
        System.out.println("       ID       NOME");
        for (int i = 0  ; i< size ; i++){
            System.out.println(i + "  |   " + tabelaHash[i].getIdCliente()+ "  | " + tabelaHash[i].getNomeCliente());
            System.out.println("-------------------------");
        }
    }


}
