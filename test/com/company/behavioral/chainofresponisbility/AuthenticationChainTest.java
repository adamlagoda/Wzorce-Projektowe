package com.company.behavioral.chainofresponisbility;

import com.company.behavioral.chainofrepsonsibility.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AuthenticationChainTest {

    private static AuthenticationProcessor path;

   @BeforeClass
   public static void createResponsibilityChain() {
       AuthenticationProcessor second = new OAuthProcessor(null);
       AuthenticationProcessor first = new UsernamePasswordProcessor(second);
       path = first;
   }

    @Test
    public void whenOAuthProviderThenAuthorize() {
        AuthenticationProvider provider = new OAuthTokenProvider();
        Assert.assertTrue(path.isAuthorized(provider));
    }

    @Test
    public void whenUsernamePasswordProviderThenAuthorize() {
        AuthenticationProvider provider = new UsernamePasswordProvider();
        Assert.assertTrue(path.isAuthorized(provider));
    }

    @Test
    public void whenLDAPProviderThenUnauthorize() {
        AuthenticationProvider provider = new LDAPProvider();
        Assert.assertFalse(path.isAuthorized(provider));
    }
}
