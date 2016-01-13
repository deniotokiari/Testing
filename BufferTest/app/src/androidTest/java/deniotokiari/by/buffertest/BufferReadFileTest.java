package deniotokiari.by.buffertest;

import android.test.AndroidTestCase;

import java.io.IOException;
import java.io.InputStream;

public class BufferReadFileTest extends AndroidTestCase {

    static final String PATH = "test";
    static final int COUNT = 10;

    public void test_OK_IO() throws Exception {
        for (int i = 0; i < COUNT; i++) {
            BufferRider.read(getInputStream(), BufferRider.IReader.OK_IO_STREAM_FILE);
        }
    }

    /*public void test_OK_IO() throws Exception {
        BufferRider.read(getInputStream(), BufferRider.IReader.OK_IO_FILE);
    }*/

    public void test_JAVA() throws Exception {
        for (int i = 0; i < COUNT; i++) {
            BufferRider.read(getInputStream(), BufferRider.IReader.JAVA_FILE);
        }
    }

    public void test_JAVA_BUFFERED() throws Exception {
        for (int i = 0; i < COUNT; i++) {
            BufferRider.read(getInputStream(), BufferRider.IReader.JAVA_BUFFERED_FILE);
        }
    }

    private InputStream getInputStream() throws IOException {
        return getContext().getAssets().open(PATH);
    }

}
