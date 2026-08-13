package flamingo.apredendo.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // byte : -128 - 127
        // short : -32.768 a 32.767
        // int :  -2 bilhões a 2 bilhões
        // long : Para números inteiros muito grandes (usa um l no final do número)
        // float : Precisão simples ( usa um f no final, ex: 5.5f).
        // double : Precisão dupla, sendo o padrão para decimais no java.
        // char : Guarda uma única letra ou símboloem formato Unicode ( ex: 'A').
        // boolean : Guarda apenas dois valores: true (verdadeiro) ou false (falso).
        short idade = 27;
        int municipio = 114000000;
        long contaBancaria = 9999999999999L;
        float salario = 15000.66f;
        double salarioExtra = 25000.50;
        char primeiraLetraDoNome = 'M';
        boolean vaiEstudarNasFerias = false;
        System.out.println("Primeira letra do meu nome é " + primeiraLetraDoNome);
        System.out.println("Pl caiu = " + salarioExtra);
        System.out.println("Meu salario depois de estudar com o bigas é " + salario);
        System.out.println("Minha idade é "+ idade);
        System.out.println("São Paulo (SP): mais de " + "milhões de moradores.");
        System.out.println("Minha conta bancaria daqui a 5 anos " + contaBancaria);
    }
}
