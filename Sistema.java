package com.mycompany.mavenproject1;


public class Sistema {
    public static void main(String[] args) {
        
        Estoque estoque = new Estoque();

        while (true) {
            InOut.MsgDeInformacao("Gerenciamento do Estoque", "Selecione uma Opção:\n 1. Incluir Produto\n 2. Alterar Produto\n 3. Excluir Produto\n 4. Relatório Geral\n 5. Relatório Específico\n 6. Relatório Completo\n 7. Sair do Programa");
            System.out.println("1. Incluir Produto");
            System.out.println("2. Alterar Produto");
            System.out.println("3. Excluir Produto");
            System.out.println("4. Relatório Geral");
            System.out.println("5. Relatório Específico");
            System.out.println("6. Relatório Completo");
            System.out.println("7. Sair");

            int opcao = InOut.leInt("Selecione uma opção:");
            

            switch (opcao) {
                case 1:                  
                    int codigoInclusao = InOut.leInt("Digite o código do produto:");
                    
                    String nomeInclusao = InOut.leString("Digite o nome do produto:");
                   
                    int qntdEstoqueInclusao = InOut.leInt("Digite a quantidade em estoque do produto:");
                   
                    float precoCustoInclusao = InOut.leFloat("Digite o preço de custo do produto:");
                   
                    float precoVendaInclusao = InOut.leFloat("Digite o preço de venda do produto:");
                    
                    
                    estoque.incluirProduto(codigoInclusao, nomeInclusao, qntdEstoqueInclusao, precoCustoInclusao, precoVendaInclusao);
                    break;
                    
                    
                    
                    
                case 2:
                   
                    int codigoAlteracao = InOut.leInt("Digite o código do produto que deseja alterar:");
               
                    float novoPreco = InOut.leFloat("Digite o novo preço de venda do produto:");
                   
                    int novaQuantidade = InOut.leInt("Digite a nova quantidade em estoque do produto:");
                    
                
                    estoque.alterarProduto(codigoAlteracao, novoPreco, novaQuantidade);
                    break;
                    
                    
                    
                    
                case 3:
                    
                    int codigoExclusao = InOut.leInt("Digite o código do produto que deseja excluir:");
                  
                    estoque.excluirProduto(codigoExclusao);
                    break;
                    
                    
                    
                    
                case 4:
                    estoque.relatorioGeral();
                    break;
                    
                    
                    
                    
                case 5:
                   
                    int codigoEspecifico = InOut.leInt("Digite o código do produto para o relatório específico:");
                    
                    estoque.relatorioEspecifico(codigoEspecifico);
                    break;
                    
                    
                    
                    
                case 6:
                    
                    int codigoCompleto = InOut.leInt("Digite o código do produto para o relatório completo:");
                    
                    estoque.relatorioCompleto(codigoCompleto);
                    break;
                    
                    
                    
                    
                case 7:
                    InOut.MsgDeInformacao("Saindo...", "Encerrando o programa.");
                    return;
                    
                default:
                    InOut.MsgDeErro("Erro", "Opção inválida. Por favor, selecione novamente.");
            
            }
        }
    }
}