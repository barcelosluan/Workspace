package ed_aula25;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();

        do {
            menu.menu();
            menu.escolha();
        } while (menu.getOpcao() != 0);


    }

}
