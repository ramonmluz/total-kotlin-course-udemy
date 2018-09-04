/**
 * Classe carro que estende veiculo e tem passagem de parâmetros no construtor
 */

class Car: Vehicle {

    constructor(){
    }

    constructor(carName: String){
        this.carName = carName
    }

    constructor(carName: String, vinNumber: Int){
        Car(carName)
        this.vinNumber = vinNumber
    }


    var carName = "Toayta"
    var vinNumber = 11222

    fun showVinNumber(): Int {
        return vinNumber
    }
}