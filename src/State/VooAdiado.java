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
        return "O vôo solicitado já foi adiado";
    }

   
    @Override
    public String atrasado(Voo voo) {
        return "O vôo solicitado encontra-se adiado, não sendo possível atrasá-lo no momento";
    }


    @Override
    public String cancelado(Voo voo) {
        voo.setEstado(new VooCancelado());
        boolean status = VooDAO.getInstance().update(voo);
        return "Vôo cancelado!";
    }


    @Override
    public String confirmado(Voo voo) {
        return "O vôo solicitado encontra-se adiado, não sendo possível confirma-lo no momento";
    }

 
}
