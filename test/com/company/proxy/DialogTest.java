package com.company.proxy;

import com.company.factorymethod.Dialog;
import com.company.factorymethod.HTMLDialog;
import com.company.factorymethod.WindowsDialog;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class DialogTest {

    private OutputStream baos;
    private PrintStream ps;
    private PrintStream oldOut = System.out;

    @Before
    public void setupOutputStream() {
        baos = new ByteArrayOutputStream();
        ps = new PrintStream(baos);
        System.setOut(ps);
    }

    @After
    public void restoreOutputStreams() {
        System.setOut(oldOut);
        ps.close();
    }

    @Test
    public void whenWindowsDialogCreatedThenWindowsButtonRendered() {
        Dialog dialog = new WindowsDialog();
        dialog.render();
        Assert.assertEquals("Rendered Windows Button", baos.toString());
    }
    @Test
    public void whenHTMLDialogCreatedThenHTMLButtonRendered() {
        Dialog dialog = new HTMLDialog();
        dialog.render();
        Assert.assertEquals("Rendered HTML Button", baos.toString());
    }

}
