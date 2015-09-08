public class ListClient
{
  public static void main(String[] args)
  {
    testList();
  }
  
  public static void testList()
  {
    ListInterface<String> runnerList = new AList<String>();
    runnerList.add("16"); //winner
    runnerList.add("4");
    runnerList.add("33");
    runnerList.add("27");
    runnerList.display();
  }
}
