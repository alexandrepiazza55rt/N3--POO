public class Cliente extends SQLClass {

    @Key
    int id;

    String nome;
    String cpf;
    int idade;    

    Cliente(){
        this.setTableName("CLIENTE");
    }   
    
    public void printObject(){
        System.out.println(
            "ID: " +
            this.id + 
            ", Nome: " +
            this.nome + 
            ", Idade: " +
            this.idade +
            ", CPF: " +
            this.cpf 
        );
    }
}
