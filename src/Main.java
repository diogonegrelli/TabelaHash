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
        clientes.inserirClienteTratado(c17);
        clientes.inserirClienteTratado(c13);
        clientes.inserirClienteTratado(c10);
        clientes.inserirClienteTratado(c12);
        clientes.inserirClienteTratado(c11);
        clientes.inserirClienteTratado(c16);
        clientes.inserirClienteTratado(c15);
        clientes.inserirClienteTratado(c14);

        clientes.removerClienteTratado(675);
        clientes.removerClienteTratado(234);
        clientes.buscarClienteTratado(123);
        clientes.buscarClienteTratado(675);
        clientes.buscarClienteTratado(234);

        System.out.println("--------------------");
        System.out.println("Tabela Hash CLientes");
        System.out.println("Chave  -  ID  - Nome");
        for (int i = 0  ; i< clientes.size ; i++){
            System.out.println(i + "        " + clientes.tabelaHash[i].getIdCliente()+ "   " + clientes.tabelaHash[i].getNomeCliente());
        }

    }
}