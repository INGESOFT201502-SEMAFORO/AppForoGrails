package appforograils

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
class UserSpec extends Specification {



    /* def setup() {
     }

     def cleanup() {
     }
 */
    void "usuariovalido"() {
        when:
        def Sergio = new User(
                name: 'Esteban',
                lastname: 'Gabalan',
                age: 44,
                username: 'sumadresama',
                password: 'Qwerty12345'
        )
        then:
        user.validate()
    }
    void "usuarioinvalido"() {
        when:
        def David = new User(
                name: '',
                lastname: 'ui',
                age: 9,
                username: 'sumadresama',
                password: 'hola'
        )
        then:
        user.validate()

    }


}

