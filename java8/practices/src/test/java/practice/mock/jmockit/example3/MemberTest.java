package practice.mock.jmockit.example3;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import practice.mock.jmockit.example3.Member;
import practice.mock.jmockit.example3.PointCard;
import mockit.NonStrictExpectations;
import mockit.integration.junit4.JMockit;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JMockit.class)
public class MemberTest {
	@Test
	public void testGetPointIsMocked() {
		new NonStrictExpectations(PointCard.class) {
            {
                new PointCard().getPoint();
                result = 7777L;
            }
        };
        Member member = new Member();
        assertThat(member.getMemberNameAndPoint(), is("hoge_7777"));
	}
}
