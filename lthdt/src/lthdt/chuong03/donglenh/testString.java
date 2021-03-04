/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.donglenh;

/**
 *
 * @author USER
 */
public class testString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String content = "Long lanh day nuoc in troi \n Thanh xay khoi biec non phoi bong vang";
        System.out.println(content);
        
        //Taho tac 1: Tim vi tri cua mot ki tu
        System.out.println("Vi tri cua ki tu a trong chuoi la: " + content.indexOf('a'));
        System.out.println("Vi tri cua tu nuoc trong chuoi la: " + content.indexOf("nuoc"));
        
        //thao tac 2: kiem tra khoi dau va ket thuc
        System.out.println("Chuoi mo dau bang cum tu Long: " + content.startsWith("Long"));
        System.out.println("Chuoi ket thuc bang cum troi : " + content.endsWith("troi"));
        
        //Thao tac 3: cat chuoi theo vi tri
        String temp = content.substring(20, 26);
        System.out.println("Chuoi con la: " + temp );
        
        //Thao tac 4: Phan tach chuoi
        String[] result = content.split("\n");
        for(int i =0; i < result.length; i ++){
            System.out.println(result[i]);
        }
        
        //Thao tac thu 5: loai bo khoang trang dau - cuoi chuoi
        for(int i =0; i < result.length; i ++){
            System.out.println(result[i].trim());
        }
        
        //Thao tac thu 6: Thay the ki tu
        temp = content.replace('a', 'z');
        System.out.println(temp);
        
        //Thao tac 7: chuyen kieu
        temp = content.toUpperCase();
        System.out.println(temp);
        temp = content.toLowerCase();
        System.out.println(temp);
        
        //Thao tac 8: so sanh chuoi
        temp = "Nguyen";
        if(temp.compareToIgnoreCase("nguyen") == 0){
            System.out.println("2 chuoi bang nhau");
        }else{
            System.out.println("2 chuoi khong bang nhau");
        }
        
        //Thao tac 9: noi chuoi
        temp = temp.concat("Van A");
        System.out.println(temp);
        
        //Thao tac 10: truy xuat bang chi so
        for(int i = 0; i < temp.length(); i ++){
            System.out.print(temp.charAt(i));
           }
         System.out.println();
         
         //thao tac 10: Chuyen kieu
         temp = "155";
         int n = Integer.parseInt(temp);
         System.out.println("n = " + n);
         
         //thao tac 11: su dung stringBuilder
         StringBuilder sb = new StringBuilder();
         sb.append("Long lanh day nuoc in troi\n");
         sb.append("Thanh xay khoi biec non phoi bong vang");
         temp = sb.toString();
         System.out.println(sb);
    }
    
}
