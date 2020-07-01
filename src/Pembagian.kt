class Pembagian(var userInputX:Int , var userInputY:Int ): JenisPerhitungan() {
    override fun pembagianFunction() {
        val x = userInputX
        val y = userInputY

        val prosesHitung = hitungPembagian( x, y)

        println(" Hasil dari pembagian anda $prosesHitung")

    }

    private fun hitungPembagian(userInputX: Int, userInputY: Int): Float {
        val changeUserInputX = userInputX.toFloat()
        val changeUserInputY = userInputY.toFloat()
        return (changeUserInputX / changeUserInputY)
    }
}