package SixLab;

public class Author {
    private String name;
    private int age;
    private Sex gender;

    Author() {
        this.name = "Name";
        this.age = 30;
        gender = Sex.Male;
    }

    public Author(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        gender = sex;
    }

    public String getName(String a) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getGender() {
        return this.gender;
    }

    public void setGender(SixLab.Sex gender) {
        this.gender = gender;
    }


    public String authorString(){
        return "Author's name: " + name + ", age: " + age + ", gender: " + gender;
    }

}

enum Sex{
    Male,
    Female
}
