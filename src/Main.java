import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso01 = new Curso();
        curso01.setTitulo("Curso Java");
        curso01.setDescricao("Curso para conceitos fundamentais do Java");
        curso01.setCargaHoraria(20);

        Curso curso02 = new Curso();
        curso02.setTitulo("Curso Angular");
        curso02.setDescricao("Curso para conceitos fundamentais do Angular");
        curso02.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Starter Java");
        mentoria.setDescricao("Mentoria completa para curso de Java");
        mentoria.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp backend e frontend para desenvolvedores Java");
        bootcamp.getConteudos().add(curso01);
        bootcamp.getConteudos().add(curso02);
        bootcamp.getConteudos().add(mentoria);

        Dev dev01 = new Dev();
        dev01.setNome("Miquéias");
        dev01.inscreverBootcamp(bootcamp);

        Dev dev02 = new Dev();
        dev02.setNome("Diogo");
        dev02.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos do dev "+dev01.getNome()+": "+dev01.getConteudosPendentes());
        System.out.println("Conteúdos inscritos do dev "+dev02.getNome()+": "+dev02.getConteudosPendentes());

        dev01.progredir();
        dev02.progredir();

        System.out.println("Conteúdos concluídos do dev "+dev01.getNome()+": "+dev01.getConteudosConcluidos());
        System.out.println("Conteúdos concluídos do dev "+dev02.getNome()+": "+dev02.getConteudosConcluidos());

    }
}
