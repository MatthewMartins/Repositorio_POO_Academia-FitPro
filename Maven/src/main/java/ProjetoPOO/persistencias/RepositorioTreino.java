
package ProjetoPOO.persistencias;

import ProjetoPOO.entidades.Treino;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface RepositorioTreino extends CrudRepository<Treino, Long> {
    
    public List<Treino> findByNomeTreino(String nomeTreino);
    public Treino findByIdTreino(long idTreino);
}
