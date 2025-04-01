
import java.util.Scanner;

public class Produto{
/*Criar uma classe Produto, que mantém o estoque de produtos de uma loja, com as seguintes
    características: código sequencial, nome do produto, quantidade, tipo, valor do produto.*/

    int codigoSequencial;
    String nomeProduto;
    int quantidadeProduto;
    String tipoProduto;
    double valorProduto;

    Scanner sc = new Scanner(System.in);

    //Construtores
    public Produto(int codigoSequencial, String nomeProduto, String tipoProduto, int quantidadeProduto, double valorProduto) {
        this.codigoSequencial = codigoSequencial;
        this.nomeProduto = nomeProduto;
        this.tipoProduto = tipoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.valorProduto = valorProduto;
    }

    public Produto(int codigoSequencial, String nomeProduto) {
        this.codigoSequencial = codigoSequencial;
        this.nomeProduto = nomeProduto;
    }

    public Produto(int codigoSequencial, String nomeProduto, int quantidadeProduto) {
        this.codigoSequencial = codigoSequencial;
        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public Produto(int codigoSequencial){
        this.codigoSequencial = codigoSequencial;
    }

    //inserir: recebe como parâmetro o nome do produto, a quantidade, o tipo e o valor, e altera os dados do objeto
    public void inserir(){
        System.out.println("Codigo:");
        this.codigoSequencial= sc.nextInt();
        sc.nextLine();

        System.out.println("Nome:");
        this.nomeProduto = sc.nextLine();

        System.out.println("Quantidade:");
        this.quantidadeProduto = sc.nextInt();
        sc.nextLine();

        System.out.println("Tipo:");
        this.tipoProduto= sc.nextLine();

        System.out.println("Valor:");
        this.valorProduto = sc.nextDouble();
        sc.nextLine();
    }


    /*vender: recebe uma quantidade a ser vendida, verifica se tem estoque, se não tem informa, se tem,
    baix do estoque e informa o valor total da venda;*/

    public double vender(int quantidadeVendida) {
        double soma = 0;
        if (this.quantidadeProduto >= quantidadeVendida) {
            this.quantidadeProduto = this.quantidadeProduto - quantidadeVendida;
            soma = quantidadeVendida * this.valorProduto;
            return soma;
        } else {
            return soma;
        }

    }

    /* comprar: recebe apenas a quantidade a ser acrescentada no estoque, sem alteração de valor*/
    public int comprar (int novaQuantidade) {
        this.quantidadeProduto = novaQuantidade;
        return this.quantidadeProduto;
    }

    /*comprar recebe uma quantidade e o novo valor, acrescentar produtos no estoque e altera o valor*/
    public void comprar(int novaQuantidade, double novoValor){
        this.quantidadeProduto += novaQuantidade;
        this.valorProduto = novoValor;
    }



    /*recebe um produto como parâmetro (objeto de Produto), verifica se nome e tipo do objeto corrent
    são iguais aos do objeto recebido como parâmetro, retornando true (se forem iguais) ou false.
     */
    public boolean igual(Produto produto1) {
        if (produto1 == null) {
            return false;
        }
        return this.nomeProduto.equals(produto1.nomeProduto) && this.tipoProduto.equals(produto1.tipoProduto);
    }

    //características: código sequencial, nome do produto, quantidade, tipo, valor do produto.*/
    public String toString() {
        return "Codigo : " + this.codigoSequencial +
                "Nome : " + this.nomeProduto +
                "Quantidade :"+ this.quantidadeProduto+
                "Tipo:" +this.tipoProduto+
                "Valor Produto :"+this.valorProduto;
    }


}
