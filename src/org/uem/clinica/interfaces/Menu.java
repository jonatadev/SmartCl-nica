/*
http://www.mballem.com/post/utilizando-swing-com-banco-de-dados/?i=1

*/
package org.uem.clinica.interfaces;

import java.util.Scanner;
import org.uem.clinica.relatorios.RelatoriosConsultas;
import org.uem.clinica.relatorios.RelatoriosMedicos;

public class Menu {

      private static Scanner io = new Scanner(System.in);

      public static void menuPrimario() {
            int opcaoMenuPrimario = 0;
            do {
                  System.out.println("==============================");
                  System.out.println("Menu Principal - Escolha uma opçao:");
                  System.out.println("1 - Secretaria");
                  System.out.println("2 - Gerente");
                  System.out.println("3 - Medico");
                  System.out.println("4 - Relatorios");
                  System.out.println("5 - Sair");
                  System.out.print("Opcao: ");
                  opcaoMenuPrimario = io.nextInt();
                  System.out.println("==============================");

                  switch (opcaoMenuPrimario) {
                        case 1:
                              menuSecretaria();
                              break;
                        case 2:
                              menuGerente();
                              break;
                        case 3:
                              menuMedico();
                              break;
                        case 4:
                              menuRelatorios();
                              break;
                  }
            } while (opcaoMenuPrimario != 5);
      }

      public static void menuSecretaria() {
            int opcaoSecretaria;
            do {
                  System.out.println("==============================");
                  System.out.println("Secretaria:");
                  System.out.println("1 - Cadastrar Paciente");
                  System.out.println("2 - Alterar Paciente");
                  System.out.println("3 - Remover Paciente");
                  System.out.println("4 - Cadastar Consulta");
                  System.out.println("5 - Alterar Consulta");
                  System.out.println("6 - Remover Consulta");
                  System.out.println("7 - Menu Principal");
                  System.out.print("Opcao: ");
                  opcaoSecretaria = io.nextInt();
                  System.out.println("==============================");

                  switch (opcaoSecretaria) {
                        case 1:
                              InterfacePaciente.cadastrarPaciente();
                              break;
                        case 2:
                              InterfacePaciente.atualizarPaciente();
                              break;
                        case 3:
                              InterfacePaciente.removerPaciente();
                              break;
                        case 4:
                              InterfaceConsulta.cadastrarConsulta();
                              break;
                        case 5:
                              InterfaceConsulta.atualizarConsulta();
                              break;
                        case 6:
                              InterfaceConsulta.removerConsulta();
                              break;
                  }
            } while (opcaoSecretaria != 7);
      }

      public static void menuGerente() {
            int opcaoGerente = 0;
            do {
                  System.out.println("==============================");
                  System.out.println("Gerente:");
                  System.out.println("1 - Cadastrar Medico");
                  System.out.println("2 - Alterar Medico");
                  System.out.println("3 - Remover Medico");
                  System.out.println("4 - Menu Principal");
                  System.out.print("Opcao: ");
                  opcaoGerente = io.nextInt();
                  System.out.println("==============================");
                  switch (opcaoGerente) {
                        case 1:
                              InterfaceGerente.cadastrarMedico();
                              break;
                        case 2:
                              InterfaceGerente.atualizarMedico();
                              break;
                        case 3:
                              InterfaceGerente.removerMedico();
                              break;
                  }
            } while (opcaoGerente != 4);
      }

      public static void menuMedico() {
            int opcaoMedico = 0;
            do {
                  System.out.println("==============================");
                  System.out.println("Medico:");
                  System.out.println("1 - Cadastrar Prontuario");
                  System.out.println("2 - Alterar Prontuario");
                  System.out.println("3 - Remover Prontuario");
                  System.out.println("4 - Cadastrar Dados Adicionais");
                  System.out.println("5 - Alterar Dados Adicionais");
                  System.out.println("6 - Remover Dados Adicionais");
                  System.out.println("7 - Menu Principal");
                  System.out.print("Opcao: ");
                  opcaoMedico = io.nextInt();
                  System.out.println("==============================");

                  switch (opcaoMedico) {
                        case 1:
                              InterfaceProntuario.cadastrarProntuario();
                              break;
                        case 2:
                              InterfaceProntuario.atualizarProntuario();
                              break;
                        case 3:
                              InterfaceProntuario.removerProntuario();
                              break;
                        case 4:
                              InterfaceDadosAdicionais.cadastrarDadosAdicionais();
                              break;
                        case 5:
                              InterfaceDadosAdicionais.atualizarDadosAdicionais();
                              break;
                        case 6:
                              InterfaceDadosAdicionais.removerDadosAdicionais();
                              break;
                  }
            } while (opcaoMedico != 7);
      }

      public static void menuRelatorios() {
            int opcaoRelatorio = 0;
            do {
                  System.out.println("==============================");
                  System.out.println("Relatorios:");
                  System.out.println("1 - Todas as Consultas cadastradas");
                  System.out.println("2 - Todos os Prontuarios dado por um medico");
                  System.out.println("3 - Todas as consultas efetuadas por um medico");
                  System.out.println("4 - Menu Principal");
                  System.out.print("Opcao: ");
                  opcaoRelatorio = io.nextInt();
                  System.out.println("==============================");
                  switch (opcaoRelatorio) {
                        case 1:
                              RelatoriosConsultas.todasAsConsultas();
                              break;
                        case 2:
                              RelatoriosMedicos.todosProntuariosPorMedico();
                              break;
                        case 3:
                              RelatoriosMedicos.todasConsultasPorMedico();
                  }

            } while (opcaoRelatorio != 4);
      }
}
