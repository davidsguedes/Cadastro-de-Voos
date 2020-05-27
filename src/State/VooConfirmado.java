package State;

import Model.Voo;

public class VooConfirmado implements VooEstado {


    @Override
    public String getEstado() {
        return "Confirmado";
    }


    @Override
    public String adiado(Voo voo) {
        return "O vôo solicitado está confirmado e não pode ser adiado";
    }


    @Override
    public String atrasado(Voo voo) {
        return "O vôo solicitado está confirmado e não pode ser atrasado";
    }


    @Override
    public String cancelado(Voo voo) {
        return "O vôo solicitado está confirmado e não pode ser cancelado";
    }

    @Override
    public String confirmado(Voo voo) {
        return "O vôo solicitado já está confirmado"; 
    }


}
