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
        return "O vôo solicitado encontra-se atrasado e por esse motivo será adiado";
    }


    @Override
    public String atrasado(Voo voo) {
        return "O vôo já encontra-se atrasado";
    }


    @Override
    public String cancelado(Voo voo) {
        voo.setEstado(new VooAdiado());
        boolean status = VooDAO.getInstance().update(voo);
        return "Vôo cancelado com sucesso";
    }


    @Override
    public String confirmado(Voo voo) {
        return "O vôo solicitado encontra-se atrasado, não sendo possíl confirmá-lo";
    }

}
