
package Database;

import Main.Utility;
import Main.User;
import java.sql.*;
import java.util.ArrayList;

public class DB {

    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String DATABASE_URL = "jdbc:mysql://localhost:3306/";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "1234";
    public static String DATABASE_NAME = "poofs";
    private static Connection c;
    private static Statement s;

    public static void create(String table) {

        c = null;
        s = null;

        try {
            c = getConnection();
            s = c.createStatement();
            s.executeUpdate("CREATE DATABASE IF NOT EXISTS " + DATABASE_NAME);
            String st = "CREATE TABLE IF NOT EXISTS " + DATABASE_NAME + "." + table + "(time DOUBLE NOT NULL AUTO_INCREMENT, day DOUBLE NOT NULL, month DOUBLE NOT NULL, distance DOUBLE NOT NULL, lane DOUBLE NOT NULL, volume_cars DOUBLE NOT NULL, volume_commuters DOUBLE NOT NULL, PRIMARY KEY (time, day, month)) ENGINE = InnoDB;";
            s.executeUpdate(st);
            /*
             * CREATE  TABLE IF NOT EXISTS `poofs`.`user` (
                    `user_id` INT NOT NULL ,
                    `first_name` VARCHAR(45) NOT NULL ,
                    `middle_name` VARCHAR(45) NULL ,
                    `last_name` VARCHAR(45) NOT NULL ,
                    `user_type_id` INT NOT NULL ,
                    `email` VARCHAR(45) NOT NULL ,
                    PRIMARY KEY (`user_id`) ,
                    UNIQUE INDEX `user_id_UNIQUE` (`user_id` ASC) ,
                    UNIQUE INDEX `email_UNIQUE` (`email` ASC) );
                ALTER TABLE `poofs`.`user` ADD COLUMN `contact_no` VARCHAR(45) NULL  AFTER `email` ;
                     
                INSERT INTO `poofs`.`user` (`user_id`, `first_name`, `middle_name`, `last_name`, `user_type_id`, `email`, `contact_no`, `year_started`) VALUES ('1', 'Grant', 'Caballero', 'Bacaltos', '3', 'grantbacs@gmail.com', '09326592012', '2002');
                     
                CREATE  TABLE `poofs`.`pending` (
                `user_id` INT NOT NULL ,
                PRIMARY KEY (`user_id`) ,
                INDEX `FK_pending_user_id_idx` (`user_id` ASC) ,
                CONSTRAINT `FK_pending_user_id`
                  FOREIGN KEY (`user_id` )
                  REFERENCES `poofs`.`user` (`user_id` )
                  ON DELETE NO ACTION
                  ON UPDATE NO ACTION);


                CREATE  TABLE `poofs`.`credentials` (
                    `user_id` INT NOT NULL ,
                    `username` VARCHAR(45) NOT NULL ,
                    `password` VARCHAR(45) NOT NULL ,
                    PRIMARY KEY (`user_id`) ,
                    UNIQUE INDEX `username_UNIQUE` (`username` ASC) );
                ALTER TABLE `poofs`.`credentials` 
                    ADD CONSTRAINT `FK_credentials_user_id`
                    FOREIGN KEY (`user_id` )
                    REFERENCES `poofs`.`user` (`user_id` )
                    ON DELETE NO ACTION
                    ON UPDATE NO ACTION
                  , ADD INDEX `FK_credentials_user_id_idx` (`user_id` ASC) ; 
                    
                CREATE  TABLE `poofs`.`user_type` (
                    `user_type_id` INT NOT NULL ,
                    `user_type_name` VARCHAR(45) NOT NULL ,
                    PRIMARY KEY (`user_type_id`) ,
                    UNIQUE INDEX `user_type_name_UNIQUE` (`user_type_name` ASC) );
                  
                INSERT INTO `poofs`.`user_type` (`user_type_id`, `user_type_name`) VALUES ('1', 'Teacher');
                INSERT INTO `poofs`.`user_type` (`user_type_id`, `user_type_name`) VALUES ('2', 'Staff');
                INSERT INTO `poofs`.`user_type` (`user_type_id`, `user_type_name`) VALUES ('3', 'Administrator');   
                INSERT INTO `poofs`.`user_type` (`user_type_id`, `user_type_name`) VALUES ('4', 'Chairperson');
                
                ALTER TABLE `poofs`.`user` 
                    ADD CONSTRAINT `FK_user_type_id`
                    FOREIGN KEY (`user_type_id` )
                    REFERENCES `poofs`.`user_type` (`user_type_id` )
                    ON DELETE NO ACTION
                    ON UPDATE NO ACTION
                  , ADD INDEX `FK_user_type_id_idx` (`user_type_id` ASC) ;

                CREATE  TABLE `poofs`.`course` (
                    `course_no` INT NOT NULL ,
                    `course_name` VARCHAR(45) NOT NULL ,
                    PRIMARY KEY (`course_Id`) ,
                    UNIQUE INDEX `course_Id_UNIQUE` (`course_Id` ASC) );
                     
                ALTER TABLE `poofs`.`course` ADD COLUMN `year_level` INT NOT NULL  AFTER `course_name` , ADD COLUMN `semester` VARCHAR(45) NOT NULL  AFTER `year_level` ;

                CREATE  TABLE `poofs`.`course_offering` (
                  `offer_code` INT NOT NULL ,
                  `course_no` INT NOT NULL ,
                  `user_id` INT NOT NULL ,
                  `time` TIME NOT NULL ,
                  PRIMARY KEY (`offer_code`) ,
                  UNIQUE INDEX `offer_code_UNIQUE` (`offer_code` ASC) ,
                  INDEX `FK_offering_course_no_idx` (`course_no` ASC) ,
                  INDEX `FK_offering_user_id_idx` (`user_id` ASC) ,
                  CONSTRAINT `FK_offering_course_no`
                    FOREIGN KEY (`course_no` )
                    REFERENCES `poofs`.`course` (`course_no` )
                    ON DELETE NO ACTION
                    ON UPDATE NO ACTION,
                  CONSTRAINT `FK_offering_user_id`
                    FOREIGN KEY (`user_id` )
                    REFERENCES `poofs`.`user` (`user_id` )
                    ON DELETE NO ACTION
                    ON UPDATE NO ACTION);
             */

        } catch (Exception e) {
        } finally {
            try {
                c.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    //String s = "CREATE TABLE IF NOT EXISTS " + DATABASE_NAME + "." + TABLE_NAME + "(number INTEGER, name VARCHAR(100) NOT NULL, PRIMARY KEY (number)) ENGINE = InnoDB;";
    //String s = "CREATE TABLE IF NOT EXISTS " + DATABASE_NAME + "." + TABLE_NAME + "(name VARCHAR(100) NOT NULL, location INTEGER, destination INTEGER, PRIMARY KEY (name)) ENGINE = InnoDB;";

    //DB Accessors
    public static Connection getConnection() throws Exception {
        Connection c;
        Class.forName(DRIVER).newInstance();
        c = DriverManager.getConnection(DATABASE_URL, USERNAME, "");
        return c;
    }
        
    public static ResultSet executeQuery(String query)
    {
        ResultSet res = null;
        try
        {
            c = DBConnect.getConnection(DATABASE_NAME,USERNAME,PASSWORD);
            s = c.createStatement();
            res = s.executeQuery(query);
        }catch(Exception e){System.err.print("Error: " + e.getMessage());}
        return res;
    }
    
    public static int executeUpdate(String sql)
    {
        int update = 0;
        try
        {
            c = DBConnect.getConnection(DATABASE_NAME,USERNAME,PASSWORD);
            s = c.createStatement();
            update = s.executeUpdate(sql);
        }catch(Exception e){System.err.print("Error: " + e.getMessage());}
        return update;
    }
    
    // Registration methods
    public static int requestRegistration(String id, String fname, String lname, String mname, 
            String user_type_id, String email, String contact_no, String year_started)
    {
        int update;
        update = executeUpdate("INSERT INTO `poofs`.`user` "
                + "(`user_id`, `first_name`, `middle_name`, `last_name`, `user_type_id`, `email`, `contact_no`, `year_started`) "
                + "VALUES ('" + id + "','" + fname + "','" + mname + "','" + lname 
                + "','" + user_type_id + "','" + email + "','" + contact_no + "','" + year_started + "')");
        update = executeUpdate("INSERT INTO `poofs`.`pending` (`user_id`) VALUES ('" + id + "');");
        return update;
    }
    
    public static int approveRegistration(int id) {
        int update;
        //create credential
        String username = generateUsername(id);
        String password = "pass123";
        update = executeUpdate("INSERT INTO `poofs`.`credentials` (`user_id`, `username`, `password`)" 
                + " VALUES ('" + id + "', '" + username + "', '" + password + "')");
        //remove from pending list
        update = executeUpdate("DELETE FROM `poofs`.`pending` WHERE `user_id`='" + id + "';");
        return update;
    }
    
    public static int denyRegistration(int id) {
        int update;
        //remove from pending list
        update = executeUpdate("DELETE FROM `poofs`.`pending` WHERE `user_id`='" + id + "';");
        //remove from user list
        update = executeUpdate("DELETE FROM `poofs`.`user` WHERE `user_id`='" + id + "'");
        return update;
    }
    
    public static String generateUsername(int user_id) {
        String username = "papaya";
        try {
            User u = getUser(user_id);
            username = Utility.getFirstWord(u.getFname() + "." + Utility.eliminateSpaces(u.getLname()));
        }catch(Exception e){System.err.println("Error @ generateUsername: " + e.getMessage());}
        return username;
    }
    
    // User methods
    public static User getUser(int id) {
        ResultSet res = executeQuery("SELECT * FROM user WHERE user_id = " + id);
        User u = null;
        try
        {
            if(res.isBeforeFirst()) {
                res.next();
                int user_id = res.getInt("user_id");
                String fname = res.getString("first_name");
                String mname = res.getString("middle_name");
                String lname = res.getString("last_name");
                String email = res.getString("email");
                String contact_no = res.getString("contact_no");
                String type = getUserType(res.getInt("user_type_id"));
                int year_started = res.getInt("year_started");
                u = new User(user_id,fname,mname,lname,type,email,contact_no,year_started);
            }
            // else there is no data in the result set
            s.close();
            c.close();
        }catch(Exception e){System.err.println("Error @ getUser(int): " + e.getMessage());}
        return u;
    }
    
    public static User getUser(String username)
    {
        User u = null;
        ResultSet res = executeQuery("SELECT * FROM user WHERE user_id = "
                + "(SELECT user_id FROM credentials WHERE username = '" + username + "')");
        try
        {
            if(res.isBeforeFirst()) {
                res.next();
                int user_id = res.getInt("user_id");
                String fname = res.getString("first_name");
                String mname = res.getString("middle_name");
                String lname = res.getString("last_name");
                String email = res.getString("email");
                String contact_no = res.getString("contact_no");
                String type = getUserType(res.getInt("user_type_id"));
                int year_started = res.getInt("year_started");
                u = new User(user_id,fname,mname,lname,type,email,contact_no,year_started);
            }
            // else there is no data in the result set
            s.close();
            c.close();
        }catch(Exception e){System.err.println("Error @ getUser(String): " + e.getMessage());}
        return u;
    }
    
    public static ArrayList<User> getAllPendingUsers() {
        ArrayList<User> uList = new ArrayList<User>();
        ResultSet res = executeQuery("SELECT * FROM user WHERE user_id = ANY (SELECT user_id FROM pending)");
        try {
            if(res.isBeforeFirst()) { //if result has contents
                while(res.next()) {
                    int user_id = res.getInt("user_id");
                    String fname = res.getString("first_name");
                    String mname = res.getString("middle_name");
                    String lname = res.getString("last_name");
                    String email = res.getString("email");
                    String contact_no = res.getString("contact_no");
                    String type = getUserType(res.getInt("user_type_id"));
                    int year_started = res.getInt("year_started");
                    User u = new User(user_id,fname,mname,lname,type,email,contact_no,year_started);
                    uList.add(u);
                }
            }
        }catch(Exception e){System.err.println("Error @ getAllPendingUsers: " + e.getMessage());}
        return uList;
    }
    
    public static ArrayList<User> getAllTeachers() {
        ArrayList<User> uList = new ArrayList<User>();
        ResultSet res = executeQuery("select * FROM user WHERE user_type_id IN (0,1)");
        try {
            if(res.isBeforeFirst()) { //if result has contents
                while(res.next()) {
                    int user_id = res.getInt("user_id");
                    String fname = res.getString("first_name");
                    String mname = res.getString("middle_name");
                    String lname = res.getString("last_name");
                    String email = res.getString("email");
                    String contact_no = res.getString("contact_no");
                    String type = getUserType(res.getInt("user_type_id"));
                    int year_started = res.getInt("year_started");
                    User u = new User(user_id,fname,mname,lname,type,email,contact_no,year_started);
                    uList.add(u);
                }
            }
        }catch(Exception e){System.err.println("Error @ getAllPendingUsers: " + e.getMessage());}
        return uList;
    }
    
    public static boolean hasUser(int id){
        ResultSet res = executeQuery("SELECT user_id FROM user WHERE user_id = '" + id + "'");
        boolean has = false;
        try
        {
            if(res.isBeforeFirst())
                has = true;
            // else there is no data in the result set
            s.close();
            c.close();
        }catch(Exception e){System.err.print("Error @ hasUser(int): " + e.getMessage());}
        return has;
    }
    
    public static boolean hasUser(String username){
        ResultSet res = executeQuery("SELECT user_id FROM user WHERE user_id = "
                + "(SELECT user_id FROM credentials WHERE username = '" + username + "')");
        boolean has = false;
        try
        {
            if(res.isBeforeFirst())
                has = true;
            // else there is no data in the result set
            s.close();
            c.close();
        }catch(Exception e){System.err.print("Error @ hasUser(String): " + e.getMessage());}
        return has;
    }
    
    public static boolean hasEmail(String email){
        ResultSet res = executeQuery("SELECT email FROM user WHERE email = '" + email + "'");
        boolean has = false;
        try
        {
            if(res.isBeforeFirst())
                has = true;
            // else there is no data in the result set
            s.close();
            c.close();
        }catch(Exception e){System.err.print("Error @ hasEmail: " + e.getMessage());}
        return has;
    }
    
    public static boolean isPending(int id){
        ResultSet res = executeQuery("SELECT user_id FROM pending WHERE user_id = '" + id + "'");
        boolean has = false;
        try
        {
            if(res.isBeforeFirst())
                has = true;
            // else there is no data in the result set
            s.close();
            c.close();
        }catch(Exception e){System.err.print("Error @ isPending: " + e.getMessage());}
        return has;
    }
    
    public static boolean isPending(String username){
        ResultSet res = executeQuery("SELECT user_id FROM pending WHERE user_id = '" 
                + "(SELECT user_id FROM credentials WHERE username = '" + username + "')");
        boolean has = false;
        try
        {
            if(res.isBeforeFirst())
                has = true;
            // else there is no data in the result set
            s.close();
            c.close();
        }catch(Exception e){System.err.print("Error @ isPending: " + e.getMessage());}
        return has;
    }
    
    public static String getUserType(int id)
    {
        ResultSet res = executeQuery("SELECT user_type_name FROM user_type WHERE user_type_id = " + id);
        String type = "papaya";
        try
        {
            res.next();
            type = res.getString(1);
            s.close();
            c.close();
        }catch(Exception e){System.err.print("Error: " + e.getMessage());}
        return type;
    }
    
    public static boolean passwordMatches(String username, String password)
    {
        //ResultSet res = getUser(username);
        ResultSet res = executeQuery("SELECT * from credentials WHERE username = '" + username + "'");
        boolean matches = false;
        try
        {
            res.next();
            if(res.getString("password").equals(password))
                matches = true;
            s.close();
            c.close();
        }catch(Exception e){System.err.print("Error: " + e.getMessage());}
        return matches;
    }
    
    public static int removeUser(int user_id) {
        int update;
        //remove account from DB
        update = executeUpdate("DELETE FROM `poofs`.`credentials` WHERE `user_id`='" + user_id + "';");
        //remove user from user list
        update = executeUpdate("DELETE FROM `poofs`.`user` WHERE `user_id`='" + user_id + "';");
        return update;
    }
}
