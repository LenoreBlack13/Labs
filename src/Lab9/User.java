package Lab9;

import java.util.Objects;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Переопределяем метод equals, чтобы сравнить объекты User НЕ по ссылке, а по имени
    @Override
    public boolean equals(Object obj) {
        //Если этот объект равен obj, то это один и тот же объект
        if (this == obj) {
            return true;
        }
        //Проверка на null или объект не принадлежит User
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        //Приведение объекта к типу User
        User other = (User) obj;
        //Сравнение полей. Если имена равны, то объекты равны
        return Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        //Равные хэш-коды для объектов с одинаковыми именами
        return Objects.hash(name);
    }
}
