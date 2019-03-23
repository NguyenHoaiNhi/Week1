/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main() {
    ConvertString(34)
}

fun ConvertString(iNum: Int)
{
    var checkDevided: Boolean = false
    if (iNum % 3 == 0) { 
        print("Pling")
        checkDevided = true
    }
    if (iNum % 5 == 0) 
    {
        print("Plang")
        checkDevided = true
    }
    if (iNum % 7 == 0) 
    {
        print("Plong")
        checkDevided = true
    }
    if (checkDevided == false) print(iNum)
}