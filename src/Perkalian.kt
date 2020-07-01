class Perkalian(var userInputX:Int = 0, var userInputY:Int = 0): JenisPerhitungan() {
    override fun perkalianFunction() {
        val x = userInputX
        val y = userInputY

        val prosesHitung = hitungPerkalian( x, y)

        println(" Hasil dari perkalian anda $prosesHitung")

    }

    private fun hitungPerkalian(userInputX: Int, userInputY: Int): Int {
        return (userInputX * userInputY)
    }
}