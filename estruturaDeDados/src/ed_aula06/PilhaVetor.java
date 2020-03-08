package ed_aula06;

import ed_aula05.Livro;

public class PilhaVetor {

    Livro top;
    int size;

    public PilhaVetor(int size) {
        this.size = size;
    }

    public void setSize(int size) {
        System.out.println("Please, inform the size of the stack: ");
        this.size = size;
    }

    Livro bookStack[] = new Livro[size];



    public void push(Livro newBook) {
        bookStack[size] = newBook;
        size++;
        System.out.println("The book " + newBook.getTitulo() + " is on the stack");
    }

    public Livro pop(Livro lastBook) {
        System.out.println("The book " + lastBook + " was on the stack, not anymore.");
        return lastBook;
    }

//    public boolean isEmpity() {
//
//    }

}