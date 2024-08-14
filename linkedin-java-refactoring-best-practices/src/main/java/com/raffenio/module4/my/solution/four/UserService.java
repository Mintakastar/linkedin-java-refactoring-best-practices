package com.raffenio.module4.my.solution.four;

public class UserService {
    IDataBase database;

    public UserService(IDataBase database) {
        this.database = database;
    }


    public void save() {
        User user = new User(1,"myUser","#$% #RTRD");
        database.saveUser(user);
    }

    public User getById(int id) {
        return database.getUserById(id);
    }

}
