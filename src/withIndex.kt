fun main()

{

    val names = listOf("Anne", "Peter", "Jeff")

    for ((index, value) in names.withIndex()) {

        println ("$index: $value");
    }

}