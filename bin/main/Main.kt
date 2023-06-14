fun main() {
    var isRegularCustomer = true
    var pay = 100
    var finalPay = pay - pay * 5 / 100
    if (isRegularCustomer) {
        finalPay -= if ((finalPay * 1 / 100)<=0) {1} else {finalPay * 1 / 100}
    }

    println("покупка на $pay рублей будет со скидной и обойдется Вам в $finalPay рублей")
}