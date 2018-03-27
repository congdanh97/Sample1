package PhanTichSo;
import java.lang.*;
public class PhanTichSoDungFor {
	public static void main(String[] args) {

		int a = 25684	; 
		int tong = 0;
		int du = 0;
		int sochuso;
	    sochuso = (int) Math.log10(a) ;
	    int dem = (sochuso +1);
		 for(int i=0 ;i < dem;i++) {
			du = a % 10;
			a = (a - du) / 10;
			tong = tong + du;
		}

		 
		/* for(int i=0 ;;i++) {
			 
				du = a % 10;
				a = (a - du) / 10;
				tong = tong + du;
				 if ( a == 0 ) {break;}
			*/
		 
		System.out.print(tong);
	}
	
}
