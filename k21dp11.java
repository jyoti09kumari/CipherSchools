import java.lang.StringBuilder;
class k21dp11
{
public static void main(String jyoti[])
{
StringBuilder sb = new StringBuilder("hello k21dp students");
System.out.println(sb);
System.out.println(sb.capacity());
StringBuilder sb1=new StringBuilder();
System.out.println(sb1);
System.out.println(sb1.capacity());
System.out.println(sb.insert(1,"java"));
System.out.println(sb.append("programming"));
System.out.println(sb.delete(1,7));
System.out.println(sb.replace(6,10,"data"));
System.out.println(sb.reverse());
sb.ensureCapacity(40);
System.out.println(sb.capacity());
}}
