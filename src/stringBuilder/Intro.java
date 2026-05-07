package stringBuilder;

public class Intro {

    public static void main(String[] args) {

//       Problem with String (Immutable)
//       String objects cannot be modified.
//       Any change → new object is created in heap.
//       This leads to:
//        - extra memory usage
//        - slower performance in loops

        String str = "Vivek";
        str = str + " Sahu";  // new object created
        System.out.println(str);


//       2. StringBuilder (Mutable)
//       StringBuilder allows modification
//       without creating new objects.
//       Faster and memory efficient.

        StringBuilder sb = new StringBuilder("Vivek");

        // append → add text at end
        sb.append(" Sahu");
        System.out.println(sb);

        // insert → add at specific index
        sb.insert(5, " Kumar");
        System.out.println(sb);

        // replace → replace part of string
        sb.replace(5, 11, " Singh");
        System.out.println(sb);

        // delete → remove part of string
        sb.delete(5, 11);
        System.out.println(sb);

        // reverse → reverse string
        sb.reverse();
        System.out.println(sb);

        // length → current length
        System.out.println("Length: " + sb.length());

//       Capacity concept
//       Default capacity = 16
//       Capacity grows automatically when needed

        StringBuilder sb2 = new StringBuilder();
        System.out.println("Initial capacity: " + sb2.capacity());

        sb2.append("This is a long string exceeding default capacity");
        System.out.println("New capacity: " + sb2.capacity());

//         Convert to String

        String finalStr = sb.toString();
        System.out.println(finalStr);

//       When to use what
//       String → when data is constant (safe, readable)
//       StringBuilder → when frequent modifications
//       StringBuffer → same as SB but thread-safe (slower)


    }
}