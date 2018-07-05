class sort {
public static void main(String ars[]) {
			int a[]=new int[20];
			for(int i=0;i<ars.length;i++)
				a[i]=Integer.parseInt(ars[i]);
			for(int i=0;i<ars.length;i++)
				for(int j=0;j<ars.length-(i+1);j++)
				if(a[j]>a[j+1]){
					int k=a[j];
					a[j]=a[j+1];
					a[j+1]=k;
				}
			for(int i=0;i<ars.length;i++)
				System.out.print(a[i]+" ");
		}
}
