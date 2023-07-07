
fun main() {
    val isRegularCustomer = true
    var pay = 900
    val finalPay = if (pay <= 1000) {
        if (isRegularCustomer) {
            if ((pay * 1 / 100) <= 0) {
                pay - 1
            } else {
                pay - pay * 1 / 100
            }
        } else {
            pay
        }
    } else if ((pay > 1000)&&(pay <= 10000)) {
        if (isRegularCustomer) {
            (pay - 100) * 1 / 100
        } else {
            pay -= 100
        }
    } else {
        if (isRegularCustomer) {
            pay - pay * 5 / 100 * 1 / 100
        } else {
            pay - pay * 5 / 100
        }
    }

    println("покупка на $pay рублей будет со скидной и обойдется Вам в $finalPay рублей")
}