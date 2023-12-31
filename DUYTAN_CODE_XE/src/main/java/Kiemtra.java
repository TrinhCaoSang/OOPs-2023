import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kiemtra {
	static Scanner sc = new Scanner(System.in);

	public static boolean check_sdt(String phone) {
		String reg = "^0\\d{9}$";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(phone);
		if (!matcher.matches()) {
			System.out.println("So dien thoai khong dung dinh dang!!!");
			return false;
		}
		return true;
	}

	public static boolean check_maso(String maso) {
		String reg = "^[A-Za-z0-9]{2}\\d{8}$";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(maso);
		if (!matcher.matches()) {
			System.out.println("Ma so khong dung dinh dang!!!");
			return false;
		}
		return true;
	}

	public static boolean check_diachi(String text) {
		String reg = "[^\\s*]$";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(text);
		if (!matcher.matches()) {
			System.out.println("Chuoi khong duoc bo trong!!!");
			return false;
		}
		return true;
	}

	public static boolean check_date(String date) {
		String reg = "^(0[1-9]|[1-2][0-9]|3[01])/(0[1-9]|1[0-2])/[1-2]\\d{3}$";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(date);
		if (!matcher.matches()) {
			System.out.println("Dinh dang dung la dd/mm/yyyy!!!");
			return false;
		}
		return true;
	}

	public static boolean check_name(String name) {
		String reg = "[A-Za-z]+$";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(name);
		if (!matcher.matches()) {
			System.out.println("Ten khong dung dinh dang");
			return false;
		}
		return true;
	}

	public static boolean check_sex(String sex) {
		String reg = "nam|nu$";
		Pattern pattern = Pattern.compile(reg,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(sex);
		if (!matcher.matches() || sex == "") {
			System.out.println("Gioi tinh phai la nam/nu");
			return false;
		}
		return true;
	}

	public static boolean check_mail(String mail) {
		String reg = "^[A-Za-z0-9]{5,32}@[a-zA-Z]{2,10}(\\.[a-zA-Z]{2,10})+$";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(mail);
		if (!matcher.matches() || mail == "") {
			System.out.println("Khong nhap dung dinh dang email");
			return false;
		}
		return true;
	}

	public static boolean check_cccd(String cccd)
	{
		String reg = "^\\d{12}$";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(cccd);
		if(!matcher.matches() || cccd == "")
		{
			System.out.println("So can cuoc cong dan khong dung!");
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kiemtra num = new Kiemtra();
		// System.out.println("Nhap chuoi:");
		// String tmp = sc.nextLine();
		// num.check_sdt("0123456789");
		// num.check_maso("AB22560064");
		//num.check_date("32/10/2004");
		// num.check_name("sang");
		// num.check_sex("nam");
		//num.check_mail("sangtrinhcao7@gmail.com");
		//num.check_cccd("094203013509");
		//num.check_diachi("");
		sc.close();
	}

}
