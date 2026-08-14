package flamingo.aprendendo.basico;

public class OperadoresParte03 {
    public static void main(String[] args) {
        /*
        *  && AND -> E
        *  || OR -> ou
        * ! NOT -> Nâo
        * */

        byte idade = 15;
        boolean isCNH = true;

        boolean isEstaNaLeiParaDirigir = idade >= 18 && isCNH == true;

        System.out.println(isEstaNaLeiParaDirigir);
    }
}
