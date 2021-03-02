package ru.netology

import org.junit.Assert.*
import org.junit.Test

class MainKtTest{
    @Test
    fun calculateMirResulr1(){//минимальный налог
        var previousAmount=1005
        var amount  =4500.00
        var expected=4465.0
        var check=result(
            "Мир",
            previousAmount,
            amount )
        //есть еще один метод, assertEquals(double expected, double actual, double delta)который допускает deltaпотерю точности.
        //дельта - максимальная разница между ожидаемым и фактическим значениями, при которой оба числа по-прежнему считаются равными.
        assertEquals(expected,check,0.0)
    }
    @Test
    fun calculateMirResulr(){
        var previousAmount=1005
        var amount  =100000.00
        var expected=99250.0
        var check=result(
            "Мир",
            previousAmount,
            amount )
        //есть еще один метод, assertEquals(double expected, double actual, double delta)который допускает deltaпотерю точности.
        //дельта - максимальная разница между ожидаемым и фактическим значениями, при которой оба числа по-прежнему считаются равными.
        assertEquals(expected,check,0.0)
    }
    @Test
    fun calculateVisaResulr1(){//минимальный налог
        var previousAmount=1005
        var amount  =4500.00
        var expected=4465.0
        var check=result(
            "Visa",
            previousAmount,
            amount )
        //есть еще один метод, assertEquals(double expected, double actual, double delta)который допускает deltaпотерю точности.
        //дельта - максимальная разница между ожидаемым и фактическим значениями, при которой оба числа по-прежнему считаются равными.
        assertEquals(expected,check,0.0)
    }
    @Test
    fun calculateVisaResulr(){
        var previousAmount=1005
        var amount  =100000.00
        var expected=99250.0
        var check=result(
            "Visa",
            previousAmount,
            amount )
        //есть еще один метод, assertEquals(double expected, double actual, double delta)который допускает deltaпотерю точности.
        //дельта - максимальная разница между ожидаемым и фактическим значениями, при которой оба числа по-прежнему считаются равными.
        assertEquals(expected,check,0.0)
    }
    @Test
    fun calculateMastercardResulr1(){//без налогов
        var previousAmount=1005
        var amount  =400.00
        var expected=400.0
        var check=result(
            "Mastercard",
            previousAmount,
            amount )
        //есть еще один метод, assertEquals(double expected, double actual, double delta)который допускает deltaпотерю точности.
        //дельта - максимальная разница между ожидаемым и фактическим значениями, при которой оба числа по-прежнему считаются равными.
        assertEquals(expected,check,0.0)
    }
    @Test
    fun calculateMastercardResulr(){//с налогом
        var previousAmount=1005
        var amount  =76000.00
        var expected=75524.0
        var check=result(
            "Mastercard",
            previousAmount,
            amount )
        //есть еще один метод, assertEquals(double expected, double actual, double delta)который допускает deltaпотерю точности.
        //дельта - максимальная разница между ожидаемым и фактическим значениями, при которой оба числа по-прежнему считаются равными.
        assertEquals(expected,check,0.0)
    }
    @Test
    fun calculateMaestroResulr(){//без налогов
        var previousAmount=1005
        var amount  =400.00
        var expected=400.0
        var check=result(
            "Maestro",
            previousAmount,
            amount )
        //есть еще один метод, assertEquals(double expected, double actual, double delta)который допускает deltaпотерю точности.
        //дельта - максимальная разница между ожидаемым и фактическим значениями, при которой оба числа по-прежнему считаются равными.
        assertEquals(expected,check,0.0)
    }
    @Test
    fun calculateMaestroResulr1(){//с налогом
        var previousAmount=1005
        var amount  =76000.00
        var expected=75524.0
        var check=result(
            "Maestro",
            previousAmount,
            amount )
        //есть еще один метод, assertEquals(double expected, double actual, double delta)который допускает deltaпотерю точности.
        //дельта - максимальная разница между ожидаемым и фактическим значениями, при которой оба числа по-прежнему считаются равными.
        assertEquals(expected,check,0.0)
    }
    @Test
    fun calculateVkPayResulr1(){//без налогов
        var previousAmount=1005
        var amount  =400.00
        var expected=400.00
        var check=result(
            "Vk Pay",
            previousAmount,
            amount )
        //есть еще один метод, assertEquals(double expected, double actual, double delta)который допускает deltaпотерю точности.
        //дельта - максимальная разница между ожидаемым и фактическим значениями, при которой оба числа по-прежнему считаются равными.
        assertEquals(expected,check,0.0)
    }
    @Test
    fun calculateVkPayResulr0(){//без налогов
        var previousAmount=1005
        var amount  =400.00
        var expected=390.00
        var check=result(
            previousAmount=
            previousAmount,
            amount = amount )
        //есть еще один метод, assertEquals(double expected, double actual, double delta)который допускает deltaпотерю точности.
        //дельта - максимальная разница между ожидаемым и фактическим значениями, при которой оба числа по-прежнему считаются равными.
        assertEquals(expected,check,0.0)
    }
}