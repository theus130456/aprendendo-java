package flamingo.aprendendo.basico;

import java.sql.SQLOutput;

public class OperadoresParte02 {

    /*
    *  < menor que
    *  > maior que
    * <= menor ou igual
    * >= maior ou igual
    * == igual a
    * != diferende de
    * */
    public static void main(String[] args) {
        byte idadeMae =42;
        byte idadePai = 60;
        byte idadeTia = 41;
        System.out.println(idadeMae < idadePai);
        System.out.println(idadeMae > idadePai);
        System.out.println(idadeMae == idadeTia);
        System.out.println(idadeMae <= idadeTia);
        System.out.println(idadeMae >= idadeTia);
        System.out.println(idadeMae != idadeTia);
    }
}
