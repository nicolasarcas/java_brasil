import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

public class FormatadorDeDocumentos {
    public static void main(String[] args) {

        String cpf = "427.322.250-70";
        String titulo = "811553480159";
        String cnpj ="08.561.701/0001-01";

        CPFFormatter formatterCPF = new CPFFormatter();
        CNPJFormatter formatterCNPJ = new CNPJFormatter();
        TituloEleitoralFormatter formatterTitulo = new TituloEleitoralFormatter();

        String cpfSemFormatacao = formatterCPF.unformat(cpf);
        String cnpjSemFormatacao = formatterCNPJ.unformat(cnpj);
        String tituloComFormatacao = formatterTitulo.format(titulo);

        System.out.println(cpf +" "+cpfSemFormatacao);
        System.out.println(cnpj+" "+cnpjSemFormatacao);
        System.out.println(titulo+" "+tituloComFormatacao);
    }
}
