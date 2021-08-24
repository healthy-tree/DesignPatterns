package pri.kevin.structural.decorator.decorators;

public interface DataSource {

    void writeData(String data);

    String readData();
}
