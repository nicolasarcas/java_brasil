import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;

public class ValidaTituloDeEleitor {
    public static void main(String[] args) {
        String titulo = "811553480159";
        TituloEleitoralValidator validator = new TituloEleitoralValidator();

        try{
            validator.assertValid(titulo);
            System.out.println("Válido");
        }catch (InvalidStateException e){
            System.out.println("Inválido "+e);
        }
    }
}
