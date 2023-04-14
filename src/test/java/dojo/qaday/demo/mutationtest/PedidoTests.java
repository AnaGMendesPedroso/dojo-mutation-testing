package dojo.qaday.demo.mutationtest;

import dojo.qaday.demo.mutationtest.model.pedido.DTOItemPedido;
import dojo.qaday.demo.mutationtest.model.pedido.DTOPedido;
import dojo.qaday.demo.mutationtest.model.pedido.ItemPedido;
import dojo.qaday.demo.mutationtest.model.pedido.Setor;
import dojo.qaday.demo.mutationtest.model.produto.Categoria;
import dojo.qaday.demo.mutationtest.model.produto.Fornecedor;
import dojo.qaday.demo.mutationtest.model.produto.Produto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PedidoTests {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void deveCriarPedidoComSucesso(){
        Produto produto = new Produto("Caracu", Categoria.BEBIDAS, Fornecedor.AMBEV, 5.00);
        ItemPedido itemPedido = new ItemPedido(produto, 10);
        DTOItemPedido dtoItemPedido = new DTOItemPedido(itemPedido);
        DTOPedido pedido = new DTOPedido("Bar Xablau", Setor.BARES, "6799118822", "Rua da alegria, 182 Campão, Big Field - MS", "Joana Gomes", "67988776655", 50.00, dtoItemPedido);

        ResponseEntity<String> response = testRestTemplate.postForEntity("/pedido", pedido, String.class);
        Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    public void deveRetornarErroPedidoMinimo(){
        Produto produto = new Produto("Caracu", Categoria.BEBIDAS, Fornecedor.AMBEV, 5.00);
        ItemPedido itemPedido = new ItemPedido(produto, 10);
        DTOItemPedido dtoItemPedido = new DTOItemPedido(itemPedido);
        DTOPedido pedido = new DTOPedido("Bar Xablau", Setor.BARES, "6799118822", "Rua da alegria, 182 Campão, Big Field - MS", "Joana Gomes", "67988776655", 40.00, dtoItemPedido);

        ResponseEntity<String> response = testRestTemplate.postForEntity("/pedido", pedido, String.class);
        Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
    }
}
