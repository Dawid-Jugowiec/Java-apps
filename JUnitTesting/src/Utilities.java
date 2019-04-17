public class Utilities {


    public char[] everynthChar(char[] source, int n)
    {
        if (source == null || source.length < n)
        {
            return source;
        }

        int length = source.length/2;
        char [] nArray = new char [length];
        int index = 0;

        for (int i = n-1; i < source.length ; i += n) {
            nArray[index++] = source[i];
        }

        return nArray;
    }

    public String removePairs (String source)
    {
        if (source.length()<2)
        {
            return source;
        }

        StringBuilder builder = new StringBuilder();
        char [ ] ChArray = source.toCharArray();

        for (int i = 0; i< ChArray.length; i++)
        {
            if (i == ChArray.length-1)
            {

                builder.append(ChArray[i]);
                break;

           }

               if (ChArray[i] != ChArray[i+1])
               {
                   builder.append(ChArray[i]);
               }

        }
        return builder.toString();

    }

       public int converter (int a, int b)
       {
           return  (a/b) + (a*30) -2;

       }

         public String nullIfOddLengrh (String source)
         {
             if (source.length() %2 == 0)
             {
                 return source;
             }
         else
             return null;
         }

}
