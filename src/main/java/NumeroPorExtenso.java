import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.InteiroSemFormato;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

import java.math.BigDecimal;

public class NumeroPorExtenso {
    public static void main(String[] args) {

        NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
        BigDecimal valor = new BigDecimal("75.37");

        System.out.println(comprovante(valor));
    }
    public static String comprovante(BigDecimal valor){
        NumericToWordsConverter converter = new NumericToWordsConverter(new FormatoDeReal());
        return "Valor recebido: " + converter.toWords(valor.doubleValue());
    }
}
