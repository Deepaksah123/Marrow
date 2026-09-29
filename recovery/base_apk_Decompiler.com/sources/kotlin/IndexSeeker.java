package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class IndexSeeker {
    private static final Map write = new HashMap();
    private final Intent AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private final Context IconCompatParcelizer;
    private final parseIlst MediaBrowserCompatCustomActionResultReceiver;
    private IInterface MediaDescriptionCompat;
    private ServiceConnection RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private final getTrackTypeForHdlr read;
    private final List AudioAttributesCompatParcelizer = new ArrayList();
    private final Set AudioAttributesImplApi26Parcelizer = new HashSet();
    private final Object MediaBrowserCompatItemReceiver = new Object();
    private final IBinder.DeathRecipient MediaMetadataCompat = new IBinder.DeathRecipient() { // from class: o.parseCommonEncryptionSinfFromParent
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            IndexSeeker.AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer);
        }
    };
    private final AtomicInteger MediaBrowserCompatSearchResultReceiver = new AtomicInteger(0);
    private final WeakReference MediaBrowserCompatMediaItem = new WeakReference(null);

    public IndexSeeker(Context context, getTrackTypeForHdlr gettracktypeforhdlr, String str, Intent intent, parseIlst parseilst) {
        this.IconCompatParcelizer = context;
        this.read = gettracktypeforhdlr;
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesImplApi21Parcelizer = intent;
        this.MediaBrowserCompatCustomActionResultReceiver = parseilst;
    }

    public static /* synthetic */ void AudioAttributesImplApi21Parcelizer(IndexSeeker indexSeeker) {
        indexSeeker.read.RemoteActionCompatParcelizer("reportBinderDeath", new Object[0]);
        if (((parseEdts) indexSeeker.MediaBrowserCompatMediaItem.get()) != null) {
            indexSeeker.read.RemoteActionCompatParcelizer("calling onBinderDied", new Object[0]);
        } else {
            indexSeeker.read.RemoteActionCompatParcelizer("%s : Binder has died.", indexSeeker.RemoteActionCompatParcelizer);
            Iterator it = indexSeeker.AudioAttributesCompatParcelizer.iterator();
            while (it.hasNext()) {
                ((parseAudioSampleEntry) it.next()).a(indexSeeker.read());
            }
            indexSeeker.AudioAttributesCompatParcelizer.clear();
        }
        synchronized (indexSeeker.MediaBrowserCompatItemReceiver) {
            indexSeeker.IconCompatParcelizer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer() {
        Iterator it = this.AudioAttributesImplApi26Parcelizer.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(read());
        }
        this.AudioAttributesImplApi26Parcelizer.clear();
    }

    static /* synthetic */ void MediaBrowserCompatMediaItem(IndexSeeker indexSeeker) {
        indexSeeker.read.RemoteActionCompatParcelizer("unlinkToDeath", new Object[0]);
        indexSeeker.MediaDescriptionCompat.asBinder().unlinkToDeath(indexSeeker.MediaMetadataCompat, 0);
    }

    static /* synthetic */ void MediaBrowserCompatSearchResultReceiver(IndexSeeker indexSeeker) {
        indexSeeker.read.RemoteActionCompatParcelizer("linkToDeath", new Object[0]);
        try {
            indexSeeker.MediaDescriptionCompat.asBinder().linkToDeath(indexSeeker.MediaMetadataCompat, 0);
        } catch (RemoteException e) {
            indexSeeker.read.RemoteActionCompatParcelizer(e, "linkToDeath failed", new Object[0]);
        }
    }

    private final RemoteException read() {
        return new RemoteException(String.valueOf(this.RemoteActionCompatParcelizer).concat(" : Binder has died."));
    }

    static /* synthetic */ void write(final IndexSeeker indexSeeker, final TaskCompletionSource taskCompletionSource) {
        indexSeeker.AudioAttributesImplApi26Parcelizer.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: o.findBoxPosition
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(taskCompletionSource);
            }
        });
    }

    public final void AudioAttributesCompatParcelizer(TaskCompletionSource taskCompletionSource) {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            this.AudioAttributesImplApi26Parcelizer.remove(taskCompletionSource);
        }
        write().post(new parseExpandableClassSize(this));
    }

    public final void IconCompatParcelizer(parseAudioSampleEntry parseaudiosampleentry, TaskCompletionSource taskCompletionSource) {
        write().post(new parseEsdsFromParent(this, parseaudiosampleentry.c(), taskCompletionSource, parseaudiosampleentry));
    }

    final /* synthetic */ void RemoteActionCompatParcelizer(TaskCompletionSource taskCompletionSource) {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            this.AudioAttributesImplApi26Parcelizer.remove(taskCompletionSource);
        }
    }

    public final Handler write() {
        Handler handler;
        Map map = write;
        synchronized (map) {
            if (!map.containsKey(this.RemoteActionCompatParcelizer)) {
                HandlerThread handlerThread = new HandlerThread(this.RemoteActionCompatParcelizer, 10);
                handlerThread.start();
                map.put(this.RemoteActionCompatParcelizer, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.RemoteActionCompatParcelizer);
        }
        return handler;
    }

    static /* bridge */ /* synthetic */ void RemoteActionCompatParcelizer(IndexSeeker indexSeeker, parseAudioSampleEntry parseaudiosampleentry) {
        if (indexSeeker.MediaDescriptionCompat != null || indexSeeker.AudioAttributesImplBaseParcelizer) {
            if (!indexSeeker.AudioAttributesImplBaseParcelizer) {
                parseaudiosampleentry.run();
                return;
            } else {
                indexSeeker.read.RemoteActionCompatParcelizer("Waiting to bind to the service.", new Object[0]);
                indexSeeker.AudioAttributesCompatParcelizer.add(parseaudiosampleentry);
                return;
            }
        }
        indexSeeker.read.RemoteActionCompatParcelizer("Initiate binding to the service.", new Object[0]);
        indexSeeker.AudioAttributesCompatParcelizer.add(parseaudiosampleentry);
        ConstantBitrateSeeker constantBitrateSeeker = new ConstantBitrateSeeker(indexSeeker);
        indexSeeker.RatingCompat = constantBitrateSeeker;
        indexSeeker.AudioAttributesImplBaseParcelizer = true;
        if (indexSeeker.IconCompatParcelizer.bindService(indexSeeker.AudioAttributesImplApi21Parcelizer, constantBitrateSeeker, 1)) {
            return;
        }
        indexSeeker.read.RemoteActionCompatParcelizer("Failed to bind to the service.", new Object[0]);
        indexSeeker.AudioAttributesImplBaseParcelizer = false;
        Iterator it = indexSeeker.AudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((parseAudioSampleEntry) it.next()).a(new isTimeUsInIndex());
        }
        indexSeeker.AudioAttributesCompatParcelizer.clear();
    }

    public final IInterface AudioAttributesCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }
}
