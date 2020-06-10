# Втора лабораториска вежба по Софтверско инженерство

## Дамјан Качарев, бр. на индекс 186070

### Група на код:
Ја добив групата на код 4

### Control Flow Graph
![control_flow_graph](https://user-images.githubusercontent.com/63473931/84256420-29f77400-ab14-11ea-80fd-f527013402c9.png)
![class SILab2](https://user-images.githubusercontent.com/63473931/84256647-7cd12b80-ab14-11ea-9fef-4beb45ebb1f5.png)

### Цикломатска комплексност
Цикломатската комплексност на оваа функција е 9. Истата ја добив со функцијата Е-V+2, каде Е е бројот на ребра, V е бројот на темиња, односно 24-17+2=9. 

### Тест случаи според критериумот  Every statement
За овој критериум потревно е да генерираме test case-ови кои ќе овозможат тестирање на секоја наредба односно секој statement од кодот.
Во нашиот случај ги имаме следните statements:

A: String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}"

B: if (user!=null)

C: if (user.getUsername()!=null && user.getPassword()!=null)

D: String password = user.getPassword()

E: String passwordLower = password.toLowerCase()

F: if (!passwordLower.contains(user.getUsername().toLowerCase()) && password.length()>=8)

G: boolean digit = false, upper = false, special = false

H: for (int i=0;i<password.length();i++)

I: if (Character.isDigit(password.charAt(i)))

J: digit = true

K: if (Character.isUpperCase(password.charAt(i)))

L: upper = true

M: if (specialCharacters.contains(String.valueOf(password.charAt(i))))

N: special = true

O: if (digit && upper && special)

P: return true

Q: return false

Тест случај бр: 1
За првиот тест случај од овој критериум ги испраќаме следниве аргументи:
user=damjan  password=D-1234567 email=dame.kacharev@gmail.com
Со нив се поминуваат сите statements освен Q, односно се поминуваат A, B, C, D, E, F, G, H, I, J, K, L, M, N, O и P.
Овој тест треба да има вредност true.

Тест случај бр: 2
Со овој случај го изминуваме останатиот statement Q и ги испраќаме следниве аргументи:
user=damjan  password=D1234567 email=dame.kacharev@gmail.com
Со нив ги поминуваме A, B, C, D, E, F, G, H, I, J, K, L и Q.
Овој тест треба да има вредност false.

### Тест случаи според критериумот Every branch
Оваа метода е потемелна од Every statement методата. Во оваа метода треба да се генерираат test case-ови кои во јазлите за одлука ќе ги посетат двата исходи на одлуката.
За овој метод ги имаме следните branches:

AB-C
AB-Q
C-D
C-Q
D-E
E-F
F-G
F-Q
G-H
H-I
I-J
I-K
J-K
K-L
K-M
L-M
M-H
M-N
M-O
N-O
O-P
O-Q
N-H

Тест случај бр: 1
За првиот тест случај ги испраќаме следниве аргументи:
user=damjan ; password=D-1234567 ;email=dame.kacharev@gmail.com
Овој тест треба да има вредност true.
Со овој тест ги поминуваме следните разгранувања:
AB-C, C-D, D-E, E-F, F-G, G-H, H-I, I-J, J-K, K-L, L-M, M-N, N-O, O-P, N-H

Тест случај бр: 2
За вториот тест случај ги испраќаме следниве аргументи:
user=null ; password=null ;email=null
Овој тест треба да има вредност false.
Со овој тест се поминува само  AB-Q

Тест случај бр: 3
За третиот тест случај ги испраќаме следниве аргументи:
user=null ; password=D-1234567 ;email=dame.kacharev@gmail.com
Овој тест треба да има вредност false.
Со овој тест се поминуваат разгранувањата AB-C и C-Q.

Тест случај бр: 4
За четвртиот тест случај ги испраќаме следниве аргументи:
user=damjan ; password=1234 ;email=dame.kacharev@gmail.com
Овој тест треба да има вредност false.
Со овој тест се поминуваат разгранувањата AB-C, C-D, D-E, E-F, F-Q

Тест случај бр: 5
За петиот тест случај ги испраќаме следниве аргументи:
user=damjan ; password=12345678 ;email=dame.kacharev@gmail.com
Овој тест треба да има вредност false.
Со овој тест дополнително се поминуваат разгранувањата: K-M, M-H, M-O, O-Q


Тест случај бр: 6
За шестиот тест случај ги испраќаме следниве аргументи:
user=damjan ; password=abcdefkasdkj ;email=dame.kacharev@gmail.com
Овој тест треба да има вредност false.
Со овој случај дополнително се поминува разгранувањето I-K

### Објаснување на напишаните unit tests
Првиот unit тест се однесува на тест случаите според Every statement критериумот. Содржи од 2 проверки, каде секоја проверка се изведува со assertEquals, односно се проверува дали резултатот кој го враќа функцијата се совпаѓа со резултатот кој е предвиден.

Вториот unit тест се однесува на тест случаите според Every branch критериумот. Се содржи од 6 проверки, каде секоја проверка се изведува со assertEquals, односно се проверува дали резултатот кој го враќа функцијата се совпаѓа со резултатот кој е предвиден.
