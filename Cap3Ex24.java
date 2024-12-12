import java.util.Scanner;
// Victor Amaro - 1° Semestre.
public class Cap3Ex24 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println(" digite a quantidade que voce tem em R$: ");
        double dinheiroEmReais = read.nextDouble();

        double conversaoEmDolar = dinheiroEmReais / 1.80;
        double conversaoEmmarcoAlemao = dinheiroEmReais / 2;
        double conversaoEmlibraEstelina = dinheiroEmReais / 3.57;

        System.out.println(" Dinheiro em Reais (R$) " + dinheiroEmReais);
        System.out.println(" Dinheiro em Dolar ($) " + conversaoEmDolar);
        System.out.println(" Dinheiro em Marco Alemão (DM) " + conversaoEmmarcoAlemao);
        System.out.println(" Dinheiro em Libra Estelina (£) " + conversaoEmlibraEstelina);
        read.close();
    }
}
// 24. Faça um programa que receba a quantidade de dinheiro em reais que uma pessoa que vai viajar possui. Ela 
// vai passar por vários países e precisa converter seu dinheiro em dólares, marco alemão e libra esterlina. Sabe-
// -se que a cotação do dólar é de R$ 1,80; do marco alemão, de R$ 2,00; e da libra esterlina, de R$ 3,57. O 
// programa deve fazer as conversões e mostrá-las. 