package kotlin;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class getAvcProfileAndLevel {
    public static InputStream AudioAttributesCompatParcelizer(URL url) throws IOException {
        return RemoteActionCompatParcelizer(new ensureMediaCodecInfosInitialized(url), sortByScore.read(), new Timer());
    }

    private static InputStream RemoteActionCompatParcelizer(ensureMediaCodecInfosInitialized ensuremediacodecinfosinitialized, sortByScore sortbyscore, Timer timer) throws IOException {
        timer.IconCompatParcelizer();
        long jWrite = timer.write();
        avcLevelToMaxFrameSize avcleveltomaxframesizeWrite = avcLevelToMaxFrameSize.write(sortbyscore);
        try {
            URLConnection uRLConnectionRemoteActionCompatParcelizer = ensuremediacodecinfosinitialized.RemoteActionCompatParcelizer();
            if (uRLConnectionRemoteActionCompatParcelizer instanceof HttpsURLConnection) {
                return new getCodecProfileAndLevel((HttpsURLConnection) uRLConnectionRemoteActionCompatParcelizer, timer, avcleveltomaxframesizeWrite).getInputStream();
            }
            if (uRLConnectionRemoteActionCompatParcelizer instanceof HttpURLConnection) {
                return new getAv1ProfileAndLevel((HttpURLConnection) uRLConnectionRemoteActionCompatParcelizer, timer, avcleveltomaxframesizeWrite).getInputStream();
            }
            return uRLConnectionRemoteActionCompatParcelizer.getInputStream();
        } catch (IOException e) {
            avcleveltomaxframesizeWrite.AudioAttributesCompatParcelizer(jWrite);
            avcleveltomaxframesizeWrite.RemoteActionCompatParcelizer(timer.AudioAttributesCompatParcelizer());
            avcleveltomaxframesizeWrite.IconCompatParcelizer(ensuremediacodecinfosinitialized.toString());
            getDecoderInfosSortedByFormatSupport.read(avcleveltomaxframesizeWrite);
            throw e;
        }
    }

    public static Object read(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new getCodecProfileAndLevel((HttpsURLConnection) obj, new Timer(), avcLevelToMaxFrameSize.write(sortByScore.read()));
        }
        return obj instanceof HttpURLConnection ? new getAv1ProfileAndLevel((HttpURLConnection) obj, new Timer(), avcLevelToMaxFrameSize.write(sortByScore.read())) : obj;
    }
}
