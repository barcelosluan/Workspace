package lista_duplamente_ligada.visualisacao;

public class Main {
    
    public static void main(String[] args) {
        Menu menu = new Menu();
        
        do {
            menu.menu();
            menu.escolha();
        } while (menu.getOpcao() != 0);
    }
    
}
