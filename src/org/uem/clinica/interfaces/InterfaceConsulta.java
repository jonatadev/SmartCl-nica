package org.uem.clinica.interfaces;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Scanner;
import org.uem.clinica.colaboradores.Gerente;
import org.uem.clinica.colaboradores.Secretaria;
import org.uem.clinica.modelos.Consulta;
import org.uem.clinica.modelos.Medico;
import org.uem.clinica.modelos.Paciente;

public class InterfaceConsulta {
    private static Scanner io = new Scanner(in);
    private static Secretaria secretaria = new Secretaria();
    private static Gerente gerente = new Gerente();

    public static void cadastrarConsulta() {
        System.out.println("Digite as informações da Consulta:");
        Consulta novaConsulta = new Consulta();

        System.out.print("Data Consulta: ");
        novaConsulta.setData(io.nextLine());
        System.out.print("Horario: ");
        novaConsulta.setHorario(io.nextLine());
        System.out.print("Tipo(Normal/Retorno): ");
        novaConsulta.setTipo(io.nextLine());
        
        System.out.println("Escolha um Paciente a ser cadastrado:");
        InterfacePaciente.exibirPacientesCadastrados();
        System.out.print("Nome do Paciente: ");
        String nomePaciente = io.nextLine();
        novaConsulta.setPaciente(recuperarPaciente(nomePaciente, 
                secretaria.recuperarPaciente()));
        
        System.out.println("Escolha um Medico a ser cadastrado:");
        InterfaceGerente.exibirMedicosCadastrados();
        System.out.print("Nome do Medico: ");
        String nomeMedico = io.nextLine();
        novaConsulta.setMedico(recuperarMedico(nomeMedico, 
                gerente.atualizarMedico()));
        
        // chama o metodo cadastrarConsulta da secretaria
        secretaria.cadastrarConsulta(novaConsulta);
    }
    
    public static void atualizarConsulta() {
          System.out.println("Todos as Consultas Cadastradas: ");
          exibirConsultasCadastradas();
          
          System.out.print("Nome do Paciente o qual deseja alterar a consulta: ");
          String nome = io.nextLine();
          int indice = pegarIndicePacienteConsulta(nome, secretaria.atualizarConsulta());
          
          System.out.println("Dados da Consulta o qual você deseja alterar: ");
          System.out.println("Não pode alterar o Paciente e o Medico: ");
          System.out.println("Somente os outros campos: ");
          visualizarUnicaConsulta(indice); 
          
          String sair = "";
          do {
          System.out.print("Qual campo você deseja alterar: (sair) para encerar: ");
          String opcao = io.nextLine().toLowerCase();
          
          switch(opcao) {
              case "data consulta": 
                  System.out.print("Data consulta: ");
                   secretaria.atualizarConsulta().get(indice).setData(io.nextLine());
                  break;
              case "horario": 
                  System.out.print("Horario: ");
                  secretaria.atualizarConsulta().get(indice).setHorario(io.nextLine());
                  break;
              case "tipo": 
                  System.out.print("Tipo(Normal/Retorno): ");
                  secretaria.atualizarConsulta().get(indice).setTipo(io.nextLine());
                  break;
              case "sair":  
                  System.out.print("Dados atualizados. ");
                  sair = "sair";
                break;
           }
          }while (!sair.equalsIgnoreCase("sair"));   
      }
      
      // Remove uma consulta do ArrayList<Consulta>
      public static void removerConsulta() {
            System.out.println("===============================");
            System.out.println("Remover Consulta: ");
            exibirConsultasCadastradas();
            System.out.print("Digite o nome do paciente para excluir sua consulta: ");
            String nomePaciente = io.nextLine();
            int indice = pegarIndicePacienteConsulta(nomePaciente, secretaria.atualizarConsulta());
            
            secretaria.removerConsulta(indice);
            exibirConsultasCadastradas();
      }

      // Imprime todos os pacientes cadastrados no momento.
      public static void exibirConsultasCadastradas() {
            System.out.println("===================================");
            System.out.println("Todas as consultas cadastradas: ");
            for (int i = 0; i < secretaria.atualizarConsulta().size(); i++) {
                  System.out.println("Data: " + 
                          secretaria.atualizarConsulta().get(i).getData() +
                          " Paciente: " + secretaria.atualizarConsulta().get(i).getPaciente().getNome() +  
                          " Medico(a): " + secretaria.atualizarConsulta().get(i).getMedico().getNome()  
                  );
            }
      }
      
      // Retorna o indice do objeto paciente cadastrado no ArrayList<Paciente>
      public static int pegarIndicePacienteConsulta(String nome, ArrayList<Consulta> consulta) {
            int indiceConsulta = 0;      
            for(int i = 0; i < consulta.size(); i++) {
                  if(consulta.get(i).getPaciente().getNome()
                          .equalsIgnoreCase(nome)) {
                        indiceConsulta = i;
                  }
            }
              return indiceConsulta;
      }
      
      // Lista os dados de um unica consulta cadastrada
      public static void visualizarUnicaConsulta(int indice) {
          System.out.println("Data: " + secretaria.atualizarConsulta().get(indice).getData());
          System.out.println("Horario: " + secretaria.atualizarConsulta().get(indice).getHorario());
          System.out.println("Tipo(Normal/Retorno): " + secretaria.atualizarConsulta().get(indice).getTipo());
          System.out.println("Paciente: " + secretaria.atualizarConsulta().get(indice).getPaciente().getNome());
          System.out.println("Medico: " + secretaria.atualizarConsulta().get(indice).getMedico().getNome());
      } 
      
      // pegar paciente para adicionar consulta
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
      
      // pegar medico para adicionar consulta
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
