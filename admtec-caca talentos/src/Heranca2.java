import java.util.Date;

public class Heranca2 {
        public String nome;
        public String cpf;
        public Date data_nascimento;

    public Heranca2(String _nome, String _cpf, Date _data) {
        this.nome = _nome;
        this.cpf = _cpf;
        this.data_nascimento = _data;
    }

    public static class Aluno extends Heranca2 {
        public Aluno(String _nome, String _cpf, Date  _data) {
            super(_nome, _cpf, _data);
        }
        public String matricula = "0000";
    }
    public static void main(String[] args) {
        Aluno i = new Aluno("Ially", "123.456.789-00", new Date());
        System.out.println("nome: " + i.nome);
        System.out.println("cpf: " + i.cpf);
        System.out.println("data de nascimento: " + i.data_nascimento);
        System.out.println("matrícula: " + i.matricula);
    }
}
