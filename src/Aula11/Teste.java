package Aula11;

public class Teste {
    public static void main(String[] args) {
        insertion inse = new insertion();
        inse.isInit();

        long elapsed = inse.insertionSort();
        long elapsed1 = inse.selectionSort();
        long elapsed2 = inse.bubbleSort();


        System.out.println("InsertionSort:"+elapsed+"Mls");
        System.out.println("SelectionSort:"+elapsed1+"Mls");
        System.out.println("BubbleSort:"+elapsed2+"Mls");

    }
}
