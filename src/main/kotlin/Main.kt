fun main() {
    var isRegularCustomer = true
    var pay = 100
    var finalPay =
        if (isRegularCustomer) {
            if (((pay - pay * 5 / 100) * 1 / 100) <= 0) {
                (pay - pay * 5 / 100) - 1
            } else {
                (pay - pay * 5 / 100) * 1 / 100
            }
        } else {
            pay - pay * 5 / 100
        }

    println("покупка на $pay рублей будет со скидной и обойдется Вам в $finalPay рублей")
}