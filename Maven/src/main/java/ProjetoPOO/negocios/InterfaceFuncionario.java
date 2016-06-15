package ProjetoPOO.negocios;

import ProjetoPOO.entidades.Funcionario;
import ProjetoPOO.listar.ListarFuncionario;
import java.util.List;

public interface InterfaceFuncionario {

    public void adicionarFuncionario(Funcionario funcionario) throws FuncionarioExistenteException;

    public void atualizarFuncionario(Funcionario funcionario) throws FuncionarioInexistenteException;

    public void removerFuncionario(long numContrato) throws FuncionarioInexistenteException;

    public List<ListarFuncionario> listarFuncionarios();

    public Funcionario buscarNumContratoFuncionario(long numContrato) throws FuncionarioInexistenteException;
}
