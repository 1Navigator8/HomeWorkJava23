package src.main.java.org.example.homework22;

import java.util.Stack;

public class GwentCard {

    private String name;
    private int strength;

    public GwentCard(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public GwentCard() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public static class SimpleCardGame {

        //  колода
        private Stack<GwentCard> deck;


        //  сброс
        private Stack<GwentCard> resetСards;

        public SimpleCardGame() {
        }

        public GwentCard getCardFromDeck() {
            return deck.pop();
        }

        public void Discard(GwentCard card) {
            resetСards.push(card);

        }

        public GwentCard lookTopCard() {

            return deck.peek(); //колода
        }

        public void setDeck(Stack<GwentCard> deck) {
        }

        public void setDiscard(Stack<GwentCard> discarding) {
        }

        public void discard(GwentCard card) {
        }

        public Stack<GwentCard> getDiscard() {
            return deck;
        }
    }

    public static void main(String[] args) {

        //  создаем колоду и добавляем в нее карты
        Stack<GwentCard> deck = new Stack<>();
        deck.push(new GwentCard("Geralt of Rivia", 15));
        deck.push(new GwentCard("Yennefer of Vengerberg", 7));
        deck.push(new GwentCard("Cirilla Fiona Elen Riannon", 15));
        deck.push(new GwentCard("Vernon Roche", 10));
        deck.push(new GwentCard("Triss Merigold", 7));
        deck.push(new GwentCard("Dandelion", 2));
        deck.push(new GwentCard("Letho of Gulet", 10));
        deck.push(new GwentCard("Saesenthessis", 10));
        deck.push(new GwentCard("Vesemir", 6));
        deck.push(new GwentCard("Cerys", 10));
        deck.push(new GwentCard("Sigismund Dijkstra", 4));
        deck.push(new GwentCard("Iorveth", 10));
        deck.push(new GwentCard("Philippa Eilhart", 7));

        //  создаем сброс
        Stack<GwentCard> discarding = new Stack<>();

        //  начинаем игру
        SimpleCardGame game = new SimpleCardGame();
        game.setDeck(deck);
        game.setDiscard(discarding);


        GwentCard card1 = game.getCardFromDeck();
        GwentCard card2 = game.getCardFromDeck();
        GwentCard card3 = game.getCardFromDeck();
        GwentCard card4 = game.getCardFromDeck();
        GwentCard card5 = game.getCardFromDeck();


        System.out.println("What cards did the first player get?");
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        System.out.println(card4);
        System.out.println(card5);

        //  первый игрок отправляет в сброс 3 своих карты
        game.discard(card1);
        game.discard(card2);
        game.discard(card3);
        game.discard(card4);
        game.discard(card5);

        System.out.println("What cards are in the discard ?");
        System.out.println(game.getDiscard().pop());
        System.out.println(game.getDiscard().pop());
        System.out.println(game.getDiscard().pop());
        System.out.println(game.getDiscard().pop());
        System.out.println(game.getDiscard().pop());
    }
}






