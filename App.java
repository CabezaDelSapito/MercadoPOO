public class App {
    public static void main(String[] args) throws Exception {
        
        Estoque estoque = new Estoque();
        Pagamento pagamento = new Pagamento();
        Cliente cliente = new Cliente();
        Atendente atendente = new Atendente();
        Carrinho carrinho = new Carrinho();

        atendente.nome = "José";
        atendente.idade = 18;
        atendente.sexo = "M";
        
        atendente.FichaAtendente();

        cliente.nome = "Luana";
        cliente.idade = 18;
        cliente.sexo = "F";
        
        cliente.FichaCliente();
        estoque.adEstoque("Arroz", 10.00, 7);
        /*
        estoque.nome = "Arroz";
        estoque.preco = 10.00;
        estoque.quant = 5;
        */
        estoque.infoEstoque(carrinho.quant);
        carrinho.adCarrinho(2);
        
        carrinho.produto = estoque.nome;

        pagamento.valorPagamento = 21.00;

        estoque.infoEstoque(carrinho.quant);
        carrinho.infoCarrinho(estoque.preco);
        pagamento.pagar(carrinho.valorCompra);

    }
}
