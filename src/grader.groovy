/*
>= 70 - A
>= 60 - B
>= 40 - C
< 40 - F
> 100 or < 0 - I
 */

/* def calculateGrade(marks) {
    if (marks > 100 || marks < 0) {
        'I'
    } else if (marks >= 70) {
        'A'
    } else if (marks >= 60) {
        'B'
    } else if (marks >= 40) {
        'C'
    } else {
        'F'
    }
} */

def calculateGrade(marks) {
    switch (marks) {
        case 0..39: 'F'
            break
        case 40..59: 'C'
            break
        case 60..69: 'B'
            break
        case 70..100: 'A'
            break
        default: 'I'
    }
}

println calculateGrade(65)
