package koly.li.database.usage;

import koly.li.database.annotations.Constraints;
import koly.li.database.annotations.DBTable;
import koly.li.database.annotations.SQLInteger;
import koly.li.database.annotations.SQLString;

@DBTable(name = "MEMBER")
public class Member {
    @SQLString(30)
    String fristName;

    @SQLString(50)
    String lastName;

    @SQLInteger
    Integer age;

    @SQLString(value = 30, constraints = @Constraints(primaryKey = true))
    String handle;

    static int memberCount;
    public String getHandle(){
        return this.handle;
    }

    public String getFirstName(){
        return this.fristName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String toString(){
        return handle;
    }

    public Integer getAge(){
        return this.age;
    }
}
