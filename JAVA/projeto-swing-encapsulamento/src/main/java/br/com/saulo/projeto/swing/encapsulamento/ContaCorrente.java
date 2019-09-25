package br.com.saulo.projeto.swing.encapsulamento;

public class ContaCorrente {

    
    // o private torna o atributo "privado" ou "particular"
    // ou seja, somente cada instância ou objeto
    // do tipo ContaCorrente sabe e pode alterar seu "saldo"
    private Double saldo = 0.00;
    private Integer operacoesRealizadas = 0;
    
    // o "public" indica que o método pode ser invocado
    // por qualquer outro objeto
    public void depositar15(){
        saldo+=15.0;
        operacoesRealizadas++;
    }
    
    public void sacar5(){
        saldo-=5.0;
        operacoesRealizadas++;
    }

    /*
        Este metodo Retorna (ou seja, entrega) um valor Double
        Isso é indicado antes do nome do método
        Dentro dele temos um "return saldo", o que indica que
        o valor que ele vai entregar é o "saldo" de ContaCorrente
    */
    public Double getSaldo() {
        return saldo;
    }
    
    public Integer getOperacoesRealizadas(){
        return operacoesRealizadas;
    }
    
    

}
