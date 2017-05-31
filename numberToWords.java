package numberToWords;
import java.util.*;
public class numberToWords {

		public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
			int length;
			int num;
			char yesOrNo;
			String[] ones=new String[] {"", "one","two","three","four","five","six","seven","eight","nine"};
			String[] tens=new String[] {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
			String[] teens=new String[] {"ten", "eleven","twelve","thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
			do{
			System.out.println("enter the number to convert: (a zero to nine digit number)");
			num=s.nextInt();
			length = (int) (Math.log10(num) + 1);
			switch(length){
				case 1:
					for (int x=1;x<=10;x++){
						if(num%10==x){
							System.out.print(ones[x]);
						}
					}
					break;
					
				case 2:
			
					if (num>=10 && num<=19){
						for (int x=10;x<=19;x++){
							if(num==x){
							System.out.print(teens[x-10]);
							break;
							}
						  }
						}
					else{
						for(int x=2;x<=9;x++)
						    {
							if(num/10==x)
							  {
							  for(int y=0;y<10;y++)
								{
								if (num%10==y)
									{
									System.out.println(tens[x-2]+" "+ ones[y]);
									}
								}
							  }
						    }
						}
					break;
				case 3: 
					for (int x=1;x<=9;x++){
						if(num/100==x){
							num=num%100;
							if(num/10==0){//for three digit numbers with zero in the middle
								for(int y=0;y<10;y++)
								{
								if (num%10==y){
									System.out.println(ones[x]+" hundred "+ ones[y]);
									break;}
								}
							}else if(num>=10 && num<=19){
								for (int z=10;z<=19;z++){
									if(num==z){
										System.out.print(ones[x]+" hundred "+teens[z-10]);
									break;}
								  }
							}else{
								for(int a=2;a<=9;a++)
							    {
								if(num/10==a)
								  {
								  for(int b=0;b<10;b++)
									{
									if (num%10==b)
										{
										System.out.println(ones[x]+" hundred "+tens[a-2]+" "+ ones[b]);
										}
									}
								  }
							    }
							}
						}	
					}
					break;
				case 4: 
					for (int e=1;e<10;e++){
						if (num/1000==e){
							num=num%1000;
							if (num/100==0){
								num=num%100;
								if(num/10==0){//for three digit numbers with zero in the middle
									for(int y=0;y<10;y++)
									{
									if (num%10==y){
										System.out.println(ones[e]+" thousand "+ ones[y]);
										break;}
									}
								}else if(num>=10 && num<=19){
									for (int z=10;z<=19;z++){
										if(num==z){
											System.out.print(ones[e]+" thousand "+teens[z-10]);
										break;}
									  }
								}else{
									for(int a=2;a<=9;a++)
								    {
									if(num/10==a)
									  {
									  for(int b=0;b<10;b++)
										{
										if (num%10==b)
											{
											System.out.println(ones[e]+" thousand "+tens[a-2]+" "+ ones[b]);
											}
										}
									  }
								    }
								}
							}else{
								for(int l=1;l<10;l++){
									if (num/100==l){
										num=num%100;
										if(num/10==0){//for three digit numbers with zero in the middle
											for(int y=0;y<10;y++)
											{
											if (num%10==y){
												System.out.println(ones[e] + " thousand "+ ones[l] + " hundred "+ ones[y]);
												break;}
											}
										}else if(num>=10 && num<=19){
											for (int z=10;z<=19;z++){
												if(num==z){
													System.out.print(ones[e] + " thousand "+ ones[l] +" hundred "+teens[z-10]);
												break;}
											  }
										}else{
											for(int a=2;a<=9;a++)
										    {
											if(num/10==a)
											  {
											  for(int b=0;b<10;b++)
												{
												if (num%10==b)
													{
													System.out.println(ones[e] + " thousand "+ ones[l] +" hundred "+tens[a-2]+" "+ ones[b]);
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
					break;
				case 5:
					String FirstHalf="";
					String SecondHalf="";
					int num1=num/1000;
					int num2=num%1000;
					if (num1>=10 && num1<=19){
						for (int h=10;h<=19;h++){
							if(num1==h){
							FirstHalf= (teens[h-10]+ " thousand ");
							}
						}
					}else{
						for(int h=2;h<=9;h++)
						    {
							if(num1/10==h)
							  {
							  for(int i=0;i<10;i++)
								{
								if (num1%10==i)
									{
									FirstHalf=(tens[h-2]+" "+ ones[i] + "thousand ");
									}
								}
							  }
						    }
					}
					for (int x=1;x<=9;x++){
						if (num2/100==0){
							num2=num2%100;
							if(num2/10==0){ //for three digit numbers with zero in the middle
								for(int y=0;y<10;y++)
								{
								if (num2%10==y){
									SecondHalf= (ones[y]);
									}
								}
							}else if(num2>=10 && num2<=19){
								for (int z=10;z<=19;z++){
									if(num2==z){
										SecondHalf= (teens[z-10]);
									}
								  }
							}else{
								for(int a=2;a<=9;a++)
							    {
								if(num2/10==a)
								  {
								  for(int b=0;b<10;b++)
									{
									if (num2%10==b)
										{
										SecondHalf=( tens[a-2]+" "+ ones[b]);
										}
									}
								  }
							    }
							}
						}
						if(num2/100==x){
							num2=num2%100;
							if(num2/10==0){ //for three digit numbers with zero in the middle
								for(int y=0;y<10;y++)
								{
								if (num2%10==y){
									SecondHalf= (ones[x]+" hundred "+ ones[y]);
									}
								}
							}else if(num2>=10 && num2<=19){
								for (int z=10;z<=19;z++){
									if(num2==z){
										SecondHalf= (ones[x]+" hundred "+teens[z-10]);
									}
								  }
							}else{
								for(int a=2;a<=9;a++)
							    {
								if(num2/10==a)
								  {
								  for(int b=0;b<10;b++)
									{
									if (num2%10==b)
										{
										SecondHalf=( ones[x]+" hundred "+tens[a-2]+" "+ ones[b]);
										}
									}
								  }
							    }
							}
						}	
						}
					System.out.println(FirstHalf + SecondHalf);
					break;
					
				case 6: 
					String First1Half="";
					String Second1Half="";
					int num11=num/1000;
					int num12=num%1000;
					for (int x=1;x<=9;x++){
						if(num11/100==x){
							num11=num11%100;
							if(num11/10==0){//for three digit numbers with zero in the middle
								for(int y=0;y<10;y++)
								{
								if (num11%10==y){
									First1Half=(ones[x]+" hundred "+ ones[y]+" thousand ");
									break;}
								}
							}else if(num11>=10 && num11<=19){
								for (int z=10;z<=19;z++){
									if(num11==z){
										First1Half=(ones[x]+" hundred "+teens[z-10]+" thousand ");
									break;}
								  }
							}else{
								for(int a=2;a<=9;a++)
							    {
								if(num11/10==a)
								  {
								  for(int b=0;b<10;b++)
									{
									if (num11%10==b)
										{
										First1Half=(ones[x]+" hundred "+tens[a-2]+" "+ ones[b]+" thousand ");
										}
									}
								  }
							    }
							}
						}	
					}
					
						if (num12/100==0){
							num12=num12%100;
							if(num12/10==0){ //for three digit numbers with zero in the middle
								for(int y=0;y<10;y++)
								{
								if (num12%10==y){
									Second1Half= (ones[y]);
									}
								}
							}else if(num12>=10 && num12<=19){
								for (int z=10;z<=19;z++){
									if(num12==z){
										Second1Half= (teens[z-10]);
									}
								  }
							}else{
								for(int a=2;a<=9;a++)
							    {
								if(num12/10==a)
								  {
								  for(int b=0;b<10;b++)
									{
									if (num12%10==b)
										{
										Second1Half=( tens[a-2]+" "+ ones[b]);
										}
									}
								  }
							    }
							}
						}
						for (int x=1;x<=9;x++){
						if(num12/100==x){
							num12=num12%100;
							if(num12/10==0){ //for three digit numbers with zero in the middle
								for(int y=0;y<10;y++)
								{
								if (num12%10==y){
									Second1Half= (ones[x]+" hundred "+ ones[y]);
									}
								}
							}else if(num12>=10 && num12<=19){
								for (int z=10;z<=19;z++){
									if(num12==z){
										Second1Half= (ones[x]+" hundred "+teens[z-10]);
									}
								  }
							}else{
								for(int a=2;a<=9;a++)
							    {
								if(num12/10==a)
								  {
								  for(int b=0;b<10;b++)
									{
									if (num12%10==b)
										{
										Second1Half=( ones[x]+" hundred "+tens[a-2]+" "+ ones[b]);
										}
									}
								  }
							    }
							}
						}	
						}
					System.out.println(First1Half + Second1Half);
					break;
				case 7: 
					String First2Half="";
					String Second2Half="";
					String Third2Half="";
					
					for(int k=1;k<=9;k++){
						if (num/1000000==k){
							Third2Half=(ones[k]+" million ");
							int num21=(num/1000)%1000;
							int num22=num%1000;
							
								if (num21/100==0){
									num21=num21%100;
									if(num21/10==0){ //for three digit numbers with zero in the middle
										for(int y=0;y<10;y++)
										{
										if (num21%10==y){
											First2Half= (ones[y]);
											}
										}
									}else if(num21>=10 && num21<=19){
										for (int z=10;z<=19;z++){
											if(num21==z){
												First2Half= (teens[z-10]+" thousand ");
											}
										  }
									}else{
										for(int a=2;a<=9;a++)
									    {
										if(num21/10==a)
										  {
										  for(int b=0;b<10;b++)
											{
											if (num21%10==b)
												{
												First2Half=( tens[a-2]+" "+ ones[b]+" thousand ");
												}
											}
										  }
									    }
									}
								}
								for (int x=1;x<=9;x++){
								if(num21/100==x){
									num21=num21%100;
									if(num21/10==0){//for three digit numbers with zero in the middle
										for(int y=0;y<10;y++)
										{
										if (num21%10==y){
											First2Half=( ones[x]+" hundred "+ ones[y]+" thousand ");
											break;}
										}
									}else if(num21>=10 && num21<=19){
										for (int z=10;z<=19;z++){
											if(num21==z){
												First2Half=(ones[x]+" hundred "+teens[z-10]+" thousand ");
											break;}
										  }
									}else{
										for(int a=2;a<=9;a++)
									    {
										if(num21/10==a)
										  {
										  for(int b=0;b<10;b++)
											{
											if (num21%10==b)
												{
												First2Half=(ones[x]+" hundred "+tens[a-2]+" "+ ones[b]+" thousand ");
												}
											}
										  }
									    }
									}
								}	
							}
							
								if (num22/100==0){
									num22=num22%100;
									if(num22/10==0){ //for three digit numbers with zero in the middle
										for(int y=0;y<10;y++)
										{
										if (num22%10==y){
											Second2Half= (ones[y]);
											}
										}
									}else if(num22>=10 && num22<=19){
										for (int z=10;z<=19;z++){
											if(num22==z){
												Second2Half= (teens[z-10]);
											}
										  }
									}else{
										for(int a=2;a<=9;a++)
									    {
										if(num22/10==a)
										  {
										  for(int b=0;b<10;b++)
											{
											if (num22%10==b)
												{
												Second2Half=( tens[a-2]+" "+ ones[b]);
												}
											}
										  }
									    }
									}
								}
								for (int x=1;x<=9;x++){
								if(num22/100==x){
									num22=num22%100;
									if(num22/10==0){ //for three digit numbers with zero in the middle
										for(int y=0;y<10;y++)
										{
										if (num22%10==y){
											Second2Half= (ones[x]+" hundred "+ ones[y]);
											}
										}
									}else if(num22>=10 && num22<=19){
										for (int z=10;z<=19;z++){
											if(num22==z){
												Second2Half= (ones[x]+" hundred "+teens[z-10]);
											}
										  }
									}else{
										for(int a=2;a<=9;a++)
									    {
										if(num22/10==a)
										  {
										  for(int b=0;b<10;b++)
											{
											if (num22%10==b)
												{
												Second2Half=( ones[x]+" hundred "+tens[a-2]+" "+ ones[b]);
												}
											}
										  }
									    }
									}
								}	
								}
							System.out.println(Third2Half+ First2Half + Second2Half);
							break;
							}
						}
				case 8: 
							String First3Half="";
							String Second3Half="";
							String Third3Half="";
							int num31= (num/1000)%1000;
							int num32= num%1000;
							int num33= num/1000000;
							
							if (num33>=10 && num33<=19){
								for (int h=10;h<=19;h++){
									if(num33==h){
									Third3Half= (teens[h-10]+ " million ");
									}
								}
							}else{
								for(int h=2;h<=9;h++)
								    {
									if(num33/10==h)
									  {
									  for(int i=0;i<10;i++)
										{
										if (num33%10==i)
											{
											Third3Half=(tens[h-2]+" "+ ones[i] + " million ");
											}
										}
									  }
								    }
							}
							if (num31/100==0){
								num31=num31%100;
								if(num31/10==0){ //for three digit numbers with zero in the middle
									for(int y=0;y<10;y++)
									{
									if (num31%10==y){
										First3Half= (ones[y]);
										}
									}
								}else if(num31>=10 && num31<=19){
									for (int z=10;z<=19;z++){
										if(num31==z){
											First3Half= (teens[z-10]+" thousand ");
										}
									  }
								}else{
									for(int a=2;a<=9;a++)
								    {
									if(num31/10==a)
									  {
									  for(int b=0;b<10;b++)
										{
										if (num31%10==b)
											{
											First3Half=( tens[a-2]+" "+ ones[b]+" thousand ");
											}
										}
									  }
								    }
								}
							}
							for (int x=1;x<=9;x++){
							if(num31/100==x){
								num31=num31%100;
								if(num31/10==0){//for three digit numbers with zero in the middle
									for(int y=0;y<10;y++)
									{
									if (num31%10==y){
										First3Half=( ones[x]+" hundred "+ ones[y]+" thousand ");
										break;}
									}
								}else if(num31>=10 && num31<=19){
									for (int z=10;z<=19;z++){
										if(num31==z){
											First3Half=(ones[x]+" hundred "+teens[z-10]+" thousand ");
										break;}
									  }
								}else{
									for(int a=2;a<=9;a++)
								    {
									if(num31/10==a)
									  {
									  for(int b=0;b<10;b++)
										{
										if (num31%10==b)
											{
											First3Half=(ones[x]+" hundred "+tens[a-2]+" "+ ones[b]+" thousand ");
											}
										}
									  	}
								    	}
									}
								}	
							}
						
							if (num32/100==0){
								num32=num32%100;
								if(num32/10==0){ //for three digit numbers with zero in the middle
									for(int y=0;y<10;y++)
									{
									if (num32%10==y){
										Second3Half= (ones[y]);
										}
									}
								}else if(num32>=10 && num32<=19){
									for (int z=10;z<=19;z++){
										if(num32==z){
											Second3Half= (teens[z-10]);
										}
									  }
								}else{
									for(int a=2;a<=9;a++)
								    {
									if(num32/10==a)
									  {
									  for(int b=0;b<10;b++)
										{
										if (num32%10==b)
											{
											Second3Half=( tens[a-2]+" "+ ones[b]);
											}
										}
									  }
								    }
								}
								}
							for (int x=1;x<=9;x++){
							if(num32/100==x){
								num32=num32%100;
								if(num32/10==0){ //for three digit numbers with zero in the middle
									for(int y=0;y<10;y++)
									{
									if (num32%10==y){
										Second3Half= (ones[x]+" hundred "+ ones[y]);
										}
									}
								}else if(num32>=10 && num32<=19){
									for (int z=10;z<=19;z++){
										if(num32==z){
											Second3Half= (ones[x]+" hundred "+teens[z-10]);
										}
									  }
								}else{
									for(int a=2;a<=9;a++)
								    {
									if(num32/10==a)
									  {
									  for(int b=0;b<10;b++)
										{
										if (num32%10==b)
											{
											Second3Half=( ones[x]+" hundred "+tens[a-2]+" "+ ones[b]);
											}
										}
									  }
								    }
								}
							}	
							}
						System.out.println(Third3Half+ First3Half + Second3Half);
					
					break;
					
				case 9:
					String First4Half="";
					String Second4Half="";
					String Third4Half="";
					int num41= (num/1000)%1000;
					int num42= num%1000;
					int num43= num/1000000;
					for (int x=1;x<=9;x++){
						if(num43/100==x){
							num43=num43%100;
							if(num43/10==0){//for three digit numbers with zero in the middle
								for(int y=0;y<10;y++)
								{
								if (num43%10==y){
									Third4Half=(ones[x]+" hundred "+ ones[y]+" million ");
									break;}
								}
							}else if(num43>=10 && num43<=19){
								for (int z=10;z<=19;z++){
									if(num43==z){
										Third4Half=(ones[x]+" hundred "+teens[z-10]+" million ");
									break;}
								  }
							}else{
								for(int a=2;a<=9;a++)
							    {
								if(num43/10==a)
								  {
								  for(int b=0;b<10;b++)
									{
									if (num43%10==b)
										{
										Third4Half=(ones[x]+" hundred "+tens[a-2]+" "+ ones[b]+" million ");
										}
									}
								  }
							    }
							}
						}	
					}
					
					if (num41/100==0){
						num41=num41%100;
						if(num41/10==0){ //for three digit numbers with zero in the middle
							for(int y=0;y<10;y++)
							{
							if (num41%10==y){
								First4Half= (ones[y]);
								}
							}
						}else if(num41>=10 && num41<=19){
							for (int z=10;z<=19;z++){
								if(num41==z){
									First4Half= (teens[z-10]+" thousand ");
								}
							  }
						}else{
							for(int a=2;a<=9;a++)
						    {
							if(num41/10==a)
							  {
							  for(int b=0;b<10;b++)
								{
								if (num41%10==b)
									{
									First4Half=( tens[a-2]+" "+ ones[b]+" thousand ");
									}
								}
							  }
						    }
						}
					}
					for (int x=1;x<=9;x++){
					if(num41/100==x){
						num41=num41%100;
						if(num41/10==0){//for three digit numbers with zero in the middle
							for(int y=0;y<10;y++)
							{
							if (num41%10==y){
								First4Half=( ones[x]+" hundred "+ ones[y]+" thousand ");
								break;}
							}
						}else if(num41>=10 && num41<=19){
							for (int z=10;z<=19;z++){
								if(num41==z){
									First4Half=(ones[x]+" hundred "+teens[z-10]+" thousand ");
								break;}
							  }
						}else{
							for(int a=2;a<=9;a++)
						    {
							if(num41/10==a)
							  {
							  for(int b=0;b<10;b++)
								{
								if (num41%10==b)
									{
									First4Half=(ones[x]+" hundred "+tens[a-2]+" "+ ones[b]+" thousand ");
									}
								}
							  	}
						    	}
							}
						}	
					}
				
					if (num42/100==0){
						num42=num42%100;
						if(num42/10==0){ //for three digit numbers with zero in the middle
							for(int y=0;y<10;y++)
							{
							if (num42%10==y){
								Second4Half= (ones[y]);
								}
							}
						}else if(num42>=10 && num42<=19){
							for (int z=10;z<=19;z++){
								if(num42==z){
									Second4Half= (teens[z-10]);
								}
							  }
						}else{
							for(int a=2;a<=9;a++)
						    {
							if(num42/10==a)
							  {
							  for(int b=0;b<10;b++)
								{
								if (num42%10==b)
									{
									Second4Half=( tens[a-2]+" "+ ones[b]);
									}
								}
							  }
						    }
						}
						}
					for (int x=1;x<=9;x++){
					if(num42/100==x){
						num42=num42%100;
						if(num42/10==0){ //for three digit numbers with zero in the middle
							for(int y=0;y<10;y++)
							{
							if (num42%10==y){
								Second4Half= (ones[x]+" hundred "+ ones[y]);
								}
							}
						}else if(num42>=10 && num42<=19){
							for (int z=10;z<=19;z++){
								if(num42==z){
									Second4Half= (ones[x]+" hundred "+teens[z-10]);
								}
							  }
						}else{
							for(int a=2;a<=9;a++)
						    {
							if(num42/10==a)
							  {
							  for(int b=0;b<10;b++)
								{
								if (num42%10==b)
									{
									Second4Half=( ones[x]+" hundred "+tens[a-2]+" "+ ones[b]);
									}
								}
							  }
						    }
						}
					}	
					}
				System.out.println(Third4Half+ First4Half + Second4Half);
			
				break;
					
			
				}//switch close
			
			do{
			System.out.println("Do you want to enter another number to convert(Y/N)?");
			yesOrNo=s.next(".").charAt(0);
			}while(yesOrNo!='Y'&&yesOrNo!='y'&&yesOrNo!='N'&&yesOrNo!='n');
		}while(yesOrNo=='Y'||yesOrNo=='y');
			s.close();
		}

	}

/*
 enter the number to convert: (a zero to nine digit number)
46235
forty sixthousand thirty five
Do you want to enter another number to convert(Y/N)?
Y
enter the number to convert: (a zero to nine digit number)
156
one hundred fifty six
Do you want to enter another number to convert(Y/N)?
Y
enter the number to convert: (a zero to nine digit number)
123456985
one hundred twenty three million four hundred fifty six thousand nine hundred eighty five
Do you want to enter another number to convert(Y/N)?
N


 */

	