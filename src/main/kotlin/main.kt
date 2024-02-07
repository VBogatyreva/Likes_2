fun main () {

    val likes = 100

    var format = " людям"

    if (likes % 10 == 1 && likes != 11) {
        format = " человеку"
    }

    println ("Понравилось " + likes + format + ".")

}