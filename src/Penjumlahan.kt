class Penjumlahan(var userInputX:Int = 0, var userInputY:Int = 0): JenisPerhitungan() {
    override fun penjumlahanFunction() {
        val x = userInputX
        val y = userInputY

        val prosesHitung = hitungPenjumlahan( x, y)

        println(" Hasil dari penjumlahan anda $prosesHitung")

    }

    private fun hitungPenjumlahan(userInputX: Int, userInputY: Int): Int {
        return (userInputX + userInputY)
    }
//    private fun hitungPenjumlahan(userInputX: Double, userInputY: Double): Double{
//        return (userInputX + userInputY)
//    }

}