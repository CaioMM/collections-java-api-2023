package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoList;

    public CarrinhoDeCompras() {
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade, double preco){
        carrinhoList.add(new Item(nome, quantidade, preco));
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();

        for (Item i : carrinhoList) {
            if(i.getNome().equalsIgnoreCase(nome)){
                itemsParaRemover.add(i);
            }
        }
        carrinhoList.removeAll(itemsParaRemover);
    }

    public void calcularValorTotal(){
        double holder = 0;
        for (Item i : carrinhoList) {
            holder = holder + i.getPreco();
        }

        System.out.println("Valor Total: " + holder);
    }

    public void exibirItens(){
        System.out.println(carrinhoList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        System.out.println("O carrinho possui os itens: ");
        carrinho.exibirItens();

        carrinho.adicionarItem("maçã",10,20);
        carrinho.adicionarItem("pêra",5,10);
        carrinho.adicionarItem("melão",3,5);
        carrinho.adicionarItem("maçã",4,8);

        System.out.println("Agora o carrinho possui os itens: ");
        carrinho.exibirItens();

        carrinho.removerItem("maçã");
        System.out.println("Agora o carrinho possui os itens: ");
        carrinho.exibirItens();

        System.out.println("O valor à ser pago é: ");
        carrinho.calcularValorTotal();


    }
}
