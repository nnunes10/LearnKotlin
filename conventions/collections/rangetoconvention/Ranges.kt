package conventions.collections.rangetoconvention

import java.time.LocalDate

/**
 * To create a range, we use the .. syntax. The .. operator is actually a concise way to call the rangeTo function
 *
 * start..end => start.rangeTo(end)
 */

fun main() {
    val now = LocalDate.now()   // defined in Java 8
    val vacation = now..now.plusDays(10)    // it calls rangeTo function which is an extension fn on Comparable

    println(now.plusWeeks(1) in vacation)   // true
}

