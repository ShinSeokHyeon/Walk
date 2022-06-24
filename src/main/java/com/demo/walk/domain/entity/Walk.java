package com.demo.walk.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.demo.walk.domain.enums.SmsStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "walk")
public class Walk {

    @Id
    @Column(name = "walkId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long walkId; // 산책ID

    @Column(name = "walkStartDate")
    private Date walkStartDate; // 산책 시작 일자 (실제)

    @Column(name = "walkEndDate")
    private Date walkEndDate; // 산책 종료 일자 (실제)

    @Column(name = "smsStatus")
    @Enumerated(EnumType.STRING)
    private SmsStatus smsStatus; // SMS 발송 상태

    @Column(name = "reservedId")
    private Long reservedId; // 예약ID

    @Column(name = "userId")
    private Long userId; // 회원ID

    @Column(name = "dogWalkerId")
    private Long dogWalkerId; // 도그워커ID

}
