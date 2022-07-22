import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição javascript");
        curso2.setCargaHoraria(80);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de Java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devVinicius = new Dev();
        devVinicius.setNome("Vinicius");
        devVinicius.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + devVinicius.getNome() + " " + devVinicius.getConteudoInscritos());

        System.out.println("-");
        devVinicius.progredir();
        devVinicius.progredir();
        System.out.println("Conteúdos inscritos de " + devVinicius.getNome() + " " + devVinicius.getConteudoInscritos());
        System.out.println("Conteúdos concluídos de " + devVinicius.getNome() + " " + devVinicius.getConteudoConcluidos());
        System.out.println("XP: " + devVinicius.calcularTotalXp());

        System.out.println("---------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + devCamila.getNome() + " " + devCamila.getConteudoInscritos());

        System.out.println("-");
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos inscritos de " + devCamila.getNome() + " " + devCamila.getConteudoInscritos());
        System.out.println("Conteúdos concluídos de " + devCamila.getNome() + " " + devCamila.getConteudoConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("---------------------");

    }
}
