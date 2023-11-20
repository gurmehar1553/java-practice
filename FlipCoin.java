class FlipCoin{
     public static void main(String[]args){
	int num = 5;
	int tails=0,heads=0;
	for(int i=0;i<num;i++){
		double inp = Math.random();
		if(inp < 0.5){
			tails++;
		}else{
			heads++;
		}
	}	
	double ans =(heads/(tails*1.0))*100;
	System.out.println(ans);
     }
}