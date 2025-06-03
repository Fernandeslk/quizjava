import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cabecalho cabecalho = new Cabecalho();
        cabecalho.infos();

        ArrayList<Questao> questoes = new ArrayList<>();

        questoes.add(new Questao(
                "1) Qual a função do radiador?",
                "a) Manter a temperatura do carro estável",
                "b) Responsável pela mistura ar/combustível.",
                "c) Fornecer energia elétrica para o motor do veículo.",
                "d) Resfriar o fluido de ar-condicionado do veículo.",
                "e) Manter a temperatura do motor do veículo muito alta para melhorar seu desempenho.",
                "a"
        ));

        questoes.add(new Questao(
                "2) O que é o motor de combustão interna?",
                "a) Motor movido a eletricidade.",
                "b) Motor que queima combustível internamente para gerar energia.",
                "c) Motor que funciona apenas com vapor.",
                "d) Motor que não usa combustível.",
                "e) Motor que usa energia solar.",
                "b"
        ));

        questoes.add(new Questao(
                "3) Para que serve o óleo do motor?",
                "a) Refrigerar o motor.",
                "b) Lubrificar as peças móveis do motor.",
                "c) Aumentar a potência do motor.",
                "d) Limpar o radiador.",
                "e) Controlar a mistura ar/combustível.",
                "b"
        ));

        questoes.add(new Questao(
                "4) O que é a bateria do carro?",
                "a) Dispositivo que armazena energia elétrica para ligar o motor e acessórios.",
                "b) Sistema de arrefecimento.",
                "c) Peça que controla a temperatura do motor.",
                "d) Dispositivo que injeta combustível.",
                "e) Componente do sistema de freios.",
                "a"
        ));

        questoes.add(new Questao(
                "5) Qual a função da embreagem?",
                "a) Transmitir a força do motor para as rodas, permitindo trocas de marcha.",
                "b) Resfriar o motor.",
                "c) Acionar o freio de estacionamento.",
                "d) Controlar a injeção de combustível.",
                "e) Melhorar o consumo de combustível.",
                "a"
        ));

        questoes.add(new Questao(
                "6) O que é o câmbio (caixa de marchas)?",
                "a) Sistema que permite variar a velocidade e torque do motor nas rodas.",
                "b) Componente que filtra o óleo do motor.",
                "c) Sistema de freio do veículo.",
                "d) Peça do sistema elétrico.",
                "e) Dispositivo que controla a direção.",
                "a"
        ));

        questoes.add(new Questao(
                "7) Qual a função do filtro de ar?",
                "a) Limpar o ar que entra no motor para evitar sujeira.",
                "b) Filtrar o combustível.",
                "c) Resfriar o radiador.",
                "d) Lubrificar o motor.",
                "e) Controlar a pressão dos pneus.",
                "a"
        ));

        questoes.add(new Questao(
                "8) O que é torque em um motor?",
                "a) A força que o motor produz para girar as rodas.",
                "b) A velocidade máxima do veículo.",
                "c) O consumo de combustível.",
                "d) O tipo de combustível usado.",
                "e) A temperatura do motor.",
                "a"
        ));

        questoes.add(new Questao(
                "9) Qual a função do alternador?",
                "a) Gerar energia elétrica para carregar a bateria e alimentar os sistemas do carro.",
                "b) Refrigerar o motor.",
                "c) Acionar o freio.",
                "d) Controlar o combustível.",
                "e) Filtrar o óleo.",
                "a"
        ));

        questoes.add(new Questao(
                "10) Para que serve o sistema de suspensão?",
                "a) Absorver impactos e garantir estabilidade ao veículo.",
                "b) Resfriar o motor.",
                "c) Controlar a velocidade.",
                "d) Acionar a direção.",
                "e) Alimentar o motor com combustível.",
                "a"
        ));

        questoes.add(new Questao(
                "11) O que é o sistema de freios ABS?",
                "a) Sistema que evita o travamento das rodas durante a frenagem.",
                "b) Sistema que aumenta a potência do motor.",
                "c) Sistema que reduz o consumo de combustível.",
                "d) Sistema que controla a direção do veículo.",
                "e) Sistema que melhora o som do motor.",
                "a"
        ));

        questoes.add(new Questao(
                "12) Para que serve o catalisador?",
                "a) Reduzir a emissão de gases poluentes no escapamento.",
                "b) Aumentar a potência do motor.",
                "c) Controlar a temperatura do motor.",
                "d) Lubrificar o motor.",
                "e) Armazenar combustível.",
                "a"
        ));

        questoes.add(new Questao(
                "13) Qual a função do sistema de ignição?",
                "a) Gerar faísca para inflamar a mistura ar/combustível no motor.",
                "b) Controlar o ar-condicionado.",
                "c) Resfriar o motor.",
                "d) Alimentar a bateria.",
                "e) Transmitir o movimento para as rodas.",
                "a"
        ));

        questoes.add(new Questao(
                "14) O que é o motor flex?",
                "a) Motor que pode usar mais de um tipo de combustível, como gasolina e álcool.",
                "b) Motor que só usa gasolina.",
                "c) Motor elétrico.",
                "d) Motor a diesel.",
                "e) Motor movido a vapor.",
                "a"
        ));

        questoes.add(new Questao(
                "15) Para que serve o óleo de transmissão?",
                "a) Lubrificar e proteger os componentes internos da caixa de câmbio.",
                "b) Refrigerar o motor.",
                "c) Aumentar a potência do motor.",
                "d) Controlar o combustível.",
                "e) Limpar o filtro de ar.",
                "a"
        ));

        Scanner scanner = new Scanner(System.in);

        for (Questao q : questoes) {
            q.escrevaQuestao();

            String resposta;
            do {
                System.out.print("Digite a resposta (A, B, C, D ou E): ");
                resposta = scanner.nextLine().trim().toUpperCase();

                if (!resposta.matches("[ABCDE]")) {
                    System.out.println("Resposta inválida! Digite A, B, C, D ou E.");
                }
            } while (!resposta.matches("[ABCDE]"));

            q.isCorreta(resposta);
        }

        scanner.close();
        System.out.println("Fim do questionário!");
    }
}
