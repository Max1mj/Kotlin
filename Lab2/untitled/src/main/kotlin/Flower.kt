
open class Flower(val Name: String, val Color: String){
    fun gotName(): String{
        return Name
    }
    fun gotColor(): String{
        return Color
    }
}

class Tulip(Name: String, Color: String ,val Size: Int) : Flower(Name, Color){
    fun gotSize() :Int{
        return Size
    }
}

class Rose(Name: String, Color: String, val GrowTime: Int): Flower(Name, Color){
    fun gotGrowTime(): Int{
        return GrowTime
    }
}

class Lily(Name: String, Color: String, val BurgeonCount: Int ) : Flower(Name, Color){
    fun gotBurgeonCount(): Int{
        return BurgeonCount
    }
}

fun main(){
    val tulip = Tulip("Tulip", "Yellow", 30)
    val rose = Rose("Rose", "Pink", 270)
    val lily = Lily("Lily", "White", 4)

    println("Tulip: ${tulip.gotName()}, Color: ${tulip.gotColor()} Size: ${tulip.gotSize()} cm")
    println("Rose: ${rose.gotName()}, Color: ${rose.gotColor()}, GrowTime: ${rose.gotGrowTime()} days")
    println("Lily: ${lily.gotName()}, Color: ${lily.gotColor()}, GrowTime: ${lily.gotBurgeonCount()} flowers")
}