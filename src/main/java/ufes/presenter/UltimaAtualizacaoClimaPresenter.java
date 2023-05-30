package ufes.presenter;

import ufes.model.DadoClima;
import java.time.LocalDate;
import java.util.ArrayList;
import ufes.view.EstacaoClimaticaView;

public class UltimaAtualizacaoClimaPresenter implements IPainel {

    private DadoClima resultadoUltimaAtualizacao;

    @Override
    public void atualizar(ArrayList<DadoClima> dadosClima, EstacaoClimaticaView estacaoClimaticaView) {
        DadoClima ultimoDado = dadosClima.get(dadosClima.size() - 1);
        if (ultimoDado.getData().isEqual(LocalDate.now())) {
//            System.out.println("Painel Clima - Data " + ultimoDado.getData()
//                    + ", Temperatura: " + ultimoDado.getTemperatura()
//                    + ", Umidade: " + ultimoDado.getUmidade()
//                    + ", Pressão: " + ultimoDado.getPressao());
        }
        //Atualiza a view com o novo dado
        estacaoClimaticaView.preencherDadosUltimaAtualizacao(String.valueOf(ultimoDado.getTemperatura()), String.valueOf(ultimoDado.getUmidade()), String.valueOf(ultimoDado.getPressao()), String.valueOf(ultimoDado.getData()));
    }
}
