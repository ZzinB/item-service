package hello.itemservice.domain.item;

import lombok.Data;

// DTO의 경우 @Data 를 사용해도 되지만(물론 확인필요) 도메인 item 에서 @Data를 쓰는건 위험
@Data // 안쓰는게 낫다
//@Getter @Setter // 이거 쓰는게 낫다

public class Item {
    private Long id;
    private  String itemName;
    private Integer price;
    private  Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
