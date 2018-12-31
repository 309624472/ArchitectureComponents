package me.francis.lifecycle;

/**
 * Created by yun.feng on 2018/12/31.
 */
public class UserEntity {
    private String name;
    private String id;

    public UserEntity(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
