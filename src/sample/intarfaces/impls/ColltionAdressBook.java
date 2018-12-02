package sample.intarfaces.impls;

import sample.intarfaces.AdressBook;
import sample.objects.Person;

import java.util.ArrayList;

public class ColltionAdressBook implements AdressBook {
    private ArrayList<Person> personList = new ArrayList<>();


    @Override
    public void add(Person person) {
        personList.add(person);
    }

    @Override
    public void update(Person person) {
        //усли бы использовали базу данных как хранилище, то писали бы реализацию метода update

    }


    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    @Override
    public void delete(Person person) {
        personList.remove(person);


    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
}
