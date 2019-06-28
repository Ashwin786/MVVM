package com.rk.mvvm;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private byte[] bytes;

    @Test
    public void addition_isCorrect() throws Exception {
//        assertEquals(4, 2 + 2);
//        bytecheck();
        System.out.print("is Sale allowed = "+is_sale_Allowed("5,25",26));

    }

    private boolean is_sale_Allowed(String status, int today) {
        if (StringUtils.isNotEmpty(status)) {
            String[] dates = status.split(",");
            int startDate = 0;
            int endDate = 31;
            if (dates.length == 2) {
                startDate = StringUtils.isNotEmpty(dates[0]) ? Integer.parseInt(dates[0]) : 0;
                endDate = StringUtils.isNotEmpty(dates[1]) ? Integer.parseInt(dates[1]) : 31;
            } else if (dates.length == 1) {
                startDate = StringUtils.isNotEmpty(dates[0]) ? Integer.parseInt(dates[0]) : 0;
            }
            if(today >= startDate && today <= endDate)
                return true;
            else
                return false;
        }
        return true;
    }

    private void bytecheck() {
        String i = "100";
        //            bytes = intToByteArray(i);
        bytes = i.getBytes();
        System.out.println(""+bytes.toString());

    }
    private byte[] intToByteArray ( final int i ) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(bos);
        dos.writeInt(i);
        dos.flush();
        return bos.toByteArray();
    }
}