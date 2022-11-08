public class Comment
{
    private String poster;
    private String comment;
    private String date;
    
    public Comment(String personPosting, String message, String commentDate)
    {
       

       
        public String gotDate

        poster = personPosting;
        comment = message;
        date = commentDate;
        

    }
    
    public String toString()
    {
        return comment + "\n--" + poster + "(" + date + ")";
    }

    public String gotPoster(){
        return poster; 
    } 
    public String gotComment(){
        return comment;
    }

    public String getDate(){
        return date; 
    }



    public static void main(String[] args)
    {
        //Your code here.
        //Create two Comment objects and print them out.
        //Then use the “get” methods to print out the instance variables
    }
}

