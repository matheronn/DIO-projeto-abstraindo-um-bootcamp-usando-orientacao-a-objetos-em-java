import br.com.dio.projeto.dominio.Bootcamp;
import br.com.dio.projeto.dominio.Curso;
import br.com.dio.projeto.dominio.Dev;
import br.com.dio.projeto.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso Java completo na DIO!");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Curso JavaScript completo na DIO!");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria online na DIO!");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer 1");
        bootcamp.setDescricao("Primeiro bootcamp Java na DIO!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMatheus = new Dev();
        devMatheus.setNome("Dev1");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devMatheus.getNome() + ":" + devMatheus.getConteudoInscrito());
        devMatheus.progresso();
        System.out.println("-");
        System.out.println("Conteudos inscritos " + devMatheus.getNome() + ":" + devMatheus.getConteudoInscrito());
        System.out.println("Conteudos concluidos " + devMatheus.getNome() + ":" + devMatheus.getConteudoConcluido());
        System.out.println("XP: " + devMatheus.calcularXpTotal());

        System.out.println("------------------");

        Dev devEduardo = new Dev();
        devEduardo.setNome("Dev2");
        devEduardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devEduardo.getNome() + ":" + devEduardo.getConteudoInscrito());
        devEduardo.progresso();
        devEduardo.progresso();
        devEduardo.progresso();
        System.out.println("-");
        System.out.println("Conteudos inscritos " + devEduardo.getNome() + ":" + devEduardo.getConteudoInscrito());
        System.out.println("Conteudos concluidos " + devEduardo.getNome() + ":" + devEduardo.getConteudoConcluido());
        System.out.println("XP: " + devEduardo.calcularXpTotal());


    }
}
