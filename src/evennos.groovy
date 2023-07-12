def n = 67

// logic
// while loop
/* def i = 0
while (i <= n) {
    if (i % 2 == 0) {
        println i
    }
    i = i + 1
} */

// for loop
/* for (def i = 0; i <= n; i++) {
    if (i % 2 == 0) {
        println i
    }
} */

// Groovy for-loop
/*
for (def v in <<sequence of elements>>) {
    // I1
    // I2
}
 */
// 0..67
for (def v in 0..n) {
    if (v % 2 == 0) {
        println v
    }
}