import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

import java.io.IOException;

public class CEP {
    public static void main(String[] args){
        ViaCEPClient cliente = new ViaCEPClient();
        try{
            ViaCEPEndereco endereco = cliente.getEndereco("82010340");

            System.out.println(endereco.getBairro());
            System.out.println(endereco.getLogradouro());
            System.out.println(endereco.getCep());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
