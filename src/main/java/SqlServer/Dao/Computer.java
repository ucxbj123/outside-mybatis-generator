package SqlServer.Dao;

public class Computer {

    private String ComputerID;
    private String software;

    public Computer() {
    }

    public Computer(String computerID, String software) {
        ComputerID = computerID;
        this.software = software;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ComputerID='" + ComputerID + '\'' +
                ", software='" + software + '\'' +
                '}';
    }

    public String getComputerID() {
        return ComputerID;
    }

    public void setComputerID(String computerID) {
        ComputerID = computerID;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }
}
