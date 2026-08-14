package flamingo.apredendo.introducao;

public class ExercicioPraticaBasica {
    /*
     Eu <nome> morando no endereco <endereco>, confirmo o saçãrio
    * de <salario> na data <data>.
    * */
    public static void main(String[] args) {
        String nome = "Matheus";
        String endereco = "Av Heitor Hartmann, 754";
        float salario = 2600;
        String data = "20/09/199";

        System.out.println("Meu nome é" + nome);
        System.out.println("Meu endereco é" + endereco
                +", confirmo o salario de "
                + salario + " na data " + data);
    }
}
