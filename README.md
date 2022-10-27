# 3 단계: 로또(자동)

## 기능요구사항

- 금액에 따른 구매 개수 기능 구현
- 로또 추첨 구현
- 당첨 통계 구현
- 총 수익률 구현
- UI 로직 구현
  - InputView 구현
    - 구입금액, 지난주 당첨 번호
  - OutputView 구현
    - 구매 내역
    - 당첨 통계
    - 수익률

# 2단계: 문자열 덧셈 계산기

## 기능요구사항

- 문자열 파싱 클래스 구현
  - 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리
    - (예: “” => 0, "1,2" => 1 + 2, "1,2,3" => 1 + 2 + 3, “1,2:3” => 1 + 2 + 3)
  - 커스텀 구분자를 지정할 수 있도록 함수 구현
    - 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용
    - 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 1 + 2 + 3 으로 분리
- 계산 클래스 구현
  - 파싱 후에 숫자 이외의 값 또는 음수가 있는 경우 RuntimeException 예외를 throw한다.
  - 파싱 후에 남아있는 숫자들을 더한다.