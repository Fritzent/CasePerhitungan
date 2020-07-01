class Pengurangan(var userInputX:Int = 0, var userInputY:Int = 0): JenisPerhitungan() {
    override fun penguranganFunction() {
        val x = userInputX
        val y = userInputY

        val prosesHitung = hitungPengurangan( x, y)

        println(" Hasil dari pengurangan anda $prosesHitung")

    }

    private fun hitungPengurangan(userInputX: Int, userInputY: Int): Int {
        return (userInputX - userInputY)
    }
}