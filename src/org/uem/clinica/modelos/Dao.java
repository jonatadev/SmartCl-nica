package org.uem.clinica.modelos;

import java.util.ArrayList;

public class Dao {
      // Essa classe simula um banco de dados e suas tabelas.
      private static ArrayList<Paciente> dbPaciente = new ArrayList();
      private static ArrayList<Medico> dbMedico = new ArrayList();
      
      private static ArrayList<Consulta> dbConsulta = new ArrayList();
      private static ArrayList<DadosAdicionais> dbDadosAdicionais = new ArrayList();
      private static ArrayList<Prontuario> dbProntuario = new ArrayList();
      
      // Adiciona Paciente ao ArrayList<Paciente>
      public static void adicionarPaciente(Paciente paciente) {
            dbPaciente.add(paciente);
      }
      
      // Retorna o ArrayList de Pacientes
      public static ArrayList<Paciente> pesquisarDbPaciente() {
            return dbPaciente;
      }
      // Adiciona Medico ao ArrayList<Paciente>
      public static void adicionarMedico(Medico medico) {
            dbMedico.add(medico);
      }
      
      // Retorna o ArrayList de Medicos
      public static ArrayList<Medico> pesquisarDbMedicos() {
            return dbMedico;
      }
      
      // Adiciona Consulta ao ArrayList<Consulta>
      public static void adicionarConsulta(Consulta consulta) {
            dbConsulta.add(consulta);
      }
      
      // Retorna o ArrayList de Consultas
      public static ArrayList<Consulta> pesquisarDbConsulta(){
            return dbConsulta;
      }
      
      // Adiciona DadosAdicionais ao ArrayList<DadosAdicionais>
      public static void adicionarDadosAdicionais(DadosAdicionais dadosAdicionais) {
            dbDadosAdicionais.add(dadosAdicionais);
      }
      
       // Retorna o ArrayList de DadosAdicionais
      public static ArrayList<DadosAdicionais> pesquisarDbDadosAdicionais(){
            return dbDadosAdicionais;
      }
      
      // Adiciona Prontuario ao ArrayList<Prontuario>
      public static void adicionarProntuario(Prontuario prontuario) {
            dbProntuario.add(prontuario);
      }
      
       // Retorna o ArrayList de Prontuario
      public static ArrayList<Prontuario> pesquisarDbProntuario(){
            return dbProntuario;
      }
}
