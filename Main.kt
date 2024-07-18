fun main() {
    DecToBinary(30)
}

fun DecToBinary(Numero:Int){
    var Numero=Numero
    println("El numero ingresado es: ${Numero.toString()}")
    var binary:String=""
    while (Numero>=1){
        binary += (Numero % 2).toString()
        Numero/=2
    }

    println("El numero binario es:  ${(binary.reversed())}")
}
