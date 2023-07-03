public class Empresa extends SQLClass{
    
    Empresa(){
        this.setTableName("EMPRESA");                
    }
    
    @Key
    int id;

    String nome;
    String fone;
    String cnpj;
    String endereco;

    public void printObject(){
        System.out.println(
            "ID: " +
            this.id + 
            ", Nome: " +
            this.nome + 
            ", Telefone: " +
            this.fone +
            ", CNPJ: " +
            this.cnpj + 
            ", Endereço: " +
            this.endereco
        );
    }
}
