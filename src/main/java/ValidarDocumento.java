import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;
import br.com.caelum.stella.validation.Validator;

public class ValidarDocumento {

    public static void main(String[] args) {

        String cpf = "42732225070";
        String titulo = "811553480159";
        String cnpj ="08561701000101";
        try{
            validarDocumento(new CPFValidator(),cpf);
            validarDocumento(new CNPJValidator(),cnpj);
            validarDocumento(new TituloEleitoralValidator(),titulo);
            System.out.print("Documentos válidos");
        }catch (InvalidStateException e ){
            System.out.print("Um dois documentos está inválido");
        }
    }

    private static void validarDocumento(Validator<String> validator, String documento){
        validator.assertValid(documento);
    }
}
