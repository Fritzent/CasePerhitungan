class Penjumlahan(var userInputX:Double , var userInputY:Double ): JenisPerhitungan() {
    override fun penjumlahanFunction() {
        val x = userInputX
        val y = userInputY

        val prosesHitung = hitungPenjumlahan( x, y)

        println(" Hasil dari penjumlahan anda $prosesHitung")

    }

    private fun hitungPenjumlahan(userInputX: Double, userInputY: Double): Double {
        return (userInputX + userInputY)
    }
//    private fun hitungPenjumlahan(userInputX: Double, userInputY: Double): Double{
//        return (userInputX + userInputY)
//    }

}