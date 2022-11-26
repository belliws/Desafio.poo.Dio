import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição curso Java ");
        curso1.setCargaHoraria(8);
        Curso curso2 = new Curso();
        curso1.setTitulo("Java 2");
        curso1.setDescricao("Descrição curso Java 2 ");
        curso1.setCargaHoraria(12);

        //System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());
       // System.out.println(mentoria);

       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("Bootcamp Java developer");
       bootcamp.setDescricao("descrição Bootcamp Java Developer");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria);

       Dev devRodrigo = new Dev();
       devRodrigo.setNome("Rodrigo");
       devRodrigo.InscreverBootcamp(bootcamp);
       System.out.println("Conteudos inscritos: " + devRodrigo.getConteudosIncritos());
       devRodrigo.Progredir();
       devRodrigo.Progredir();
       devRodrigo.Progredir();
       System.out.println("Conteudos concluidos: " + devRodrigo.getConteudosConcluidos());
       System.out.println("xp:" + devRodrigo.calcularTotalXp());
       
       System.out.println("----------------");
       
       Dev devMaria = new Dev();
       devMaria.InscreverBootcamp(bootcamp);
       devMaria.setNome("Maria");
       System.out.println("Conteudos inscritos: " + devMaria.getConteudosIncritos());
       devMaria.Progredir();
       System.out.println("Conteudos concluidos: " + devMaria.getConteudosConcluidos());
       System.out.println("xp:" + devMaria.calcularTotalXp());

    
    }
    
}
