package escola;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String Nome;
    private List<Turma> Turma=new ArrayList<Turma>();
    
    public void addTurma(Turma t){
        Turma.add(t);
    }
    
    public void ExibirTurma(){
        for(Turma t : this.Turma){
            System.out.println("Turma: "+t.getNomeTurma());
        }
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public List<Turma> getTurma() {
        return Turma;
    }

    public void setTurma(List<Turma> Turma) {
        this.Turma = Turma;
    }
    
}
