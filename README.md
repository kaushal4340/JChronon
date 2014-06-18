JChronon
========

What is JChronon library ?      

JChronon is a small java library implemented to handle the operations or calculations that a Java developer wants to do with the Date,Time and Duration.Till now developers has to write their own functions or need to search methods related to date and time on Google.But now it is easier to do.

JChronon library will perform the calculations related to date and time.All the classes DateHandler , TimeHandler and DurationHandler contains the methods to perform calculations.

Why JChronon ?     
Many times developers needed to do calculations with date and time and they have to write traditional code. Here is the example what Jdevelopers do when they have to print system date or time.
        
If you have ever googled the below questions then you got the right thing.
1) How to add 2 times in java?
2) How to get days between two dates ?
3) How to convert date pattern in java ?
4) How to add seconds or minutes in time ?

Traditionally java developers use the java.util.Date function which prints date something like Sun Sep 04 09:33:01 IST 2013 , another thing that developers can do is ,they can use SimpleDateFormat class to get the date or time in appropriate pattern.

    Example : 
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    System.out.println(dateFormat.format(new Date());
    output : 2014-01-12

    Similar operation can be easily done using the JChronon library by calling just a function.
    Example : 
    DateHandler dateHandler = DateHandler.getInstance();
    System.out.println(dateHandler.getCurrentDate("yyyy-MM-dd"));
    output : 2014-01-12

   Above is just the example of one method of JChronon library.My another post will demonstrate all the classes and methods of this library.
