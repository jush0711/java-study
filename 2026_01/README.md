공부내용 요약 및 느낀 점
-  
2026/01/22  
Method, MethodOverloading, MethodClass  
1. static은 classMethod에 사용된다. 클래스 변수는 고유의 변수
2. 인스턴스 Method는 객체마다 다른 변수

classMethod 안에 인스턴스 Method를 사용할 수 없다.
  
- class 메소드는 메모리로 바로 올라가며 인스턴스 메소드는 객체마다 변경됨

MethodOverloading  
같은 이름을 가진 변수라도
1. 다른 형태의 값을 가지거나
2. 다른 갯수를 가지고 있을 때
3. overloading이 가능합니다
  
그래서 Method 안에 Method를 넣을 수 있음
  
  
2026/01/23  
This 
1. 메소드의 매개변수값과 인스턴스 변수의 이름이 같을 때
2. Java는 가까운 매개변수를 선택하게 되는데
3. 이 때 인스턴스 변수를 선택하기 위해 this가 사용된다.
  
// static 안에서는 this가 사용될 수 없다. static은 객체가 태어나기 전부터 존재한다.   
고로 this는 사용할 수 없다.  
// 변수는 값은 담는 상자라 생각, 그래서 b1.modelName 에 괄호가 필요없다.  
메소드는 입이 있다, 그래서 b1.appendModelName() 에 괄호가 들어간다

2026/01/30  
constructor , GetterSetter  
1. constructor 생성자는 객체의 초기 상태를 강제하기 위해 사용
2. GetterSetter는 데이터 가공과 보호를 위해 사용됨
  
생성자는
1. 클래스명과 동일한 이름으로 설정해야함
2. 생성자 오버로딩 가능함
3. this로 생성자에서 생성자를 실행할 수 있음 (생성자간 호출 가능)
  
Getter & Setter
1. getter는 데이터를 추출하는 입구, return을 꼭 사용해야함
2. setter은 데이터를 주입하는 입구, 반환타입은 void, this를 주로 사용함