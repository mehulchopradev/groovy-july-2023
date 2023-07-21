import com.globalpayex.college.domain.Author
import com.globalpayex.college.domain.Book
import com.globalpayex.college.domain.Contact

/* def a1 = new Author(name: 'mehul', ratings: 4, contact: new Contact(email: 'mehulc@hey.com', mobile: '987979709', country: 'IN'))
def a2 = new Author(name: 'jane', ratings: 3, contact: new Contact(email: 'jane@gmail.com', mobile: '978686796', country: 'USA'))
def b1 = new Book(title: 'Prog in C', price: 1000, pages: 560, authors: [a1, a2]) */

// build an object graph
def obj = new ObjectGraphBuilder(classNameResolver: 'com.globalpayex.college.domain')

def b1 = obj.book(title: 'Prog in C', price: 1000, pages: 560) {
    author(name: 'mehul', ratings: 4) {
        contact email: 'mehulc@hey.com', mobile: '987979709', country: 'IN'
    }
    author(name: 'jane', ratings: 3) {
        contact email: 'jane@gmail.com', mobile: '978686796', country: 'USA'
    }
}
println b1

