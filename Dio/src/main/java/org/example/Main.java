package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando Cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        // Criando Mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        // Exibindo conteúdos
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        // Criando Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Criando Devs e inscrevendo no Bootcamp
        Dev devAnderson = new Dev();
        devAnderson.setNome("Anderson");
        devAnderson.inscreverBootcamp(bootcamp);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println("\n--- Conteúdos Inscritos Anderson ---");
        devAnderson.getConteudosInscritos().forEach(System.out::println);
        System.out.println("XP: " + devAnderson.calcularTotalXp());

        System.out.println("\n--- Conteúdos Inscritos Camila ---");
        devCamila.getConteudosInscritos().forEach(System.out::println);
        System.out.println("XP: " + devCamila.calcularTotalXp());

        // Anderson progride
        System.out.println("\n--- Anderson progrediu ---");
        devAnderson.progredir();
        devAnderson.progredir();
        System.out.println("Conteúdos Inscritos:");
        devAnderson.getConteudosInscritos().forEach(System.out::println);
        System.out.println("Conteúdos Concluídos:");
        devAnderson.getConteudosConcluidos().forEach(System.out::println);
        System.out.println("XP total: " + devAnderson.calcularTotalXp());

        // Camila progride
        System.out.println("\n--- Camila progrediu ---");
        devCamila.progredir();
        System.out.println("Conteúdos Inscritos:");
        devCamila.getConteudosInscritos().forEach(System.out::println);
        System.out.println("Conteúdos Concluídos:");
        devCamila.getConteudosConcluidos().forEach(System.out::println);
        System.out.println("XP total: " + devCamila.calcularTotalXp());

        // Devs inscritos no Bootcamp
        System.out.println("\n--- Devs inscritos no Bootcamp ---");
        bootcamp.getDevsInscritos().forEach(dev -> System.out.println(dev.getNome()));
    }
}
