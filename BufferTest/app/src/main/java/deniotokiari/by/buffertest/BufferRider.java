package deniotokiari.by.buffertest;

import android.support.annotation.NonNull;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.zip.GZIPInputStream;

import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;

public final class BufferRider {

    public static void read(final InputStream stream, @NonNull final IReader reader) throws Exception {
        reader.read(stream);

        stream.close();
    }

    public interface IReader {

        IReader OK_IO_STREAM_FILE = new IReader() {

            @Override
            public void read(final InputStream stream) throws Exception {
                final BufferedSource source = Okio.buffer(Okio.source(stream));
                final InputStream inputStream = source.inputStream();
                int a;

                while ((a = inputStream.read()) != -1) {

                }

                source.close();
            }
        };
        IReader OK_IO_FILE = new IReader() {

            @Override
            public void read(final InputStream stream) throws Exception {
                final BufferedSource source = Okio.buffer(Okio.source(stream));

                String a = source.readUtf8();

                source.close();
            }
        };
        IReader JAVA_BUFFERED_FILE = new IReader() {

            @Override
            public void read(final InputStream stream) throws Exception {
                final Reader reader = new InputStreamReader(stream);
                final BufferedReader bufferedReader = new BufferedReader(reader);
                int a;

                while ((a = bufferedReader.read()) != -1) {

                }

                bufferedReader.close();
            }
        };
        IReader JAVA_FILE = new IReader() {

            @Override
            public void read(final InputStream stream) throws Exception {
                int a;

                while ((a = stream.read()) != -1) {

                }

                stream.close();
            }
        };

        // == //
        IReader JAVA_BUFFERED_GZIP = new IReader() {

            @Override
            public void read(final InputStream stream) throws Exception {
                final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(stream)));

                int a;

                while ((a = bufferedReader.read()) != -1) {

                }

                bufferedReader.close();
            }
        };
        IReader JAVA_GZIP = new IReader() {

            @Override
            public void read(final InputStream stream) throws Exception {
                final InputStream reader = new GZIPInputStream(stream);

                int a;

                while ((a = reader.read()) != -1) {

                }

                reader.close();
            }
        };
        IReader OK_IO_STREAM_GZIP = new IReader() {

            @Override
            public void read(final InputStream stream) throws Exception {
                final BufferedSource source = Okio.buffer(new GzipSource(Okio.source(stream)));
                final InputStream inputStream = source.inputStream();
                int a;

                while ((a = inputStream.read()) != -1) {

                }

                source.close();
            }
        };
        IReader OK_IO_GZIP = new IReader() {

            @Override
            public void read(final InputStream stream) throws Exception {
                final BufferedSource source = Okio.buffer(new GzipSource(Okio.source(stream)));

                String a = source.readUtf8();

                source.close();
            }
        };

        void read(InputStream stream) throws Exception;

    }

}
