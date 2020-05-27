package State;

import Model.Voo;
import Persistence.VooDAO;

public class VooAdiado implements VooEstado {

    
    @Override
    public String getEstado() {
        return "Adiado";
    }


    @Override
    public String adiado(Voo voo) {
        return "O v�o solicitado j� foi adiado";
    }

   
    @Override
    public String atrasado(Voo voo) {
        return "O v�o solicitado encontra-se adiado, n�o sendo poss�vel atras�-lo no momento";
    }


    @Override
    public String cancelado(Voo voo) {
        voo.setEstado(new VooCancelado());
        boolean status = VooDAO.getInstance().update(voo);
        return "V�o cancelado!";
    }


    @Override
    public String confirmado(Voo voo) {
        return "O v�o solicitado encontra-se adiado, n�o sendo poss�vel confirma-lo no momento";
    }

 
}
