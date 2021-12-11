import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

public class FormatadorDeDocumentos {
    public static void main(String[] args) {

        String cpf = "427.322.250-70";
        String titulo = "811553480159";
        String cnpj ="08.561.701/0001-01";

        String cpfSemFormatacao = desformatarDocumento(new CPFFormatter(),cpf);
        String cnpjSemFormatacao = desformatarDocumento(new CNPJFormatter(),cnpj);
        String tituloComFormatacao = formataDocumento(new TituloEleitoralFormatter(),titulo);

        System.out.println(cpf +" "+cpfSemFormatacao);
        System.out.println(cnpj+" "+cnpjSemFormatacao);
        System.out.println(titulo+" "+tituloComFormatacao);
    }
    private static String formataDocumento(Formatter formatter, String documento){
        return formatter.format(documento);
    }
    private static String desformatarDocumento(Formatter formatter,String documento){
        return formatter.unformat(documento);
    }
}
