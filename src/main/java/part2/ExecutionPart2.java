package part2;

import classes.Aluno;
import classes.Estado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class ExecutionPart2 {
    public static void main(String[] args) {
        /** OBS: Esse código deve executar SEM ERROS com a implementação JPA que foi definida no persistence.xml
         * Se estiver somente com o JPA baixado, o código NÃO IRÁ funcionar. */

        // O ideal é que nessa parte (Parte 2) o código EXECUTE SEM ERROS, pois aqui tera uma implementação JPA sendo utilizada

        // 1 - Passos iniciais para criar um gerenciador de entidades com o banco de dados especificado no arquivo "persistence.xml"
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("part2-DIO");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // 2.1 - Criar instancias para serem adicionadas no banco de dados
        Estado estadoParaAdicionar = new Estado("Rio de Janeiro", "RJ");
        Aluno alunoParaAdiciionar = new Aluno("Daniel", 29, estadoParaAdicionar);

        // 2.2 - Iniciar uma transação para adicionar as instancias no banco de dados
        /*entityManager.getTransaction().begin();

        entityManager.persist(estadoParaAdicionar);
        entityManager.persist(alunoParaAdiciionar);

        entityManager.getTransaction().commit();*/

        // 3 - Resgatar/Listar instancias no banco de dados
        //Estado estadoEncontrado = entityManager.find(Estado.class, 1);
        //Aluno alunoEncontrado = entityManager.find(Aluno.class, 1);

        //System.out.println(estadoEncontrado);
        //System.out.println(alunoEncontrado);

        /*Query q = entityManager.createNamedQuery(Aluno.FIND_ALL, Aluno.class);
        List<Aluno> alunos = q.getResultList();

        alunos.stream().forEach(System.out::println);*/

        // 4 - Altera uma entidade
        /*entityManager.getTransaction().begin();

        alunoEncontrado.setNome("Karam");
        alunoEncontrado.setIdade(20);

        entityManager.getTransaction().commit();

        System.out.println(alunoEncontrado);*/

        // 5 - Remover umaentidade
        /*entityManager.getTransaction().begin();

        entityManager.remove(alunoEncontrado);

        entityManager.getTransaction().commit();*/

        // 6 - Encerrar o gerenciador de entidades e encerrar a fabrica de gerenciadores de entidade.
        entityManager.clear();
        entityManagerFactory.close();
    }
}
