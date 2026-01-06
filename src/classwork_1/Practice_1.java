package classwork_1;

public class Practice_1 {
	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		System.out.println();
		
		int ag = sr.nextInt();
		if(ag<18) {
			System.out.println("Minor");
		} else {
			System.out.println("Adult");
		}
		
		int iq = -67;
		if(iq>0) {
			System.out.println("+");
		} else if (iq<0) {
			System.out.println("-");
		}
		
		Scanner ghg = new Scanner(System.in);
		System.out.println();
		int gr = ghg.nextInt();
		
		if(gr == 2) {
			System.out.println("badd");
		} else if (gr==3) {
			System.out.println("eughh");
		} else if (gr==4) {
			System.out.println("not bad");
		} else if (gr==5) {
			System.out.println("nicee");
		}
		
		Scanner tmp = new Scanner(System.in);
		System.out.println();
		int tp = tmp.nextInt();
		
		if(tp>25) {
			System.out.println("buuuhh hot");
		} else if (tp>10 && tp<25) {
			System.out.println("niicee");
		} else {
			System.out.println("aaa cold");
		}
		
		int dy = 5;
		switch(dy) {
		case 1 -> System.out.println("Mon");
		case 2 -> System.out.println("Tue");
		case 3 -> System.out.println("Wen");
		case 4 -> System.out.println("Thu");
		case 5 -> System.out.println("Fri");
		case 6 -> System.out.println("Sat");
		case 7 -> System.out.println("Sun");
		}
		
		String gar = "A";
		switch(gar) {
		case "A" -> System.out.println("ekseluntt");
		case "B" -> System.out.println("gud");
		case "C" -> System.out.println("not bad");
		case "D" -> System.out.println("eughh");
		case "E" -> System.out.println("bad");
		case "F" -> System.out.println("im dead");
		}
		
		int a = 8;
		int b = 8;
		if(a>b) {
			System.out.println("1");
		} else{
			System.out.println("2");
		}
		
		
		int tme = 22;
		if(tme>=6 && tme <=11) {
			System.out.println("moningg");
		} else if (tme>=12 && tme<=17) {
			System.out.println("noon");
		} else if (tme >=18 && tme<=22) {
			System.out.println("evning");
		} else {
			System.out.println("HONK mimimimiimi HONK mimimimimimi");
		}
		
		int mon = 12;
		switch(mon) {
		case 12,1,2 -> System.out.println("wint");
		case 3,4,5 -> System.out.println("spring");
		case 6,7,8 -> System.out.println("summr");
		case 9,10,11 -> System.out.println("fall");
		}
		
		byte dfgh = 3;
		if(dfgh%2==0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
		String g = "N";
		if(g=="M") {
			System.out.println("hey man");
		} else if (g=="F") {
			System.out.println("hey gurl");
		} else {
			System.err.println("hey friend");
		}
		
		String c = "g";
		switch(c) {
		case "r" -> System.out.println("dont");
		case "y" -> System.out.println("waiit");
		case "g" -> System.err.println("go");
		}
		
		if(ag < 7) {
			System.out.println("kindergarten");
		} else if (ag>7 && ag<=17) {
			System.out.println("school(prison)");
		} else {
			System.out.println("get a job");
		}
		
		byte ch = 2;
		switch(ch) {
		case 1 -> System.out.println("1");
		case 2 -> System.out.println("2");
		case 3 -> System.out.println("3");
		case 4 -> System.out.println("4");
		}
		
		
		int hegt = 160;
		if(hegt<150) {
			System.out.println("shortie");
		} else if (hegt>150 && hegt<=180) {
			System.out.println("aveg");
		} else {
			System.out.println("tall");
		}
		
		int pts = 88;
		if (pts>100) {
			System.out.println("you won!");
		} else {
			System.out.println("try again");
		}
		
		char o = '*';
		switch(o) {
		case '+' -> System.out.println("pribavit");
		case '-' -> System.out.println("otnyat");
		case '*' -> System.out.println("umnojit");
		case '/' -> System.out.println("razdelit");
		}
		
		String wd = "Fri";
		switch(wd) {
		case "Mon","Tue","Wen","Thu","Fri" -> System.out.println("budni");
		case "Sat","Sun" -> System.out.println("vixodn");
		}
		
		int wsh = 8;
		switch(wsh) {
		case 8 -> System.out.println("yes");
		default -> System.out.println("no");
		}
		
		if(a==b) {
			System.out.println("equal");
		}
		
		int wtp = 45;
		if(wtp<0) {
			System.out.println("ice");
		} else if (wtp>100) {
			System.out.println("gas");
		} else {
			System.out.println("water");
		}
		
		int anicnt = 1;
		if (anicnt==0) {
			System.out.println("no pets");
		} else {
			System.out.println("yes pets");
		}
		
		int bhg = 5;
		if(bhg<4) {
			System.out.println("ill talk to your parents");
		} else {
			System.out.println("good child");
		}
		
		int e22 = 4;
		if(e22==4) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}
	}
}

