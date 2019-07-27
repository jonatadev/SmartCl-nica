package org.uem.clinica.interfaces;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Scanner;
import org.uem.clinica.colaboradores.Gerente;
import org.uem.clinica.colaboradores.Secretaria;
import org.uem.clinica.modelos.DadosAdicionais;
import org.uem.clinica.modelos.Medico;
import org.uem.clinica.modelos.Paciente;
import org.uem.clinica.modelos.Prontuario;

public class InterfaceDadosAdicionais {
      private static Scanner io = new Scanner(in);
    private static Secretaria secretaria = new Secretaria();
    private static Gerente gerente = new Gerente();
    private static Medico medico = new Medico();
    private static Prontuario dadosAdicionais = new Prontuario();

    public static void cadastrarDadosAdicionais() {
        System.out.println("Digite as informações dos Dados Adicionais:");
        System.out.println("Sim ou Nao");
        DadosAdicionais novoDadosAdicionais = new DadosAdicionais();

        System.out.print("Fuma: ");
        novoDadosAdicionais.setFuma(io.nextLine());
        System.out.print("Bebe: ");
        novoDadosAdicionais.setBebe(io.nextLine());
        System.out.print("Colesterol: ");
        novoDadosAdicionais.setColesterol(io.nextLine());
        System.out.print("Diabete: ");
        novoDadosAdicionais.setDiabete(io.nextLine());
        System.out.print("Doenca Cardiaca: ");
        novoDadosAdicionais.setDoencaCardiaca(io.nextLine());
        System.out.print("Cirurgias: ");
        novoDadosAdicionais.setCirurgias(io.nextLine());
        System.out.print("Alergias: ");
        novoDadosAdicionais.setAlergias(io.nextLine());
        
        System.out.println("Escolha um Paciente a ser cadastrado:");
        InterfacePaciente.exibirPacientesCadastrados();
        System.out.print("Nome do Paciente: ");
        String nomePaciente = io.nextLine();
        novoDadosAdicionais.setPaciente(recuperarPaciente(nomePaciente, 
                secretaria.recuperarPaciente()));
        
        System.out.println("Escolha um Medico a ser cadastrado:");
        InterfaceGerente.exibirMedicosCadastrados();
        System.out.print("Nome do Medico: ");
        String nomeMedico = io.nextLine();
        novoDadosAdicionais.setMedico(recuperarMedico(nomeMedico, 
                gerente.atualizarMedico()));
        
        // chama o metodo cadastrarDadosAdicionais do paciente
        medico.cadastrarDadosAdicionais(novoDadosAdicionais);
    }
    
    public static void atualizarDadosAdicionais() {
          System.out.println("Todos os dados adicionais: ");
          exibirDadosAdicionaisCadastrados();
          
          System.out.print("Nome do Paciente o qual deseja alterar os Dados Adicionais: ");
          String nome = io.nextLine();
          int indice = pegarIndicePacienteDadosAdicionais(nome, medico.atualizarDadosAdicionais());
          
          System.out.println("Dados do prontuario o qual você deseja alterar: ");
          System.out.println("Não pode alterar o Paciente e o Medico: ");
          System.out.println("Somente os outros campos: ");
          visualizarUnicoDadosAdicionais(indice); 
          
          String sair = "";
          do {
          System.out.print("Qual campo você deseja alterar: (sair) para encerar: ");
          String opcao = io.nextLine().toLowerCase();
          
          switch(opcao) {
              case "fuma": 
                  System.out.print("Fuma: ");
                   medico.atualizarDadosAdicionais().get(indice).setFuma(io.nextLine());
                  break;
              case "bebe": 
                  System.out.print("Bebe: ");
                  medico.atualizarDadosAdicionais().get(indice).setBebe(io.nextLine());
                  break;
              case "colesterol": 
                  System.out.print("Colesterol: ");
                  medico.atualizarDadosAdicionais().get(indice).setColesterol(io.nextLine());
                  break;
              case "diabete": 
                  System.out.print("Diabete: ");
                  medico.atualizarDadosAdicionais().get(indice).setDiabete(io.nextLine());
              case "doenca cardiaca": 
                  System.out.print("Doenca cardiaca: ");
                  medico.atualizarDadosAdicionais().get(indice).setDoencaCardiaca(io.nextLine());
                  break;
              case "cirurgias": 
                  System.out.print("Cirurgias: ");
                  medico.atualizarDadosAdicionais().get(indice).setCirurgias(io.nextLine());
                  break;
              case "alergias": 
                  System.out.print("Alergias: ");
                  medico.atualizarDadosAdicionais().get(indice).setAlergias(io.nextLine());
                  break;
              case "sair":  
                  System.out.print("Dados atualizados. ");
                  sair = "sair";
                break;
           }
          }while (!sair.equalsIgnoreCase("sair"));   
      }
      
      // Remove um Dados Adicionais do ArrayList<DadosAdicionais>
      public static void removerDadosAdicionais() {
            System.out.println("===============================");
            System.out.println("Remover Dados Adicionais: ");
            exibirDadosAdicionaisCadastrados();
            System.out.print("Digite o nome do paciente para excluir os Dados Adicionais: ");
            String nomePaciente = io.nextLine();
            int indice = pegarIndicePacienteDadosAdicionais(nomePaciente, medico.atualizarDadosAdicionais());
            
            medico.removerDadosAdicionais(indice);
            exibirDadosAdicionaisCadastrados();
      }

      // Imprime todos os DadosAdicionais cadastrados no momento.
      public static void exibirDadosAdicionaisCadastrados() {
            System.out.println("===================================");
            System.out.println("Todas os Dados Adicionais cadastrados: ");
            for (int i = 0; i < medico.atualizarProntuario().size(); i++) {
                  System.out.println("Paciente: " + 
                          medico.atualizarDadosAdicionais().get(i).getPaciente().getNome() +
                          " Medico: " + medico.atualizarDadosAdicionais().get(i).getMedico().getNome() +  
                          " cirurgias: " + medico.atualizarDadosAdicionais().get(i).getCirurgias()
                  );
            }
      }
      
      // Retorna o indice do objeto paciente cadastrado no ArrayList<DadosAdicionais>
      public static int pegarIndicePacienteDadosAdicionais(String nome, ArrayList<DadosAdicionais> dadosAdicionais) {
            int indiceDadosAdicionais = 0;      
            for(int i = 0; i < dadosAdicionais.size(); i++) {
                  if(dadosAdicionais.get(i).getPaciente().getNome()
                          .equalsIgnoreCase(nome)) {
                        indiceDadosAdicionais = i;
                  }
            }
              return indiceDadosAdicionais;
      }
      
      // Lista os dados de um unico dadosAdicionais cadastrado
      public static void visualizarUnicoDadosAdicionais(int indice) {
          System.out.println("Fuma: " + medico.atualizarDadosAdicionais().get(indice).getFuma());
          System.out.println("Bebe: " + medico.atualizarDadosAdicionais().get(indice).getBebe());
          System.out.println("Colesterol: " + medico.atualizarDadosAdicionais().get(indice).getColesterol());
          System.out.println("Diabete: " + medico.atualizarDadosAdicionais().get(indice).getDiabete());
          System.out.println("Doenca Cardiaca: " + medico.atualizarDadosAdicionais().get(indice).getDoencaCardiaca());
          System.out.println("Cirurgias: " + medico.atualizarDadosAdicionais().get(indice).getCirurgias());
          System.out.println("Alergias: " + medico.atualizarDadosAdicionais().get(indice).getCirurgias());
          System.out.println("Paciente: " + medico.atualizarDadosAdicionais().get(indice).getPaciente().getNome());
          System.out.println("Medico: " + medico.atualizarDadosAdicionais().get(indice).getMedico().getNome());
      } 
      
      // pegar paciente para adicionar ao dadosAdicionais
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
      
      // pegar medico para adicionar aos dadosAdicionais
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
