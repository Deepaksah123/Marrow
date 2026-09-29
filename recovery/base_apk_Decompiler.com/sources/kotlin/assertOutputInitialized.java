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

/* JADX INFO: loaded from: classes3.dex */
public final class assertOutputInitialized {
    private static final Map RemoteActionCompatParcelizer = new HashMap();
    private boolean AudioAttributesImplApi21Parcelizer;
    private final Context IconCompatParcelizer;
    private final Intent MediaBrowserCompatItemReceiver;
    private final parseVorbisCodecPrivate MediaBrowserCompatMediaItem;
    private IInterface MediaBrowserCompatSearchResultReceiver;
    private ServiceConnection RatingCompat;
    private final getCurrentTrack write;
    private final List read = new ArrayList();
    private final Set AudioAttributesImplBaseParcelizer = new HashSet();
    private final Object MediaBrowserCompatCustomActionResultReceiver = new Object();
    private final IBinder.DeathRecipient MediaMetadataCompat = new IBinder.DeathRecipient() { // from class: o.MatroskaExtractorExternalSyntheticLambda0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            assertOutputInitialized.AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer);
        }
    };
    private final AtomicInteger MediaDescriptionCompat = new AtomicInteger(0);
    private final String AudioAttributesCompatParcelizer = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    private final WeakReference AudioAttributesImplApi26Parcelizer = new WeakReference(null);

    public assertOutputInitialized(Context context, getCurrentTrack getcurrenttrack, Intent intent, parseVorbisCodecPrivate parsevorbiscodecprivate) {
        this.IconCompatParcelizer = context;
        this.write = getcurrenttrack;
        this.MediaBrowserCompatItemReceiver = intent;
        this.MediaBrowserCompatMediaItem = parsevorbiscodecprivate;
    }

    public static /* synthetic */ void AudioAttributesImplApi26Parcelizer(assertOutputInitialized assertoutputinitialized) {
        assertoutputinitialized.write.read("reportBinderDeath", new Object[0]);
        if (((MatroskaExtractorInnerEbmlProcessor) assertoutputinitialized.AudioAttributesImplApi26Parcelizer.get()) != null) {
            assertoutputinitialized.write.read("calling onBinderDied", new Object[0]);
        } else {
            assertoutputinitialized.write.read("%s : Binder has died.", assertoutputinitialized.AudioAttributesCompatParcelizer);
            Iterator it = assertoutputinitialized.read.iterator();
            while (it.hasNext()) {
                ((handleBlockAddIDExtraData) it.next()).RemoteActionCompatParcelizer(assertoutputinitialized.RemoteActionCompatParcelizer());
            }
            assertoutputinitialized.read.clear();
        }
        assertoutputinitialized.read();
    }

    static /* synthetic */ void MediaBrowserCompatCustomActionResultReceiver(assertOutputInitialized assertoutputinitialized) {
        assertoutputinitialized.write.read("linkToDeath", new Object[0]);
        try {
            assertoutputinitialized.MediaBrowserCompatSearchResultReceiver.asBinder().linkToDeath(assertoutputinitialized.MediaMetadataCompat, 0);
        } catch (RemoteException e) {
            assertoutputinitialized.write.read(e, "linkToDeath failed", new Object[0]);
        }
    }

    static /* synthetic */ void RatingCompat(assertOutputInitialized assertoutputinitialized) {
        assertoutputinitialized.write.read("unlinkToDeath", new Object[0]);
        assertoutputinitialized.MediaBrowserCompatSearchResultReceiver.asBinder().unlinkToDeath(assertoutputinitialized.MediaMetadataCompat, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read() {
        synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
            Iterator it = this.AudioAttributesImplBaseParcelizer.iterator();
            while (it.hasNext()) {
                ((TaskCompletionSource) it.next()).trySetException(RemoteActionCompatParcelizer());
            }
            this.AudioAttributesImplBaseParcelizer.clear();
        }
    }

    public final void AudioAttributesCompatParcelizer(TaskCompletionSource taskCompletionSource) {
        synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
            this.AudioAttributesImplBaseParcelizer.remove(taskCompletionSource);
        }
        synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
            if (this.MediaDescriptionCompat.get() > 0 && this.MediaDescriptionCompat.decrementAndGet() > 0) {
                this.write.read("Leaving the connection open for other ongoing calls.", new Object[0]);
            } else {
                IconCompatParcelizer().post(new MatroskaExtractorFlags(this));
            }
        }
    }

    public final Handler IconCompatParcelizer() {
        Handler handler;
        Map map = RemoteActionCompatParcelizer;
        synchronized (map) {
            if (!map.containsKey(this.AudioAttributesCompatParcelizer)) {
                HandlerThread handlerThread = new HandlerThread(this.AudioAttributesCompatParcelizer, 10);
                handlerThread.start();
                map.put(this.AudioAttributesCompatParcelizer, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.AudioAttributesCompatParcelizer);
        }
        return handler;
    }

    final /* synthetic */ void IconCompatParcelizer(TaskCompletionSource taskCompletionSource) {
        synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
            this.AudioAttributesImplBaseParcelizer.remove(taskCompletionSource);
        }
    }

    public final void IconCompatParcelizer(handleBlockAddIDExtraData handleblockaddidextradata, final TaskCompletionSource taskCompletionSource) {
        synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
            this.AudioAttributesImplBaseParcelizer.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: o.writeToTarget
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    this.read.IconCompatParcelizer(taskCompletionSource);
                }
            });
        }
        synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
            if (this.MediaDescriptionCompat.getAndIncrement() > 0) {
                this.write.AudioAttributesCompatParcelizer(new Object[0]);
            }
        }
        IconCompatParcelizer().post(new handleBlockAdditionalData(this, handleblockaddidextradata.AudioAttributesCompatParcelizer(), handleblockaddidextradata));
    }

    private final RemoteException RemoteActionCompatParcelizer() {
        return new RemoteException(String.valueOf(this.AudioAttributesCompatParcelizer).concat(" : Binder has died."));
    }

    static /* synthetic */ void AudioAttributesCompatParcelizer(assertOutputInitialized assertoutputinitialized, handleBlockAddIDExtraData handleblockaddidextradata) {
        if (assertoutputinitialized.MediaBrowserCompatSearchResultReceiver != null || assertoutputinitialized.AudioAttributesImplApi21Parcelizer) {
            if (!assertoutputinitialized.AudioAttributesImplApi21Parcelizer) {
                handleblockaddidextradata.run();
                return;
            } else {
                assertoutputinitialized.write.read("Waiting to bind to the service.", new Object[0]);
                assertoutputinitialized.read.add(handleblockaddidextradata);
                return;
            }
        }
        assertoutputinitialized.write.read("Initiate binding to the service.", new Object[0]);
        assertoutputinitialized.read.add(handleblockaddidextradata);
        getHdrStaticInfo gethdrstaticinfo = new getHdrStaticInfo(assertoutputinitialized);
        assertoutputinitialized.RatingCompat = gethdrstaticinfo;
        assertoutputinitialized.AudioAttributesImplApi21Parcelizer = true;
        if (assertoutputinitialized.IconCompatParcelizer.bindService(assertoutputinitialized.MediaBrowserCompatItemReceiver, gethdrstaticinfo, 1)) {
            return;
        }
        assertoutputinitialized.write.read("Failed to bind to the service.", new Object[0]);
        assertoutputinitialized.AudioAttributesImplApi21Parcelizer = false;
        Iterator it = assertoutputinitialized.read.iterator();
        while (it.hasNext()) {
            ((handleBlockAddIDExtraData) it.next()).RemoteActionCompatParcelizer(new parseFourCcPrivate());
        }
        assertoutputinitialized.read.clear();
    }

    public final IInterface AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }
}
