
function Employee(id, name){

    this.id = id;
    this.name = name;

    return {
        getId : function(){
            return id;
        },
        getName : function(){
            return name;
        },

    }
}

var e = new Employee(1, 'Employee-1');
console.log(e.getId())
console.log(e.getName())
