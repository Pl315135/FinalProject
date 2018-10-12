package games;

public class Slots {
	
	public static void randomGen() {
		int number = 0;
//		(1/2) + (1/4)+ (1/8) + (1/20) + (1/24) + (1/32) + (1/480)
		for(int i = 0; i <= 3; i++) {
			int ran = (int) (Math.random() * (3 - 1) + 1);
			if(ran == 1) {
			number = 1;
			}
			else if(ran == 2) {
		
			}
			slots(number);
		}
	}
	public static void slots(int number) {
		System.out.println("              0000000000000000000000    0000000000000000000000000000000000000");
		System.out.println("             000000000000000000000 0    0      3 of the following:          0");
		System.out.println("           000000000000000000000   0    0 1 = 100                 5 = 2000  0");
		System.out.println("         000000000000000000000     0    0 2 = 250                 6 = 3000  0");
		System.out.println("       000000000000000000000       0    0 3 = 500                 7 = 10000 0");
		System.out.println("       0                   0       0    0 4 = 1000                          0");
		System.out.println("       0                   0       0    0                                   0");
		System.out.println("       0    " + number +"    "+"    " +"    0       0    0000000000000000000000000000000000000");
		System.out.println("       0                   0       0 ");
		System.out.println("       0                   0       0 ");
		System.out.println("      000000000000000000000        0 ");
		System.out.println("     0 0 0 0 0 0 0 0 0 0 0         0 ");
		System.out.println("    0 0 0 0 0 0 0 0 0 0 0          0 ");
		System.out.println("    00000000000000000000           0 ");
		System.out.println("    0000 S L O T S  0000         0   ");
		System.out.println("    00000000000000000000       0     ");
		System.out.println("    00000000000000000000     0       ");
		System.out.println("    000000000000000000000000         ");

		
		}
		
		
	}

