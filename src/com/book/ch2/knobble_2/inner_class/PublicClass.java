package com.book.ch2.knobble_2.inner_class;

/**
 * @Author: xjf
 * @Date: 2019/6/4 15:04
 */
public class PublicClass {
    static private String username;
    static private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    static class PrivateClass{
        private String age;
        private String address;

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void printPublicProperty(){
            System.out.println("public object: username=" + username + "  password=" + password);
        }
    }
}
