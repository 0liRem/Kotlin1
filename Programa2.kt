fun main() {
    ValPal()
}

fun ValPal(){
    println("Bienvenido a palabra ingrese sus palabras si quiere salir ingrese 0")
    var palabra= readln()
    var arr = ArrayList<String>()
    while (palabra!=("0")){
        arr.add(palabra)
        println(palabra)
        println("Bienvenido a palabra ingrese sus palabras si quiere salir ingrese 0")
        palabra= readln()
    }
    var conta=0
    var conte=0
    var conti=0
    var conto=0
    var contu=0
    var cont=0
    for( i in arr){
        conta=0
        conte=0
        conti=0
        conto=0
        contu=0
        cont=0
        if(i==i.reversed()){
            println("La palabra:  ${(i.reversed())} es palindroma")
        }
            if (!i.startsWith('a') && !i.startsWith('e') &&!i.startsWith('i') &&!i.startsWith('o') &&!i.startsWith('u')){
                println("La palabra:  ${(i)} empieza con consonante o numero")

        }
        conta=i.filter{ it=='a'}.count()
        conte=i.filter{ it=='e'}.count()
        conti=i.filter{ it=='i'}.count()
        conto=i.filter{ it=='o'}.count()
        contu=i.filter{ it=='u'}.count()
        if (conta>0){
            cont+=1
        }
        if (conte>0){
            cont+=1
        }
        if (conti>0){
            cont+=1
        }
        if (conto>0){
            cont+=1
        }
        if (contu>0){
            cont+=1
        }
        if (cont>1){
            println("La palabra:  ${(i)} contiene 2 vocales distintas")
        }
    }
}
