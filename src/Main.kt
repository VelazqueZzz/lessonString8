//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val move = "D2-D4;0"
    val parts = move.split(";")
    val cells = parts[0].split("-")
    val from = cells[0]
    val to = cells[1]
    val moveNumber = parts[1]
    //вывод
    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $moveNumber")
}