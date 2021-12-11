import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ValidaCPF {

    public static void main(String[] args) {

        String cpf = "427.322.250-70";
        CPFValidator validator = new CPFValidator();

        try {
            validator.assertValid(cpf);
            System.out.println("CPF válido");
        }catch (InvalidStateException e){
            System.out.println("CPF inválido"+ e);
        }
    }
}
