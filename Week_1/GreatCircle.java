public class GreatCircle {
	public static void main(String[] args) {
        double x1=Math.toRadians(Double.parseDouble(args[0])); 
        double y1=Math.toRadians(Double.parseDouble(args[1])); 
        double x2=Math.toRadians(Double.parseDouble(args[2])); 
        double y2=Math.toRadians(Double.parseDouble(args[3]));
        double r=6371.0;
        double sin1=Math.pow(Math.sin(((x2-x1)/2)),2);
        double sin2=Math.pow(Math.sin(((y2-y1)/2)),2);
        double cos1=Math.cos(x1);
        double cos2=Math.cos(x2);
        double inside=Math.sqrt(sin1+cos1*cos2*sin2);
        double distance=2*r*Math.asin(inside);
		System.out.println(distance+" kilometers");
	}
}
