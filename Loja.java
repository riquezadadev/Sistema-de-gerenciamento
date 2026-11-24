import java.util.Scanner;

public class Loja {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        //Oq vai ter nesta bomba
        // Cadastro e alteração de produtos.
        //Listagem e busca.
        //Controle de entradas e saídas.
        //Registro de vendas.
        //Consulta de estoque.
        //Alertas de estoque baixo.
        //Histórico de movimentações.
        //Relatórios de vendas e impostos.
        System.out.println("============\nCLUTCH STORE\n============ ");
        System.out.print("seja bem-vindo! =)\n");
        System.out.println("oque deseja fazer?!");

        // professor quer  tratamento e exessões(try e cash)

        int quantidade = 0;
        System.out.println("==================\n   CLUTCH STORE  \n================== ");
        System.out.print("Seja Bem-Vindo!\n");
        System.out.println("\noque deseja fazer?");
        String nome;
        String opcao;

        // Capacidade máxima do sistema (1 a 1000)
        final int MAX = 1000;
        int totalCadastrados = 0;

        // Opções padrão da loja (4 modelos, 3 cores, tamanhos 36 a 42)
        String[] modelosPadrao = {"Modelo 1", "Modelo 2", "Modelo 3", "Modelo 4"};
        String[] coresPadrao = {"Preto", "Branco", "Branco com Preto"};
        int[] tamanhosPadrao = {36, 37, 38, 39, 40, 41, 42, 43};

        // Vetores principais dos produtos em estoque
        int[] codigos = new int[MAX];
        String[] modelos = new String[MAX];
        String[] cores = new String[MAX];
        int[] tamanhos = new int[MAX];
        int[] estoque = new int[MAX];
        double[] precos = new double[MAX];

        // Controle de vendas, caixa e histórico de movimentações
        double caixaTotal = 0.0;
        double totalImpostos = 0.0;
        int totalVendas = 0;
        String[] historico = new String[MAX];
        int totalMovimentacoes = 0;

        do{
            System.out.println("\n--Escolha uma opção abaixo--\n");
            System.out.print(
                "1-Cadastrar produto\n2-Listar produtos\n3-Buscar\n4-Entrada de Estoque\n5-Saída/Venda"+
                "\n6-Consultar estoque\n7-Produtos com estoque baixo\n8-Histórico de movimentações"+
                "\n9-Relatório de vendas\n0-Sair \nopção: "
            );
            opcao = ler.next();
            switch (opcao) {
                //cadastro -> Marcos
                case "1":
                    System.out.println("\n---CADASTRO DE PRODUTOS---");
                    
                    // limite de cadastros entre 1 e 1000
                    while (quantidade == 0 || quantidade > 1000) {
                    System.out.println("informe a qunatidade que será cadastrada ");
                     quantidade = ler.nextInt();
                    if (quantidade == 0 || quantidade > 1000) {
                    System.out.println("quantidade inválida");
                    continue;
                    }
                 }
                    break;
                case"2":
                    break;
                case"3":
                    break;   
                case"4":
                    break;
                case"5":
                    break;
                case"6":
                    break; 
                case"7":
                    break;
                case"8":
                    break;
                case"9":
                    break;
                default:
                    break;
            }


        }while(!opcao.equals("0"));


    }

    
}
