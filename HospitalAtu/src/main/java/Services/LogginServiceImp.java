package Services;

import dto.PersonaDto;

public class LogginServiceImp implements LogginService {
    @Override
    public boolean salirDelSistema(int opcion) {
        if (opcion == 3) {
            boolean salirDelSistema = true;
            return salirDelSistema;
        }

    else{
            return false;
        }
    }

}

