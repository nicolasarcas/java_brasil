import org.javamoney.moneta.Money;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;

public class Dinheiro {
    public static void main(String[] args) {
        CurrencyUnit moeda = Monetary.getCurrency("BRL");

        MonetaryAmount valorDaParcela = Money.of(75.15, moeda);

        System.out.println(valorDaParcela);
    }
}
