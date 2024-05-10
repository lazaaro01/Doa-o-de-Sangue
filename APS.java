

import java.util.Scanner;

public class APS {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("A cada doação de sangue, renovamos o estoque de esperança para aqueles que lutam pela vida.\nDoar sangue é oferecer uma oportunidade de recomeço para alguém. O verdadeiro super-herói não usa capa.");
        System.out.println("Informe seus dados abaixo:");

        leia.nextLine(); // pressionar Enter

        System.out.println("Informe seu nome: ");
        String nome = leia.nextLine();

        System.out.println("Qual a sua idade? ");
        int idade = leia.nextInt();

        System.out.println("Qual o seu peso? ");
        float peso = leia.nextFloat();
        leia.nextLine(); //

        if (idade >= 18 && peso >= 50) {
            String usuario = "elegível";
            System.out.println(
                    "\nDemais informações:\n" + "Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Peso: " + peso);
            System.out.println("Você está elegível para a doação de sangue!");

            System.out.println("\nInforme o dia da sua doação de sangue:");
            System.out.println("1-Domingo\n2-Segunda\n3-Terça\n4-Quarta\n5-Quinta\n6-Sexta\n7-Sábado");
            System.out.println(" ");
            String dia = leia.nextLine();

            switch (dia) {
                case "1":
                    dia = "Domingo";
                    break;
                case "2":
                    dia = "Segunda";
                    break;
                case "3":
                    dia = "Terça";
                    break;
                case "4":
                    dia = "Quarta";
                    break;
                case "5":
                    dia = "Quinta";
                    break;
                case "6":
                    dia = "Sexta";
                    break;
                case "7":
                    dia = "Sábado";
                    break;
                default:
                    System.out.println("Dia inválido!");
                    return;
            }

            System.out.println("Informe um Horário Disponível:");
            System.out.println("1- 12:15\n2- 14:40\n3- 15:30\n4- 16:10");
            System.out.println(" ");
            String hora = leia.nextLine();

            switch (hora) {
                case "1":
                    hora = "12:15";
                    break;
                case "2":
                    hora = "14:40";
                    break;
                case "3":
                    hora = "15:30";
                    break;
                case "4":
                    hora = "16:10";
                    break;
                default:
                    System.out.println("Opção inválida!");
                    return;
            }

            System.out.println("Sua doação ficou agendado para o  " + dia + " às " + hora + " horas.");
            System.out.println(" ");

            // Outras opções Pós doação marcada
            System.out.println("Se estiver com dúvidas , Escolha uma dessas opções :");
            System.out.println("1- Passo a Passo da Doação.\n2- Dicas pós Doação.\n3- Não tenho dúvidas.");
            System.out.println(" ");

            // string Criada
            String duvida = leia.nextLine();

            // switch case das duvidas
            switch (duvida) {
                case "1":
                    duvida = "passo";
                    // Guardando a informação sobre o procedimento de passo a passo da doção dentro
                    // de uma variavel.
                    String procedimento = " O processo de coleta segue os seguintes passos: \n"
                            +
                            "- Registro: O paciente fornece informações pessoais e responde a perguntas sobre seu histórico médico para garantir sua elegibilidade para doar.\n"
                            +
                            "- Triagem: O paciente passa por uma triagem, onde são feitas perguntas sobre saúde e comportamentos que possam afetar a segurança da doação.\n"
                            +
                            "- Testes Pré-doação: São realizados testes para medir a pressão arterial, frequência cardíaca e níveis de hemoglobina para garantir que o paciente esteja apto para a doação.\n"
                            +
                            "- Consentimento: O paciente assina um formulário de consentimento, confirmando que está ciente dos procedimentos e dos riscos associados à doação.\n"
                            +
                            "- Coleta de Sangue: Uma vez aprovado, o paciente é levado para a área de doação, onde uma enfermeira insere uma agulha em uma veia do braço para coletar o sangue. O sangue é coletado em uma bolsa estéril.";
                    // retornando a frase inteira na saida.
                    System.out.println(procedimento);
                    break;

                case "2":
                    duvida = "dicas";
                    // Guardando a informação sobre as dicas depois da doação dentro de uma
                    // variavel.
                    String cuidadosPosDoacao = "Estas são as seguintes orientações pós doação:\n" +
                            "- Evitar atividades extenuantes.\n"
                            +
                            "- Beber bastante líquido.\n"
                            +
                            "- Não fumar por algumas horas.";
                    // retornado a frase na saida
                    System.out.println(cuidadosPosDoacao);
                    break;

                // caso a pessoa não tenha duvidas.
                case "3":
                    duvida = "nao";
                    String semDuvidas = "OK!, te esperamos no nosso Centro de Doação Unifametro.";
                    System.out.println(semDuvidas);
                    break;
                // defalt
                default:
                    System.out.println("Opção inválida!");
                    return;
            }

        }

        // Caso não for doador
        // Estes são os criterios para doar :

        else {
            System.out.println("Você não está elegível para a doação de sangue devido ao peso ou idade.");

            System.out.println("\nCritérios mínimos para doação:");
            System.out.println(
                    "- Ter idade entre 18 e 69 anos (menores de 18 anos devem apresentar consentimento formal do responsável legal para doar sangue).");
            System.out.println(
                    "- Pessoas com idade entre 60 e 69 anos só poderão doar sangue se já tiverem feito antes dos 60 anos.");
            System.out.println(
                    "- Apresentar documento de identificação com foto emitido por órgão oficial (Carteira de Identidade, Carteira Nacional de Habilitação, Carteira de Trabalho, Passaporte, Certificado de Reservista e Carteira Profissional emitida por classe).");
            System.out.println("- São aceitos documentos digitais com foto.");
            System.out.println("- Pesar no mínimo 50 kg.");
            System.out.println("- Ter dormido pelo menos 6 horas nas últimas 24 horas.");
            System.out.println(
                    "- Estar alimentado para evitar desmaios durante a doação. Evitar alimentos gordurosos antes da doação de sangue. Caso seja após o almoço, aguardar 2 horas.");
        }
        System.out.println("Clique para acessar um quiz:");
        String quiz = leia.nextLine();

        System.out.println("1 - Quem pode doar sangue?");
        System.out.println("(A) Apenas pessoas em boas condições de saúde, entre 16 e 69 anos e com mais de 50 kg, que cumpram os requisitos básicos" );
         System.out.println("(B) Todas as pessoas com mais de 50 kg podem doar sangue");
         System.out.println("(C) Qualquer pessoa maior de idade pode doar");
         System.out.print("Sua resposta: ");
        String quest1 = leia.next();
        
        switch(quest1) {
            case "A":
            System.out.println("Você acertou!");
            break;
            default:
            System.out.println("Você errou!");
        }

        System.out.println("2 - Quantas vezes é recomendável para você doar sangue?");
        System.out.println("(A) Sempre que quiser");
        System.out.println("(B) Homens podem doar a cada 2 meses e mulheres a cada 3 meses");
        System.out.println("(C) Só pode doar sangue uma vez por mês");
        System.out.print("Sua reposta: "); 
        String quest2 = leia.next();
         
        switch(quest2) {
            case "B":
            System.out.println("Você acertou!");
            break;
            default:
            System.out.println("Você errou!");
            break;
        }
        System.out.println("3 - Quanto tempo pessoas com tatuagem ou maquiagem definitiva precisam esperar para doar sangue?");
        System.out.println("(A) Pessoas com tatuagem ou micropigmentação não podem doar sangue nunca");
        System.out.println("(B) Entre 6 a 12 meses depois de fazer a tatuagem ou a micropigmentação");
        System.out.println("(C) 5 anos depois de fazer a tatuagem ou micropigmentação");
        System.out.print("Sua resposta: ");
        String quest3 = leia.next();

        switch(quest3) {
            case "B":
            System.out.println("Você acertou!");
            break;
            default:
            System.out.println("Você errou!");
            break;
        }
        System.out.println("4 - Quem não pode doar sangue?");
        System.out.println("(A) Pessoas que tiveram hepatite após 11 anos de idade, pessoas com evidência clínica ou laboratorial de doenças infecciosas transmissíveis pelo sangue: hepatites B e C, AIDS (vírus HIV), doenças associadas aos vírus HTLV I e II e doença de Chagas e malária");
        System.out.println("(B) Usuários de drogas injetáveis");
        System.out.println("(C) Todas as respostas anteriores");
        System.out.print("Sua resposta: ");
        String quest4 = leia.next();

        switch(quest4) {
            case "C":
            System.out.println("Você acertou!");
            break;
            default:
            System.out.println("Você errou!");
            break;
        }
        System.out.println("5 - Onde doar sangue?");
        System.out.println("(A) Em postos de coleta e hemocentros");
        System.out.println("(B) Em qualquer clínica");
        System.out.println("(C) Pela internet");
        System.out.print("Sua respota: ");
        String quest5 = leia.next();

        switch(quest5) {
            case "A":
            System.out.println("Você acertou!");
            break;
            default:
            System.out.println("Você errou!");
            break;
        }
    
    } 
}