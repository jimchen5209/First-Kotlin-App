fun main(args: Array<String>) {
    val times = StringBuilder()
    for (index in 1..9) {
        for (index1 in 1..9 ) {
            val res = (index*index1).toString()
            times.append("$index1*$index=$res\t")
        }
        times.append("\n")
    }
    print(times.toString())
}
