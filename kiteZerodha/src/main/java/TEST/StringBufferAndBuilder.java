package TEST;

public class StringBufferAndBuilder {
public static void main(String[] args) {
	String OriginalString;
	String s=new String("Velocity");
	StringBuffer sb=new StringBuffer("Katraj");
	StringBuilder sbb=new StringBuilder("Pune");
	
	OriginalString=s.concat("Pune");
	
	System.out.println(OriginalString);
	sb.append(" Pune ");
	sbb.append("Maharastra");
     System.out.println(s);
     System.out.println(sb);
     System.out.println(sbb);
     sb.reverse();
     System.out.println(sb);
}
}
