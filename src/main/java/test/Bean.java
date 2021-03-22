package test;

/**
 * todo
 *
 * @author zhaozf
 * @date 2021-03-15 15:53
 */
public class Bean {

    public Bean(String name, Integer age){
       this.name=name;
       this.age=age;
    }

    public Bean(){
    }

    private String name;

    private Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
