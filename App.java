import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Agenda.Agendamento;
import Cadastro.Animais;
import Cadastro.Cachorro;
import Cadastro.Gato;
import Cadastro.OutrosAnimais;

public class App {
    public static void main(String[] args) {
        // armazenar os meus objetos
        Gato gatos[] = new Gato[10];
        Cachorro cachorros[] = new Cachorro[10];
        // ArrayList<OutrosAnimais> outros = new ArrayList<OutrosAnimais>();
        OutrosAnimais outroAnimais[] = new OutrosAnimais[10];
        Agendamento[] agendamentos = new Agendamento[100]; // vetor dos agendamentos
        // contador
        int contGatos = 0, contCachorros = 0, contOutros = 0, contAgenda = 0;
        // criar o cadastro
        JOptionPane.showMessageDialog(null, "Bem-Vindo ao Consultario do Dr. Frankstein");
        boolean aberto = true;
        // if(java.time.LocalDateTime.now()>8 && LocalDateTime.now(null)<18){
        // aberto=true;
        // }else{
        // aberto = false;
        // }
        while (aberto) {
            int acao = Integer.parseInt(JOptionPane
                    .showInputDialog("Vai fazer o que hoje?\n 1-Cadastrar PET\n 2-Agendar Consulta\n 3-Sair"));
            if (acao == 1) {
                int acao2 = Integer.parseInt(JOptionPane.showInputDialog("1-Gato\n 2-Cachorro\n 3-Outro"));
                // Cadastro do Gato
                if (acao2 == 1) {
                    // criar o obj
                    gatos[contGatos] = new Gato();
                    // preencher os atributos do obj
                    gatos[contGatos].setProprietario(JOptionPane.showInputDialog(null, "Informe o nome do dono: "));
                    gatos[contGatos].setPeso(Double.parseDouble(null));
                    // aumentar o contador +1
                    contGatos++;
                } else if (acao2 == 2) {
                    gatos[contCachorros].setProprietario(JOptionPane.showInputDialog(null, "Informe o nome do dono: "));
                    gatos[contCachorros].setPeso(Double.parseDouble(null));
                    contCachorros++;
                    // cadastro do Cachorro
                } else if (acao2 == 3) {
                    gatos[contOutros].setProprietario(JOptionPane.showInputDialog(null, "Informe o nome do dono: "));
                    gatos[contOutros].setPeso(Double.parseDouble(null));
                    contOutros++;
                    // cadastro do outro Pet(peixe)
                } else {
                    // mensagem de erro
                    JOptionPane.showMessageDialog(null, "Não é válido essa resposta");
                }
            } else if (acao == 2) {
                // agendamento
                // verificar se já existe o cadastro
                boolean cadastroOk = false;
                String proprietarioAgenda = JOptionPane.showInputDialog(null, "Informe o Nome do Dono do PET");
                //
                for (int i = 0; i < contGatos; i++) {
                    if (gatos[i].getProprietario().equals(proprietarioAgenda))
                        ;
                    {
                        JOptionPane.showMessageDialog(null, "Cadastro Encontrado");
                        cadastroOk = true;
                        break;
                    }
                }
                for (int i = 0; i < contCachorros; i++) {
                    if (cachorros[i].getProprietario().equals(proprietarioAgenda))
                        ;
                    {
                        JOptionPane.showMessageDialog(null, "Cadastro Encontrado");
                        cadastroOk = true;
                        break;
                    }
                }
                for (int i = 0; i < contOutros; i++) {
                    if (outroAnimais[i].getProprietario().equals(proprietarioAgenda))
                        ;
                    {
                        JOptionPane.showMessageDialog(null, "Cadastro Encontrado");
                        cadastroOk = true;
                        break;
                    }
                }
                // 1° verificação ok- cadastro realizado
                // 2° verificação
                boolean agendaOk = true;
                while (agendaOk) {
                    String dataAgenda = JOptionPane.showInputDialog(null, "Informe a data do Agendamento");
                    String horaAgenda = JOptionPane.showInputDialog(null, "Informe a hora do Agendamento");
                    for (int i = 0; i <= contAgenda; i++) {
                        if (agendamentos[i].getDataHora().equals(dataAgenda + horaAgenda)) {
                            JOptionPane.showMessageDialog(null, "Horario já Agendado, Escolha outro");
                        } else {
                            agendaOk = false;
                            JOptionPane.showMessageDialog(null, "Cadastro Realizado");
                            agendamentos[contAgenda]= new Agendamento();
                            agendamentos[contAgenda].setData(dataAgenda);
                            agendamentos[contAgenda].setHora(horaAgenda);
                    contAgenda++;
                        }
                        }
                    }
                }
            }
        }
    }
