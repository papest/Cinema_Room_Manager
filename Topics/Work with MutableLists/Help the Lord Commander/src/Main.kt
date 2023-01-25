fun main() {  
    val beyondTheWall = readLine()!!.split(", ").map { it }.toMutableList()
    val backToTheWall = readLine()!!.split(", ").map { it }.toMutableList()   
    beyondTheWall.sort()
    backToTheWall.sort()
    println(beyondTheWall == backToTheWall)

}