public class Carrinho {
    public double valorCompra;
    public String produto = "";
    public int quant;
    
    public void adCarrinho(int quantMais){
        this.quant += quantMais;
    }
    public void infoCarrinho(double preco){
        this.valorCompra += preco * this.quant;

        System.out.println("Info Carrinho");
        System.out.println("Produto: " + this.produto);
        System.out.println("Quantidade: " + this.quant);
        System.out.println("Preço: R$ " + this.valorCompra);
        System.out.println("");
    }
}
