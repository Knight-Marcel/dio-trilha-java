public abstract class Produto {
    private int codigo;
    private String nome;
    private int estoque;
    private Double valorUnitario;

    public Produto(int codigo, String nome){
        this.codigo= codigo;
        this.nome=nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

 

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }


    public void incluirEstoque(int quantidade){
        estoque = estoque + quantidade;
    }
    
    public void tirarEstoque(int quantidade){
        if (quantidade <= estoque){
            estoque = estoque - quantidade;
        }
        else{
            System.out.println("Estoque Indisponível");
        }
    }

}

