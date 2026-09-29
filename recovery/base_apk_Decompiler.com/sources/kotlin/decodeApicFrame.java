package kotlin;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.IcyInfo1;
import kotlin.decodeTextInformationFrame;

/* JADX INFO: loaded from: classes5.dex */
public final class decodeApicFrame {
    private final Set<EventMessage1> AudioAttributesCompatParcelizer;
    private final EventMessage1 AudioAttributesImplApi21Parcelizer;
    private final HttpURLConnection IconCompatParcelizer;
    private final ScheduledExecutorService MediaBrowserCompatItemReceiver;
    private final Random RemoteActionCompatParcelizer = new Random();
    private final decodeTextInformationFrame read;
    private final decodeCommentFrame write;

    public decodeApicFrame(HttpURLConnection httpURLConnection, decodeTextInformationFrame decodetextinformationframe, decodeCommentFrame decodecommentframe, Set<EventMessage1> set, EventMessage1 eventMessage1, ScheduledExecutorService scheduledExecutorService) {
        this.IconCompatParcelizer = httpURLConnection;
        this.read = decodetextinformationframe;
        this.write = decodecommentframe;
        this.AudioAttributesCompatParcelizer = set;
        this.AudioAttributesImplApi21Parcelizer = eventMessage1;
        this.MediaBrowserCompatItemReceiver = scheduledExecutorService;
    }

    private void AudioAttributesCompatParcelizer(IcyInfo1 icyInfo1) {
        synchronized (this) {
            Iterator<EventMessage1> it = this.AudioAttributesCompatParcelizer.iterator();
            while (it.hasNext()) {
                it.next().IconCompatParcelizer(icyInfo1);
            }
        }
    }

    private void RemoteActionCompatParcelizer() {
        synchronized (this) {
            for (EventMessage1 eventMessage1 : this.AudioAttributesCompatParcelizer) {
            }
        }
    }

    private boolean IconCompatParcelizer() {
        boolean zIsEmpty;
        synchronized (this) {
            zIsEmpty = this.AudioAttributesCompatParcelizer.isEmpty();
        }
        return zIsEmpty;
    }

    private static String read(String str) {
        int iIndexOf = str.indexOf(123);
        int iLastIndexOf = str.lastIndexOf(125);
        if (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) {
            return "";
        }
        return str.substring(iIndexOf, iLastIndexOf + 1);
    }

    public final void read() {
        HttpURLConnection httpURLConnection = this.IconCompatParcelizer;
        if (httpURLConnection == null) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            AudioAttributesCompatParcelizer(inputStream);
            inputStream.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.IconCompatParcelizer.disconnect();
            throw th;
        }
        this.IconCompatParcelizer.disconnect();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        r4 = new org.json.JSONObject(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        if (r4.has("featureDisabled") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r4.getBoolean("featureDisabled") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        r7.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(new kotlin.CommentFrame1("The server is temporarily unavailable. Try again in a few minutes.", o.IcyInfo1.RemoteActionCompatParcelizer.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (IconCompatParcelizer() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r4.has("latestTemplateVersionNumber") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        r5 = r7.read.read();
        r3 = r4.getLong("latestTemplateVersionNumber");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r3 <= r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        AudioAttributesCompatParcelizer(3, r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void AudioAttributesCompatParcelizer(java.io.InputStream r8) throws java.io.IOException {
        /*
            r7 = this;
            java.lang.String r0 = "latestTemplateVersionNumber"
            java.lang.String r1 = "featureDisabled"
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.lang.String r4 = "utf-8"
            r3.<init>(r8, r4)
            r2.<init>(r3)
        L10:
            java.lang.String r3 = ""
        L12:
            java.lang.String r4 = r2.readLine()
            if (r4 == 0) goto L8b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            java.lang.String r5 = "}"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L12
            java.lang.String r3 = read(r3)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L12
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L79
            r4.<init>(r3)     // Catch: org.json.JSONException -> L79
            boolean r3 = r4.has(r1)     // Catch: org.json.JSONException -> L79
            if (r3 == 0) goto L59
            boolean r3 = r4.getBoolean(r1)     // Catch: org.json.JSONException -> L79
            if (r3 == 0) goto L59
            o.EventMessage1 r3 = r7.AudioAttributesImplApi21Parcelizer     // Catch: org.json.JSONException -> L79
            o.CommentFrame1 r4 = new o.CommentFrame1     // Catch: org.json.JSONException -> L79
            java.lang.String r5 = "The server is temporarily unavailable. Try again in a few minutes."
            o.IcyInfo1$RemoteActionCompatParcelizer r6 = o.IcyInfo1.RemoteActionCompatParcelizer.CONFIG_UPDATE_UNAVAILABLE     // Catch: org.json.JSONException -> L79
            r4.<init>(r5, r6)     // Catch: org.json.JSONException -> L79
            r3.IconCompatParcelizer(r4)     // Catch: org.json.JSONException -> L79
            goto L8b
        L59:
            boolean r3 = r7.IconCompatParcelizer()     // Catch: org.json.JSONException -> L79
            if (r3 == 0) goto L60
            goto L8b
        L60:
            boolean r3 = r4.has(r0)     // Catch: org.json.JSONException -> L79
            if (r3 == 0) goto L10
            o.decodeTextInformationFrame r3 = r7.read     // Catch: org.json.JSONException -> L79
            long r5 = r3.read()     // Catch: org.json.JSONException -> L79
            long r3 = r4.getLong(r0)     // Catch: org.json.JSONException -> L79
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L10
            r5 = 3
            r7.AudioAttributesCompatParcelizer(r5, r3)     // Catch: org.json.JSONException -> L79
            goto L10
        L79:
            r3 = move-exception
            o.ApicFrame1 r4 = new o.ApicFrame1
            java.lang.Throwable r3 = r3.getCause()
            o.IcyInfo1$RemoteActionCompatParcelizer r5 = o.IcyInfo1.RemoteActionCompatParcelizer.CONFIG_UPDATE_MESSAGE_INVALID
            java.lang.String r6 = "Unable to parse config update message."
            r4.<init>(r6, r3, r5)
            r7.AudioAttributesCompatParcelizer(r4)
            goto L10
        L8b:
            r2.close()
            r8.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.decodeApicFrame.AudioAttributesCompatParcelizer(java.io.InputStream):void");
    }

    private void AudioAttributesCompatParcelizer(final int i, final long j) {
        if (i == 0) {
            AudioAttributesCompatParcelizer(new CommentFrame1("Unable to fetch the latest version of the template.", IcyInfo1.RemoteActionCompatParcelizer.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.MediaBrowserCompatItemReceiver.schedule(new Runnable() { // from class: o.decodeApicFrame.4
                @Override // java.lang.Runnable
                public final void run() {
                    decodeApicFrame.this.write(i, j);
                }
            }, this.RemoteActionCompatParcelizer.nextInt(4), TimeUnit.SECONDS);
        }
    }

    public final Task<Void> write(int i, final long j) {
        Task taskContinueWithTask;
        synchronized (this) {
            final int i2 = i - 1;
            final Task<decodeTextInformationFrame.RemoteActionCompatParcelizer> taskAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(decodeTextInformationFrame.read.REALTIME, 3 - i2);
            final Task<decodeGeobFrame> task = this.write.read();
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskAudioAttributesCompatParcelizer, task}).continueWithTask(this.MediaBrowserCompatItemReceiver, new Continuation() { // from class: o.decodeChapterFrame
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    return this.write.AudioAttributesCompatParcelizer(taskAudioAttributesCompatParcelizer, task, j, i2);
                }
            });
        }
        return taskContinueWithTask;
    }

    final /* synthetic */ Task AudioAttributesCompatParcelizer(Task task, Task task2, long j, int i) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(new ApicFrame1("Failed to auto-fetch config update.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new ApicFrame1("Failed to get activated config for auto-fetch", task2.getException()));
        }
        decodeTextInformationFrame.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (decodeTextInformationFrame.RemoteActionCompatParcelizer) task.getResult();
        decodeGeobFrame decodegeobframeWrite = (decodeGeobFrame) task2.getResult();
        if (!RemoteActionCompatParcelizer(remoteActionCompatParcelizer, j).booleanValue()) {
            AudioAttributesCompatParcelizer(i, j);
            return Tasks.forResult(null);
        }
        if (remoteActionCompatParcelizer.read() == null) {
            return Tasks.forResult(null);
        }
        if (decodegeobframeWrite == null) {
            decodegeobframeWrite = decodeGeobFrame.write().write();
        }
        Set<String> set = decodegeobframeWrite.read(remoteActionCompatParcelizer.read());
        if (set.isEmpty()) {
            return Tasks.forResult(null);
        }
        writeNullTerminatedString.AudioAttributesCompatParcelizer(set);
        RemoteActionCompatParcelizer();
        return Tasks.forResult(null);
    }

    private static Boolean RemoteActionCompatParcelizer(decodeTextInformationFrame.RemoteActionCompatParcelizer remoteActionCompatParcelizer, long j) {
        if (remoteActionCompatParcelizer.read() != null) {
            return Boolean.valueOf(remoteActionCompatParcelizer.read().MediaBrowserCompatCustomActionResultReceiver() >= j);
        }
        return Boolean.valueOf(remoteActionCompatParcelizer.write() == 1);
    }
}
