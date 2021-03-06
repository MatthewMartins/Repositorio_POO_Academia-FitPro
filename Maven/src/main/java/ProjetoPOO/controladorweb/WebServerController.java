package ProjetoPOO.controladorweb;

import ProjetoPOO.entidades.Aluno;
import ProjetoPOO.entidades.Avaliacao;
import ProjetoPOO.entidades.Exercicio;
import ProjetoPOO.entidades.Funcionario;
import ProjetoPOO.entidades.Treino;
import ProjetoPOO.listar.ListarAluno;
import ProjetoPOO.listar.ListarAvaliacao;
import ProjetoPOO.listar.ListarExercicio;
import ProjetoPOO.listar.ListarFuncionario;
import ProjetoPOO.listar.ListarTreino;
import ProjetoPOO.negocios.InterfaceFachada;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//controlador funcionando para Javascript e HTML, apenas HTML tirar as anotações @RequestBody....
//usar anotação @Controller para poder usar os formularios
@Controller
//@RestController
@RequestMapping("/Controlador")
public class WebServerController {

    @Autowired
    private InterfaceFachada fachada;
    
  
    @RequestMapping(value = "aluno/listar", method = RequestMethod.GET)
    public @ResponseBody List<ListarAluno> listarAlunos() {
        return this.fachada.listarAlunos();
    }
    
    //@RequestBody é as informações que vc esta mandando, as requisições que vem do fron
    //@ResponseBody é a resposta que o metodo vai trazer
    //o @RequestMapping recebe um atributo chamado value que indica qual será a URL utilizada para chamar o método.
    @RequestMapping("aluno/adicionar")
    public @ResponseBody ResponseEntity<?> adicionarAluno(@RequestBody Aluno aluno) {
        try {
          
            this.fachada.adicionarAluno(aluno);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @RequestMapping("aluno/atualizar")
    public @ResponseBody ResponseEntity<?> atualizarAluno(@RequestBody Aluno aluno) {

        try {
            this.fachada.atualizarAluno(aluno);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping(value = "aluno/buscar", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity<?> buscarAlunoID(long numMatricula) {

        try {
            //return this.fachada.buscarIdAluno(numMatricula);
            ListarAluno aluno = this.fachada.buscarIdAluno(numMatricula);
            //No front precisou eu transformar o aluno em uma lista, para poder ele jogar na tabela
            List<ListarAluno> retornaListaAluno = new ArrayList<ListarAluno>();
            retornaListaAluno.add(aluno);
            return new ResponseEntity<List<ListarAluno>>(retornaListaAluno, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }

    }
    
    @RequestMapping(value = "aluno/historicoTreino",produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity<?> historicoTreinosAluno(long numMatricula){
        try {
            List<ListarTreino> historico = this.fachada.historicoTreinosAluno(numMatricula);
            return new ResponseEntity<List<ListarTreino>>(historico, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
    }
    
    @RequestMapping(value = "aluno/historicoAvaliacao",produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity<?> historicoAvaliacoesAluno(long numMatricula){
        try {
            List<ListarAvaliacao> historicoAvaliacao = this.fachada.historicoAvaliacoesAluno(numMatricula);
            return new ResponseEntity<List<ListarAvaliacao>>(historicoAvaliacao, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping("aluno/remover")
    public @ResponseBody ResponseEntity<?> removerAluno(long numMatricula) {

        try {
            this.fachada.removerAluno(numMatricula);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }
    
     //    -----------    CONTROLADOR AVALIACAO    ----------------------------

    @RequestMapping("avaliacao/adicionar")
    public @ResponseBody ResponseEntity<?> adicionarAvaliacao(@RequestBody Avaliacao avaliacao, long numMatricula) {

        try {
            this.fachada.adicionarAvaliacao(avaliacao, numMatricula);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping("avaliacao/atualizar")
    public ResponseEntity<?> atualizarAvaliacao(@RequestBody Avaliacao avaliacao) {

        try {
            this.fachada.atualizarAvaliacao(avaliacao);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping("avaliacao/remover")
    public ResponseEntity<?> removerAvaliacao(long idAvaliacao) {

        try {
            this.fachada.removerAvaliacao(idAvaliacao);

        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping(value = "avaliacao/listar", method = RequestMethod.GET)
    public @ResponseBody List<ListarAvaliacao> listarAvaliacoes() {
        return this.fachada.listarAvaliacoes();
    }

    @RequestMapping(value = "avaliacao/buscar", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity<?> buscarAvaliacaoID(long idAvaliacao) {

        try {
            ListarAvaliacao avaliacao = this.fachada.buscarIdAvaliacao(idAvaliacao);
            List<ListarAvaliacao> retornaListaAvaliacao = new ArrayList<ListarAvaliacao>();
            retornaListaAvaliacao.add(avaliacao);
            return new ResponseEntity<List<ListarAvaliacao>>(retornaListaAvaliacao, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }

    }
    
     //    -----------    CONTROLADOR FUNCIONARIO    ----------------------------

    @RequestMapping("funcionario/adicionar")
    public ResponseEntity<?> adicionarFuncionario(@RequestBody Funcionario funcionario) {

        try {
            this.fachada.adicionarFuncionario(funcionario);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping("funcionario/atualizar")
    public ResponseEntity<?> atualizarFuncionario( @RequestBody Funcionario funcionario) {

        try {
            this.fachada.atualizarFuncionario(funcionario);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping("funcionario/remover")
    public ResponseEntity<?> removerFuncionario(long numContrato) {

        try {
            this.fachada.removerFuncionario(numContrato);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping(value = "funcionario/listar", method = RequestMethod.GET)
    public @ResponseBody  List<ListarFuncionario> listarFuncionarios() {
        return this.fachada.listarFuncionarios();
    }

    @RequestMapping("funcionario/buscar")
    public ResponseEntity<?> buscarNumContratoFuncionario(long numContrato) {

        try {
            Funcionario funcionario = this.fachada.buscarNumContratoFuncionario(numContrato);
            return new ResponseEntity<Funcionario>(funcionario, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }

    }
    
    //    -----------    CONTROLADOR TREINO    ----------------------------

    @RequestMapping("treino/adicionar")
    public @ResponseBody ResponseEntity<?> adicionarTreino( @RequestBody Treino treino, long numMatricula) {
        
        try {
            this.fachada.adicionarTreino(treino, numMatricula);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping("treino/atualizar")
    public ResponseEntity<?> atualizarTreino(@RequestBody Treino treino) {

        try {
            this.fachada.atualizarTreino(treino);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping("treino/remover")
    public ResponseEntity<?> removerTreino(long idTreino) {

        try {
            this.fachada.removerTreino(idTreino);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping(value = "treino/listar", method = RequestMethod.GET)
    public @ResponseBody List<ListarTreino> listarTreinos() {
        return this.fachada.listarTreinos();
    }

    @RequestMapping(value = "treino/buscar",produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity<?> buscarTreinoId(long idTreino) {

        try {
            ListarTreino treino = this.fachada.buscarTreinoId(idTreino);
            List<ListarTreino> retornaListaTreino = new ArrayList<ListarTreino>();
            retornaListaTreino.add(treino);
            return new ResponseEntity<List<ListarTreino>>(retornaListaTreino, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }

    }
    
    @RequestMapping("exercicio/adicionar")
    public ResponseEntity<?> adicionarExercicio(long idTreino, @RequestBody  Exercicio exercicio) {

        try {
            this.fachada.adicionarExercicio(idTreino, exercicio);
       
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping("exercicio/atualizar")
    public ResponseEntity<?> atualizarExercicio(@RequestBody Exercicio exercicio) {

        try {
            this.fachada.atualizarExercicio(exercicio);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping("exercicio/remover")
    public ResponseEntity<?> removerExercicio(long idExercicio) {

        try {
            this.fachada.removerExercicio(idExercicio);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping(value = "exercicio/listar", method = RequestMethod.GET)
    public @ResponseBody List<ListarExercicio> listarExercicios() {
        return this.fachada.listarExercicios();
    }
    
    @RequestMapping("exercicio/buscar")
    public ResponseEntity<?> buscarExercicioId(long idExercicio) {

        try {
            ListarExercicio exercicio = this.fachada.buscarExercicioId(idExercicio);
            return new ResponseEntity<ListarExercicio>(exercicio, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
    }

    //-------------------------------------FORMULARIOOS---------------------------------------------- 
    
    
    // -----------------  ALUNO -------------------
    
    @RequestMapping("/cadastrarAluno")
    public String formularioCadastrarAluno() {
        return "cadastrarAluno";
    }

    @RequestMapping("/excluirAluno")
    public String formularioExcluirAluno() {
        return "excluirAluno";
    }

    @RequestMapping("/atualizarAluno")
    public String formularioAtualizarAluno() {
        return "atualizarAluno";
    }
    
    @RequestMapping("/historicoTreinosAluno")
    public String formularioHistoricoTreinoAluno() {
        return "historicoTreinosAluno";
    }
    
    @RequestMapping("/historicoAvaliacoesAluno")
    public String formularioHistoricoAvaliacaoAluno() {
        return "historicoAvaliacoesAluno";
    }

    @RequestMapping("/buscarAluno")
    public String formularioBuscarAluno() {
        return "buscarAluno";
    }
    
    // -----------------  FUNCIONARIO -------------------
    
    @RequestMapping("/cadastrarFuncionario")
    public String formularioCadastrarFuncionario() {
        return "cadastrarFuncionario";
    }

    @RequestMapping("/excluirFuncionario")
    public String formularioExcluirFuncionario() {
        return "excluirFuncionario";
    }

    @RequestMapping("/atualizarFuncionario")
    public String formularioAtualizarFuncionario() {
        return "atualizarFuncionario";
    }

    @RequestMapping("/buscarFuncionario")
    public String formularioBuscarFuncionario() {
        return "buscarFuncionario";
    }
    
    // -----------------  TREINO -------------------
    
    @RequestMapping("/cadastrarTreino")
    public String formularioCadastrarTreino() {
        return "cadastrarTreino";
    }
    
    @RequestMapping("/atualizarTreino")
    public String formularioAtualizarTreino() {
        return "atualizarTreino";
    }
    
    @RequestMapping("/buscarTreino")
    public String formularioBuscarTreino() {
        return "buscarTreino";
    }
    
    @RequestMapping("/excluirTreino")
    public String formularioExcluirTreino() {
        return "excluirTreino";
    }
    
    // -----------------  EXERCICIO -------------------
    
    @RequestMapping("/cadastrarExercicio")
    public String formularioCadastrarExercicio() {
        return "cadastrarExercicio";
    }
    
    @RequestMapping("/atualizarExercicio")
    public String formularioAtualizarExercicio() {
        return "atualizarExercicio";
    }
    
    @RequestMapping("/buscarExercicio")
    public String formularioBuscarExercicio() {
        return "buscarExercicio";
    }
    
    @RequestMapping("/excluirExercicio")
    public String formularioExcluirExercicio() {
        return "excluirExercicio";
    }
    
    // -----------------  AVALIACAO-------------------
    
    @RequestMapping("/cadastrarAvaliacao")
    public String formularioCadastrarAvaliacao() {
        return "cadastrarAvaliacao";
    }
    
    @RequestMapping("/atualizarAvaliacao")
    public String formularioAtualizarAvaliacao() {
        return "atualizarAvaliacao";
    }
    
    @RequestMapping("/buscarAvaliacao")
    public String formularioBuscarAvaliacao() {
        return "buscarAvaliacao";
    }
    
    @RequestMapping("/excluirAvaliacao")
    public String formularioExcluirAvaliacao() {
        return "excluirAvaliacao";
    }
    
}
