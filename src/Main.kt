 fun main(args: Array<String>) {

     val club = Club()

     var i: Int = 1

     while (i < args.size-1) {

         club.addMember(args.get(i), args.get(i+1).toInt(), args.get(i+2).get(0))

         i += 3
     }

     club.getMembers()

 }