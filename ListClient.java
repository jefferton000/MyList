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
    runnerList.displayList(runnerList);
    runnerList.display();
    
    ListInterface<String> alphaList = new AList<String>();
    alphaList.add(1, "Amy");
    alphaList.add(2, "Ellen");
    alphaList.add(2, "Bob");
    alphaList.add(3, "Drew");
    alphaList.add(1, "Aaron");
    alphaList.add(4, "Carol");
    runnerList.display();
    
    ListInterface<Name> nameList = new AList<Name>();
    nameList.add(amy);
    nameList.add(new Name("Tina", "Drexel"));
    nameList.add(new Name("Robert", "Jones"));
    Name secondName = nameList.getEntry(2);
    runnerList.display();
  }
  
  public static void displayList(ListInterface<String> list)
  {
    int numberOfEntries = list.getLength();
    System.out.println("This list contains " + numberOfEntries +
                       " entries, as follows:");
    for (int position = 1; position <= numberOfEntries; position++)
      System.out.println(list.getEntry(position) +
                         " is entry " + position);
  }
}
