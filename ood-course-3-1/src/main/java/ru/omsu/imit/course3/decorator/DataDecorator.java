package ru.omsu.imit.course3.decorator;

public class DataDecorator implements Data{

    private Data data;

    public DataDecorator(Data data) {
        this.data = data;
    }

    @Override
    public void write(String s) {
        data.write(s);
    }

    @Override
    public String read() {
        return data.read();
    }
}
