package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta


class FakeData {

    fun getLocalData() : Conta {
        val cliente = Cliente("Olá, Rafael")
        val cartao = Cartao("123456789012")
        return Conta("445655-4",
            "6552-4",
            "R$ 2450,80",
            "R$4120,00",
            cliente,
            cartao);
    }


}