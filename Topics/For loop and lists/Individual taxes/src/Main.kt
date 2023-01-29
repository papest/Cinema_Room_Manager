fun main() {
    val numberOfCompanies = readln().toInt()
    val incomes = mutableListOf<Int>()
    val taxRates = mutableListOf<Int>()
    var tax: Int

    for (i in 0 until numberOfCompanies) {
        incomes.add(readln().toInt())
    }

    for (i in 0 until numberOfCompanies) {
        taxRates.add(readln().toInt())
    }

    var maxTaxes = 0
    var companyNumber = 1

    for (i in 1..numberOfCompanies) {
        tax = incomes[i - 1] * taxRates[i - 1]

        if (tax > maxTaxes) {
            maxTaxes = tax
            companyNumber = i
        }
    }

    println(companyNumber)
}