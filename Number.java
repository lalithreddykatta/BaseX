
public class Number
{
    private long value;
    private String val;

    public Number(String v, int base)
    {
        val = v;
        value = Long.parseLong(val,base);
    }

    public String getBase(int base)
    {
        return Long.toString(value,base);
    }
}
