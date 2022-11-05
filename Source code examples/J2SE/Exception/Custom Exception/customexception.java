class NewException extends Exception
{
    int value;

    NewException(int v)
    {
        value = v;
    }

    public String toString()
    {
        return "NewException " + value;
    }
}

class customexception
{
    public static void main(String args[])
    {
        try {
            doWork(3);
            doWork(2);
            doWork(1);
            doWork(0);
        }
        catch (NewException e) {
            System.out.println("Exception: " + e);
        }
    }

    static void doWork(int value) throws NewException
    {
        if(value == 0){ throw new NewException(value);}
        else {System.out.println("No problem."); }
    }
}


