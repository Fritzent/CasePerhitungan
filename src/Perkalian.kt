class Perkalian(var userInputX:Double, var userInputY:Double): JenisPerhitungan() {
    override fun perkalianFunction() {
        val x = userInputX
        val y = userInputY

        val prosesHitung = hitungPerkalian( x, y)

        println(" Hasil dari perkalian anda $prosesHitung")

    }

    private fun hitungPerkalian(userInputX: Double, userInputY: Double): Double {
        return (userInputX * userInputY)
    }
}