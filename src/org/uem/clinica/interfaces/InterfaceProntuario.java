package org.uem.clinica.interfaces;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Scanner;
import org.uem.clinica.colaboradores.Gerente;
import org.uem.clinica.colaboradores.Secretaria;
import org.uem.clinica.modelos.Medico;
import org.uem.clinica.modelos.Paciente;
import org.uem.clinica.modelos.Prontuario;

public class InterfaceProntuario {
    private static Scanner io = new Scanner(in);
    private static Secretaria secretaria = new Secretaria();
    private static Gerente gerente = new Gerente();
    private static Medico medico = new Medico();
    private static Prontuario prontuario = new Prontuario();

    public static void cadastrarProntuario() {
        System.out.println("Digite as informações do prontuario:");
        Prontuario novoProntuario = new Prontuario();

        System.out.print("Sintomas: ");
        novoProntuario.setSintomas(io.nextLine());
        System.out.print("Diagnostico da doenca: ");
        novoProntuario.setDiagnosticoDoenca(io.nextLine());
        System.out.print("Tratamento: ");
        novoProntuario.setTratamento(io.nextLine());
        
        System.out.println("Escolha um Paciente a ser cadastrado:");
        InterfacePaciente.exibirPacientesCadastrados();
        System.out.print("Nome do Paciente: ");
        String nomePaciente = io.nextLine();
        novoProntuario.setPaciente(recuperarPaciente(nomePaciente, 
                secretaria.recuperarPaciente()));
        
        System.out.println("Escolha um Medico a ser cadastrado:");
        InterfaceGerente.exibirMedicosCadastrados();
        System.out.print("Nome do Medico: ");
        String nomeMedico = io.nextLine();
        novoProntuario.setMedico(recuperarMedico(nomeMedico, 
                gerente.atualizarMedico()));
        
        // chama o metodo cadastrarProntuario do paciente
        medico.cadastrarProntuario(prontuario);
    }
    
    public static void atualizarProntuario() {
          System.out.println("Todos os prontuarios: ");
          exibirProntuariosCadastrados();
          
          System.out.print("Nome do Paciente o qual deseja alterar a consulta: ");
          String nome = io.nextLine();
          int indice = pegarIndicePacienteProntuario(nome, medico.atualizarProntuario());
          
          System.out.println("Dados do prontuario o qual você deseja alterar: ");
          System.out.println("Não pode alterar o Paciente e o Medico: ");
          System.out.println("Somente os outros campos: ");
          visualizarUnicoProntuario(indice); 
          
          String sair = "";
          do {
          System.out.print("Qual campo você deseja alterar: (sair) para encerar: ");
          String opcao = io.nextLine().toLowerCase();
          
          switch(opcao) {
              case "sintomas": 
                  System.out.print("Sintomas: ");
                   medico.atualizarProntuario().get(indice).setSintomas(io.nextLine());
                  break;
              case "diagnostico da doenca": 
                  System.out.print("Diagnostico da doenca: ");
                  medico.atualizarProntuario().get(indice).setDiagnosticoDoenca(io.nextLine());
                  break;
              case "tratamento": 
                  System.out.print("Tratamento: ");
                  medico.atualizarProntuario().get(indice).setTratamento(io.nextLine());
                  break;
              case "sair":  
                  System.out.print("Dados atualizados. ");
                  sair = "sair";
                break;
           }
          }while (!sair.equalsIgnoreCase("sair"));   
      }
      
      // Remove um prontuario do ArrayList<Prontuario>
      public static void removerProntuario() {
            System.out.println("===============================");
            System.out.println("Remover prontuario: ");
            exibirProntuariosCadastrados();
            System.out.print("Digite o nome do paciente para excluir o prontuario: ");
            String nomePaciente = io.nextLine();
            int indice = pegarIndicePacienteProntuario(nomePaciente, medico.atualizarProntuario());
            
            medico.removerProntuario(indice);
            exibirProntuariosCadastrados();
      }

      // Imprime todos os prontuarios cadastrados no momento.
      public static void exibirProntuariosCadastrados() {
            System.out.println("===================================");
            System.out.println("Todas as prontuarios cadastrados: ");
            for (int i = 0; i < medico.atualizarProntuario().size(); i++) {
                  System.out.println("Paciente: " + 
                          medico.atualizarProntuario().get(i).getPaciente().getNome() +
                          " Medico: " + medico.atualizarProntuario().get(i).getMedico().getNome() +  
                          " Sintomas: " + medico.atualizarProntuario().get(i).getSintomas()
                  );
            }
      }
      
      // Retorna o indice do objeto paciente cadastrado no ArrayList<Prontuario>
      public static int pegarIndicePacienteProntuario(String nome, ArrayList<Prontuario> prontuario) {
            int indiceProntuario = 0;      
            for(int i = 0; i < prontuario.size(); i++) {
                  if(prontuario.get(i).getPaciente().getNome()
                          .equalsIgnoreCase(nome)) {
                        indiceProntuario = i;
                  }
            }
              return indiceProntuario;
      }
      
      // Lista os dados de um unico prontuario cadastrado
      public static void visualizarUnicoProntuario(int indice) {
          System.out.println("Sintomas: " + medico.atualizarProntuario().get(indice).getSintomas());
          System.out.println("Diagnostico da doenca: " + medico.atualizarProntuario().get(indice).getDiagnosticoDoenca());
          System.out.println("Tratamento: " + medico.atualizarProntuario().get(indice).getTratamento());
          System.out.println("Paciente: " + medico.atualizarProntuario().get(indice).getPaciente().getNome());
          System.out.println("Medico: " + medico.atualizarProntuario().get(indice).getMedico().getNome());
      } 
      
      // pegar paciente para adicionar ao prontuario
      public static Paciente recuperarPaciente(String nome, ArrayList<Paciente> paciente) {
          Paciente novoPaciente = new Paciente();
            for(int i = 0; i < paciente.size(); i++) {
                  if(paciente.get(i).getNome()
                          .equalsIgnoreCase(nome)) {
                        novoPaciente.setTipoConvenio(paciente.get(i).getTipoConvenio());
                        novoPaciente.setNome(paciente.get(i).getNome());
                        novoPaciente.setCpf(paciente.get(i).getCpf());
                        novoPaciente.setRg(paciente.get(i).getRg());
                        novoPaciente.setSexo(paciente.get(i).getSexo());
                        novoPaciente.setEmail(paciente.get(i).getEmail());
                        novoPaciente.setTelefone(paciente.get(i).getTelefone());
                  }
            }
              return novoPaciente;
      }
      
      // pegar medico para adicionar ao prontuario
      public static Medico recuperarMedico(String nome, ArrayList<Medico> medico) {
          Medico novoMedico = new Medico();
            for(int i = 0; i < medico.size(); i++) {
                  if(medico.get(i).getNome()
                          .equalsIgnoreCase(nome)) {
                        novoMedico.setNome(medico.get(i).getNome());
                        novoMedico.setCpf(medico.get(i).getCpf());
                        novoMedico.setCrm(medico.get(i).getCrm());
                        novoMedico.setSexo(medico.get(i).getSexo());
                        novoMedico.setEspecialidade(medico.get(i).getEspecialidade());
                  }
            }
              return novoMedico;
      }
}
