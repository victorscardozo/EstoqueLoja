package com.mycompany.mavenproject1;




public class Produto {
    
    
//------------------------------------------------------------------------------

    public int codigo;
    public String nome;
    public int qntd_estoque;
    public float preco_custo;
    public int qntd_vendida;
    public float preco_venda;
    
//------------------------------------------------------------------------------

    
    
    
    
//------------------------------------------------------------------------------
    
    public Produto(int codigo, String nome, int qntd_estoque, float preco_custo, int qntd_vendida, float preco_venda) {
        this.codigo = codigo;
        this.nome = nome;
        this.qntd_estoque = qntd_estoque;
        this.preco_custo = preco_custo;
        this.qntd_vendida = qntd_vendida;
        this.preco_venda = preco_venda;
        
    }
//------------------------------------------------------------------------------

}
