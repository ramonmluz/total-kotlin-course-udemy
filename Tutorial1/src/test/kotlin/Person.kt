class Person() : PersonInterface {

    override fun talk() {
        println("Talking")
    }

    override fun walk() {
        println("Walking")
    }

    var name: String = ""
    var age: Int = 0
    var weight: Int = 0

}