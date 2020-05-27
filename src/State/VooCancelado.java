package State;

import Model.Voo;

public class VooCancelado implements VooEstado {


    @Override
    public String getEstado() {
        return "Cancelado";
    }


    @Override
    public String adiado(Voo voo) {
        return "O v�o solicitado est� cancelado";
    }


    @Override
    public String atrasado(Voo voo) {
        return "O v�o solicitado est� cancelado";
    }


    @Override
    public String cancelado(Voo voo) {
        return "O v�o solicitado j� est� cancelado";
    }


    @Override
    public String confirmado(Voo voo) {
        return "O v�o solicitado est� cancelado";
    }


}
