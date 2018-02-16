# javaPractice

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

public class Task {


  private static class Item {
    int id;
    float weight;
    int price;

    @Override
    public String toString() {
      return "Item{" +
              "id=" + id +
              ", weight=" + weight +
              ", price=" + price +
              '}';
    }

    public Item(int id, float weight, int price) {
      this.id = id;
      this.weight = weight;
      this.price = price;

    }
  }


  public static void main(String[] args) {
    List<Item> items1 = new ArrayList<>();
//    items1.add(new Item(1, 5f, 10));
//    items1.add(new Item(2, 9f, 10));
//    items1.add(new Item(3, 8f, 10));
//    items1.add(new Item(4, 1f, 10));
//    items1.add(new Item(5, 3f, 10));


    items1.add(new Item(1, 5f, 10));
    items1.add(new Item(2, 9f, 11));
    items1.add(new Item(3, 8f, 9));
    items1.add(new Item(4, 1f, 15));
    items1.add(new Item(5, 4f, 10));
    items1.add(new Item(6, 3f, 15));
    items1.add(new Item(7, 2f, 8));

    int maxWeight = 9;
    packer(items1, maxWeight);
  }

  public static void packer(List<Item> items, float maxWeight) {
//    Map<Integer, List<Item>> itemMap = new HashMap<>();

    items.sort(new Comparator<Item>() {
      @Override
      public int compare(Item o1, Item o2) {
        return (int) (o2.weight - o1.weight);
      }
    });

    System.out.println(items);
    List<Item> maxList = new ArrayList<>();
    int maxResultPrice = 0;
    float maxResultWeight = maxWeight;

    for (int i = 0; i < items.size(); i++) {
      Item item = items.get(i);


      if (item.weight < maxWeight) {
        float tempWeight = item.weight;
        int tempMaxPrice = item.price;

        List<Item> tempList = new ArrayList<>();
        tempList.add(item);
        for (int k = items.size() - 1; k > i; k--) {
          if ((tempWeight + items.get(k).weight) > maxWeight) {
            break;
          }
          for (int j = k; j > i; j--) {

            Item nextItem = items.get(j);
            if ((tempWeight + nextItem.weight) <= maxWeight) {
              tempWeight += nextItem.weight;
              tempMaxPrice += nextItem.price;
              tempList.add(nextItem);
            } else {
              break;
            }

          }
          if ((maxResultPrice < tempMaxPrice && maxWeight >= tempWeight) ||
                  (maxResultPrice == tempMaxPrice && maxWeight > tempWeight)) {
            maxList = tempList;

            maxResultPrice = tempMaxPrice;
            maxResultWeight = tempWeight;
          }

          tempWeight = item.weight;
          tempMaxPrice = item.price;
          tempList = new ArrayList<>();
          tempList.add(item);
        }

      } else if (item.weight == maxWeight) {
        if (maxResultPrice <= item.price && maxResultWeight >= item.weight) {
          maxList = Collections.singletonList(item);
        }

      }

    }
    System.out.println(maxList);
  }

}
