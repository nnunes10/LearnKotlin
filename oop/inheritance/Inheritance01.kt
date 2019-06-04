package oop.inheritance

import java.math.BigDecimal

/**
 * All classes in Kotlin have a common superclass Any
 *
 * Whereas Java’s classes and methods are open by default, Kotlin’s are final by default
 * If you want to allow the creation of subclasses of a class, you need to mark the class with the open modifier
 */


enum class CardType {
    VISA, MASTERCARD, AMEX
}
open class Payment(val amount: BigDecimal) // open means the class Payment can be inherited from

// CardPayment which extends from Payment
class CardPayment(amount: BigDecimal, val number: String, val type: CardType) : Payment(amount)

class ChequePayment : Payment {
    constructor(amount: BigDecimal, name: String, bankId: String) :
            super(amount) { // it has to call the parent one
        this.name = name
        this.bankId = bankId
    }
    var name: String
        get() = this.name
    var bankId: String
        get() = this.bankId
}