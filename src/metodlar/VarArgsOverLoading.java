package metodlar;

public class VarArgsOverLoading {
    /*
     * Değişken uzunlukta parametre alan bir metodu aşırı yükleyebiliriz.
     * Oveloading : Aynı isimli metodlar fakat farklı parametreler
     */

    static void Test(int ...v){
        System.out.print("Test(int ...): " + "Number of args: "
                + v.length + " Contents: \n");

        for(int x : v)
            System.out.println(x + " ");

        System.out.println();
    }

    static void Test(boolean ...v){
        System.out.print("Test(boolean ...): " + "Number of args:"
                + " " + v.length + " Contents: \n");

        for(boolean x : v)
            System.out.println(x + " ");

        System.out.println();
    }

    static void Test(String msg, int ...v){
        System.out.print("Test(String, int ...): " + msg
                + v.length + " Contents: \n");

        for(int x : v)
            System.out.println(x + " ");

        System.out.println();
    }

    public static void main(String args[]){
        Test(1, 2, 3);
        Test("Testing", 10, 20);
        Test(true, false, false);

   //     Test();  böyle bir çağrı belirsizliğe yol açar dikkat edilmelidir.
    }
}


/*
ÇIKTI :

Test(int ...): Number of args: 3 Contents:
1
2
3

Test(String, int ...): Testing2 Contents:
10
20

Test(boolean ...): Number of args: 3 Contents:
true
false
false

 */

