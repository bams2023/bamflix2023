package com.bamflix.interceptor;

import com.bamflix.domain.member.MemberResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoginCheckInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
        Object handler) throws Exception {

        // 1. 세션에서 회원 정보 조회
        HttpSession session = request.getSession();
        MemberResponse member = (MemberResponse) session.getAttribute("loginMember");

        // 2. 회원 정보 체크
        if (member == null || member.getDeleteYn() == true) {
            response.sendRedirect("/login");
            return false;
        }

        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}