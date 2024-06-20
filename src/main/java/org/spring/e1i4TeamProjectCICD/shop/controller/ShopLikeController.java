package org.spring.e1i4TeamProjectCICD.shop.controller;

import org.spring.e1i4TeamProjectCICD.member.repository.MemberRepository;
import org.spring.e1i4TeamProjectCICD.shop.service.ShopLikeService;
import org.spring.e1i4TeamProjectCICD.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shop")
public class ShopLikeController {

  private final ShopService shopService;
  private final MemberRepository memberRepository;

  private final ShopLikeService shopLikeService;

  @Autowired
  public ShopLikeController(ShopService shopService, MemberRepository memberRepository, ShopLikeService shopLikeService) {
    this.shopService = shopService;
    this.memberRepository = memberRepository;
    this.shopLikeService = shopLikeService;
  }

  @PostMapping("/like")
  public ResponseEntity<String> toggleLikeShop(@RequestParam Long shopId, @RequestParam Long memberId) {
    try {
      String result = shopService.toggleLikeShop(shopId, memberId);
      return ResponseEntity.ok(result);
    } catch (IllegalArgumentException e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    } catch (RuntimeException e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("서버 오류가 발생했습니다.");
    }
  }
  @GetMapping("/checkLikeStatus")
  public ResponseEntity<String> checkLikeStatus(@RequestParam Long shopId, @RequestParam Long memberId) {
    try {
      String likeStatus = shopService.checkLikeStatus(shopId, memberId);
      return ResponseEntity.ok(likeStatus);
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("서버 오류가 발생했습니다.");
    }
  }


}
