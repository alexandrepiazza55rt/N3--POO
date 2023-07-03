public class Produto extends SQLClass{
    
    @Key
    int id;

    String produto;
    String validade;
    String fabricacao;
    double preco;   

    Produto(){
        this.setTableName("PRODUTO");
    }   
    
    public void printObject(){
        System.out.println(
            "ID: " +
            this.id + 
            ", Produto: " +
            this.produto + 
            ", Fabricação: " +
            this.fabricacao +
            ", Validade: " +
            this.validade + 
            ", Preço: " +
            this.preco
        );
    }
}
