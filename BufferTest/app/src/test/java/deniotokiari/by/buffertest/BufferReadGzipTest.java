package deniotokiari.by.buffertest;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferReadGzipTest {

    static final String PATH = "src\\main\\assets\\test_gz";

    @Test
    public void OK_IO() throws Exception {
        BufferRider.read(getFileInputStream(), BufferRider.IReader.OK_IO_GZIP);
    }

    @Test
    public void JAVA() throws Exception {
        BufferRider.read(getFileInputStream(), BufferRider.IReader.JAVA_GZIP);
    }

    @Test
    public void JAVA_BUFFERED() throws Exception {
        BufferRider.read(getFileInputStream(), BufferRider.IReader.JAVA_BUFFERED_GZIP);
    }

    private FileInputStream getFileInputStream() throws FileNotFoundException {
        return new FileInputStream(new File(PATH));
    }

}
