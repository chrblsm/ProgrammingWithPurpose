public class CMYKtoRGB {
	public static void main(String[] args) {
		double cyan=Double.parseDouble(args[0]); 
		double magenta=Double.parseDouble(args[1]); 
		double yellow=Double.parseDouble(args[2]); 
		double black=Double.parseDouble(args[3]);
		double white=1-black;
		double red=255*white*(1-cyan);int 
		r=(int)red;
		double green=255*white*(1-magenta);int 
		g=(int)green;
		double blue=255*white*(1-yellow);int 
		b=(int)blue;
		System.out.println("red   = "+r);
		System.out.println("green = "+g);
		System.out.println("blue  = "+b);
	}
}
