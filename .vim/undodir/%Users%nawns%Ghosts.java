Vim�UnDo� ��[��]䖤�|�X�`%<��4���EL�I�   4       return 1;            J   J   J   J   I    VR��    _�                             ����                                                                                                                                                                                                                                                                                                                                                             VR�&     �                   5�_�                            ����                                                                                                                                                                                                                                                                                                                                                  v        VR�(     �              
       .      public static void main(String[] args) {   4                Scanner in = new Scanner(System.in);   -                        int A = in.nextInt();   5                                int B = in.nextInt();   =                                        int C = in.nextInt();   E                                                int D = in.nextInt();   5                                                    }   }    5�_�                            ����                                                                                                                                                                                                                                                                                                                                                  v        VR�*     �                  import java.io.*;   import java.util.*;   import java.text.*;   import java.math.*;   import java.util.regex.*;       public class Solution {    5�_�                            ����                                                                                                                                                                                                                                                                                                                                                  v        VR�*    �                   5�_�                           ����                                                                                                                                                                                                                                                                                                                                                  v        VR�C    �               public class Solution {5�_�                           ����                                                                                                                                                                                                                                                                                                                                                  v        VR�O     �                       int D = in.nextInt();5�_�                            ����                                                                                                                                                                                                                                                                                                                                                  v        VR�Q    �                5�_�      	                      ����                                                                                                                                                                                                                                                                                                                                                  v        VR�t    �      
          5�_�      
           	   	        ����                                                                                                                                                                                                                                                                                                                                                             VR��     �      
         }5�_�   	              
   	       ����                                                                                                                                                                                                                                                                                                                                                             VR��     �      
           }5�_�   
                 	       ����                                                                                                                                                                                                                                                                                                                                                             VR��     �                   }5�_�                       :    ����                                                                                                                                                                                                                                                                                                                                                             VR��     �               :    public static int ghosts(int A, int B, int C, int D) {5�_�                    	   9    ����                                                                                                                                                                                                                                                                                                                                                             VR��     �               9      List<List<Integer>> permutes = permute(A, B, C, D);5�_�                    
   (    ����                                                                                                                                                                                                                                                                                                                                                             VR��    �   	            (      for (List<Integer> p : permutes) {5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             VR��     �      	         public class Ghosts {5�_�                    	       ����                                                                                                                                                                                                                                                                                                                            	                    v       VR��     �               :    public static int ghosts(int A, int B, int C, int D) {   9      List<List<Integer>> permutes = permute(A, B, C, D);   (      for (List<Integer> p : permutes) {           System.out.println(p);         }         return 5;       }       ,    public static void main(String[] args) {   ,        Scanner in = new Scanner(System.in);           int A = in.nextInt();           int B = in.nextInt();           int C = in.nextInt();           int D = in.nextInt();   /        System.out.println(ghosts(A, B, C, D));       }5�_�                           ����                                                                                                                                                                                                                                                                                                                                                v       VR��    �               *      Scanner in = new Scanner(System.in);         int A = in.nextInt();         int B = in.nextInt();         int C = in.nextInt();         int D = in.nextInt();   -      System.out.println(ghosts(A, B, C, D));5�_�                           ����                                                                                                                                                                                                                                                                                                                                                v       VR��     �      
            5�_�                       I    ����                                                                                                                                                                                                                                                                                                                                                v       VR�     �      
         I  public static List<List<Integer>> permute(int A, int B, int C, int D) {5�_�                           ����                                                                                                                                                                                                                                                                                                                                                v       VR�@     �                I  public static List<List<Integer>> permute(int A, int B, int C, int D) {    5�_�                           ����                                                                                                                                                                                                                                                                                                                                                v       VR�@     �                  }   8  public static int ghosts(int A, int B, int C, int D) {5�_�                           ����                                                                                                                                                                                                                                                                                                                                                v       VR�A     �                7    List<List<Integer>> permutes = permute(A, B, C, D);   &    for (List<Integer> p : permutes) {5�_�                           ����                                                                                                                                                                                                                                                                                                                                                v       VR�A     �                      System.out.println(p);       }5�_�                           ����                                                                                                                                                                                                                                                                                                                                                v       VR�B     �                    return 5;     }5�_�                            ����                                                                                                                                                                                                                                                                                                                            
                    v       VR�C     �                 5�_�                           ����                                                                                                                                                                                                                                                                                                                            	                    v       VR�D     �                +    System.out.println(ghosts(A, B, C, D));5�_�                           ����                                                                                                                                                                                                                                                                                                                            	                    v       VR�E     �                   int D = in.nextInt();5�_�                           ����                                                                                                                                                                                                                                                                                                                            	                    v       VR�M     �                   for (int i = 0; i <= A) {5�_�                           ����                                                                                                                                                                                                                                                                                                                            	                    v       VR�O     �                   for (int i = 0; i <= A) {5�_�                            ����                                                                                                                                                                                                                                                                                                                            	                    v       VR�R     �                5�_�                            ����                                                                                                                                                                                                                                                                                                                            	                    v       VR�X     �                     for (int j = 1; j <= B) {5�_�      !                  &    ����                                                                                                                                                                                                                                                                                                                            	                    v       VR�]     �               &        for (int k = 1; k <= C; k++) {5�_�       "           !      (    ����                                                                                                                                                                                                                                                                                                                            	                    v       VR�i     �               (          for (int l = 1; l <= D; l++) {5�_�   !   #           "      )    ����                                                                                                                                                                                                                                                                                                                            	                    v       VR�v    �               )            System.out.println(i + " " + 5�_�   "   $           #          ����                                                                                                                                                                                                                                                                                                                            	                    v       VR�~     �                     for (int j = 1; j <= B) {5�_�   #   %           $          ����                                                                                                                                                                                                                                                                                                                            	                    v       VR��    �                   for (int i = 1; i <= A) {5�_�   $   &           %      $    ����                                                                                                                                                                                                                                                                                                                            	                    v       VR��     �               $      for (int j = 1; j <= B; j++) {5�_�   %   '           &      !    ����                                                                                                                                                                                                                                                                                                                            	                    v       VR��     �               %        if (Math.abs(i - j) % 3 == 0)5�_�   &   (           '      %    ����                                                                                                                                                                                                                                                                                                                            	                    v       VR��   	 �               %        if (Math.abs(i - j) % 3 != 0)5�_�   '   )           (      &    ����                                                                                                                                                                                                                                                                                                                            	                    v       VR��     �               &        for (int k = 1; k <= C; k++) {5�_�   (   *           )          ����                                                                                                                                                                                                                                                                                                                            	                    v       VR��     �                         if ((B + C) % 5 == 0)5�_�   )   +           *          ����                                                                                                                                                                                                                                                                                                                            	                    v       VR��   
 �                         if ((B + C) % 5 != 0)5�_�   *   ,           +          ����                                                                                                                                                                                                                                                                                                                            	                    v       VR��     �                           continue;5�_�   +   -           ,          ����                                                                                                                                                                                                                                                                                                                            	                    v       VR��     �                         if ((B + C) % 5 != 0)5�_�   ,   .           -          ����                                                                                                                                                                                                                                                                                                                            	                    v       VR�     �                         if ((j + C) % 5 != 0)5�_�   -   /           .          ����                                                                                                                                                                                                                                                                                                                            	                    v       VR�     �                         if (5�_�   .   0           /          ����                                                                                                                                                                                                                                                                                                                            	                    v       VR�     �                         if (k + i5�_�   /   1           0          ����                                                                                                                                                                                                                                                                                                                            	                    v       VR�     �                         if (k * i5�_�   0   2           1          ����                                                                                                                                                                                                                                                                                                                            	                    v       VR�    �                         if ((k * i5�_�   1   3           2      (    ����                                                                                                                                                                                                                                                                                                                            	                    v       VR�.     �               (          for (int l = 1; l <= D; l++) {5�_�   2   4           3          ����                                                                                                                                                                                                                                                                                                                            	                    v       VR�7     �                            if (gdc(i,l) == 1)5�_�   3   5           4          ����                                                                                                                                                                                                                                                                                                                            	                    v       VR�8    �                            if (gdc(i,l) != 1)5�_�   4   6           5          ����                                                                                                                                                                                                                                                                                                                            	                    v       VR�>     �         !      public class Ghosts {5�_�   5   7           6      '    ����                                                                                                                                                                                                                                                                                                                                      "          v       VR�E    �      
   $      '  public static int gdc(int a, int b) {5�_�   6   8           7          ����                                                                                                                                                                                                                                                                                                                                      #          v       VR�]     �         %                    continue;5�_�   7   9           8          ����                                                                                                                                                                                                                                                                                                                                      $          v       VR�`     �                @            System.out.println(i + " " + j + " " + k + " " + l);5�_�   8   :           9          ����                                                                                                                                                                                                                                                                                                                                      #          v       VR�b    �         %          int D = in.nextInt();5�_�   9   ;           :   #       ����                                                                                                                                                                                                                                                                                                                                      $          v       VR�f    �   "   %   &          }5�_�   :   <           ;      '    ����                                                                                                                                                                                                                                                                                                                                      %          v       VR��     �         '      '  public static int gdc(int a, int b) {5�_�   ;   =           <          ����                                                                                                                                                                                                                                                                                                                                      )          v       VR��     �         +          }5�_�   <   >           =          ����                                                                                                                                                                                                                                                                                                                                      *          v       VR��     �         ,          5�_�   =   ?           >          ����                                                                                                                                                                                                                                                                                                                                      *          v       VR��     �         ,          int temp5�_�   >   @           ?          ����                                                                                                                                                                                                                                                                                                                                      *          v       VR��    �         ,            int temp5�_�   ?   A           @          ����                                                                                                                                                                                                                                                                                                                                      ,          v       VR��     �         .          }5�_�   @   B           A           ����                                                                                                                                                                                                                                                                                                                                      .          v       VR��     �         0           while (large % small != 0) {5�_�   A   C           B          ����                                                                                                                                                                                                                                                                                                                                      /          v       VR��     �         1          return 1;5�_�   B   D           C           ����                                                                                                                                                                                                                                                                                                                                      /          v       VR��    �         1       5�_�   C   E           D          ����                                                                                                                                                                                                                                                                                                                                      /          v       VR��     �         1          }5�_�   D   F           E          ����                                                                                                                                                                                                                                                                                                                                      0          v       VR��     �         2           while (large % small != 0) {5�_�   E   G           F          ����                                                                                                                                                                                                                                                                                                                                      0          v       VR��     �         2          while (large %  != 0) {5�_�   F   H           G          ����                                                                                                                                                                                                                                                                                                                                      0          v       VR��     �         2            5�_�   G   I           H          ����                                                                                                                                                                                                                                                                                                                                      1          v       VR��     �         3          return small;5�_�   H   J           I          ����                                                                                                                                                                                                                                                                                                                                      1          v       VR��    �         3              return x;5�_�   I               J          ����                                                                                                                                                                                                                                                                                                                                      2          v       VR��    �         4          return 0;5��