public class TabelaHash {


    Cliente tabelaHash [] = new Cliente[13];

    int size = tabelaHash.length;
    int posicoes = 9;
    int iteracoes1;
    int iteracoes2;


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
            tabelaHash[pos] = cliente;
            System.out.println("Cliente inserido com sucesso!");
        } else {
            while (posicaoColisao < 13) {
                if (tabelaHash[posicaoColisao].getIdCliente()==-1 || tabelaHash[posicaoColisao].getIdCliente()==-2) {
                    tabelaHash[posicaoColisao] = cliente;
                    System.out.println("Cliente inserido com sucesso!");
                    return;
                }
                posicaoColisao = posicaoColisao +1;
            }
        }
    }

    public void inserirCliente2 (Cliente cliente) {
        int idCliente = cliente.getIdCliente();
        int pos = funcaoHash(idCliente);
        while (true) {
            if (tabelaHash[pos].getIdCliente() == -1 || tabelaHash[pos].getIdCliente() == -2) {
                tabelaHash[pos] = cliente;
                System.out.println("Cliente inserido com sucesso!");
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

    public Cliente buscarCliente1(int chave) {
        int pos = funcaoHash(chave);
        iteracoes1 = 0;
        if (tabelaHash[pos].getIdCliente() == -1) {
            System.out.println("Objeto não encontrado!");
            iteracoes1 += 1;
        } else {
            if (tabelaHash[pos].getIdCliente() == chave) {
                System.out.println("Item encontrado!");
                iteracoes1 += 1;
            } else {
                for(int i = posicoes; i < size; i++) {
                    if(tabelaHash[i].getIdCliente() == chave) {
                        System.out.println("Item Encontrado!");
                        iteracoes1 += 1;
                        return tabelaHash[i];
                    }
                    iteracoes1 += 1;
                }
                System.out.println("Item não encontrado");
                return null;
            }
        }
        return tabelaHash[pos];
    }

    public Cliente buscarCliente2 (int chave) {
        iteracoes2 = 0;
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
                System.out.println("Cliente encontrado!");
                clienteEncontrado = null;
                break;
            } else {
                pos += 1;
            }
            iteracoes2 += 1;
        }
        return clienteEncontrado;
    }

    

    public Cliente removerCliente1(int chave) {
        int pos = funcaoHash(chave);
        Cliente disponivel = new Cliente(-2, " ");
    
        if (tabelaHash[pos].getIdCliente() == -1) {
            System.out.println("Falha na remoção, item não encontrado!");
            return null;
        } else if (tabelaHash[pos].getIdCliente() == chave) {
            System.out.println("Cliente: " + tabelaHash[pos].getIdCliente() + " - " + tabelaHash[pos].getNomeCliente());
            System.out.println("Removido com sucesso!");
            tabelaHash[pos] = disponivel;
            return tabelaHash[pos];
        } else {
            for (int i = posicoes; i < size; i++) {
                if (tabelaHash[i].getIdCliente() == chave) {
                    System.out.println("Cliente: " + tabelaHash[i].getIdCliente() + " - " + tabelaHash[i].getNomeCliente());
                    System.out.println("Removido com sucesso!");
                    tabelaHash[i] = disponivel;
                    return tabelaHash[i];
                }
            }
        }
    
        System.out.println("Falha na remoção, item não encontrado!");
        return null;
    }

    public Cliente removerCliente2(int chave) {
        Cliente disponivel = new Cliente(-2, " ");
        int pos = funcaoHash(chave);
        Cliente clienteRemovido;
        while (true) {
            if (tabelaHash[pos].getIdCliente() == chave) {
                clienteRemovido = tabelaHash[pos];
                System.out.println("Cliente " + tabelaHash[pos].getIdCliente() + " - " + tabelaHash[pos].getNomeCliente() + " removido com sucesso!");
                tabelaHash[pos] = disponivel;
                break;
            } else if(tabelaHash[pos].getIdCliente() == -2) {
                pos += 1;
            } else if(tabelaHash[pos].getIdCliente() == -1) {
                System.out.println("Cliente não encontrado!");
                clienteRemovido = null;
                break;
            } else {
                pos += 1;
            }
        }
        return clienteRemovido;
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
