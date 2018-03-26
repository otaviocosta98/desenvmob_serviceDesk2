package br.usjt.desenvmob.aula03.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by arqdsis on 21/03/2018.
 */

public class Data {

    public static ArrayList<Chamado> criarChamados(){
        ArrayList<Chamado> lista = new ArrayList<>();
        Chamado chamado = new Chamado();
        chamado.setNumero(1);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Computador da secretára quebrado");
        Fila fila = new Fila();
        fila.setId(FilaId.DESKTOPS.id());
        fila.setNome(FilaId.DESKTOPS.nome());
        fila.setFigura(FilaId.DESKTOPS.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        Chamado chamado2 = new Chamado();
        chamado2.setNumero(2);
        chamado2.setDataAbertura(new Date());
        chamado2.setDataFechamento(null);
        chamado2.setStatus(Chamado.ABERTO);
        chamado2.setDescricao("Telefone não funciona.");
        Fila fila2 = new Fila();
        fila2.setId(FilaId.TELEFONIA.id());
        fila2.setNome(FilaId.TELEFONIA.nome());
        fila2.setFigura(FilaId.TELEFONIA.figura());
        chamado2.setFila(fila2);
        lista.add(chamado2);

        Chamado chamado3 = new Chamado();
        chamado3.setNumero(3);
        chamado3.setDataAbertura(new Date());
        chamado3.setDataFechamento(null);
        chamado3.setStatus(Chamado.ABERTO);
        chamado3.setDescricao("Manutenção no proxy");
        Fila fila3 = new Fila();
        fila3.setId(FilaId.REDES.id());
        fila3.setNome(FilaId.REDES.nome());
        fila3.setFigura(FilaId.REDES.figura());
        chamado3.setFila(fila3);
        lista.add(chamado3);

        Chamado chamado4 = new Chamado();
        chamado4.setNumero(4);
        chamado4.setDataAbertura(new Date());
        chamado4.setDataFechamento(new Date());
        chamado4.setStatus(Chamado.FECHADO);
        chamado4.setDescricao("Lentidão generalizada.");
        Fila fila4 = new Fila();
        fila4.setId(FilaId.SERVIDORES.id());
        fila4.setNome(FilaId.SERVIDORES.nome());
        fila4.setFigura(FilaId.SERVIDORES.figura());
        chamado4.setFila(fila4);
        lista.add(chamado4);

        Chamado chamado5 = new Chamado();
        chamado5.setNumero(5);
        chamado5.setDataAbertura(new Date());
        chamado5.setDataFechamento(new Date());
        chamado5.setStatus(Chamado.FECHADO);
        chamado5.setDescricao("CRM");
        Fila fila5 = new Fila();
        fila5.setId(FilaId.PROJETO.id());
        fila5.setNome(FilaId.PROJETO.nome());
        fila5.setFigura(FilaId.PROJETO.figura());
        chamado5.setFila(fila5);
        lista.add(chamado5);

        Chamado chamado6 = new Chamado();
        chamado6.setNumero(6);
        chamado6.setDataAbertura(new Date());
        chamado6.setDataFechamento(new Date());
        chamado6.setStatus(Chamado.FECHADO);
        chamado6.setDescricao("atualizar versão.");
        Fila fila6 = new Fila();
        fila6.setId(FilaId.ERP.id());
        fila6.setNome(FilaId.ERP.nome());
        fila6.setFigura(FilaId.ERP.figura());
        chamado6.setFila(fila6);
        lista.add(chamado6);

        Chamado chamado7 = new Chamado();
        chamado7.setNumero(7);
        chamado7.setDataAbertura(new Date());
        chamado7.setDataFechamento(new Date());
        chamado7.setStatus(Chamado.FECHADO);
        chamado7.setDescricao("Rede MPLS");
        Fila fila7 = new Fila();
        fila7.setId(FilaId.PROJETO.id());
        fila7.setNome(FilaId.PROJETO.nome());
        fila7.setFigura(FilaId.PROJETO.figura());
        chamado7.setFila(fila7);
        lista.add(chamado7);

        Chamado chamado8 = new Chamado();
        chamado8.setNumero(8);
        chamado8.setDataAbertura(new Date());
        chamado8.setDataFechamento(new Date());
        chamado8.setStatus(Chamado.FECHADO);
        chamado8.setDescricao("incluir pipeline.");
        Fila fila8 = new Fila();
        fila8.setId(FilaId.VENDAS.id());
        fila8.setNome(FilaId.VENDAS.nome());
        fila8.setFigura(FilaId.VENDAS.figura());
        chamado8.setFila(fila8);
        lista.add(chamado8);

        Chamado chamado9 = new Chamado();
        chamado9.setNumero(9);
        chamado9.setDataAbertura(new Date());
        chamado9.setDataFechamento(new Date());
        chamado9.setStatus(Chamado.FECHADO);
        chamado9.setDescricao("erro contábil");
        Fila fila9 = new Fila();
        fila9.setId(FilaId.ERP.id());
        fila9.setNome(FilaId.ERP.nome());
        fila9.setFigura(FilaId.ERP.figura());
        chamado9.setFila(fila9);
        lista.add(chamado9);

        Chamado chamado10 = new Chamado();
        chamado10.setNumero(10);
        chamado10.setDataAbertura(new Date());
        chamado10.setDataFechamento(new Date());
        chamado10.setStatus(Chamado.FECHADO);
        chamado10.setDescricao("Gestão de Orçamento");
        Fila fila10 = new Fila();
        fila10.setId(FilaId.PROJETO.id());
        fila10.setNome(FilaId.PROJETO.nome());
        fila10.setFigura(FilaId.PROJETO.figura());
        chamado10.setFila(fila10);
        lista.add(chamado10);

        Chamado chamado11 = new Chamado();
        chamado11.setNumero(11);
        chamado11.setDataAbertura(new Date());
        chamado11.setDataFechamento(new Date());
        chamado11.setStatus(Chamado.FECHADO);
        chamado11.setDescricao("Big Data");
        Fila fila11 = new Fila();
        fila11.setId(FilaId.PROJETO.id());
        fila11.setNome(FilaId.PROJETO.nome());
        fila11.setFigura(FilaId.PROJETO.figura());
        chamado11.setFila(fila11);
        lista.add(chamado11);

        Chamado chamado12 = new Chamado();
        chamado12.setNumero(12);
        chamado12.setDataAbertura(new Date());
        chamado12.setDataFechamento(new Date());
        chamado12.setStatus(Chamado.FECHADO);
        chamado12.setDescricao("Internet com lentidão");
        Fila fila12 = new Fila();
        fila12.setId(FilaId.REDES.id());
        fila12.setNome(FilaId.REDES.nome());
        fila12.setFigura(FilaId.REDES.figura());
        chamado12.setFila(fila12);
        lista.add(chamado12);

        Chamado chamado13 = new Chamado();
        chamado13.setNumero(13);
        chamado13.setDataAbertura(new Date());
        chamado13.setDataFechamento(new Date());
        chamado13.setStatus(Chamado.FECHADO);
        chamado13.setDescricao("Chatbot");
        Fila fila13 = new Fila();
        fila13.setId(FilaId.PROJETO.id());
        fila13.setNome(FilaId.PROJETO.nome());
        fila13.setFigura(FilaId.PROJETO.figura());
        chamado13.setFila(fila13);
        lista.add(chamado13);

        Chamado chamado14 = new Chamado();
        chamado14.setNumero(14);
        chamado14.setDataAbertura(new Date());
        chamado14.setDataFechamento(new Date());
        chamado14.setStatus(Chamado.FECHADO);
        chamado14.setDescricao("troca de senha");
        Fila fila14 = new Fila();
        fila14.setId(FilaId.DESKTOPS.id());
        fila14.setNome(FilaId.DESKTOPS.nome());
        fila14.setFigura(FilaId.DESKTOPS.figura());
        chamado14.setFila(fila14);
        lista.add(chamado14);

        Chamado chamado15 = new Chamado();
        chamado15.setNumero(15);
        chamado15.setDataAbertura(new Date());
        chamado15.setDataFechamento(new Date());
        chamado15.setStatus(Chamado.FECHADO);
        chamado15.setDescricao("falha no Windows");
        Fila fila15 = new Fila();
        fila15.setId(FilaId.DESKTOPS.id());
        fila15.setNome(FilaId.DESKTOPS.nome());
        fila15.setFigura(FilaId.DESKTOPS.figura());
        chamado15.setFila(fila15);
        lista.add(chamado15);

        Chamado chamado16 = new Chamado();
        chamado16.setNumero(16);
        chamado16.setDataAbertura(new Date());
        chamado16.setDataFechamento(new Date());
        chamado16.setStatus(Chamado.FECHADO);
        chamado16.setDescricao("ITIL V3");
        Fila fila16 = new Fila();
        fila16.setId(FilaId.PROJETO.id());
        fila16.setNome(FilaId.PROJETO.nome());
        fila16.setFigura(FilaId.PROJETO.figura());
        chamado16.setFila(fila16);
        lista.add(chamado16);

        Chamado chamado17 = new Chamado();
        chamado17.setNumero(17);
        chamado17.setDataAbertura(new Date());
        chamado17.setDataFechamento(new Date());
        chamado17.setStatus(Chamado.FECHADO);
        chamado17.setDescricao("liberar celular");
        Fila fila17 = new Fila();
        fila17.setId(FilaId.TELEFONIA.id());
        fila17.setNome(FilaId.TELEFONIA.nome());
        fila17.setFigura(FilaId.TELEFONIA.figura());
        chamado17.setFila(fila17);
        lista.add(chamado17);

        Chamado chamado18 = new Chamado();
        chamado18.setNumero(18);
        chamado18.setDataAbertura(new Date());
        chamado18.setDataFechamento(new Date());
        chamado18.setStatus(Chamado.FECHADO);
        chamado18.setDescricao("mover ramal");
        Fila fila18 = new Fila();
        fila18.setId(FilaId.TELEFONIA.id());
        fila18.setNome(FilaId.TELEFONIA.nome());
        fila18.setFigura(FilaId.TELEFONIA.figura());
        chamado18.setFila(fila18);
        lista.add(chamado18);

        Chamado chamado19 = new Chamado();
        chamado19.setNumero(19);
        chamado19.setDataAbertura(new Date());
        chamado19.setDataFechamento(new Date());
        chamado19.setStatus(Chamado.FECHADO);
        chamado19.setDescricao("ponto com defeito");
        Fila fila19 = new Fila();
        fila19.setId(FilaId.REDES.id());
        fila19.setNome(FilaId.REDES.nome());
        fila19.setFigura(FilaId.REDES.figura());
        chamado19.setFila(fila19);
        lista.add(chamado19);

        Chamado chamado20 = new Chamado();
        chamado20.setNumero(20);
        chamado20.setDataAbertura(new Date());
        chamado20.setDataFechamento(new Date());
        chamado20.setStatus(Chamado.FECHADO);
        chamado20.setDescricao("ferramenta EMM");
        Fila fila20 = new Fila();
        fila20.setId(FilaId.PROJETO.id());
        fila20.setNome(FilaId.PROJETO.nome());
        fila20.setFigura(FilaId.PROJETO.figura());
        chamado20.setFila(fila20);
        lista.add(chamado20);

        return lista;
    }

    public static ArrayList<Chamado> buscarChamados(String chave){
        ArrayList<Chamado> lista = criarChamados();
        if(chave == null || chave.length() == 0){
            return lista;
        }
        ArrayList<Chamado> resultado = new ArrayList<>();
        for(Chamado chamado : lista){
            if(chamado.getFila().getNome().toUpperCase().contains(chave.toUpperCase())){
                resultado.add(chamado);
            }
        }
        return resultado;
    }
}
