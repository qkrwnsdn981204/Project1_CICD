package org.spring.e1i4TeamProjectCICD.shop.entity;

import lombok.*;
import org.spring.e1i4TeamProjectCICD.contraint.BaseTimeEntity;
import org.spring.e1i4TeamProjectCICD.member.entity.MemberEntity;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "shop_like")
public class ShopLikeEntity extends BaseTimeEntity {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "shop_id", nullable = false)
  private ShopEntity shopEntity;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "member_id", nullable = false)
  private MemberEntity memberEntity;

  @Column(nullable = false)
  private boolean liked;

  public ShopLikeEntity(ShopEntity shopEntity, MemberEntity memberEntity) {
    this.shopEntity = shopEntity;
    this.memberEntity = memberEntity;
    this.liked = true;
  }


}
