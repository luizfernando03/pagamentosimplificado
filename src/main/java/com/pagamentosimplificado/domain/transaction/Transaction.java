package com.pagamentosimplificado.domain.transaction;

import com.pagamentosimplificado.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name="transaction")
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  long id;
    private BigDecimal amount;
    @ManyToOne
    @JoinColumn(name ="sender_id")
    private User sender;
    @ManyToOne
    @JoinColumn (name = "receiver_id")
    private User receiver;
    private LocalDateTime timestamp;


}
