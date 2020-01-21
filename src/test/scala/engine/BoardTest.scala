package engine

import org.scalatest.FunSpec

class BoardTest extends FunSpec {
  describe("TEST FOR gameBoard") {
    case class TestCase(name: String, expected: Vector[Engine.State])

    val testCases = Vector(
      TestCase("Given game board is called without any interaction, it should return an empty board", Vector())
    )

    testCases.foreach((testCase: TestCase) => {
      it(testCase.name) {
        assert(Engine.Board() == testCase.expected)
      }
    })
  }
}
