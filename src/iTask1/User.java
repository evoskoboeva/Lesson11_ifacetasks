package iTask1;

import java.util.Objects;

public class User implements iUser, iPerson {

    @Override
    public String toString() {
        return "User " +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", Metod='" + Metod + '\'' +
                ", ip='" + ip + '\'' +
                ", id='" + id + '\'' +
                ", password='" + password + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getName().equals(user.getName()) && getAddress().equals(user.getAddress()) && getPhone().equals(user.getPhone()) && getMetod().equals(user.getMetod()) && getIp().equals(user.getIp()) && getId().equals(user.getId()) && getPassword().equals(user.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAddress(), getPhone(), getMetod(), getIp(), getId(), getPassword());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMetod() {
        return Metod;
    }

    public void setMetod(String metod) {
        Metod = metod;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String name, String address, String phone, String metod, String ip, String id, String password) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        Metod = metod;
        this.ip = ip;
        this.setId(id);
        this.password = password;
    }

    private String name, address, phone, Metod, ip, id, password;


    @Override
    public String GetName() {
        return "name is nessesarry " + this.name;
    }

    @Override
    public String GetAddress() {
        return "address is nessesarry " + this.address;
    }

    @Override
    public String GetPhone() {
        return "phone is nessesarry" + this.phone;
    }

    @Override
    public String GetMethod() {
        return "Method is nessesarry " + this.getMetod();
    }

    @Override
    public String GetIP() {
        return "ip is nessesarry " + this.ip;
    }

    @Override
    public String GetId() {
        return "id is nessesarry " + this.id;
    }

    @Override
    public String GetPassword() {
        return "password is nessesarry " + this.password;
    }

    @Override
    public boolean tryLogin(String login, String password) {
        if (login.equals(this.id)&&(password.equals(this.password))) {
            return true;
        }
        return false;
    }
}
