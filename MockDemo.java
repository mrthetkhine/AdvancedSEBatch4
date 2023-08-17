interface SomeAPI
{
    String getSomeData();
}
class FakeAPI implements SomeAPI
{
    public String getSomeData()
    {
        return "Dummy";
    }
}
public class MockDemo {
    public static void main(String[] args) {
        SomeAPI api = new FakeAPI();
        System.out.println("Api "+api.getSomeData());
    }
}
