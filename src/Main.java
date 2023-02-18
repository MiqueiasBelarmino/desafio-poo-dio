import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso01 = new Curso();
        curso01.setTitulo("Curso Java");
        curso01.setDescricao("Curso para conceitos fundamentais do Java");
        curso01.setCargaHoraria(20);

        Curso curso02 = new Curso();
        curso01.setTitulo("Curso JavaScript");
        curso01.setDescricao("Curso para conceitos fundamentais do JavaScript");
        curso01.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Starter Java");
        mentoria.setDescricao("Mentoria completa para curso de Java");
        mentoria.setDate(LocalDate.now());

        System.out.println(curso01);
        System.out.println(curso02);
        System.out.println(mentoria);
    }
}
