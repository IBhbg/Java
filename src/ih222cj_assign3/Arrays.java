package ih222cj_assign3;

public class Arrays {
		 public static int value;
			public static String string;
			private static int sum;
			
			
			public static void main(String[] args) {

				int [] ar = {11,2,3,4};
				
				
			/*
				int suman = sum(ar);
				System.out.println(suman);
				System.out.println();
					
				int [] ar1 = {11,2,3,4};
			  String str = toString(ar1);
			  System.out.println("arq = " + str);
		*/
				 
			int [] arin = addN(ar,1);
				display(arin);
				System.out.println();

				int [] arint = reverse(ar);
				display(arint);
				/**/
				System.out.println();
				if(hasN(ar,3))
					System.out.println("there is a common number");
				System.out.println();
				/**/
				/**/
				replaceAll(ar,3,19);
				
				
				/**/
				System.out.println();
				int [] Mixt = {100,67,2,4,98,1};
				int[] nyMixt=sort(Mixt);
				display(nyMixt);
		        System.out.println();
				/**/
				int[] array={1,2,3,4,5};
				int [] sub={2,3,4};
				boolean tf = hasSubsequence(array, sub);
				if(tf)
				System.out.println("true");
				
				
				
				
				


			}
			
			public static boolean hasSubsequence(int[] arr, int[] sub){
				int counter=0,pre=0,after=0;
				boolean statment =false;
				for(int r=0; r<= sub.length-1; r++){
					 for(int u=0; u<=arr.length-1;u++){
					
					if(sub[r]==arr[u]){
						pre=sub[r];
						
						counter++;
					}
					
					if(counter==sub.length)
					   statment=true;
					
					 }  
					
					
					
					
				}
				
				
				
				
				
				return statment;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			public static int[] sort(int[] arr){
				int [] leastFirst = new int [arr.length];
				boolean fix =true;
				while(fix){
					 fix =false;
				for(int e=0; e<arr.length-1;e++){
					
					if(arr[e] > arr[e+1] ){
						
						value = arr[e];
						arr[e] = arr[e+1];
						arr[e+1] = value;
						fix =true;
					         }
				}
				}
				
				
				for(int g=0; g<=arr.length-1;g++){
					
					leastFirst[g] = arr[g];
				}
				
				
				
				
				
				
				
				
				return  leastFirst;
			}
			
			
			
			
			
			
			
			
			
			public static void replaceAll(int[] arr, int old, int nw){
				for(int d=0; d<=arr.length-1; d++){
					if(arr[d]==old){
						arr[d]=nw;
					}
				}
				
				for(int a=0;a<=arr.length-1;a++){
					System.out.println(arr[a]);
				}
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			public static boolean hasN(int[] arr, int n) {
			boolean statment =false;	
			
				for (int q=0; q<=arr.length-1;q++){
					if(arr[q]==n){
						statment=true;
						q=arr.length-1;
					      }
					else{
						statment=false;
					    }
				}
				return statment;
				
			}
			
			
			public static int[] reverse(int[] arr){
				int [] art = new int[arr.length];
				
				for(int w=0; w<=art.length-1;w++){
					art[w] =arr[art.length-1-w];
				}
				
				return art;
				
				
				
				
				
			}
			
			
			
			
			public static void display(int[]a){
				for(int u=0; u<=a.length-1;u++){
					System.out.print(a[u]+" ");
				}
				
			}
		public static int[] addN(int[] arr, int n){
			
			int [] nyarr = new int [arr.length];
			//int [] nya = new int [arr.length];
			for(int j=0; j<=arr.length-1; j++){
				nyarr[j] = arr[j]+n;
			}
			return nyarr;
			
			
		}
			
			
			
			
			
			
			
		public static String toString(int[] arq) {
			string = Arrays.toString(arq);
			
				return string;
			}




		public static int sum(int[] arr){
				
			for(int i=0; i<=arr.length-1;i++){
				 sum = arr[i]+sum;
			       }
				return sum;
		        }

		}



