package org.spring.e1i4TeamProjectCICD.shop.controller;

import lombok.RequiredArgsConstructor;
import org.spring.e1i4TeamProjectCICD.config.MyUserDetailsImpl;
import org.spring.e1i4TeamProjectCICD.shop.dto.ShopDto;
import org.spring.e1i4TeamProjectCICD.shop.dto.ShopReplyDto;
import org.spring.e1i4TeamProjectCICD.shop.service.ShopReplyService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/reply")
public class ShopReplyController {
  private final ShopReplyService shopReplyService;
  
  @PostMapping("/shopReplyWrite")
  public String shopReplyWrite(@AuthenticationPrincipal MyUserDetailsImpl myUserDetails,
                                Model model, ShopReplyDto shopReplyDto, ShopDto shopDto) {

    model.addAttribute("memberName", myUserDetails.getMemberEntity().getName());
    shopReplyService.insertReply(shopReplyDto);

    return "redirect:/shop/shopDetail/" + shopReplyDto.getShopId();
  }
  @GetMapping("/shopReplyDelete/{id}")
  public String shopReplyDelete(@PathVariable("id") Long id) {


    Long shopId = shopReplyService.shopReplyDeleteById(id);

    return "redirect:/shop/shopDetail/" + shopId;
  }

}
