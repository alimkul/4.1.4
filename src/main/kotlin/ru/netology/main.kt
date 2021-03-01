package ru.netology

fun result(typeCard: String="Vk Pay",
           previousAmount: Int,
           amount: Double):Double{
    var nalog=0.0
    when(typeCard){
        "Mastercard", "Maestro" -> if(! (amount >= 300 && amount <= 75000) ) {
            nalog=amount*0.6 /100 +20

        }
        "Visa" , "Мир" -> if( amount * 0.75/100 <=35 )
            nalog=35.0
        else nalog=amount * 0.75/100
        "Vk Pay" -> nalog=0.0
    }
    print ("Amount: "+(amount -nalog) + " налог "+nalog)
    return (amount-nalog)
}