class Club {

    companion object {
        var nbrMembers: Int = 0
    }

    var name: String

    var members:  MutableList<Person>

    constructor(name: String="") {

        this.name = name
        this.members = mutableListOf()



    }

    fun addMember(name: String, age: Int, gender:Char) {

        val person: Person = Person(name, age, gender)

        this.members.add(person)
        nbrMembers++

    }

    fun getMembers() {

        for(i in 0..members.size-1) {

            println(members.get(i).name+ "  " +members.get(i).age + "  " + members.get(i).gender)

        }

    }
}