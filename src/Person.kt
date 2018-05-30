class Person {

    val MAXPEOPLE: Int = 3;

    companion object {
        var nbrPeople: Int = 0;
    }
    //internal var nbrPeople: Int = 0;

    var name: String

    var age: Int

    var gender: Char

    constructor(name: String = "", age: Int = 0, gender: Char = 'N')  {
        this.name = name
        this.age = age
        this.gender = gender
        nbrPeople++
    }
}