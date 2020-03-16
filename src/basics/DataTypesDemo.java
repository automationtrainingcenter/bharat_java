package basics;
/*
 * In java we have mainly two types of data types
 * 1. primitive
 * 		boolean either true or false - Boolean
 * 		char which will store single character - Character
 *		byte store integer values - Byte
 *		short store integer values - Short
 *		int store integer values -Integer
 *		long store integer values - Long
 *		float store floating point number -Float
 *		double store floating point number - Double
 *
 * 2. reference
 * 		Arrays
 * 		Strings
 *
 *  Wrapper class: For every primitive data_type we have an equivalent class in Java. Those classes
 * are known as Wrapper classes. These are used to perform different operations on data.
 * 		1. Boolean
 * 		2. Character
 * 		3. Byte
 * 		4. Short
 * 		5. Integer
 * 		6. Long
 * 		7. Float
 * 		8. Double
 *
 * 	WCData_type obj_name = new WCData_type(value);
 *
 * 	Type Casting: converting one type of primitive data to another type of primitive data
 * 	up casting: lower memory type to higher memory type : widening : no data loss
 * 	down casting: higher memory data type to lower memory data type : narrowing : data loss is possible
 *
 * Converting primitive data type to wrapper class: boxing
 *  Converting wrapper to primitive : un-boxing
 *
 *
 * syntax to create primitive data type
 * data-type var-name  = value; //initialization
 * data-type var-name; //declaration
 * var-name = value; //assignment to the variable which is already declared
 *
 * variable is nothing but name of memory location where we are storing data
 */

public class DataTypesDemo {

    public static void main(String[] args) {
        // boolean
        boolean b = true;
        System.out.println("boolean value b is "+b);
        System.out.println("*****************************************************");

        // character
        char ch = 'a';
        System.out.println("character value ch is "+ch);
        System.out.println("min value of char type is "+Character.MIN_VALUE);
        System.out.println("max value of char type is "+Character.MAX_VALUE);
        System.out.println("size of char type in bits is "+Character.SIZE);
        System.out.println("size of char type in bytes is "+Character.BYTES);
        System.out.println("*****************************************************");


        // byte
        byte by = 123;
        System.out.println("byte value by is "+by);
        System.out.println("min value of byte type is "+Byte.MIN_VALUE);
        System.out.println("max value of byte type is "+Byte.MAX_VALUE);
        System.out.println("size of byte type in bits is "+Byte.SIZE);
        System.out.println("size of byte type in bytes is "+Byte.BYTES);
        System.out.println("*****************************************************");


        // short
        short sh = 12345;
        System.out.println("short value sh is "+sh);
        System.out.println("min value of short type is "+Short.MIN_VALUE);
        System.out.println("max value of short type is "+Short.MAX_VALUE);
        System.out.println("size of short type in bits is "+Short.SIZE);
        System.out.println("size of short tyep in bytes is "+Short.BYTES);
        System.out.println("*****************************************************");


        // integer
        int i = 123456789;
        System.out.println("integer value is "+i);
        System.out.println("min value of int type is "+Integer.MIN_VALUE);
        System.out.println("max value of int type is "+Integer.MAX_VALUE);
        System.out.println("size of int type in bits is "+Integer.SIZE);
        System.out.println("size of int type in bytes is "+Integer.BYTES);
        System.out.println("*****************************************************");

        // long
        long l = 123456789012l;
        System.out.println("long value l is "+l);
        System.out.println("min value of long type is "+Long.MIN_VALUE);
        System.out.println("max value of long type is "+Long.MAX_VALUE);
        System.out.println("size of long type in bits is "+Long.SIZE);
        System.out.println("size of long type in bytes is "+Long.BYTES);
        System.out.println("*****************************************************");

        // float
        float f = 12.3f;
        System.out.println("float value f is "+f);
        System.out.println("min value of float type is "+Float.MIN_VALUE);
        System.out.println("max value of float type is "+Float.MAX_VALUE);
        System.out.println("size of float type in bits is "+Float.SIZE);
        System.out.println("size of float type in bytes is "+Float.BYTES);
        System.out.println("*****************************************************");


        // double
        double d = 123.467;
        System.out.println("double value is "+d);
        System.out.println("min value of double type is "+Double.MIN_VALUE);
        System.out.println("max value of double type is "+Double.MAX_VALUE);
        System.out.println("size of double in bits is "+Double.SIZE);
        System.out.println("size of double in bytes is "+Double.BYTES);
        System.out.println("*****************************************************");


        // upcasting : lower type to higher type
        // higher_data_type_var_name = lower_data_type_var_name
        short shLow = 23413;
        int iHigh;
        iHigh = shLow;
        System.out.println(iHigh);

        float flow = 9.8f;
        double dhigh;
        dhigh = flow;
        System.out.println(dhigh);

        int iLow = 9876;
        float fHigh;
        fHigh = iLow;
        System.out.println(fHigh);


        // down casting: higher type to lower type
        // lower_type_var_name = (lower_type) higher_type_var_name
        short sHigh = 123;
        byte byLow;
        byLow = (byte) sHigh;
        System.out.println(byLow);

        long lHigh = 123456l;
        int intLow;
        intLow = (int) lHigh;
        System.out.println(intLow);

        double dHigh = 123.999;
        long lLow;
        lLow = (long) dHigh;
        System.out.println(lLow);


        // boxing : converting a primitive type to wrapper type
        int ip = 12345;
//        Integer iw = ip;
//        Integer iw = new Integer(ip);
        Integer iw = Integer.valueOf(ip);
        System.out.println(iw);

        float fp = 123.43f;
//        Float fw = fp;
//        Float fw = new Float(fp);
        Float fw = Float.valueOf(fp);
        System.out.println(fw);


        // unboxing: converting a wrapper type to primitive type
        Long lw = new Long(98765432199l);
//        long lp = lw;
        long lp = lw.longValue();
        System.out.println(lp);

        Double dw = new Double(9.8);
//        double dp = dw;
        double dp = dw.doubleValue();
        System.out.println(dp);

        

    }


}
