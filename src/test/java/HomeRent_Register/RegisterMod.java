package HomeRent_Register;

public class RegisterMod {

	public static void main(String[] args) {
		String str="pavithra";
		String temp=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			temp=temp+ch;
			
		}
		System.out.println(temp);

	}

}
