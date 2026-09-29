package kotlin;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.IcyInfo1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class validateFrames {
    private final decodeTextInformationFrame AudioAttributesImplApi21Parcelizer;
    private final Context AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private final FirebaseApp MediaBrowserCompatCustomActionResultReceiver;
    private final hasSamples MediaBrowserCompatItemReceiver;
    private final Set<EventMessage1> MediaBrowserCompatSearchResultReceiver;
    private final decodeUrlLinkFrame MediaDescriptionCompat;
    private final String handleMediaPlayPauseIfPendingOnHandler;
    private final ScheduledExecutorService onCommand;
    private decodeCommentFrame write;
    private static int[] RemoteActionCompatParcelizer = {2, 4, 8, 16, 32, 64, 128, 256};
    private static final Pattern IconCompatParcelizer = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    private final int read = 8;
    private boolean MediaMetadataCompat = false;
    private final Random onAddQueueItem = new Random();
    private final Clock AudioAttributesCompatParcelizer = DefaultClock.getInstance();
    private boolean RatingCompat = false;
    private boolean MediaBrowserCompatMediaItem = false;

    private static boolean read(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public validateFrames(FirebaseApp firebaseApp, hasSamples hassamples, decodeTextInformationFrame decodetextinformationframe, decodeCommentFrame decodecommentframe, Context context, String str, Set<EventMessage1> set, decodeUrlLinkFrame decodeurllinkframe, ScheduledExecutorService scheduledExecutorService) {
        this.MediaBrowserCompatSearchResultReceiver = set;
        this.onCommand = scheduledExecutorService;
        this.AudioAttributesImplBaseParcelizer = Math.max(8 - decodeurllinkframe.AudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer(), 1);
        this.MediaBrowserCompatCustomActionResultReceiver = firebaseApp;
        this.AudioAttributesImplApi21Parcelizer = decodetextinformationframe;
        this.MediaBrowserCompatItemReceiver = hassamples;
        this.write = decodecommentframe;
        this.AudioAttributesImplApi26Parcelizer = context;
        this.handleMediaPlayPauseIfPendingOnHandler = str;
        this.MediaDescriptionCompat = decodeurllinkframe;
    }

    private static String AudioAttributesCompatParcelizer(String str) {
        Matcher matcher = IconCompatParcelizer.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String AudioAttributesCompatParcelizer() {
        try {
            Context context = this.AudioAttributesImplApi26Parcelizer;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                this.AudioAttributesImplApi26Parcelizer.getPackageName();
                return null;
            }
            return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
        } catch (PackageManager.NameNotFoundException unused) {
            this.AudioAttributesImplApi26Parcelizer.getPackageName();
            return null;
        }
    }

    private void AudioAttributesCompatParcelizer(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.MediaBrowserCompatCustomActionResultReceiver.read().AudioAttributesCompatParcelizer());
        httpURLConnection.setRequestProperty("X-Android-Package", this.AudioAttributesImplApi26Parcelizer.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", AudioAttributesCompatParcelizer());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty(RtspHeaders.ACCEPT, "application/json");
    }

    private JSONObject RemoteActionCompatParcelizer(String str) {
        HashMap map = new HashMap();
        map.put("project", AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.read().RemoteActionCompatParcelizer()));
        map.put("namespace", this.handleMediaPlayPauseIfPendingOnHandler);
        map.put("lastKnownVersionNumber", Long.toString(this.AudioAttributesImplApi21Parcelizer.read()));
        map.put("appId", this.MediaBrowserCompatCustomActionResultReceiver.read().RemoteActionCompatParcelizer());
        map.put(PaymentConstants.SDK_VERSION, "21.4.1");
        map.put("appInstanceId", str);
        return new JSONObject(map);
    }

    private void write(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        AudioAttributesCompatParcelizer(httpURLConnection, str2);
        byte[] bytes = RemoteActionCompatParcelizer(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(IcyInfo1 icyInfo1) {
        synchronized (this) {
            Iterator<EventMessage1> it = this.MediaBrowserCompatSearchResultReceiver.iterator();
            while (it.hasNext()) {
                it.next().IconCompatParcelizer(icyInfo1);
            }
        }
    }

    private void RemoteActionCompatParcelizer(Date date) {
        int iRemoteActionCompatParcelizer = this.MediaDescriptionCompat.AudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer() + 1;
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, new Date(date.getTime() + RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer)));
    }

    private long RemoteActionCompatParcelizer(int i) {
        int length = RemoteActionCompatParcelizer.length;
        if (i >= length) {
            i = length;
        }
        long millis = TimeUnit.MINUTES.toMillis(r0[i - 1]);
        return (millis / 2) + ((long) this.onAddQueueItem.nextInt((int) millis));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read() {
        synchronized (this) {
            this.RatingCompat = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean write() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Set<o.EventMessage1> r0 = r1.MediaBrowserCompatSearchResultReceiver     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L17
            boolean r0 = r1.MediaMetadataCompat     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L17
            boolean r0 = r1.RatingCompat     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L17
            boolean r0 = r1.MediaBrowserCompatMediaItem     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            monitor-exit(r1)
            return r0
        L1a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.validateFrames.write():boolean");
    }

    private String write(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.read().RemoteActionCompatParcelizer()), str);
    }

    private URL MediaBrowserCompatCustomActionResultReceiver() {
        try {
            return new URL(write(this.handleMediaPlayPauseIfPendingOnHandler));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    private Task<HttpURLConnection> MediaBrowserCompatItemReceiver() {
        final Task<getLastOutputBufferPresentationTimeUs> taskRemoteActionCompatParcelizer = this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
        final Task<String> taskWrite = this.MediaBrowserCompatItemReceiver.write();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskRemoteActionCompatParcelizer, taskWrite}).continueWithTask(this.onCommand, new Continuation() { // from class: o.indexOfZeroByte
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.IconCompatParcelizer.IconCompatParcelizer(taskRemoteActionCompatParcelizer, taskWrite);
            }
        });
    }

    final /* synthetic */ Task IconCompatParcelizer(Task task, Task task2) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(new ApicFrame1("Firebase Installations failed to get installation auth token for config update listener connection.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new ApicFrame1("Firebase Installations failed to get installation ID for config update listener connection.", task2.getException()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) MediaBrowserCompatCustomActionResultReceiver().openConnection();
            write(httpURLConnection, (String) task2.getResult(), ((getLastOutputBufferPresentationTimeUs) task.getResult()).AudioAttributesCompatParcelizer());
            return Tasks.forResult(httpURLConnection);
        } catch (IOException e) {
            return Tasks.forException(new ApicFrame1("Failed to open HTTP stream connection", e));
        }
    }

    public final void RemoteActionCompatParcelizer() {
        AudioAttributesCompatParcelizer(0L);
    }

    private void AudioAttributesImplApi26Parcelizer() {
        synchronized (this) {
            AudioAttributesCompatParcelizer(Math.max(0L, this.MediaDescriptionCompat.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer().getTime() - new Date(this.AudioAttributesCompatParcelizer.currentTimeMillis()).getTime()));
        }
    }

    private void AudioAttributesCompatParcelizer(long j) {
        synchronized (this) {
            if (write()) {
                int i = this.AudioAttributesImplBaseParcelizer;
                if (i > 0) {
                    this.AudioAttributesImplBaseParcelizer = i - 1;
                    this.onCommand.schedule(new Runnable() { // from class: o.validateFrames.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            validateFrames.this.IconCompatParcelizer();
                        }
                    }, j, TimeUnit.MILLISECONDS);
                } else if (!this.MediaBrowserCompatMediaItem) {
                    AudioAttributesCompatParcelizer(new ApicFrame1("Unable to connect to the server. Check your connection and try again.", IcyInfo1.RemoteActionCompatParcelizer.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        }
    }

    final void IconCompatParcelizer(boolean z) {
        this.MediaBrowserCompatMediaItem = z;
    }

    private void AudioAttributesImplBaseParcelizer() {
        synchronized (this) {
            this.AudioAttributesImplBaseParcelizer = 8;
        }
    }

    private void read(boolean z) {
        synchronized (this) {
            this.MediaMetadataCompat = z;
        }
    }

    private decodeApicFrame RemoteActionCompatParcelizer(HttpURLConnection httpURLConnection) {
        decodeApicFrame decodeapicframe;
        synchronized (this) {
            decodeapicframe = new decodeApicFrame(httpURLConnection, this.AudioAttributesImplApi21Parcelizer, this.write, this.MediaBrowserCompatSearchResultReceiver, new EventMessage1() { // from class: o.validateFrames.3
                @Override // kotlin.EventMessage1
                public final void IconCompatParcelizer(IcyInfo1 icyInfo1) {
                    validateFrames.this.read();
                    validateFrames.this.AudioAttributesCompatParcelizer(icyInfo1);
                }
            }, this.onCommand);
        }
        return decodeapicframe;
    }

    private static String RemoteActionCompatParcelizer(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public final void IconCompatParcelizer() {
        if (write()) {
            if (new Date(this.AudioAttributesCompatParcelizer.currentTimeMillis()).before(this.MediaDescriptionCompat.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer())) {
                AudioAttributesImplApi26Parcelizer();
            } else {
                final Task<HttpURLConnection> taskMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
                Tasks.whenAllComplete((Task<?>[]) new Task[]{taskMediaBrowserCompatItemReceiver}).continueWith(this.onCommand, new Continuation() { // from class: o.getFrameId
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(taskMediaBrowserCompatItemReceiver);
                    }
                });
            }
        }
    }

    final /* synthetic */ Task AudioAttributesCompatParcelizer(Task task) throws Exception {
        Integer numValueOf;
        HttpURLConnection httpURLConnection;
        boolean z;
        CommentFrame1 commentFrame1;
        HttpURLConnection httpURLConnection2 = null;
        try {
        } catch (IOException unused) {
            httpURLConnection = null;
            numValueOf = null;
        } catch (Throwable th) {
            th = th;
            numValueOf = null;
        }
        if (!task.isSuccessful()) {
            throw new IOException(task.getException());
        }
        read(true);
        httpURLConnection = (HttpURLConnection) task.getResult();
        try {
            numValueOf = Integer.valueOf(httpURLConnection.getResponseCode());
            try {
                if (numValueOf.intValue() == 200) {
                    AudioAttributesImplBaseParcelizer();
                    this.MediaDescriptionCompat.AudioAttributesImplApi21Parcelizer();
                    RemoteActionCompatParcelizer(httpURLConnection).read();
                }
                read(httpURLConnection);
                read(false);
                z = numValueOf == null || read(numValueOf.intValue());
                if (z) {
                    RemoteActionCompatParcelizer(new Date(this.AudioAttributesCompatParcelizer.currentTimeMillis()));
                }
            } catch (IOException unused2) {
                read(httpURLConnection);
                read(false);
                z = numValueOf == null || read(numValueOf.intValue());
                if (z) {
                    RemoteActionCompatParcelizer(new Date(this.AudioAttributesCompatParcelizer.currentTimeMillis()));
                }
                if (!z && numValueOf.intValue() != 200) {
                    String strRemoteActionCompatParcelizer = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                    if (numValueOf.intValue() == 403) {
                        strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(httpURLConnection.getErrorStream());
                    }
                    commentFrame1 = new CommentFrame1(numValueOf.intValue(), strRemoteActionCompatParcelizer, IcyInfo1.RemoteActionCompatParcelizer.CONFIG_UPDATE_STREAM_ERROR);
                }
                AudioAttributesImplApi26Parcelizer();
                return Tasks.forResult(null);
            } catch (Throwable th2) {
                httpURLConnection2 = httpURLConnection;
                th = th2;
                read(httpURLConnection2);
                read(false);
                z = numValueOf == null || read(numValueOf.intValue());
                if (z) {
                    RemoteActionCompatParcelizer(new Date(this.AudioAttributesCompatParcelizer.currentTimeMillis()));
                }
                if (z || numValueOf.intValue() == 200) {
                    AudioAttributesImplApi26Parcelizer();
                } else {
                    String strRemoteActionCompatParcelizer2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                    if (numValueOf.intValue() == 403) {
                        strRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(httpURLConnection2.getErrorStream());
                    }
                    AudioAttributesCompatParcelizer(new CommentFrame1(numValueOf.intValue(), strRemoteActionCompatParcelizer2, IcyInfo1.RemoteActionCompatParcelizer.CONFIG_UPDATE_STREAM_ERROR));
                }
                throw th;
            }
        } catch (IOException unused3) {
            numValueOf = null;
        } catch (Throwable th3) {
            httpURLConnection2 = httpURLConnection;
            th = th3;
            numValueOf = null;
        }
        if (!z && numValueOf.intValue() != 200) {
            String strRemoteActionCompatParcelizer3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
            if (numValueOf.intValue() == 403) {
                strRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(httpURLConnection.getErrorStream());
            }
            commentFrame1 = new CommentFrame1(numValueOf.intValue(), strRemoteActionCompatParcelizer3, IcyInfo1.RemoteActionCompatParcelizer.CONFIG_UPDATE_STREAM_ERROR);
            AudioAttributesCompatParcelizer(commentFrame1);
            return Tasks.forResult(null);
        }
        AudioAttributesImplApi26Parcelizer();
        return Tasks.forResult(null);
    }

    private static void read(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }
}
