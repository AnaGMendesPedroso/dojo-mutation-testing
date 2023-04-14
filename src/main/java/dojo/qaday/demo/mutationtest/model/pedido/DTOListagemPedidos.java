package dojo.qaday.demo.mutationtest.model.pedido;

public record DTOListagemPedidos(
        String nomeFantasiaVendedor,

        Setor setorVendasVendedor,

        String telefoneVendedor,

        String enderecoVendedor,

        String nomeCliente,

        String telefoneCliente,

        double valorTotal,

        DTOItemPedido itemPedido) {

    public DTOListagemPedidos(EntityPedido pedido){
        this(pedido.getNomeFantasiaVendedor(), pedido.getSetorVendasVendedor(), pedido.getTelefoneVendedor(), pedido.getEnderecoVendedor(), pedido.getNomeCliente(), pedido.getTelefoneCliente(), pedido.getValorTotal(), new DTOItemPedido(pedido.getItensPedido()));
    }
}
