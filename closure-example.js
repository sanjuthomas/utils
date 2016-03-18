function Employee(id, name){

    this.empId = id;
    this.empName = name;

    return{
        getId : function(){
            return empId;
        },
        getName : function(){
            return empName;
        },
        setName : function(nameArg){
          empName = nameArg;
        }

    }

}

var e = Employee(1, "e1");
console.log(e.getId());
console.log(e.getName());
e.setName("test");
console.log(e.getName())
