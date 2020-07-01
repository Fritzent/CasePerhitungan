class Pengurangan(var userInputX:Double, var userInputY:Double): JenisPerhitungan() {
    override fun penguranganFunction() {
        val x = userInputX
        val y = userInputY

        val prosesHitung = hitungPengurangan( x, y)

        println(" Hasil dari pengurangan anda $prosesHitung")

    }

    private fun hitungPengurangan(userInputX: Double, userInputY: Double): Double {
        return (userInputX - userInputY)
    }
}