public class Main {
    public static void main(String[] args) {
        
    Cabecalho cabecalho = new Cabecalho();
    Questao quiz = new Questao();

    cabecalho.infos();

    quiz.escrevaQuestao();
    quiz.isCorreta(quiz.leiaResposta());


    }
}
