package org.uem.clinica.interfaces;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Scanner;
import org.uem.clinica.modelos.Paciente;
import org.uem.clinica.colaboradores.Secretaria;

public class InterfacePaciente {
      private static Scanner io = new Scanner(in);
      private static Secretaria secretaria = new Secretaria();

      public static void cadastrarPaciente() {
            System.out.println("Digite as informações do paciente:");
            Paciente novoPaciente = new Paciente();

            System.out.print("Nome: ");
            novoPaciente.setNome(io.nextLine());
            System.out.print("Cpf: ");
            novoPaciente.setCpf(io.nextLine()); 
            System.out.print("Rg: ");
            novoPaciente.setRg(io.nextLine());
            System.out.print("Sexo: ");
            novoPaciente.setSexo(io.nextLine());
            System.out.print("Email: ");
            novoPaciente.setEmail(io.nextLine());
            System.out.print("Telefone: ");
            novoPaciente.setTelefone(io.nextLine());  

            // Chama o metodo cadastrarPaciente da classe Secretaria
            secretaria.cadastrarPaciente(novoPaciente);
      }
      
      public static void atualizarPaciente() {
          System.out.println("Todos os pacientes cadastrados: ");
          exibirPacientesCadastrados();
          
          System.out.print("Nome do Paciente o qual deseja alterar: ");
          String nome = io.nextLine();
          int indice = pegarIndicePaciente(nome, secretaria.recuperarPaciente());
          
          System.out.println("Dados do paciente o qual você deseja alterar: ");
          visualizarUnicoPaciente(indice); 
          
          String sair = "";
          do {
          System.out.print("Qual campo você deseja alterar: (sair) para encerar: ");
          String opcao = io.nextLine().toLowerCase();
          
          switch(opcao) {
              case "nome": 
                  System.out.print("Nome: ");
                   secretaria.recuperarPaciente().get(indice).setNome(io.nextLine());
                  break;
              case "cpf": 
                  System.out.print("Cpf: ");
                  secretaria.recuperarPaciente().get(indice).setCpf(io.nextLine());
                  break;
              case "rg": 
                  System.out.print("Rg: ");
                  secretaria.recuperarPaciente().get(indice).setRg(io.nextLine());
                  break;
              case "sexo": 
                  System.out.print("Sexo: ");
                  secretaria.recuperarPaciente().get(indice).setSexo(io.nextLine());
                  break;
              case "email": 
                  System.out.print("Email: ");
                  secretaria.recuperarPaciente().get(indice).setEmail(io.nextLine());
                  break;
              case "telefone": 
                  System.out.print("Telefone: ");
                  secretaria.recuperarPaciente().get(indice).setTelefone(io.nextLine());
                  break;
              case "sair":  
                  System.out.print("Dados atualizados. ");
                  sair = "sair";
                break;
           }
          }while (!sair.equalsIgnoreCase("sair"));   
      }
      
      // Remove um paciente do ArrayList<Paciente>
      public static void removerPaciente() {
            System.out.println("===============================");
            System.out.println("Remover Paciente: ");
            exibirPacientesCadastrados();
            System.out.print("Digite o nome do paciente a ser excluido: ");
            String nomePaciente = io.nextLine();
            int indice = pegarIndicePaciente(nomePaciente, secretaria.recuperarPaciente());
            // Chama metodo removerPaciente
            secretaria.removerPaciente(indice);
            // Lista novamente todos os pacientes cadastrados.
            //visualizarPacientesCadastrados();
      }

      // Imprime todos os pacientes cadastrados no momento.
      public static void exibirPacientesCadastrados() {
            System.out.println("===================================");
            System.out.println("Todos os pacientes cadastrados: ");
            for (int i = 0; i < secretaria.recuperarPaciente().size(); i++) {
                  System.out.println("Nome: " + 
                          secretaria.recuperarPaciente().get(i).getNome());
            }
      }
      
      // Retorna o indice do objeto paciente cadastrado no ArrayList<Paciente>
      public static int pegarIndicePaciente(String nome, ArrayList<Paciente> paciente) {
            int indicePaciente = 0;      
            for(int i = 0; i < paciente.size(); i++) {
                  if(paciente.get(i).getNome()
                          .equalsIgnoreCase(nome)) {
                        indicePaciente = i;
                  }
            }
              return indicePaciente;
      }
      // Lista os dados de um único paciente
      public static void visualizarUnicoPaciente(int indice) {
          System.out.println("Nome: " + secretaria.recuperarPaciente().get(indice).getNome());
          System.out.println("Cpf: " + secretaria.recuperarPaciente().get(indice).getCpf());
          System.out.println("Rg: " + secretaria.recuperarPaciente().get(indice).getRg());
          System.out.println("Sexo: " + secretaria.recuperarPaciente().get(indice).getSexo());
          System.out.println("Email: " + secretaria.recuperarPaciente().get(indice).getEmail());
          System.out.println("Telefone: " + secretaria.recuperarPaciente().get(indice).getTelefone());
      } 
}
