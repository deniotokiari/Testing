package deniotokiari.by.buffertest;

import android.test.AndroidTestCase;

import java.io.IOException;
import java.io.InputStream;

public class BufferReadGzipTest extends AndroidTestCase {

    static final String PATH = "test_gz";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    public void test_OK_IO() throws Exception {
        BufferRider.read(getInputStream(), BufferRider.IReader.OK_IO_GZIP);
    }

    public void test_JAVA() throws Exception {
        BufferRider.read(getInputStream(), BufferRider.IReader.JAVA_BUFFERED_GZIP);
    }

    public void test_JAVA_BUFFERED() throws Exception {
        BufferRider.read(getInputStream(), BufferRider.IReader.JAVA_BUFFERED_GZIP);
    }

    private InputStream getInputStream() throws IOException {
        return getContext().getAssets().open(PATH);
    }

}
