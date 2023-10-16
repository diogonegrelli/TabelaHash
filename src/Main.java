// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        TabelaHash clientes1 = new TabelaHash();
        TabelaHash clientes2 = new TabelaHash();

        Cliente vazio = new Cliente(-1, "");
        clientes1.iniciarTabela(vazio);

        Cliente c10 = new Cliente(546, "Ana");
        Cliente c11 = new Cliente(234, "Carlos");
        Cliente c12 = new Cliente(123, "João");
        Cliente c13 = new Cliente(808, "Beatriz");
        Cliente c14 = new Cliente(945, "Laura");
        Cliente c15 = new Cliente(021, "Henrique");
        Cliente c16 = new Cliente(367, "Caio");
        Cliente c17 = new Cliente(447, "Ameinda");
        Cliente c18 = new Cliente(675, "Claudio");

        // insere utilizando o primeiro tratamento
        clientes1.inserirCliente1(c17);
        clientes1.inserirCliente1(c13);
        clientes1.inserirCliente1(c10);
        clientes1.inserirCliente1(c14);
        clientes1.inserirCliente1(c11);
        clientes1.inserirCliente1(c15);
        clientes1.inserirCliente1(c18);

        clientes1.printarTabela();

        clientes1.removerCliente1(945);
        clientes1.buscarCliente1(675);

        clientes1.printarTabela();

        clientes2.iniciarTabela(vazio);

        // insere utilizando o segundo tratamento
        clientes2.inserirCliente2(c17);
        clientes2.inserirCliente2(c13);
        clientes2.inserirCliente2(c10);
        clientes2.inserirCliente2(c14);
        clientes2.inserirCliente2(c11);
        clientes2.inserirCliente2(c15);
        clientes2.inserirCliente2(c18);

        clientes2.printarTabela();

        clientes2.removerCliente2(945);
        clientes2.buscarCliente2(675);

        clientes2.printarTabela();

        System.out.println("A função de busca do primeiro tratamento realizou " + clientes1.iteracoes1 + " iterações");
        System.out.println("A função de busca do primeiro tratamento realizou " + clientes2.iteracoes2 + " iterações");

        if(clientes1.iteracoes1 < clientes2.iteracoes2) {
            System.out.println("O primeiro tratamento é mais eficiente!");
        } else {
            System.out.println("O segundo tratamento é mais eficiente!");
        }

    }


}