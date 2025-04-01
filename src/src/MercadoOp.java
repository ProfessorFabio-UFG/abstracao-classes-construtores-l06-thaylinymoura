import java.util.Scanner;
public class MercadoOp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //código sequencial, nome do produto, quantidade, tipo, valor do produto.
        Produto produto = new Produto(001,"Jogo 1", "Brinquedo",0,12.90);
        Produto produto1 = new Produto(001,"Abobora", "Fruta",3,8.90);
        //código sequencial, nome do produto
        Produto produto2 = new Produto(001, "Jogo 1");
        //código, o nome do produto e a quantidade
        Produto produto3 = new Produto(001,"Jogo 1", 10);
        //codigo
        Produto produto4 = new Produto(001);



        System.out.println("Quantos produtos deseja vender:");
        int quantidadeVendida = sc.nextInt();
        produto.vender(quantidadeVendida);
        System.out.println(produto.toString());

        System.out.println("Quantos produtos deseja comprar: ");
        int novaQuantidade = sc.nextInt();
        produto.comprar(novaQuantidade);
        System.out.println(produto.toString());

        System.out.println("Quantos produtos deseja comprar e o valor: ");
        novaQuantidade = sc.nextInt();
        double novoValor = sc.nextDouble();
        produto1.comprar(novaQuantidade, novoValor);
        System.out.println(produto.toString());

        System.out.println(produto1.igual(produto2));

        produto.inserir();
        System.out.println(produto.toString());



    }
}