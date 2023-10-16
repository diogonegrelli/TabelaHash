// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        TabelaHash clientes = new TabelaHash();

        Cliente vazio = new Cliente(-1, "");
        clientes.iniciarTabela(vazio);

        Cliente c10 = new Cliente(546, "Ana");
        Cliente c11 = new Cliente(234, "Carlos");
        Cliente c12 = new Cliente(123, "João");
        Cliente c13 = new Cliente(808, "Beatriz");
        Cliente c14 = new Cliente(945, "Laura");
        Cliente c15 = new Cliente(021, "Henrique");
        Cliente c16 = new Cliente(367, "Caio");
        Cliente c17 = new Cliente(447, "Ameinda");
        Cliente c18 = new Cliente(675, "Claudio");


        clientes.inserirCliente1(c17);
        clientes.inserirCliente1(c13);
        clientes.inserirCliente1(c10);
        clientes.inserirCliente1(c12);
        clientes.inserirCliente1(c11);
        clientes.inserirCliente1(c16);
        clientes.inserirCliente1(c15);
        clientes.inserirCliente1(c14);
        clientes.inserirCliente1(c18);


        clientes.printarTabela();


        clientes.buscarCliente(12);

    }


}