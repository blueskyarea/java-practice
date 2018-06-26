package test.java.practice.mock.jmockit.example1;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import main.java.practice.mock.jmockit.example1.Member;
import main.java.practice.mock.jmockit.example1.PointCard;
import mockit.Expectations;
import mockit.Mocked;
import mockit.integration.junit4.JMockit;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JMockit.class)
public class MemberTest {	
	// Without mock
	@Test
	public void testGetMemberInfoWithoutMock() {
		Member member = new Member(1, "hoge");
		assertThat(member.getPointCard().getPoint(), is(1000L));
	}
	
	// With Mock
	@Test
	public void testGetMemberInfoWithMock(@Mocked Member member) {
		PointCard pointCard = new PointCard(1, "hoge", 2000L);
		new Expectations() {
            {
                member.getPointCard();
                result = pointCard;
            }
        };
        assertThat(member.getPointCard(), is(pointCard));
		assertThat(pointCard.getPoint(), is(2000L));
	}
}
