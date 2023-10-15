// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        
        TabelaHash clientes = new TabelaHash();

        Cliente vazio = new Cliente(-1, "");

        Cliente c10 = new Cliente(546, "Ana");
        Cliente c11 = new Cliente(234, "Carlos");
        Cliente c12 = new Cliente(123, "João");
        Cliente c13 = new Cliente(808, "Beatriz");
        Cliente c14 = new Cliente(945, "Laura");
        Cliente c15 = new Cliente(021, "Henrique");
        Cliente c16 = new Cliente(367, "Caio");
        Cliente c17 = new Cliente(447, "Amanda");
        Cliente c18 = new Cliente(675, "Claudio");

        clientes.iniciarTabela(vazio);
        clientes.inserirCliente(c17);
        clientes.inserirCliente(c13);
        clientes.inserirCliente(c10);
        clientes.inserirCliente(c12);
        clientes.inserirCliente(c11);
        clientes.inserirCliente(c16);
        clientes.inserirCliente(c15);
        clientes.inserirCliente(c14);







        System.out.println("--------------------");
        System.out.println("Tabela Hash CLientes");
        System.out.println("Chave  -  ID  - Nome");
        for (int i = 0  ; i< clientes.size ; i++){
            System.out.println(i + "        " + clientes.tabelaHash[i].getIdCliente()+ "   " + clientes.tabelaHash[i].getNomeCliente());
        }

    }
}