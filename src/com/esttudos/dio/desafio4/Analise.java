package com.esttudos.dio.desafio4;

import java.util.Date;

public class Analise {

        Date data;
        String descricao;

        public Analise(Date data, String descricao) {
            this.data = data;
            this.descricao = descricao;
        }

        public Date getData() {
            return data;
        }

        public String getDescricao() {
            return descricao;
        }

}
