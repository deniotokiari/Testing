package deniotokiari.by.buffertest;

import android.test.AndroidTestCase;

import java.io.IOException;
import java.io.InputStream;

public class BufferReadFileTest extends AndroidTestCase {

    static final String PATH = "test";

    public void test_OK_IO_STREAM() throws Exception {
        BufferRider.read(getInputStream(), BufferRider.IReader.OK_IO_STREAM_FILE);
    }

    public void test_OK_IO() throws Exception {
        BufferRider.read(getInputStream(), BufferRider.IReader.OK_IO_FILE);
    }

    public void test_JAVA_READER() throws Exception {
        BufferRider.read(getInputStream(), BufferRider.IReader.JAVA_READER_FILE);
    }

    public void test_JAVA_BUFFERED_READER() throws Exception {
        BufferRider.read(getInputStream(), BufferRider.IReader.JAVA_READER_BUFFERED_FILE);
    }

    private InputStream getInputStream() throws IOException {
        return getContext().getAssets().open(PATH);
    }

}
