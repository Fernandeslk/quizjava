public class Main {
    public static void main(String[] args) {
        
    Cabeçalho cabecalho = new Cabeçalho();
    Questao quiz = new Questao();


    cabecalho.infos();

    quiz.escrevaQuestao();
    quiz.isCorreta(quiz.leiaResposta());


    }
}
