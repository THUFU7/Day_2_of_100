//create a for loop which goes through the names array and prints out the index and element
fun main(){
    var names = arrayOf("Thufu", "Chalo", "Jemo", "Mastima", "Monch")
    for (i in names.indices){
        println("Number $i is ${names[i]}")
    }
}