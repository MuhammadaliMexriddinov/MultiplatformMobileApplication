package uz.catsi.multiplatformmobileapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform