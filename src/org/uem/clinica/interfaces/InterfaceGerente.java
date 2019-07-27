package org.uem.clinica.interfaces;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Scanner;
import org.uem.clinica.colaboradores.Gerente;
import org.uem.clinica.modelos.Medico;

public class InterfaceGerente {
      private static Scanner io = new Scanner(in);
      private static Gerente gerente = new Gerente();

      public static void cadastrarMedico() {
            System.out.println("Digite as informações do Medico:");
            Medico novoMedico = new Medico();

            System.out.print("Nome: ");
            novoMedico.setNome(io.nextLine());
            System.out.print("Cpf: ");
            novoMedico.setCpf(io.nextLine());
            System.out.print("Crm (ex #455): ");
            novoMedico.setCrm(io.nextLine());
            System.out.print("Sexo: ");
            novoMedico.setSexo(io.nextLine());
            System.out.print("Especialidade: ");
            novoMedico.setEspecialidade(io.nextLine());

            // Chama o metodo cadastrarMedico da classe Gerente
            gerente.cadastrarMedico(novoMedico);
      }

      public static void atualizarMedico() {
            System.out.println("Todos os medicos cadastrados: ");
            exibirMedicosCadastrados();

            System.out.print("Nome do medico o qual deseja alterar: ");
            String nome = io.nextLine();
            int indice = pegarIndiceMedico(nome, gerente.atualizarMedico());

            System.out.println("Dados do medico o qual você deseja alterar: ");
            visualizarUnicoMedico(indice);

            String sair = "";
            do {
                  System.out.print("Qual campo você deseja alterar: (sair) para encerar: ");
                  String opcao = io.nextLine().toLowerCase();

                  switch (opcao) {
                        case "nome":
                              System.out.print("Nome: ");
                              gerente.atualizarMedico().get(indice).setNome(io.nextLine());
                              break;
                        case "cpf":
                              System.out.print("Cpf: ");
                              gerente.atualizarMedico().get(indice).setCpf(io.nextLine());
                              break;
                        case "crm":
                              System.out.print("Crm: ");
                              gerente.atualizarMedico().get(indice).setCrm(io.nextLine());
                              break;
                        case "sexo":
                              System.out.print("Sexo: ");
                              gerente.atualizarMedico().get(indice).setSexo(io.nextLine());
                              break;
                        case "especialidade":
                              System.out.print("Especialidade: ");
                              gerente.atualizarMedico().get(indice).setEspecialidade(io.nextLine());
                              break;
                        case "sair":
                              System.out.print("Dados atualizados. ");
                              sair = "sair";
                              break;
                  }
            } while (!sair.equalsIgnoreCase("sair"));
      }

      // Remove um medico do ArrayList<Paciente>
      public static void removerMedico() {
            System.out.println("===============================");
            System.out.println("Remover Medico: ");
            exibirMedicosCadastrados();
            System.out.print("Digite o nome do medico a ser excluido: ");
            String nomeMedico = io.nextLine();
            int indice = pegarIndiceMedico(nomeMedico, gerente.atualizarMedico());
            // Chama metodo removerMedico
            gerente.removerMedico(indice);
            // Lista novamente todos os pacientes cadastrados.
            //visualizarPacientesCadastrados();
      }

      // Imprime todos os medicos cadastrados no momento.
      public static void exibirMedicosCadastrados() {
            System.out.println("===================================");
            System.out.println("Todos os medicos cadastrados: ");
            for (int i = 0; i < gerente.atualizarMedico().size(); i++) {
                  System.out.println("Nome: "
                          + gerente.atualizarMedico().get(i).getNome()
                  + " -- Especialidade: " + gerente.atualizarMedico().get(i).getEspecialidade());
            }
      }

      // Retorna o indice do objeto medico cadastrado no ArrayList<Medico>
      public static int pegarIndiceMedico(String nome, ArrayList<Medico> medico) {
            int indiceMedico = 0;
            for (int i = 0; i < medico.size(); i++) {
                  if (medico.get(i).getNome()
                          .equalsIgnoreCase(nome)) {
                        indiceMedico = i;
                  }
            }
            return indiceMedico;
      }

      // Lista os dados de um único medico
      public static void visualizarUnicoMedico(int indice) {
            System.out.println("Nome: " + gerente.atualizarMedico().get(indice).getNome());
            System.out.println("Cpf: " + gerente.atualizarMedico().get(indice).getCpf());
            System.out.println("Crm: " + gerente.atualizarMedico().get(indice).getCrm());
            System.out.println("Sexo: " + gerente.atualizarMedico().get(indice).getSexo());
            System.out.println("Especialidade: " + gerente.atualizarMedico().get(indice).getEspecialidade());
      }
}
