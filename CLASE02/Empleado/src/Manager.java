public class Manager extends Employee {
    private String departament;

    public Manager(String name, int id, double salary, String departament) {
        super(name, id, salary);
        this.departament = departament;
    }

    @Override
    public String toString() {
        return super.toString() + "[departament=" + departament + "]";
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

}
