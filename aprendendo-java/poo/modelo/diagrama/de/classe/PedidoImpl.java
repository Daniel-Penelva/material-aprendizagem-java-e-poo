package modelo.diagrama.de.classe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PedidoImpl implements Pedido {

	private Integer codigo;
	private List<ItemPedido> itens = new ArrayList<>();

	@Override
	public Integer getCodigo() {
		return codigo;
	}

	@Override
	public Double calcularValorTotal() {

		return null;
	}

	@Override
	public void imprimiItens() {

	}

	@Override
	public ItemPedido[] ordenarItensPedido() {
		
		// Filtrar itens nulos
        List<ItemPedido> itensFiltrados = new ArrayList<>();
        
        for (ItemPedido item : itens) {
            if (item != null) {
                itensFiltrados.add(item);
            }
        }

        // Ordenar os itens pelo código
        itensFiltrados.sort(Comparator.comparing(ItemPedido::getCodigo));

        return itensFiltrados.toArray(new ItemPedido[0]);
	}

	@Override
	public ItemPedido[] getItensPedido() {

		return itens.toArray(new ItemPedido[itens.size()]);
	}

	@Override
	public void adicionarItemPedido(ItemPedido itemPedido) {
		itens.add(itemPedido);
	}

	@Override
	public void removerItemPedido(ItemPedido itemPedido) {
		itens.remove(itemPedido);
	}

}