public class Funcionario extends SQLClass {

    @Key
    int id;

    String nome;
    String cpf;
    String cargo;
    double salario;
    int idade;    

    Funcionario(){
        this.setTableName("FUNCIONARIOS");
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
            this.cpf + 
            ", Cargo: " +
            this.cargo + 
            ", Salário: " + 
            this.salario 
        );
    }
}
