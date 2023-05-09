package net.nvsoftware.iOrderService.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import net.nvsoftware.iOrderService.model.PaymentMode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;

@Entity
@Data
@AllArgsConstructor
@Builder
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderId;
    private long productId;
    private long orderQuantity;
    private long totalAmount;
    private String paymentMode;
    private Instant orderDate;
    private String orderStatus;
}
