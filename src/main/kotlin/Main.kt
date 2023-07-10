
fun main() {
    val isRegularCustomer = true
    var pay = 900
    val finalPay = if (pay <= 1000) {
        if (isRegularCustomer) {
            if ((pay * 1 / 100) <= 0) {
                pay - 1
            } else {
                (pay * 0.99).toInt()
            }
        } else {
            pay
        }
    } else if ((pay > 1000)&&(pay <= 10000)) {
        if (isRegularCustomer) {
            ((pay - 100) * 0.99).toInt()
        } else {
            pay -= 100
        }
    } else {
        if (isRegularCustomer) {
            (pay * 0.95 * 0.99).toInt()
        } else {
            (pay * 0.95).toInt()
        }
    }

    println("покупка на $pay рублей будет со скидной и обойдется Вам в $finalPay рублей")
}