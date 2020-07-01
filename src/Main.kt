import java.util.*

fun main() {
    print("Please input your Username: ")
    val checkUsername: String = readLine()!!

    if(checkUsername == "Andri" || checkUsername == "Fritzent") {
        println("====================================")
        println("========== Welcome $checkUsername ===========")
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
    menuCallculator.caseSelesai()
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
                println("=======================")
                menuCallculator.casePengurangan()
                println("=======================")

                val calc = JenisPerhitungan()
                val pengurangan = Pengurangan(userInputX = 0, userInputY= 0)

                print(" userInput X: ")
                pengurangan.userInputX = Scanner(System.`in`).nextInt()

                print(" userInput y: ")
                pengurangan.userInputY = Scanner(System.`in`).nextInt()


                calc.penguranganFunction()
                pengurangan.penguranganFunction()

                println("Kembali ke menu?? (Yes/No) ")
                val checkNextStudy: String = readLine()!!
                if (checkNextStudy == "Yes") {
                    return callMain()
                } else {
                    println(" Oke, Waktunya Istirahat!! ")
                }
            }
            "C" -> {
                println("=======================")
                menuCallculator.casePerkalian()
                println("=======================")

                val calc = JenisPerhitungan()
                val perkalian = Perkalian(userInputX = 0, userInputY= 0)

                print(" userInput X: ")
                perkalian.userInputX = Scanner(System.`in`).nextInt()

                print(" userInput y: ")
                perkalian.userInputY = Scanner(System.`in`).nextInt()


                calc.perkalianFunction()
                perkalian.perkalianFunction()

                println("Kembali ke menu?? (Yes/No) ")
                val checkNextStudy: String = readLine()!!
                if (checkNextStudy == "Yes") {
                    return callMain()
                } else {
                    println(" Oke, Waktunya Istirahat!! ")
                }
            }
            "D" -> {
                println("=======================")
                menuCallculator.casePembagian()
                println("=======================")

                val calc = JenisPerhitungan()
                val pembagian = Pembagian(userInputX = 0 , userInputY = 0)

                print(" userInput X: ")
                pembagian.userInputX = Scanner(System.`in`).nextInt()

                print(" userInput y: ")
                pembagian.userInputY = Scanner(System.`in`).nextInt()


                calc.pembagianFunction()
                pembagian.pembagianFunction()

                println("Kembali ke menu?? (Yes/No) ")
                val checkNextStudy: String = readLine()!!
                if (checkNextStudy == "Yes") {
                    return callMain()
                } else {
                    println(" Oke, Waktunya Istirahat!! ")
                }
            }
            "E" -> {
                println("======  =============================  ======")
                println("======  Calculator KotlinQue Shutdown  ======")
                println("======  =============================  ======")
            }
        }
    } catch(ex: InputMismatchException) {
        println(" Check note untuk cara memilih menu!")
        return callMain()
    }
}

