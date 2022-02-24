public class Pagamento {
    public double valorPagamento;
    public double valorTroco;

    public void pagar(double valorCompra){
        this.valorTroco = this.valorPagamento - valorCompra;
        System.out.println("Valor pague: R$ "+ valorPagamento);
        if(this.valorTroco == 0){
            System.out.println("Pagamento bem sucedido");
        }
            if(this.valorTroco > 0){
            System.out.println("Pagamento bem sucedido");
            System.out.println("Troco: R$ "+ this.valorTroco);
        }
        if(this.valorTroco < 0){
            System.out.println("Devendo: R$ "+ (this.valorTroco * (-1)));
        }
    }

    
}
