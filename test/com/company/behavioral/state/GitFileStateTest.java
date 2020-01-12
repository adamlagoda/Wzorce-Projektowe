package com.company.behavioral.state;

import org.junit.Assert;
import org.junit.Test;

public class GitFileStateTest {

    @Test
    public void whenFileCreatedThenStateUntracked() {
        GitFile file = new GitFile();
        Assert.assertEquals("Untracked", file.status());
    }

    @Test
    public void whenFileAddedThenStateStaged() {
        GitFile file = new GitFile();
        file.add();
        Assert.assertEquals("Staged", file.status());
    }
}
