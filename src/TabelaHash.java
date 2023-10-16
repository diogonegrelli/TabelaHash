import java.util.Hashtable;
import java.util.LinkedList;

public class TabelaHash {


    Cliente tabelaHash [] = new Cliente[13];

    int size = tabelaHash.length;
    int posicoes = 9;

    public void iniciarTabela(Cliente vazio){
        for (int i =0; i< size ; i++){
            tabelaHash[i] = vazio;
        }
    }

    public int funcaoHash(int chave){
        return (chave % posicoes);
    }
    

    public void inserirCliente1(Cliente cliente){
        int posicaoColisao = 9;
        int idCliente = cliente.getIdCliente();
        int pos = funcaoHash(idCliente);
        if (tabelaHash[pos].getIdCliente() == -1 || tabelaHash[pos].getIdCliente() == -2){
            tabelaHash[pos] = cliente;}
        else{
            while (posicaoColisao <13){
                if (tabelaHash[posicaoColisao].getIdCliente()==-1 || tabelaHash[posicaoColisao].getIdCliente()==-2){
                    tabelaHash[posicaoColisao] = cliente;
                    return;
                }
                posicaoColisao = posicaoColisao +1;
            }
        }
    }

    public Cliente buscarCliente(int chave) {
        int pos = funcaoHash(chave);

            if (tabelaHash[pos].getIdCliente() == -1) {
                System.out.println("Objeto não encontrado!");
            } else {
                if (tabelaHash[pos].getIdCliente() == chave) {
                    System.out.println("Item encontrado!");
                
                }else{
                    for(int i = posicoes; i < size; i++) {
                        if(tabelaHash[i].getIdCliente() == chave) {
                            System.out.println("Item Encontrado!");
                            return tabelaHash[i];
                        }
                    }
            System.out.println("Item não encontrado");
            return null;
        }
            
            }
            return tabelaHash[pos];
    }

    

    public Cliente removerCliente(int chave) {
        int pos = funcaoHash(chave);
    
        if (tabelaHash[pos].getIdCliente() == -1) {
            System.out.println("Falha na remoção, item não encontrado!");
            return null;
        } else if (tabelaHash[pos].getIdCliente() == chave) {
            System.out.println("Cliente: " + tabelaHash[pos].getIdCliente() + "-" + tabelaHash[pos].getNomeCliente());
            System.out.println("Removido com sucesso!");
            tabelaHash[pos].setIdCliente(-2);
            tabelaHash[pos].setNomeCliente(" ");
            return tabelaHash[pos];
        } else {
            for (int i = posicoes; i < size; i++) {
                if (tabelaHash[i].getIdCliente() == chave) {
                    System.out.println("Cliente: " + tabelaHash[i].getIdCliente() + "-" + tabelaHash[i].getNomeCliente());
                    System.out.println("Removido com sucesso!");
                    tabelaHash[i].setIdCliente(-2);
                    tabelaHash[i].setNomeCliente(" ");
                    return tabelaHash[i];
                }
            }
        }
    
        System.out.println("Falha na remoção, item não encontrado!");
        return null;
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
