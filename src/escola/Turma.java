package escola;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String NomeTurma;
    private List<Alunos> Alunos=new ArrayList<Alunos>();
    
    public void addAlunos(Alunos a){
        Alunos.add(a);
    }
    
    public void ExibirAlunos(){
        for(Alunos a : this.Alunos){
            System.out.println("\nCod Aluno: "+a.getCodAluno()+" - Nome: "+a.getNome()+"\nNota1: "+a.getNota1()+"\nNota2: "+a.getNota2()+"\nNota3: "+a.getNota3()+"\nNota4: "+a.getNota4()+"\n"+a.ExibirSituaçao());
        }
    }

    public String getNomeTurma() {
        return NomeTurma;
    }

    public void setNomeTurma(String NomeTurma) {
        this.NomeTurma = NomeTurma;
    }

    public List<Alunos> getAlunos() {
        return Alunos;
    }

    public void setAlunos(List<Alunos> Alunos) {
        this.Alunos = Alunos;
    }
    
}
