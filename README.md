[//]: # (## [NEXTSTEP 플레이그라운드의 미션 진행 과정]&#40;https://github.com/next-step/nextstep-docs/blob/master/playground/README.md&#41;)

[//]: # ()
[//]: # (---)

[//]: # (## 학습 효과를 높이기 위해 추천하는 미션 진행 방법)

[//]: # ()
[//]: # (---)

[//]: # (1. 피드백 강의 전까지 미션 진행 )

[//]: # (> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit)

[//]: # (> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push)

[//]: # ()
[//]: # (![mission baseball]&#40;https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png&#41;)

[//]: # ()
[//]: # (---)

[//]: # (2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.)

[//]: # ()
[//]: # (---)

[//]: # (3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.)

[//]: # ()
[//]: # (```)

[//]: # (git branch -a // 모든 로컬 브랜치 확인)

[//]: # (git checkout master // 기본 브랜치가 master인 경우)

[//]: # (git checkout main // 기본 브랜치가 main인 경우)

[//]: # ()
[//]: # (git checkout -b 브랜치이름)

[//]: # (ex&#41; git checkout -b apply-feedback)

[//]: # (```)

## 기능 요구 사항
1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임

같은수가 같은 자리 - 스트라이크

다른 자리 - 볼

같은 수가 전혀 없음 - 포볼, 낫싱

## 클래스
> 한가지 역할만을 가지고 있는것으로 설계를 해보도록 노력하자.
> 
- 메인
  - 게임 클래스가 WHILE 문으로 동작
- 야구게임
  - 서로 다른 3자리 랜덤한 숫자 만들기
  - 문자열 내에 몇볼 몇 스트라이크인지 확인하는 부분
  - 실행 결과 출력
- Player
- Computer
