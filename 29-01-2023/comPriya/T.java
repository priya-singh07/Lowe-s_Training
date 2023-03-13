import comPriya.Compute;
class T
{
public static void main(String []arr)
{
Compute c = new Compute();
int p = Integer.parseInt(arr[0]);
int r = Integer.parseInt(arr[1]);
int t = Integer.parseInt(arr[2]);
int l = Integer.parseInt(arr[3]);
int b = Integer.parseInt(arr[4]);
System.out.println(c.simp_int(p,r,t));
System.out.println(c.area_rec(l,b));
}
}