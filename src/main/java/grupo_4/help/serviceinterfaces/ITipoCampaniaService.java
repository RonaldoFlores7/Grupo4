package grupo_4.help.serviceinterfaces;

import grupo_4.help.entities.TipoCampania;

import java.util.List;

public interface ITipoCampaniaService {
    public List<TipoCampania> list();
    public void insert(TipoCampania tipoCampania);
    public void update(TipoCampania tipoCampania);
    public void delete(int idTipoCampania);}
