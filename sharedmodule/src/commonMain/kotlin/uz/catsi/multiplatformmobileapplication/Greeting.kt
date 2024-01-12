package uz.catsi.multiplatformmobileapplication

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "I am Muhammadali ,\nThis Kotlin Multiplatform Mobile\nHello, ${platform.name}!"
    }
}