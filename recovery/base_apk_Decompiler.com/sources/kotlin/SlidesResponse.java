package kotlin;

import android.os.Process;
import java.lang.Thread;
import kotlin.VideoDownloadLimitResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class SlidesResponse implements Thread.UncaughtExceptionHandler {
    private static SlidesResponse write;
    private final Thread.UncaughtExceptionHandler read = Thread.getDefaultUncaughtExceptionHandler();

    public SlidesResponse() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static void RemoteActionCompatParcelizer() {
        if (write == null) {
            synchronized (SlidesResponse.class) {
                if (write == null) {
                    write = new SlidesResponse();
                }
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, final Throwable th) {
        VideoDownloadLimitResponse.IconCompatParcelizer(new VideoDownloadLimitResponse.RemoteActionCompatParcelizer() { // from class: o.SlidesResponse.2
            @Override // o.VideoDownloadLimitResponse.RemoteActionCompatParcelizer
            public final void AudioAttributesCompatParcelizer(VideoDownloadLimitResponse videoDownloadLimitResponse) {
                if (videoDownloadLimitResponse.RemoteActionCompatParcelizer().booleanValue()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("$ae_crashed_reason", th.toString());
                        videoDownloadLimitResponse.read("$ae_crashed", jSONObject, true);
                    } catch (JSONException unused) {
                    }
                }
            }
        });
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.read;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            AudioAttributesCompatParcelizer();
        }
    }

    private static void AudioAttributesCompatParcelizer() {
        try {
            Thread.sleep(400L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Process.killProcess(Process.myPid());
        System.exit(10);
    }
}
