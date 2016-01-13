package deniotokiari.by.buffertest;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferReadFileTest {

    static final String PATH = "src\\main\\assets\\test";

    @Test
    public void OK_IO_STREAM() throws Exception {
        BufferRider.read(getFileInputStream(), BufferRider.IReader.OK_IO_STREAM_FILE);
    }

    @Test
    public void OK_IO() throws Exception {
        BufferRider.read(getFileInputStream(), BufferRider.IReader.OK_IO_FILE);
    }

    @Test
    public void JAVA() throws Exception {
        BufferRider.read(getFileInputStream(), BufferRider.IReader.JAVA_FILE);
    }

    @Test
    public void JAVA_BUFFERED() throws Exception {
        BufferRider.read(getFileInputStream(), BufferRider.IReader.JAVA_BUFFERED_FILE);
    }

    private FileInputStream getFileInputStream() throws FileNotFoundException {
        return new FileInputStream(new File(PATH));
    }

}