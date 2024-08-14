package com.raffenio.module4.my.solution.four;

public class Database implements IDataBase{

    public void saveUser(User user) {
        // code to save user to database
    }

    public User getUserById(int id) {
        // code to get user by ID from database
        return new User(id);
    }

    // other methods for interacting with the database
}
