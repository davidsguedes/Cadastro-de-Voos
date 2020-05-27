package State;

import Model.Voo;
import Persistence.VooDAO;

public class VooAtrasado implements VooEstado {


    @Override
    public String getEstado() {
        return "Atrasado";
    }


    @Override
    public String adiado(Voo voo) {
        voo.setEstado(new VooAdiado());
        boolean status = VooDAO.getInstance().update(voo);
        return "O v�o solicitado encontra-se atrasado e por esse motivo ser� adiado";
    }


    @Override
    public String atrasado(Voo voo) {
        return "O v�o j� encontra-se atrasado";
    }


    @Override
    public String cancelado(Voo voo) {
        voo.setEstado(new VooAdiado());
        boolean status = VooDAO.getInstance().update(voo);
        return "V�o cancelado com sucesso";
    }


    @Override
    public String confirmado(Voo voo) {
        return "O v�o solicitado encontra-se atrasado, n�o sendo poss�l confirm�-lo";
    }

}
