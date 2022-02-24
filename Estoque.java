public class Estoque {
    public String nome = "";
    public double preco;
    public int quant;

    public void adEstoque(String produtoMais,double precoMais, int quantMais){
        this.nome += produtoMais;
        this.preco += precoMais;
        this.quant += quantMais;
    }
    public void infoEstoque(int quantCarrinho){
        System.out.println("Info Estoque");
        System.out.println(" Nome    | Quantidade | Preço  ");
        System.out.println(" "+this.nome +"\t| "+ this.quant+"\t| R$ "+ this.preco );
    }
    /*
    public void infoEstoque(int quantCarrinho){
        System.out.println("Info Estoque");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$ " + this.preco);
        System.out.println("Quantidade: " + (this.quant-quantCarrinho));
        System.out.println("");
    }
    */
}
