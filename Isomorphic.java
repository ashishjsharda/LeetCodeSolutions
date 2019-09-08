package Java12;

import java.util.TreeSet;

/**
  * Check if a string is an isomorphic String
  * https://leetcode.com/problems/isomorphic-strings/
  * @author asharda
  *
  */
public class Isomorphic {

  /**
    * Check if string is isomorphic
    * @param s
    * @param t
    * @return boolean
    */
  public boolean isIsomorphic(String s, String t) {

    TreeSet<Character>ts=new TreeSet<Character>();
    TreeSet<Character>tt=new TreeSet<Character>();
    if(s==null && t==null)
    {
      return true;
    }
    if(s==null ||t==null)
    {
      return false;
    }
    char []as=s.toCharArray();
    char []at=t.toCharArray();

    if(as.length!=at.length)
    {
      return false;
    }
    else
    {
      for(int i=0;i<as.length;i++)
      {
        ts.add(as[i]);
      }

      for(int i=0;i<at.length;i++)
      {
        tt.add(at[i]);
      }

      if(ts.size()!=tt.size())
      {
        return false;
      }

    }//end of else

    return true;
  }

  public static void main(String[] args) {

    Isomorphic i=new Isomorphic();
    System.out.println(i.isIsomorphic("paper", "title"));

  }

}
