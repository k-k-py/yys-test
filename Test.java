public class Test
{
	
	public static void main(String[] args){

		int[] arr = {7,5,6,8,13,67,45,99,76,33,23,34};

		//先进行冒泡排序
		int[] arrNew = paiXu(arr);
		int mak = 0;
		for(int i:arr){
			System.out.println("index--" + mak++ + " i ==" + i);
		}

		//排序之后查找位置二分法
		int x = 44;
		int index = search(arrNew,x);
		if( index == -1){
			System.out.println( " 搜索的数字==" + x + "==不存在");
		}else{
			System.out.println("下标--" + index + " 搜索的数字==" + x);
		}

	}
	
	public static int[] paiXu(int[] arr){
	
		for(int i=0;i < arr.length-1;i++){
		
			for(int j=0; j<arr.length-1-i;j++){
				
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}

			}

		}
		
		return arr;
	} 

	public static int search(int[] arr,int x){
		//定义三个位置
		int min,mid,max;
		min = 0;
		max = arr.length;
		mid = (min+max)/2;

		while(arr[mid]!=x){

			if(arr[mid] > x){
				max = mid-1;
			}else if(arr[mid] < x){
				min =mid+1;
			}
			if(min > max){
				return -1;
			}
			mid = (min+max)/2;

		}

		return mid;

	}
	
}

//1*100*99