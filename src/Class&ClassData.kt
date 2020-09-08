fun main (){
    //Class
    var Stu = Students()
    Stu.StuInfo(90 , "Wafaa",10)

    //Data Class
    var Tea = Students.Teacher("Ali",1000.0)

}

class Students{
    var StuName = " "
    var StuId = 0
    var StuDegre = 0

    fun StuInfo (mark : Int , name :String , id : Int){
        StuDegre = mark
         StuName = name
         StuId = id

        println("The Degre is $StuDegre  && The name is $StuName  && The Id is $StuId")


    }


    data class Teacher (var TeaName:String, var TeaSalary:Double){
      init {
          println("Teacher name is $TeaName" + "     "     + "TeacherSalary is $TeaSalary")
      }

    }
}