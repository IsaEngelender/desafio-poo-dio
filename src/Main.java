import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargahoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());



        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIsabella = new Dev();
        devIsabella.setNome("Isabella");
        devIsabella.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Isabella:" + devIsabella.getConteudosInscritos());

        devIsabella.progredir();
        devIsabella.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Isabella:" + devIsabella.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Isabella:" + devIsabella.getConteudosConcluidos());
        System.out.println("XP:" + devIsabella.calcularTotalXP());

        System.out.println("---------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Joao:" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao:" + devIsabella.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXP());





    }
}