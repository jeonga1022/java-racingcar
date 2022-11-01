# 3단계 - 자동차 경주
## 기능 목록 정리
- 사용자는 자동차 대수를 입력할 수 있다.
- 사용자는 시도햘 횟수를 입력할 수 있다.
- 자동차는 전진하거나 멈출 수 있다.
    - 전진 조건은 0에서 9사이 random 값을 구한 후 random 값이 4이상이어야 한다.
- 자동차 상태를 화면에 출력한다.

- Domain
  - Cars
  - Car
    - position
    - move()

- UI
    - InputView
    - ResultView

- Controller
    - RacingGame

- Strategy
    - MoveStrategy