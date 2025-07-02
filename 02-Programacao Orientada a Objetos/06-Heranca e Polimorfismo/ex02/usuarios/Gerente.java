package ex02.usuarios;

public class Gerente extends Usuario{

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    @Override
    public void setAdministrador(boolean administrador) {
        super.setAdministrador(administrador);
        this.isAdministrador = true;
    }

    public void gerarRelatorio(Vendedor vendedor, Atendente atendente){
        avisoConectar();
        System.out.printf("Quantidade de vendas concluídas: %2d || Valor do caixa: R$ %.2f\n", vendedor.getQtdeVendas(), atendente.getValorCaixa());
    }

    public void consultarVendas(Vendedor vendedor) {
        avisoConectar();
        System.out.println("Vendas realizadas: "+ vendedor.getQtdeVendas());
    }


}
