import java.util.*;
class Examination{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int counter=0;
		int n=0;
		int answer;
		int marks=10;
		boolean Englishstatus=false;
		boolean GKstatus=false;
		boolean Mathstatus=false;
		int englishMarks,mathsMarks,GKMarks;
		do{
			System.out.println("Online Examination");
			System.out.println("Which exam do you want to take first?");
			System.out.println("1.English");
			System.out.println("2. GK");
			System.out.println("3. Math");
			int num=sc.nextInt();
			switch(num){
				case 1:if(Englishstatus==true){
						System.out.println("You have already taken English exam");
						System.out.println();
						break;
					}
					else if(Englishstatus==false){
						System.out.println("English exam");
						System.out.println("Our country is spiritual country,theirs_____religious");
						System.out.println("1.is\n2.are\n3.also\n4.have");
						answer=sc.nextInt();
						if(answer==1){
							 marks = marks+10;
						}
						System.out.println("Our sir teaches mathematics______English");
						System.out.println("1.across\n2.besides\n3.beside\n4.along");
						answer=sc.nextInt();
						if(answer==2){
							marks = marks+10;
						}
						System.out.println("Please,come_______the bathroom.");
						System.out.println("1.out of\n2.over\n3.on\n4.in");
						answer=sc.nextInt();
						if(answer==1){
							 marks = marks+10;
						}
						Englishstatus=true;
						System.out.println();
						counter+=1;
						n++;
						break;
								
				}
				case 2:if(GKstatus==true){
						System.out.println("You have already taken GK exam");
						System.out.println();
						break;
					}
					else if(GKstatus==false){
						System.out.println("GK exam");
						System.out.println("Which bank has been collaborating with salesforce to build next generation Tech platformfor retail banking");
						System.out.println("1.HDFC Bank\n2.SBI\n3.YES Bank\n4.PNB");
						answer=sc.nextInt();
						if(answer==1){
							marks = marks+10;
						}
						System.out.println("The central government has removed the ban on which product exports from 1st january 2021");
						System.out.println("1.sugar\n2.onion\n3.tomato\n4.oil");
						answer=sc.nextInt();
						if(answer==2){
							marks = marks+10;
						}
						System.out.println("In which state first rice ATM has to be set up?");
						System.out.println("1.Maharastra\n2.Gujrat\n3.Sikkim\n4.Karnataka");
						answer=sc.nextInt();
						if(answer==4){
							 marks = marks+10;
						}
						System.out.println();
						GKstatus=true;
						counter+=1;
						n++;
						break;
					}
				case 3:if(Mathstatus==true){
						System.out.println("You have already taken Math exam");
						System.out.println();
						break;
					}
					else if(Mathstatus==false){
						System.out.println("Math exam");
						System.out.println("The average of first 50 natural number is____");
						System.out.println("1.25.30\n2.25.5\n3.25.00\n4.12.25");
						answer=sc.nextInt();
						if(answer==2){
							marks = marks+10;
						}
						System.out.println("What is 1004 divided by 2?");
						System.out.println("1.52\n2.502\n3.520\n4.5002");
						answer=sc.nextInt();
						if(answer==2){
 							marks = marks+10;
						}
						System.out.println("The simplest form of 1.5:2.5 is_______");
						System.out.println("1.6:5\n2.15:25\n3.0.75:1.25\n4.3:5");
						answer=sc.nextInt();
						if(answer==4){
 							marks = marks+10;
						}
						Mathstatus=true;
						System.out.println();
						counter+=1;
						n++;
						break;
					}
												}
				if(counter==3 && Englishstatus==true && GKstatus==true && Mathstatus==true){
					System.out.println("you have completed all your exams");
					if(marks >= 90){
						System.out.println("Congratulation you Passed with A Grade");
					}
					else if(marks < 90 && marks >=80){
						System.out.println("Congratulation you Passed with B Grade");
					}
					else if(marks < 80 && marks >=70){
						System.out.println("Congratulation you Passed with C Grade");
					}
					else{
						System.out.println("You are really good but need more study Please try next time");
					}
					break;
				}
				else{
					System.out.println("you need to complete all your exams");
					System.out.println("Remaining exams are");
					if (Englishstatus==true && GKstatus==true){
	     					System.out.println("you need to complete your Maths exam press 3");
					}
					else if(Englishstatus==true && Mathstatus==true){
	     					System.out.println("you need to complete your GK exam press 2");
					}
					else if(GKstatus==true && Mathstatus==true){
	    					 System.out.println("you need to complete your English exam press 1");
					}
					else if(GKstatus==true){
	     					System.out.println("you need to complete your Maths and English exam press 1 and 2");
					}
					else if(Englishstatus==true){
	    					 System.out.println("you need to complete your Maths and GK exam press 2 and 3");
					}
					else if(Mathstatus==true){
	     					System.out.println("you need to complete your  English and GK  exam press 1 and 3");
					}

				}
			}while (n<=3);
		}
}









 