@main def hello(): Unit =
  try {
    assert(true, 1 / 0)
    assert(false, 1 / 1)
  } catch {
    case assertionError: AssertionError => assertionError.printStackTrace()
  }
