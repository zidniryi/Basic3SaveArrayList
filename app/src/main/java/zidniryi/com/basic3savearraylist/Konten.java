package zidniryi.com.basic3savearraylist;

public class Konten {
    //Todo class ini berguna untuk menampung atau menyimpan dat array (Model)
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String toString(){
        return (getData());
    }
}
