class TryCatchDemo
{
    static int method()throws Exception
    {
        try {
            //return 50;
            throw new Exception("Garr");
        } catch (Exception e) {
           System.out.println("Exception "+e.getMessage());
           //return 50;
           throw new Exception("Ohh");
        }
        finally
        {
            System.out.println("Ok");
            //return 100;
        }
    }
    public static void main(String[] args) throws Exception{
        int data = method();
        System.out.println("Data is "+data);
    }
}