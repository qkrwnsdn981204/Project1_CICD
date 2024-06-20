package org.spring.e1i4TeamProjectCICD.controller;

import lombok.RequiredArgsConstructor;
import org.spring.e1i4TeamProjectCICD.board.dto.BoardDto;
import org.spring.e1i4TeamProjectCICD.board.service.BoardService;
import org.spring.e1i4TeamProjectCICD.member.dto.MemberDto;
import org.spring.e1i4TeamProjectCICD.member.service.MemberService;
import org.spring.e1i4TeamProjectCICD.shop.dto.ShopDto;
import org.spring.e1i4TeamProjectCICD.shop.service.ShopService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class HomeController {

    private final MemberService memberService;

    private final BoardService boardService;

    private final ShopService shopService;


    @GetMapping({"","/index"})
    public String index(MemberDto memberDto, BoardDto boardDto,Model model)
    {

        List<ShopDto> liked = shopService.liked();
        model.addAttribute("memberDto", memberDto);

        List<BoardDto> boardDtoList = boardService.topReviewBoardList(boardDto);

        model.addAttribute("boardDtoList", boardDtoList);
        model.addAttribute("liked", liked);


        return "index";
    }

}

