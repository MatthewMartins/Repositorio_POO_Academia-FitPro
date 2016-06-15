package ProjetoPOO.negocios;

import ProjetoPOO.entidades.Funcionario;
import ProjetoPOO.listar.ListarFuncionario;
import ProjetoPOO.persistencias.RepositorioFuncionario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NegocioFuncionario implements InterfaceFuncionario {

    @Autowired
    private RepositorioFuncionario repositorioFuncionario;

    @Transactional(rollbackFor = FuncionarioExistenteException.class)
    @Override
    public void adicionarFuncionario(Funcionario funcionario) throws FuncionarioExistenteException {

        try {
            buscarNumContratoFuncionario(funcionario.getNumContrato());
            throw new FuncionarioExistenteException();
        } catch (FuncionarioInexistenteException e) {
            repositorioFuncionario.save(funcionario);
        }
    }

    @Override
    public Funcionario buscarNumContratoFuncionario(long numContrato) throws FuncionarioInexistenteException {
        Funcionario funcionario = repositorioFuncionario.findByNumContrato(numContrato);
        if (funcionario == null) {
            throw new FuncionarioInexistenteException();
        }
        return funcionario;
    }

    @Transactional(rollbackFor = FuncionarioInexistenteException.class)
    @Override
    public void atualizarFuncionario(Funcionario funcionario) throws FuncionarioInexistenteException {
        Funcionario antigo = buscarNumContratoFuncionario(funcionario.getNumContrato());
        antigo.setNomeFun(funcionario.getNomeFun());
        antigo.setIdadeFun(funcionario.getIdadeFun());
        antigo.setTelefoneFun(funcionario.getTelefoneFun());
        antigo.setRuaFun(funcionario.getTelefoneFun());
        antigo.setBairroFun(funcionario.getBairroFun());
        antigo.setCidadeFun(funcionario.getCidadeFun());
        antigo.setNivelAcesso(funcionario.getNivelAcesso());
        antigo.setSenhaFun(funcionario.getSenhaFun());
        repositorioFuncionario.save(antigo);
    }

    @Transactional(rollbackFor = FuncionarioInexistenteException.class)
    @Override
    public void removerFuncionario(long numContrato) throws FuncionarioInexistenteException {
        repositorioFuncionario.delete(buscarNumContratoFuncionario(numContrato));
    }

    @Override
    public List<ListarFuncionario> listarFuncionarios() {
        List<ListarFuncionario> retornaListaFuncionarios = new ArrayList<ListarFuncionario>();
        List<Funcionario> funcionario = (List<Funcionario>) repositorioFuncionario.findAll();
        for(int i = 0; i<funcionario.size(); i++){
            ListarFuncionario listarFuncionario = new ListarFuncionario(); 
            listarFuncionario.setNomeFun(funcionario.get(i).getNomeFun());
            listarFuncionario.setIdadeFun(funcionario.get(i).getIdadeFun());
            listarFuncionario.setTelefoneFun(funcionario.get(i).getTelefoneFun());
            listarFuncionario.setRuaFun(funcionario.get(i).getRuaFun());
            listarFuncionario.setBairroFun(funcionario.get(i).getBairroFun());
            listarFuncionario.setCidadeFun(funcionario.get(i).getCidadeFun());
            listarFuncionario.setNumContrato(funcionario.get(i).getNumContrato());
            listarFuncionario.setNivelAcesso(funcionario.get(i).getNivelAcesso());
            listarFuncionario.setSenhaFun(funcionario.get(i).getSenhaFun());
            retornaListaFuncionarios.add(listarFuncionario);
        }
        
        return retornaListaFuncionarios; 
    }

}
