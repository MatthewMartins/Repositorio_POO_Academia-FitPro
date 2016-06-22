package ProjetoPOO.negocios;
import ProjetoPOO.entidades.Exercicio;
import ProjetoPOO.listar.ListarExercicio;
import java.util.List;

public interface InterfaceExercicio {

    public void adicionarExercicio(long idTreino, Exercicio exercicio) throws ExercicioExistenteException;

    public void atualizarExercicio(Exercicio exercicio) throws ExercicioInexistenteException;

    public void removerExercicio(long idExercicio) throws ExercicioInexistenteException;

    public List<ListarExercicio> listarExercicios();

    public ListarExercicio buscarExercicioId(long idExercicio) throws ExercicioInexistenteException;

}
