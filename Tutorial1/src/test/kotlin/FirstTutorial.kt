fun main(args: Array<String>) {

//     Var  = Mutável - Pode mudar
//     Val  = Imutavel - Não pode mudar
//     solveOperationSimples()
//     readStringFromConsole()
//     workIntegerAndDecimal()
//     workCondicionalStatments()
//     workCondicionalStatmentsWithOr()
//     useWhen()
//     createList()
//     createListWithCount()
//     createListArrayList()
//     useWhile()
//     getFunctionsReturn()
//     testConstructors()
//     learnDataClass()
       learnCallback()
}

private fun learnCallback() {
    speakName(object : ExampleCallback {
        override fun speakName(name: String) {
            println("my name $name")
        }
    })
}

private fun speakName(callback: ExampleCallback) {
    callback.speakName("Liz")
    callback.speakName("Liz Alves")
    callback.speakName("Liz Porto")
}


private fun learnDataClass() {
    var person: PersonDataClass = PersonDataClass("Goku", 72, 31)

    println("Name " + person.name)
    println("Age " + person.age)
    println("Weight " + person.weight)
}

private fun testConstructors() {
    val toyota = Car()
    toyota.carName = "Ford"
    println("toyotaName: " + toyota.carName)
    println("Vin Namber " + toyota.vinNumber)

    val ford = Car("Ford")
    println("Ford Name: ${ford.carName}")
}

/**
 * Obtem as funções retorno
 */
private fun getFunctionsReturn() {
    displayGreenting()
    val name: String? = readLine()
    val userGreeting: String = displayName(name)
    println(userGreeting)

    val answer = doSimpleMathProblem(4, 5)
    println("Answer: $answer")
}

/**
 * Função de Retorna soma de dois números
 */
fun doSimpleMathProblem(num1: Int, num2: Int): Int {
    return num1 + num2
}

/**
 * Função retorna o nome informado como parâmetro
 */
fun displayName(name: String?): String {
    return "Your name is $name"
}

fun displayGreenting() {
    println("Hi, my name is Kotlin.")
    println("I'm a computer.")
    println("What's your name?")
}


/**
 * Laços de repetição com opção - While
 */
private fun useWhile() {
    val bestFriends = arrayListOf<String>("Ryan")
    var bestFriendInput: String = "Nothing"
    var deleteBestFriendInPut: String = "Nothing"
    var optionPecked: String = "1"

    while (optionPecked != "3") {
        bestFriendInput = "Nothing"

        println("1. Add Best Friend")
        println("2. Delete Best Friend")
        println("3. Exit")

        optionPecked = readLine()!!

        if (optionPecked == "1") {

            while (bestFriendInput != "") {

                println("Whats's your bestfriend?")
                bestFriendInput = readLine()!!
                bestFriends.add(bestFriendInput!!)
//                println(bestFriends.size)
            }
        } else if (optionPecked == "2") {
            print("What's index isn't your friend anymore ?: ")
            deleteBestFriendInPut = readLine()!!
            bestFriends.removeAt(deleteBestFriendInPut.toInt())
        }

        for (friend in bestFriends) {
            println(friend)
        }
    }
}

/**
 * Laços de repetição - ArrayList
 */
private fun createListArrayList() {
    val bestFriends = arrayListOf<String>("Ryan")
    println("Whats's your bestfriend?")
    val bestFriendInput = readLine()
    bestFriends.add(bestFriendInput!!)

    for (friend in bestFriends) {
        println(friend)
    }
}

private fun createListWithCount() {
    /**
     * Laços de repetição - Listas
     */
    val names = listOf<String>("Ted", "Billy", "Ryan")
    var numOfTimesLooped = 0
    for (name in names) {
        println("Hello, " + name)
        println("Hello, " + numOfTimesLooped)
        numOfTimesLooped += 1
    }
}

private fun createList() {
    /**
     * Criando listas
     */
    val names = listOf<String>("Ted", "Billy", "Ryan")
//      val names = listOf<String>()
    println("name: " + names.get(1))
    println("Is List Empty?: " + names.isEmpty())
}

/**
 * Fluxo usando o When. Similar ao Switch Case
 */
private fun useWhen() {
    print("What ice cream would you line? : ")
    val iceCream: String = readLine()!!

    when (iceCream) {
        "Vanilla", "Banana" -> println("That'll be $1.20!")
        "Chocolate", "Cherry" -> println("That'll be $2.00!")
    }
}

/**
 * Fluxo com condicionais e ou (||)
 */
private fun workCondicionalStatmentsWithOr() {
    print("What ice cream would you line? : ")
    val iceCream: String = readLine()!!

    if (iceCream == "Vanilla" || iceCream == "Banana") {
        println("That'll be $1.20!")
    } else if (iceCream == "Chocolate" || iceCream == "Strawberry") {
        println("Thar'll be $2.00!")
    } else if (iceCream == "Cherry") {
        println("Thar'll be $12.00!")
    }
}

/***
 * Fluxo e condicionais
 */
private fun workCondicionalStatments() {
    print("What's your level of pain betwen 1 and 3? ")
    val number: Int = readLine()!!.toInt()

    if (number == 1) {
        println("eh, you'll be okay")
    } else if (number == 2) {
        println("Are you ok ?")
    } else if (number == 3) {
        println("You're dieing!")
    } else {
        println("that's not between 1 an 3")
    }
}

/**
 * Trabalnahdo com Inteiros, decimais
 */
private fun workIntegerAndDecimal() {
    val decimalNumber: Double = 10.6
    val floatNumber: Float = 10.6f

    val answerDouble: Double = decimalNumber * 3
    val answerFloat: Float = floatNumber * 3

    println("Double  " + answerDouble)
    println("Float  " + answerFloat)
}

/**
 * Lendo string
 */
private fun readStringFromConsole() {
    print("What your name?: ")
    val name = readLine()
    println("Hello there " + name)
}

/**
 * Simples Cáculos
 */
private fun solveOperationSimples() {
    var question1 = 12 % 5
    question1 += 2
    val question2 = 10 * 5
    println(question1 + question2)
}