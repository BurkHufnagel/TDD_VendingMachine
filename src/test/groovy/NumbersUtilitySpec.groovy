import spock.lang.PendingFeature
import spock.lang.Specification

class NumbersUtilitySpec extends Specification {

    def "6 should be identified as a perfect number"() {
        given: "an instance of NumberUtility"
        def utility = new NumbersUtility()

        when: "checking if 6 is a perfect number"
        def result = utility.isPerfectNumber(6)

        then: "the result should be true"
        result == true
    }


    def "8 should not be identified as a perfect number"() {
        given: "an instance of NumberUtility"
        def utility = new NumbersUtility()

        when: "checking if 8 is a perfect number"
        def result = utility.isPerfectNumber(8)

        then: "the result should be false"
        result == false
    }


    def "16 should not be identified as a perfect number"() {
//        given: "an instance of NumberUtility"
//        def utility = new NumbersUtility()

        expect: "16 to be identified as not being a perfect number"
        NumbersUtility.isPerfectNumber(16) == false

//        then: "the result should be false"
//        result == false
    }


    def "When asked for the factors of 6, it should return 1, 2, 3"() {
        given: "an instance of NumbersUtility"
        def utility = new NumbersUtility()

        when: "asked for the factors of 6"
        def factors = utility.getFactors(6)

        then: "it should return '1, 2, 3'"
        def expectedValues = [1,2,3] as Set
        factors.equals( expectedValues )
    }


    def "When asked for the factors of 16, it should return 1, 2, 4, 8"() {
        given: "an instance of NumbersUtility"
        def utility = new NumbersUtility()

        when: "asked for the factors of 16"
        def factors = utility.getFactors(16)

        then: "it should return '1, 2, 4, 8'"
        def expectedValues = [1,2,4,8] as Set
        factors.equals( expectedValues )
    }

    def "summing the values 1,2,4,8 should be 15"() {
        when: "when a collection containing the value 1,2,4,8 is summed"
        def sum = NumbersUtility.sumValues([1,2,4,8] as Set)

        then: "the value should be 15"
        sum == 15

    }
}
