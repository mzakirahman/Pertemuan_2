fun main() {
    //panggil tanpa argumen
    connectToDb()
    println()
//panggil dengan 2 argumen
    connectToDb("sql server", "zaki rahman")
}
fun connectToDb(hostname: String = "localhost",
                username: String = "mysql",
                password:String = "kosongkan saja") {
    println("hostname : $hostname")
    println("username : $username")
    println("password : $password")
}