import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ValidaCNPJ {
    public static void main(String[] args) {

        String cnpj ="08561701000101";
        CNPJValidator validator = new CNPJValidator();

        try{
            validator.assertValid(cnpj);
            System.out.println("CNPJ válido");
        }catch (InvalidStateException e){
            System.out.println("CNPJ inválido");
        }
    }
}
