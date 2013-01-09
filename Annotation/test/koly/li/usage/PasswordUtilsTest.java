package koly.li.usage;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PasswordUtilsTest {

    private PasswordUtils passwordUtils;
    private List<String> passwords;

    @Before
    public void setUp() throws Exception {
        passwordUtils = new PasswordUtils();
        passwords = new ArrayList<String>();
        passwords.add("123");
        passwords.add("456");
    }

    @Test
    public void should_return_true_with_right_password() throws Exception {
        assertThat(passwordUtils.validatePassword("12kj"), is(true));
    }

    @Test
    public void should_return_false_with_wrong_password() throws Exception {
        assertThat(passwordUtils.validatePassword("kj"), is(false));
    }

    @Test
    public void test_Encrypt_Password() throws Exception {
        assertThat(passwordUtils.encryptPassword("123abc"), is("cba321"));
    }

    @Test
    public void should_return_true_when_check_new_password() throws Exception {
        assertThat(passwordUtils.checkForNewPassword(passwords,"798"), is(true));
    }

    @Test
    public void should_return_false_when_check_old_password() throws Exception {
        assertThat(passwordUtils.checkForNewPassword(passwords,"123"), is(false));
    }
}
