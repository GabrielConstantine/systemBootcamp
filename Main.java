import dominio.Mentores;
import dominio.Conteudo;
import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("curso de Desenvolvimento Básico Java.");
        cursoJava.setDescricao("Neste curso será apresentado a linguagem de programação básica Java e os seus fundamentos.");
        cursoJava.setCargaHoraria(8);

        Mentores mentoriaJava = new Mentores();
        mentoriaJava.setTitulo("Mentoria de Java.");
        mentoriaJava.setDescricao("Mentoria sobre Aplicações Java com a mentora Camila");
        mentoriaJava.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Neste bootcamp serão apresentados diversos cursos envolvendo o Java e oportunidades relacionadas a essa linguagem.");
        bootcampJava.getConteudos().add(cursoJava);
        bootcampJava.getConteudos().add(mentoriaJava);

        Curso cursoJavascript = new Curso();
        cursoJavascript.setTitulo("curso de Desenvolvimento Básico Javascript.");
        cursoJavascript.setDescricao("Neste curso será apresentado a linguagem de programação básica Javascript e os seus fundamentos.");
        cursoJavascript.setCargaHoraria(4);

        Mentores mentoriaJavascript = new Mentores();
        mentoriaJavascript.setTitulo("Mentoria de Java.");
        mentoriaJavascript.setDescricao("Mentoria sobre Aplicações Java com a mentora Camila");
        mentoriaJavascript.setData(LocalDate.now());

        System.out.println("\n---------------------");
        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcampJava);
        System.out.println("\nConteúdos Inscritos Gabriel:" + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        devGabriel.progredir();
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("Conteúdos Concluídos Gabriel:" + devGabriel.getConteudosConcluidos());
        System.out.println("XP:" + devGabriel.calcularTotalXp());
        System.out.println("\n---------------------");

        Bootcamp bootcampJavascript = new Bootcamp();
        bootcampJavascript.setNome("Bootcamp Javascript Developer");
        bootcampJavascript.setDescricao("Neste bootcamp serão apresentados diversos cursos envolvendo o Javascript e oportunidades relacionadas a essa linguagem.");
        bootcampJavascript.getConteudos().add(cursoJavascript);
        bootcampJavascript.getConteudos().add(mentoriaJavascript);

        System.out.println("\n---------------------");
        Dev devConstantine = new Dev();
        devConstantine.setNome("Constantine");
        devConstantine.inscreverBootcamp(bootcampJavascript);
        System.out.println("\nConteúdos Inscritos Constantine:" + devConstantine.getConteudosInscritos());
        devConstantine.progredir();
        devConstantine.progredir();
        devConstantine.progredir();
        System.out.println("XP:" + devConstantine.calcularTotalXp());
        System.out.println("Conteúdos Concluidos Constantine:" + devConstantine.getConteudosConcluidos());
        System.out.println("\n---------------------");
    }
}