/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa;

public class Aaa {
    
 int [] [] a ;
        public Aaa (int row , int column){
            a = new int [row][column]; 
        }
        public void fillArray(int num){
            for(int i = 0 ; i<a.length ; i++){
                for(int j = 0 ; j<a[0].length ; j++){
                    a[i][j] = num ;
                    
                }
            }
        }
        public void mult(int num){
            for(int i = 0 ; i<a.length ; i++){
                for(int j = 0 ; j<a[0].length ; j++){
                    a[i][j]*= num ;
                    
                }
            }
        }
    public static void main(String[] args) {
      Aaa arr1 = new Aaa(3,4);
      arr1.fillArray(3);
      Aaa arr2 = new Aaa(5,7);
      arr2.fillArray(66);
      arr2.mult(arr1.a[2][2]);
        System.out.println(arr2.a[2][2]);
        System.out.println(arr2.a[1][0]);
      
    }
     /*    int []a = {1,2,3};
         int []b = {4,5,6};
         int []c = {1};
         double[]d = {1,2,3};
         double[]e = {2,3};
         System.out.println(a +""+ b +""+""+ c+""+ d+""+ e);
         
    }*/
        /*int x = 623 ;
        int res = --x % ++x;
        System.out.println(res);
    }*/
       // int [] [] [] table = {{{1,2,3,5},{0,57,88,73,91}},{{83,-75,-42,19,66},{-10,13,34}}};
    /*   int arr[] = {2,8,3,1,9};
       int s = 0;
       int temp;
       while(s < 3){
           for(int i =0 ; i<arr.length-1 ;i++){
               temp = arr[i];
               arr[i] = arr[i+1];
               arr[i+1] = temp;
           }
           s++;
       }
        for(int j =0 ; j<arr.length ; j++){
           System.out.println(arr[j] + " ");
       }
      
    }*/
}
       /* int [][] a = {{1,7,-2},{3,2,1},{4,8,9}};
        int [][] b = {{-3,2,4},{-2,-1,2},{2,5,-1}};
        double [] myarr = new double [4];
        int result = 0;
        for(int i =0 ; i <a.length ; i++){
            result+= a[i][i] *b[i][a.length-i-1];
            
        }
        System.out.println(result);
        //System.out.println("Value = "+table.length+table[0].length+table[0][0].length);
        
    }*/
        /*int i =1 , j= 0;
        while((j<=5&& i<j)||(j<=i && i<10)){
            System.out.println(i+j);
            i++;
            j+=i; 
        }
        
    }*/
