const val DISCOUNT = 100

fun main() {
    val regularCustomer: Boolean = true
    val previousBuyingSum = 9000
    val amount = 1000

    val result = regularCustomerDiscount(regularCustomer, calculateDiscount(previousBuyingSum, amount))

    println("Сумма в рублях, с учетом скидки: $result")
}

fun calculateDiscount(previousBuyingSum: Int, amount: Int): Int {
    if (previousBuyingSum > 10000) {
        return (amount - (amount * 0.05)).toInt()
    } else if (previousBuyingSum > 1000) {
        return amount - DISCOUNT
    } else {
        return amount
    }
}

fun regularCustomerDiscount(regularCustomer: Boolean, amount: Int): Int {
    return if (regularCustomer) (amount - (amount * 0.01)).toInt() else amount
}