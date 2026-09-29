package kotlin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public final class updatePlaybackSpeedSettingsForNewPeriod implements waitUninterruptibly {
    private final HttpURLConnection read;

    public updatePlaybackSpeedSettingsForNewPeriod(HttpURLConnection httpURLConnection) {
        this.read = httpURLConnection;
    }

    @Override // kotlin.waitUninterruptibly
    public final boolean write() {
        try {
            return this.read.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // kotlin.waitUninterruptibly
    public final InputStream read() throws IOException {
        return this.read.getInputStream();
    }

    @Override // kotlin.waitUninterruptibly
    public final String AudioAttributesCompatParcelizer() {
        return this.read.getContentType();
    }

    @Override // kotlin.waitUninterruptibly
    public final String RemoteActionCompatParcelizer() {
        try {
            if (write()) {
                return null;
            }
            StringBuilder sb = new StringBuilder("Unable to fetch ");
            sb.append(this.read.getURL());
            sb.append(". Failed with ");
            sb.append(this.read.getResponseCode());
            sb.append("\n");
            sb.append(AudioAttributesCompatParcelizer(this.read));
            return sb.toString();
        } catch (IOException e) {
            access3000.IconCompatParcelizer("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.read.disconnect();
    }

    private static String AudioAttributesCompatParcelizer(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }
}
