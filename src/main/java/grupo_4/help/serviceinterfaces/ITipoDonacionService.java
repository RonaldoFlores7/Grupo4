package grupo_4.help.serviceinterfaces;

import grupo_4.help.entities.TipoDonacion;

import java.util.List;

public interface ITipoDonacionService {
    public List<TipoDonacion> list();
    public void insert (TipoDonacion tipoDonacion);
    public void update (TipoDonacion tipoDonacion);
    public void delete (int idTipoDonacion);
}
