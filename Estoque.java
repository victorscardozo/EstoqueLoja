package com.mycompany.mavenproject1;
import java.util.ArrayList;
import java.util.List;




public class Estoque {

//------------------------------------------------------------------------------
    private List<Produto> produtos;
    
//------------------------------------------------------------------------------
    
    
    
    
    
//------------------------------------------------------------------------------
    public Estoque() {
        produtos = new ArrayList<>();
    }
//------------------------------------------------------------------------------

    
    
    
    
//Métodos---------------------------------------------------------------------
  
    public boolean incluirProduto(int codigo, String nome, int qntd_estoque, float preco_custo, float preco_venda) {
        for (Produto p : produtos) {
            if (p.codigo == codigo) {
                InOut.MsgDeErro("Erro!", "Código de produto já existente.");
                return false;
            }
        }

        Produto produto = new Produto(codigo, nome, qntd_estoque, preco_custo, 0, preco_venda);
        produtos.add(produto);
        InOut.MsgDeInformacao("OK!", "Produto cadastrado com sucesso.");
        return true;
    }
    
 //------------------------------------------------------------------------------   
   
    

    public boolean alterarProduto(int codigo, float novoPreco, int novaQuantidade) {
        for (Produto p : produtos) {
            if (p.codigo == codigo) {
                p.preco_venda = novoPreco;
                p.qntd_estoque = novaQuantidade;
                InOut.MsgDeInformacao("OK!", "Produto alterado com sucesso.");
                return true;
            }
            
        }
        InOut.MsgDeErro("Erro!", "Produto não encontrado.");
        return false;
    }
    
    
//------------------------------------------------------------------------------
    public boolean excluirProduto(int codigo) {
        for (Produto p : produtos) {
            if (p.codigo == codigo) {
                produtos.remove(p);
                InOut.MsgDeInformacao("OK!", "Produto excluído com sucesso.");
                return true;
            }
        }
        InOut.MsgDeErro("Erro!", "Produto não encontrado.");
        return false;
    }

    
 //------------------------------------------------------------------------------   
    
    
    
    public void relatorioGeral() {
        String texto = "";
        
        for (Produto p : produtos) {
            texto += "Código: " + p.codigo + "\nNome: " + p.nome + "\nQuantidade em Estoque: " + p.qntd_estoque + "\n";
            InOut.MsgDeInformacao("Relatorio Geral", texto);
        }
    }
    
    
//------------------------------------------------------------------------------
    
    
    public void relatorioEspecifico(int codigo) {
        String texto = "";
        for (Produto p : produtos) {
            if (p.codigo == codigo) {
                
                texto += "Relatório do Produto de Código" + p.codigo + ":" + "\nNome: " + p.nome + "\nQuantidade em Estoque: " + p.qntd_estoque + "\nPreço de Venda: " + p.preco_venda;
                InOut.MsgDeInformacao("Relatorio Específico", texto);
            
                return;
            }
        }
        InOut.MsgDeErro("Erro!", "Produto não encontrado.");
        
        
    }
//------------------------------------------------------------------------------
    
    public void relatorioCompleto(int codigo) {
        String texto = "";
        for (Produto p : produtos) {
            if (p.codigo == codigo) {
                float valorTotal = p.qntd_estoque * p.preco_custo;
                float valorTotalVenda = p.qntd_estoque * p.preco_venda;
                float lucro = valorTotalVenda - valorTotal;
                
                texto += "Relatório Completo do Produto de Código" + p.codigo + ":" + "\nNome: " + p.nome + "\nQuantidade em Estoque: " + p.qntd_estoque + "\nPreço de Custo: " + p.preco_custo + "\nPreço de Venda: " + p.preco_venda + "\nValor Total de custo do estoque: " + valorTotal + "\nValor Total de Venda do estoque: " + valorTotalVenda + "\nLucro do estoque: " + lucro;
                InOut.MsgDeInformacao("Relatorio Específico", texto);
                
                return;
            }
        }
        InOut.MsgDeErro("Erro!", "Produto não encontrado.");
    }
//------------------------------------------------------------------------------
}
