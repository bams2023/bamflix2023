# ![image](https://github.com/bams2023/bamflix2023/assets/111734043/4954fe9a-29e4-45e2-be7f-75e52bdf8314)flix2023 

# 밤플릭스

## OTT 서비스 플랫폼

- 조장: 손진경
- 조원: 임하늘, 유다희

밤플릭스는 '밤'의 중의적 의미를 활용하여 혼자 즐기는 OTT 서비스를 기획합니다. 
먹는 '밤'을 활용하여 이모지 표현하며, 다른 OTT 서비스와의 차별점을 가지고 있습니다.

## 주요 특징

- 오롯이 저녁 시간을 혼자 보내는 사람들을 위한 1인 OTT 서비스
- 가격 거품을 뺀 가격 제안
- 주문 기능의 변화: 일반 쇼핑몰과 다르게 배송 서비스가 없으므로 결제 이후 바로 마이페이지에서 확인 가능

## 필수 구현 기능

- 메인 페이지
- 회원 기능
- 상품 기능
- 장바구니 기능
- 주문 기능 - 구독 이용권 및 개별 구매 컨텐츠
- 마이페이지 기능
- 기타 추가 기능 고려 중

## 개발 환경 / 툴

- JDK 11 (Java 11)
- MariaDB
- Spring Boot
- MyBatis
- Thymeleaf
- IntelliJ

## 밤플릭스 주요 정책 사항

- 1인 OTT 서비스로 타 OTT 서비스보다 저렴한 가격으로 이용 가능
- 구독권 결제시 모든 콘텐츠 30일 기간 동안 열람 가능
- 구독권 미결제시 개별 콘텐츠 구입하여 평생 소장 가능
- 구독권 종류는 30일권만 존재, 취소는 추후 구현 예정으로 취소 및 환불 불가
- 구독권은 구독권 구입 페이지 내에서 결제 가능, 개별 구매는 무조건 장바구니 통해서 결제 가능
