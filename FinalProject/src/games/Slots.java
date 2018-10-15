package games;

public class Slots {
	
	public static void randomGen() {
		
//		(1/2) + (1/4)+ (1/8) + (1/20) + (1/24) + (1/32) + (1/480)
		for(int count = 0; count < 3; count++) {
		int number = 0;
		for(int i = 0; i == 1; i++) {
			int ran = (int) (Math.random() * 2 + 1);
			if(ran == 1) {
			number = 1;
			}
			else if(ran == 2) {
				for(int j = 0; j < 2; j++) {
					int ran2 = (int) (Math.random() * 4 + 1);
						if(ran2 == 2) {
							number = 2;
						}
						else if(ran2 != 2) {
							for(int k = 0; k < 2; k++) {
								int ran3 = (int) (Math.random() * 8 + 1);
									if(ran3 == 3) {
										number = 3;
									}
									else if(ran3 != 3) {
										for(int l = 0; l < 2; l++) {
											int ran4 = (int) (Math.random() * 20 + 1);
												if(ran4 == 4) {
													number = 4;
												}
													else if(ran4 != 4) {
														for(int m = 0; m < 2; m++) {
															int ran5 = (int) (Math.random() * 24 + 1);
																if(ran5 == 5) {
																	number = 5;
																}
																	else if(ran5 != 5) {
																		for(int n = 0; n < 2; n++) {
																			int ran6 = (int) (Math.random() * 32 + 1);
																				if(ran6 == 6) {
																					number = 6;
																						}
																				else if(ran6 != 6) {
																					
																						for(int o = 0; o < 2; o++) {
																							int ran7 = (int) (Math.random() * 480 + 1);
																								if(ran7 == 7) {
																									number = 7;
																								}
																									else if(ran7 != 7) {
																										number = 1;
																										}
																							
																									}
																						
																								}
																			
																							}
																		
																						}			
																					}	
																				}	
																			}

																		}		
																	}
																}
															}
														}
			slots(number);
													}
		
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

