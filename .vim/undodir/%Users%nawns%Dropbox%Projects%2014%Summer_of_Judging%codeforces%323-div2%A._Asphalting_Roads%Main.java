Vim�UnDo� �b$�\���q�۽��n�H� �0x��^��d-   "                 P       P   P   P    V	�    _�                            ����                                                                                                                                                                                                                                                                                                                                                             V�     �                     String line = br.readLine();5�_�                       M    ����                                                                                                                                                                                                                                                                                                                                                             V�     �      	         M    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));5�_�                       	    ����                                                                                                                                                                                                                                                                                                                                                             V�     �         
      ,    int N = Integer.parseInt(br.readLine());5�_�                            ����                                                                                                                                                                                                                                                                                                                                                             V�     �      
   
       5�_�                    	       ����                                                                                                                                                                                                                                                                                                                                                             V�     �                   }5�_�                    	       ����                                                                                                                                                                                                                                                                                                                                                             V�     �                   5�_�                    
   '    ����                                                                                                                                                                                                                                                                                                                                                             V�     �   
          �   
          5�_�      	                     ����                                                                                                                                                                                                                                                                                                                                                             V�     �   
            (      int h = Integer.parseInt(line[0]);5�_�      
           	      %    ����                                                                                                                                                                                                                                                                                                                                                             V�    �   
            (      int v = Integer.parseInt(line[0]);5�_�   	              
      ,    ����                                                                                                                                                                                                                                                                                                                                                             VP     �      	         ,    int n = Integer.parseInt(br.readLine());5�_�   
                        ����                                                                                                                                                                                                                                                                                                                                                             V[     �      
             int[] paved = new int[n*n];5�_�                       (    ����                                                                                                                                                                                                                                                                                                                                                             Va     �               (      int v = Integer.parseInt(line[1]);5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             Vf     �                     if (paved[h]5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             Vg     �                     if (paved[h-1]5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             Vn     �                     }5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             Vp     �                   }5�_�                   	       ����                                                                                                                                                                                                                                                                                                                                                             Vx     �                   Arrays.fill(paved, -1);5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             V{     �                     5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             V�     �                   System.out.println(count);5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             V�    �                       paved[h-1]5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             V�     �                       paved[h-1] = 1;5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             V�    �                       paved[v-1] = 1;5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             V�     �   
            %    for (int i = 0; i < n * n; i++) {5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             V�    �   
            &    for (int i = 0; i <= n * n; i++) {5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             V�     �                   }5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             V�     �                   }5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             V�     �                   5�_�                           ����                                                                                                                                                                                                                                                                                                                                                             V�     �                      System.out.println(5�_�                       '    ����                                                                                                                                                                                                                                                                                                                                                             V�     �               '    for (int i = 0; i < paved.length) {5�_�                            ����                                                                                                                                                                                                                                                                                                                                                             V�     �                   }5�_�      !                       ����                                                                                                                                                                                                                                                                                                                                                             V�     �                5�_�       "           !          ����                                                                                                                                                                                                                                                                                                                                                             V�     �                   }5�_�   !   #           "          ����                                                                                                                                                                                                                                                                                                                                                             V�     �                   }5�_�   "   $           #          ����                                                                                                                                                                                                                                                                                                                                                             V�     �                   5�_�   #   %           $          ����                                                                                                                                                                                                                                                                                                                                                             V�     �                /    System.out.println(Arrays.toString(paved));5�_�   $   &           %          ����                                                                                                                                                                                                                                                                                                                                                             V�     �                     5�_�   %   '           &      '    ����                                                                                                                                                                                                                                                                                                                                                             V�     �               '    for (int i = 0; i < paved.length) {5�_�   &   (           '          ����                                                                                                                                                                                                                                                                                                                                                             V�     �                     System.out.print  5�_�   '   )           (          ����                                                                                                                                                                                                                                                                                                                                                             V�     �                     System.out.print(5�_�   (   *           )          ����                                                                                                                                                                                                                                                                                                                                                             V�     �                   }5�_�   )   +           *          ����                                                                                                                                                                                                                                                                                                                                                             V     �                        System.out.print(5�_�   *   ,           +      "    ����                                                                                                                                                                                                                                                                                                                                                             V    �                "        System.out.print(paved[i])5�_�   +   -           ,      $    ����                                                                                                                                                                                                                                                                                                                                                             V     �         "      '    for (int i = 0; i < paved.length) {5�_�   ,   .           -      $    ����                                                                                                                                                                                                                                                                                                                                                             V     �         "      '    for (int i = 0; i < paved.length) {5�_�   -   /           .          ����                                                                                                                                                                                                                                                                                                                                                             V     �         "           for (int i = 0; i < n * n) {5�_�   .   0           /      %    ����                                                                                                                                                                                                                                                                                                                                                             V   	 �         "      (    for (int i = 0; i < paved.length;) {5�_�   /   1           0      "    ����                                                                                                                                                                                                                                                                                                                                                             V#   
 �         "      "        System.out.print(paved[i])5�_�   0   2           1          ����                                                                                                                                                                                                                                                                                                                                                             V5     �         "            if (paved[i] != -1)5�_�   1   3           2          ����                                                                                                                                                                                                                                                                                                                                                             V6     �          "              System.out.print(" ");5�_�   2   4           3          ����                                                                                                                                                                                                                                                                                                                                                v       V8    �         #            if (i != last)           System.out.print(" ");5�_�   3   5           4          ����                                                                                                                                                                                                                                                                                                                                                             V�     �         #          int[] paved = new int[n*n];5�_�   4   6           5          ����                                                                                                                                                                                                                                                                                                                                                             V�     �         %    �         %    5�_�   5   7           6          ����                                                                                                                                                                                                                                                                                                                                                             V�     �         &    �         &    5�_�   6   8           7          ����                                                                                                                                                                                                                                                                                                                                                             V�     �         '          Arrays.fill(paved, -1);5�_�   7   9           8          ����                                                                                                                                                                                                                                                                                                                                                             V�    �         '          Arrays.fill(paved, -1);5�_�   8   :           9          ����                                                                                                                                                                                                                                                                                                                                                             V�     �         '      1      if (paved[h-1] == -1 && paved[v-1] == -1) {5�_�   9   ;           :      $    ����                                                                                                                                                                                                                                                                                                                                                             V�     �         '      2      if (pavedv[h-1] == -1 && paved[v-1] == -1) {5�_�   :   <           ;          ����                                                                                                                                                                                                                                                                                                                                                             V�     �         '      3      if (pavedv[h-1] == -1 && pavedv[v-1] == -1) {5�_�   ;   =           <          ����                                                                                                                                                                                                                                                                                                                                                             V�     �         '              paved[h-1] = i;5�_�   <   >           =          ����                                                                                                                                                                                                                                                                                                                                                             V�    �         '              paved[v-1] = i;5�_�   =   ?           >          ����                                                                                                                                                                                                                                                                                                                                                             V�    �         '              pavedv[v-1] = i;5�_�   >   A           ?          ����                                                                                                                                                                                                                                                                                                                                                             V	4    �         )              pavedv[v-1] = i;5�_�   ?   B   @       A          ����                                                                                                                                                                                                                                                                                                                                                             V	8     �                        lst.add(i);5�_�   A   C           B          ����                                                                                                                                                                                                                                                                                                                                                             V	9    �         )    �         )    5�_�   B   D           C          ����                                                                                                                                                                                                                                                                                                                                                             V	>    �         *          int count = 0;5�_�   C   E           D          ����                                                                                                                                                                                                                                                                                                                                                             V	G     �                    int last = -1;   %    for (int i = 0; i < n * n; i++) {5�_�   D   F           E          ����                                                                                                                                                                                                                                                                                                                                                             V	G     �                      if (paved[i] != -1)           last = i;5�_�   E   G           F          ����                                                                                                                                                                                                                                                                                                                                                             V	H     �                    }   %    for (int i = 0; i < n * n; i++) {5�_�   F   H           G          ����                                                                                                                                                                                                                                                                                                                                                             V	H     �                      if (paved[i] != -1) {   #        System.out.print(paved[i]);5�_�   G   I           H          ����                                                                                                                                                                                                                                                                                                                                                             V	H     �                        if (i != last)              System.out.print(" ");5�_�   H   J           I          ����                                                                                                                                                                                                                                                                                                                                                             V	H     �                      }5�_�   I   K           J          ����                                                                                                                                                                                                                                                                                                                                                             V	I     �                    }5�_�   J   L           K          ����                                                                                                                                                                                                                                                                                                                                                             V	I     �                   }5�_�   K   M           L          ����                                                                                                                                                                                                                                                                                                                                                             V	R     �          !          }5�_�   L   N           M          ����                                                                                                                                                                                                                                                                                                                                                             V	R     �         "          5�_�   M   O           N      #    ����                                                                                                                                                                                                                                                                                                                                                             V	Y    �      !   "      #      System.out.print(lst.get(i));5�_�   N   P           O          ����                                                                                                                                                                                                                                                                                                                                                             V	�     �                        count++;5�_�   O               P          ����                                                                                                                                                                                                                                                                                                                                                             V	�    �                    int count = 0;5�_�   ?           A   @          ����                                                                                                                                                                                                                                                                                                                                                             V	6     �              5�_�                    	       ����                                                                                                                                                                                                                                                                                                                                                             Vt     �      
             Arrays.fill(paved, -1);       int count = 0;       int count = 0;       int count = 0;       int count = 0;5��