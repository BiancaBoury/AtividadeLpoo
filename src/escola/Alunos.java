package escola;

public class Alunos {
    private int CodAluno;
    private String Nome;
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;
    
    public String ExibirSituaçao(){
        int notaFinal=(this.nota1+this.nota2+this.nota3+this.nota4)/4;
        if(notaFinal >= 7){
            return "Voce aprovado(a) com a nota: "+notaFinal;
        }else{
            return "Voce reprovado(a) com a nota: "+notaFinal;
        }
    }

    public int getCodAluno() {
        return CodAluno;
    }

    public void setCodAluno(int CodAluno) {
        this.CodAluno = CodAluno;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }
    
}
