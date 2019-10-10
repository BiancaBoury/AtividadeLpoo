package escola;

public class Principal {

    public static void main(String[] args) {
        Escola e = new Escola();
        e.setNome("ETEC");
        
        Turma t1 = new Turma();
        Turma t2 = new Turma();
        t1.setNomeTurma("2 MIN");
        t2.setNomeTurma("2 MAD");
        
      Alunos a1 = new Alunos();
        Alunos a2 = new Alunos();
        Alunos a3 = new Alunos();
        Alunos a4 = new Alunos();
        Alunos a5 = new Alunos();
        Alunos a6 = new Alunos();
        Alunos a7 = new Alunos();
        Alunos a8 = new Alunos();
        Alunos a9 = new Alunos();
        Alunos a10 = new Alunos();
        
        a1.setCodAluno(1);
        a1.setNome("Bianca");
        a1.setNota1(10);
        a1.setNota2(5);
        a1.setNota3(3);
        a1.setNota4(10);
        
        a2.setCodAluno(2);
        a2.setNome("Gabriel Candido");
        a2.setNota1(10);
        a2.setNota2(4);
        a2.setNota3(6);
        a2.setNota4(8);
        
        a3.setCodAluno(3);
        a3.setNome("Rodolfo");
        a3.setNota1(3);
        a3.setNota2(1);
        a3.setNota3(1);
        a3.setNota4(2);
        
        a4.setCodAluno(4);
        a4.setNome("Sabrina");
        a4.setNota1(10);
        a4.setNota2(10);
        a4.setNota3(10);
        a4.setNota4(9);
        
        a5.setCodAluno(5);
        a5.setNome("Jussimar");
        a5.setNota1(1);
        a5.setNota2(5);
        a5.setNota3(3);
        a5.setNota4(6);
        
        a6.setCodAluno(6);
        a6.setNome("Claudio");
        a6.setNota1(8);
        a6.setNota2(6);
        a6.setNota3(1);
        a6.setNota4(1);
        
        a7.setCodAluno(7);
        a7.setNome("Elisangela");
        a7.setNota1(7);
        a7.setNota2(10);
        a7.setNota3(10);
        a7.setNota4(9);
        
        a8.setCodAluno(8);
        a8.setNome("Joyce");
        a8.setNota1(10);
        a8.setNota2(10);
        a8.setNota3(10);
        a8.setNota4(10);
        
        a9.setCodAluno(9);
        a9.setNome("Sid");
        a9.setNota1(5);
        a9.setNota2(5);
        a9.setNota3(9);
        a9.setNota4(10);
        
        a10.setCodAluno(10);
        a10.setNome("Paloma");
        a10.setNota1(6);
        a10.setNota2(3);
        a10.setNota3(2);
        a10.setNota4(1);
        
        e.addTurma(t1);
        e.addTurma(t2);
        t1.addAlunos(a1);
        t1.addAlunos(a2);
        t1.addAlunos(a3);
        t1.addAlunos(a4);
        t1.addAlunos(a5);
        t2.addAlunos(a6);
        t2.addAlunos(a7);
        t2.addAlunos(a8);
        t2.addAlunos(a9);
        t2.addAlunos(a10);
        
        System.out.println("Escola: "+e.getNome());
        System.out.println("Turmas nesta escola: "+t1.getNomeTurma()+" / "+t2.getNomeTurma());
        System.out.println("----------\nTurma: "+t1.getNomeTurma());
        System.out.println("Alunos: ");
        t1.ExibirAlunos();
        System.out.println("----------\nTurma: "+t2.getNomeTurma());
        System.out.println("Alunos: ");
        t2.ExibirAlunos();
    }
    
}
