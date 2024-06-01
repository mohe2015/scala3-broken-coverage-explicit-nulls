case class Test[T](value: T)

given canEqual[T]: CanEqual[Test[T], Test[T]] = CanEqual.derived

@main def hello(): Unit =
  print(Test(1) == Test(1))
