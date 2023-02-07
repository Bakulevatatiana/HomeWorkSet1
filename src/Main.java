import java.util.*;

public class Main {
    public static void main(String[] args) throws ProductAlreadyExistsException, IllegalAccessException {

       Product potato= new Product("картошка",50,5);
       Product onion=new Product("лук",20,2);
       ProductList productList=new ProductList();
       productList.addProduct(potato);
        productList.addProduct(onion);

        System.out.println(productList);

    }
    private static void numbersSetRemoveEven(){
        Set<Integer> numbers= new HashSet<>(20);
        Random random= new Random();
        while (numbers.size()<20) {
            numbers.add(random.nextInt( 1000));
        }
        System.out.println(numbers);
        numbers.removeIf(nex->nex%2 !=0);
        System.out.println(numbers);

    }
    //task 1.3
    Map<Integer,String> orderedMap=new LinkedHashMap<>();
    {
        orderedMap.put(5,"Test5");
        orderedMap.put(1,"Test1");
        orderedMap.put(3,"Test3");
        orderedMap.put(2,"Test2");
        orderedMap.put(6,"Test6");
        orderedMap.put(7,"Test7");
        orderedMap.put(8,"Test8");
        orderedMap.put(10,"Test10");
        orderedMap.put(9,"Test9");
        for (Map.Entry<Integer,String> entry:orderedMap.entrySet()){
            System.out.printf("%d:%s%n",entry.getKey(),entry.getValue());
        }
    }
}