public class SQLFactory {
    public static void main(String[] args) {
        try {
            
        
         Funcionario funcionario1 = new Funcionario();
          
         funcionario1.id = 1;
         funcionario1.nome = "Amanda";
         funcionario1.idade = 20;
         funcionario1.cpf = "043.123.321-78";
         funcionario1.cargo = "Auxiliar Administrativo";
         funcionario1.salario = 1500.00;

         //SQL Funcionários

         Database.inserirRegistro(funcionario1);
         Database.atualizarRegistro(funcionario1);
         Database.deletarRegistro(funcionario1);

         Database.abrirID(funcionario1, 1);
         funcionario1.printObject();

//---------------------------------------------------------------//

         Empresa empresa1 = new Empresa();
          
         empresa1.id = 1;
         empresa1.nome = "Mercadão";
         empresa1.fone = "(66) 9999-9999";
         empresa1.cnpj = "04.353.456/0001-33";
         empresa1.endereco = "Rua Romã, 123 JD Imperial";

         //SQL Empresa

         Database.inserirRegistro(empresa1);
         Database.atualizarRegistro(empresa1);
         Database.deletarRegistro(empresa1);

         Database.abrirID(empresa1, 1);
         empresa1.printObject();

//---------------------------------------------------------------//

         Cliente cliente1 = new Cliente();
        
         cliente1.id = 1;
         cliente1.nome = "Roberto";
         cliente1.idade = 23;
         cliente1.cpf = "045.653.454-99";

         //SQL Cliente

         Database.inserirRegistro(cliente1);
         Database.atualizarRegistro(cliente1);
         Database.deletarRegistro(cliente1);

         Database.abrirID(cliente1, 1);
         cliente1.printObject();

//---------------------------------------------------------------//
        
         Produto produto1 = new Produto();
    
         produto1.id = 1;
         produto1.produto = "Arroz";
         produto1.fabricacao = "25/02/2023";
         produto1.validade = "25/07/2023";
         produto1.preco = 7;

        //SQL Cliente

         Database.inserirRegistro(produto1);
         Database.atualizarRegistro(produto1);
         Database.deletarRegistro(produto1);

         Database.abrirID(produto1, 1);
         produto1.printObject();

        System.out.println("\nAcao realizada com sucesso!\n");

        } catch (Exception e) {
           System.out.println("\nNao foi possivel realizar a acao!\n");
        }

    }
}
