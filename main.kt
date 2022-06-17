fun main(args: Array<String>) {
    val a = intArrayOf(1, 2, 3, 4)
    val b = balik(a)
    printGenap(b)
}
fun balik(a: IntArray): IntArray{
    var b = IntArray(a.size)
    for (i in a.indices){
            b[i] = a[a.size-1-i]
            }
    return b
}
fun printGenap(c: IntArray){
    for (i in c.indices){
        if (c[i]%2 == 0 ){
            print(c[i].toString()+",")
        }
    }
}
