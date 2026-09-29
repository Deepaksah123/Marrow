package kotlin;

import android.text.format.DateUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.decodeUrlLinkFrame;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class decodeTextInformationFrame {
    public static final long AudioAttributesCompatParcelizer = TimeUnit.HOURS.toSeconds(12);
    private static int[] IconCompatParcelizer = {2, 4, 8, 16, 32, 64, 128, 256};
    private final hasSamples AudioAttributesImplApi21Parcelizer;
    private final decodeUrlLinkFrame AudioAttributesImplApi26Parcelizer;
    private final decodeCommentFrame AudioAttributesImplBaseParcelizer;
    private final Executor MediaBrowserCompatCustomActionResultReceiver;
    private final decodeTxxxFrame MediaBrowserCompatItemReceiver;
    private final Random MediaBrowserCompatMediaItem;
    private final onInputBufferAvailable<TrackSampleTable> RemoteActionCompatParcelizer;
    private final Map<String, String> read;
    private final Clock write;

    private static boolean AudioAttributesCompatParcelizer(int i) {
        return i == 429 || i == 502 || i == 503 || i == 504;
    }

    public decodeTextInformationFrame(hasSamples hassamples, onInputBufferAvailable<TrackSampleTable> oninputbufferavailable, Executor executor, Clock clock, Random random, decodeCommentFrame decodecommentframe, decodeTxxxFrame decodetxxxframe, decodeUrlLinkFrame decodeurllinkframe, Map<String, String> map) {
        this.AudioAttributesImplApi21Parcelizer = hassamples;
        this.RemoteActionCompatParcelizer = oninputbufferavailable;
        this.MediaBrowserCompatCustomActionResultReceiver = executor;
        this.write = clock;
        this.MediaBrowserCompatMediaItem = random;
        this.AudioAttributesImplBaseParcelizer = decodecommentframe;
        this.MediaBrowserCompatItemReceiver = decodetxxxframe;
        this.AudioAttributesImplApi26Parcelizer = decodeurllinkframe;
        this.read = map;
    }

    public final Task<RemoteActionCompatParcelizer> IconCompatParcelizer() {
        return AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver());
    }

    public final Task<RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer(final long j) {
        final HashMap map = new HashMap(this.read);
        StringBuilder sb = new StringBuilder();
        sb.append(read.BASE.AudioAttributesCompatParcelizer());
        sb.append("/1");
        map.put("X-Firebase-RC-Fetch-Type", sb.toString());
        return this.AudioAttributesImplBaseParcelizer.read().continueWithTask(this.MediaBrowserCompatCustomActionResultReceiver, new Continuation() { // from class: o.decodeMlltFrame
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.write.read(j, map, task);
            }
        });
    }

    public final Task<RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer(read readVar, int i) {
        final HashMap map = new HashMap(this.read);
        StringBuilder sb = new StringBuilder();
        sb.append(readVar.AudioAttributesCompatParcelizer());
        sb.append("/");
        sb.append(i);
        map.put("X-Firebase-RC-Fetch-Type", sb.toString());
        return this.AudioAttributesImplBaseParcelizer.read().continueWithTask(this.MediaBrowserCompatCustomActionResultReceiver, new Continuation() { // from class: o.decodeTextInformationFrameValues
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(map, task);
            }
        });
    }

    final /* synthetic */ Task AudioAttributesCompatParcelizer(Map map, Task task) throws Exception {
        return read(task, 0L, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public Task<RemoteActionCompatParcelizer> read(Task<decodeGeobFrame> task, long j, final Map<String, String> map) {
        Task taskContinueWithTask;
        final Date date = new Date(this.write.currentTimeMillis());
        if (task.isSuccessful() && AudioAttributesCompatParcelizer(j, date)) {
            return Tasks.forResult(RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(date));
        }
        Date dateIconCompatParcelizer = IconCompatParcelizer(date);
        if (dateIconCompatParcelizer != null) {
            taskContinueWithTask = Tasks.forException(new IcyHeaders1(write(dateIconCompatParcelizer.getTime() - date.getTime()), dateIconCompatParcelizer.getTime()));
        } else {
            final Task<String> taskWrite = this.AudioAttributesImplApi21Parcelizer.write();
            final Task<getLastOutputBufferPresentationTimeUs> taskRemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskWrite, taskRemoteActionCompatParcelizer}).continueWithTask(this.MediaBrowserCompatCustomActionResultReceiver, new Continuation() { // from class: o.decodeStringIfValid
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    return this.write.IconCompatParcelizer(taskWrite, taskRemoteActionCompatParcelizer, date, map);
                }
            });
        }
        return taskContinueWithTask.continueWithTask(this.MediaBrowserCompatCustomActionResultReceiver, new Continuation() { // from class: o.decodePrivFrame
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return this.write.read(date, task2);
            }
        });
    }

    final /* synthetic */ Task IconCompatParcelizer(Task task, Task task2, Date date, Map map) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(new ApicFrame1("Firebase Installations failed to get installation ID for fetch.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new ApicFrame1("Firebase Installations failed to get installation auth token for fetch.", task2.getException()));
        }
        return IconCompatParcelizer((String) task.getResult(), ((getLastOutputBufferPresentationTimeUs) task2.getResult()).AudioAttributesCompatParcelizer(), date, (Map<String, String>) map);
    }

    final /* synthetic */ Task read(Date date, Task task) throws Exception {
        IconCompatParcelizer(task, date);
        return task;
    }

    private boolean AudioAttributesCompatParcelizer(long j, Date date) {
        Date dateRemoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
        if (dateRemoteActionCompatParcelizer.equals(decodeUrlLinkFrame.RemoteActionCompatParcelizer)) {
            return false;
        }
        return date.before(new Date(dateRemoteActionCompatParcelizer.getTime() + TimeUnit.SECONDS.toMillis(j)));
    }

    private Date IconCompatParcelizer(Date date) {
        Date dateRemoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer();
        if (date.before(dateRemoteActionCompatParcelizer)) {
            return dateRemoteActionCompatParcelizer;
        }
        return null;
    }

    private static String write(long j) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j)));
    }

    private Task<RemoteActionCompatParcelizer> IconCompatParcelizer(String str, String str2, Date date, Map<String, String> map) {
        try {
            final RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(str, str2, date, map);
            if (RemoteActionCompatParcelizer2.write() != 0) {
                return Tasks.forResult(RemoteActionCompatParcelizer2);
            }
            return this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer2.read()).onSuccessTask(this.MediaBrowserCompatCustomActionResultReceiver, new SuccessContinuation() { // from class: o.decodeWxxxFrame
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    return Tasks.forResult(RemoteActionCompatParcelizer2);
                }
            });
        } catch (IcyInfo1 e) {
            return Tasks.forException(e);
        }
    }

    private RemoteActionCompatParcelizer RemoteActionCompatParcelizer(String str, String str2, Date date, Map<String, String> map) throws IcyInfo1 {
        try {
            RemoteActionCompatParcelizer remoteActionCompatParcelizerAudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(), str, str2, AudioAttributesCompatParcelizer(), this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(), map, write(), date);
            if (remoteActionCompatParcelizerAudioAttributesCompatParcelizer.read() != null) {
                this.AudioAttributesImplApi26Parcelizer.read(remoteActionCompatParcelizerAudioAttributesCompatParcelizer.read().MediaBrowserCompatCustomActionResultReceiver());
            }
            if (remoteActionCompatParcelizerAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer() != null) {
                this.AudioAttributesImplApi26Parcelizer.write(remoteActionCompatParcelizerAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
            }
            this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer();
            return remoteActionCompatParcelizerAudioAttributesCompatParcelizer;
        } catch (CommentFrame1 e) {
            decodeUrlLinkFrame.RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(e.AudioAttributesCompatParcelizer(), date);
            if (RemoteActionCompatParcelizer(RemoteActionCompatParcelizer2, e.AudioAttributesCompatParcelizer())) {
                throw new IcyHeaders1(RemoteActionCompatParcelizer2.RemoteActionCompatParcelizer().getTime());
            }
            throw write(e);
        }
    }

    private static CommentFrame1 write(CommentFrame1 commentFrame1) throws ApicFrame1 {
        String str;
        int iAudioAttributesCompatParcelizer = commentFrame1.AudioAttributesCompatParcelizer();
        if (iAudioAttributesCompatParcelizer == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (iAudioAttributesCompatParcelizer == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (iAudioAttributesCompatParcelizer == 429) {
                throw new ApicFrame1("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (iAudioAttributesCompatParcelizer == 500) {
                str = "There was an internal server error.";
            } else {
                switch (iAudioAttributesCompatParcelizer) {
                    case 502:
                    case 503:
                    case TarConstants.SPARSELEN_GNU_SPARSE /* 504 */:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            }
        }
        return new CommentFrame1(commentFrame1.AudioAttributesCompatParcelizer(), "Fetch failed: ".concat(str), commentFrame1);
    }

    private decodeUrlLinkFrame.RemoteActionCompatParcelizer RemoteActionCompatParcelizer(int i, Date date) {
        if (AudioAttributesCompatParcelizer(i)) {
            read(date);
        }
        return this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
    }

    private void read(Date date) {
        int iAudioAttributesCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer() + 1;
        this.AudioAttributesImplApi26Parcelizer.read(iAudioAttributesCompatParcelizer, new Date(date.getTime() + read(iAudioAttributesCompatParcelizer)));
    }

    private long read(int i) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = IconCompatParcelizer;
        long millis = timeUnit.toMillis(iArr[Math.min(i, iArr.length) - 1]);
        return (millis / 2) + ((long) this.MediaBrowserCompatMediaItem.nextInt((int) millis));
    }

    private static boolean RemoteActionCompatParcelizer(decodeUrlLinkFrame.RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i) {
        return remoteActionCompatParcelizer.AudioAttributesCompatParcelizer() > 1 || i == 429;
    }

    private void IconCompatParcelizer(Task<RemoteActionCompatParcelizer> task, Date date) {
        if (task.isSuccessful()) {
            this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof IcyHeaders1) {
            this.AudioAttributesImplApi26Parcelizer.MediaDescriptionCompat();
        } else {
            this.AudioAttributesImplApi26Parcelizer.MediaMetadataCompat();
        }
    }

    private Map<String, String> AudioAttributesCompatParcelizer() {
        HashMap map = new HashMap();
        TrackSampleTable trackSampleTableWrite = this.RemoteActionCompatParcelizer.write();
        if (trackSampleTableWrite != null) {
            for (Map.Entry<String, Object> entry : trackSampleTableWrite.RemoteActionCompatParcelizer(false).entrySet()) {
                map.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }

    private Long write() {
        TrackSampleTable trackSampleTableWrite = this.RemoteActionCompatParcelizer.write();
        if (trackSampleTableWrite == null) {
            return null;
        }
        return (Long) trackSampleTableWrite.RemoteActionCompatParcelizer(true).get("_fot");
    }

    public final long read() {
        return this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
    }

    public static class RemoteActionCompatParcelizer {
        private final String AudioAttributesCompatParcelizer;
        private final int IconCompatParcelizer;
        private final decodeGeobFrame RemoteActionCompatParcelizer;
        private final Date read;

        private RemoteActionCompatParcelizer(Date date, int i, decodeGeobFrame decodegeobframe, String str) {
            this.read = date;
            this.IconCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = decodegeobframe;
            this.AudioAttributesCompatParcelizer = str;
        }

        public static RemoteActionCompatParcelizer IconCompatParcelizer(decodeGeobFrame decodegeobframe, String str) {
            return new RemoteActionCompatParcelizer(decodegeobframe.AudioAttributesCompatParcelizer(), 0, decodegeobframe, str);
        }

        public static RemoteActionCompatParcelizer IconCompatParcelizer(Date date, decodeGeobFrame decodegeobframe) {
            return new RemoteActionCompatParcelizer(date, 1, decodegeobframe, null);
        }

        public static RemoteActionCompatParcelizer RemoteActionCompatParcelizer(Date date) {
            return new RemoteActionCompatParcelizer(date, 2, null, null);
        }

        final String RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        final int write() {
            return this.IconCompatParcelizer;
        }

        public final decodeGeobFrame read() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public enum read {
        BASE("BASE"),
        REALTIME("REALTIME");

        private final String RemoteActionCompatParcelizer;

        read(String str) {
            this.RemoteActionCompatParcelizer = str;
        }

        final String AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }
}
