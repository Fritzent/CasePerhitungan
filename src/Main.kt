import com.sun.tools.javac.Main
import java.util.*

fun main() {
    print("Please input your Username: ")
    val checkUsername: String = readLine()!!

    if(checkUsername == "Andri" || checkUsername == "Fritzent") {
        println("====================================")
        println("========== Welcome ${checkUsername} ===========")
        println("======  Calculator KotlinQue  ======")
        println("====================================")

        callMain()

    }else {
        println("Please input a valid username!")
        return main()
    }
}

fun callMain(){
    val menuCallculator = Menu ()

    println(" ")
    println("===========================")
    println("== LIST MENU CALCULATOR  ==")
    println("===========================")
    menuCallculator.casePenjumlahan()
    menuCallculator.casePengurangan()
    menuCallculator.casePerkalian()
    menuCallculator.casePembagian()
    println("===========================")
    println("===========================")

    val checkMenuSelected = Scanner (System.`in`)
    println(" Note: Gunakan A,B,C,D untuk memilih menu")
    print(" Menu Pilihan Anda: ")

    try {
        when (checkMenuSelected.next()){
            "A" -> {
                println("=======================")
                menuCallculator.casePenjumlahan()
                println("=======================")

                val calc = JenisPerhitungan()
                val penjumlahan = Penjumlahan(userInputX = 0, userInputY= 0)

                print(" userInput X: ")
                penjumlahan.userInputX = Scanner(System.`in`).nextInt()

                print(" userInput y: ")
                penjumlahan.userInputY = Scanner(System.`in`).nextInt()


                calc.penjumlahanFunction()
                penjumlahan.penjumlahanFunction()

                println("Kembali ke menu?? (Yes/No) ")
                val checkNextStudy: String = readLine()!!
                if (checkNextStudy == "Yes") {
                    return callMain()
                } else {
                    println(" Oke, Waktunya Istirahat!! ")
                }
            }
            "B" -> {

            }
            "C" -> {

            }
            "D" -> {

            }
        }
    } catch(ex: InputMismatchException) {
        println(" Check note untuk cara memilih menu!")
        return callMain()
    }
}

