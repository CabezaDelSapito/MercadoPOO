public class Cliente {
    public String nome = "";
    public int idade;
    public String sexo;

    public void FichaCliente(){
        System.out.println("Ficha do Cliente");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Idade: "+ this.idade);
        System.out.println("Sexo: "+ this.sexo);
        System.out.println("");
    }
}
