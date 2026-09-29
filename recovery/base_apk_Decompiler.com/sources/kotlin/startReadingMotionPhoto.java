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
public final class startReadingMotionPhoto {
    private static final Map RemoteActionCompatParcelizer = new HashMap();
    private boolean AudioAttributesImplApi21Parcelizer;
    private final JpegExtractor IconCompatParcelizer;
    private final Intent MediaBrowserCompatItemReceiver;
    private IInterface MediaBrowserCompatMediaItem;
    private ServiceConnection MediaBrowserCompatSearchResultReceiver;
    private final DefaultEbmlReaderMasterElement MediaDescriptionCompat;
    private final Context read;
    private final List AudioAttributesCompatParcelizer = new ArrayList();
    private final Set AudioAttributesImplBaseParcelizer = new HashSet();
    private final Object AudioAttributesImplApi26Parcelizer = new Object();
    private final IBinder.DeathRecipient MediaMetadataCompat = new IBinder.DeathRecipient() { // from class: o.readMarker
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            startReadingMotionPhoto.AudioAttributesImplApi26Parcelizer(this.write);
        }
    };
    private final AtomicInteger RatingCompat = new AtomicInteger(0);
    private final String write = "AppUpdateService";
    private final WeakReference MediaBrowserCompatCustomActionResultReceiver = new WeakReference(null);

    public startReadingMotionPhoto(Context context, JpegExtractor jpegExtractor, Intent intent, DefaultEbmlReaderMasterElement defaultEbmlReaderMasterElement) {
        this.read = context;
        this.IconCompatParcelizer = jpegExtractor;
        this.MediaBrowserCompatItemReceiver = intent;
        this.MediaDescriptionCompat = defaultEbmlReaderMasterElement;
    }

    public static /* synthetic */ void AudioAttributesImplApi26Parcelizer(startReadingMotionPhoto startreadingmotionphoto) {
        startreadingmotionphoto.IconCompatParcelizer.AudioAttributesCompatParcelizer("reportBinderDeath", new Object[0]);
        if (((readSegment) startreadingmotionphoto.MediaBrowserCompatCustomActionResultReceiver.get()) != null) {
            startreadingmotionphoto.IconCompatParcelizer.AudioAttributesCompatParcelizer("calling onBinderDied", new Object[0]);
        } else {
            startreadingmotionphoto.IconCompatParcelizer.AudioAttributesCompatParcelizer("%s : Binder has died.", startreadingmotionphoto.write);
            Iterator it = startreadingmotionphoto.AudioAttributesCompatParcelizer.iterator();
            while (it.hasNext()) {
                ((outputImageTrack) it.next()).AudioAttributesCompatParcelizer(startreadingmotionphoto.IconCompatParcelizer());
            }
            startreadingmotionphoto.AudioAttributesCompatParcelizer.clear();
        }
        synchronized (startreadingmotionphoto.AudioAttributesImplApi26Parcelizer) {
            startreadingmotionphoto.read();
        }
    }

    static /* synthetic */ void MediaBrowserCompatSearchResultReceiver(startReadingMotionPhoto startreadingmotionphoto) {
        startreadingmotionphoto.IconCompatParcelizer.AudioAttributesCompatParcelizer("linkToDeath", new Object[0]);
        try {
            startreadingmotionphoto.MediaBrowserCompatMediaItem.asBinder().linkToDeath(startreadingmotionphoto.MediaMetadataCompat, 0);
        } catch (RemoteException e) {
            startreadingmotionphoto.IconCompatParcelizer.RemoteActionCompatParcelizer(e, "linkToDeath failed", new Object[0]);
        }
    }

    static /* synthetic */ void MediaDescriptionCompat(startReadingMotionPhoto startreadingmotionphoto) {
        startreadingmotionphoto.IconCompatParcelizer.AudioAttributesCompatParcelizer("unlinkToDeath", new Object[0]);
        startreadingmotionphoto.MediaBrowserCompatMediaItem.asBinder().unlinkToDeath(startreadingmotionphoto.MediaMetadataCompat, 0);
    }

    static /* synthetic */ void RemoteActionCompatParcelizer(final startReadingMotionPhoto startreadingmotionphoto, final TaskCompletionSource taskCompletionSource) {
        startreadingmotionphoto.AudioAttributesImplBaseParcelizer.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: o.endReadingWithImageTrack
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.read.RemoteActionCompatParcelizer(taskCompletionSource);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read() {
        Iterator it = this.AudioAttributesImplBaseParcelizer.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(IconCompatParcelizer());
        }
        this.AudioAttributesImplBaseParcelizer.clear();
    }

    public final void IconCompatParcelizer(TaskCompletionSource taskCompletionSource) {
        synchronized (this.AudioAttributesImplApi26Parcelizer) {
            this.AudioAttributesImplBaseParcelizer.remove(taskCompletionSource);
        }
        RemoteActionCompatParcelizer().post(new readSegmentLength(this));
    }

    public final Handler RemoteActionCompatParcelizer() {
        Handler handler;
        Map map = RemoteActionCompatParcelizer;
        synchronized (map) {
            if (!map.containsKey(this.write)) {
                HandlerThread handlerThread = new HandlerThread(this.write, 10);
                handlerThread.start();
                map.put(this.write, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.write);
        }
        return handler;
    }

    final /* synthetic */ void RemoteActionCompatParcelizer(TaskCompletionSource taskCompletionSource) {
        synchronized (this.AudioAttributesImplApi26Parcelizer) {
            this.AudioAttributesImplBaseParcelizer.remove(taskCompletionSource);
        }
    }

    public final void write(outputImageTrack outputimagetrack, TaskCompletionSource taskCompletionSource) {
        RemoteActionCompatParcelizer().post(new sniffMotionPhotoVideo(this, outputimagetrack.write(), taskCompletionSource, outputimagetrack));
    }

    private final RemoteException IconCompatParcelizer() {
        return new RemoteException(String.valueOf(this.write).concat(" : Binder has died."));
    }

    static /* synthetic */ void write(startReadingMotionPhoto startreadingmotionphoto, outputImageTrack outputimagetrack) {
        if (startreadingmotionphoto.MediaBrowserCompatMediaItem != null || startreadingmotionphoto.AudioAttributesImplApi21Parcelizer) {
            if (!startreadingmotionphoto.AudioAttributesImplApi21Parcelizer) {
                outputimagetrack.run();
                return;
            } else {
                startreadingmotionphoto.IconCompatParcelizer.AudioAttributesCompatParcelizer("Waiting to bind to the service.", new Object[0]);
                startreadingmotionphoto.AudioAttributesCompatParcelizer.add(outputimagetrack);
                return;
            }
        }
        startreadingmotionphoto.IconCompatParcelizer.AudioAttributesCompatParcelizer("Initiate binding to the service.", new Object[0]);
        startreadingmotionphoto.AudioAttributesCompatParcelizer.add(outputimagetrack);
        MotionPhotoDescription motionPhotoDescription = new MotionPhotoDescription(startreadingmotionphoto);
        startreadingmotionphoto.MediaBrowserCompatSearchResultReceiver = motionPhotoDescription;
        startreadingmotionphoto.AudioAttributesImplApi21Parcelizer = true;
        if (startreadingmotionphoto.read.bindService(startreadingmotionphoto.MediaBrowserCompatItemReceiver, motionPhotoDescription, 1)) {
            return;
        }
        startreadingmotionphoto.IconCompatParcelizer.AudioAttributesCompatParcelizer("Failed to bind to the service.", new Object[0]);
        startreadingmotionphoto.AudioAttributesImplApi21Parcelizer = false;
        Iterator it = startreadingmotionphoto.AudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((outputImageTrack) it.next()).AudioAttributesCompatParcelizer(new StartOffsetExtractorInput());
        }
        startreadingmotionphoto.AudioAttributesCompatParcelizer.clear();
    }

    public final IInterface write() {
        return this.MediaBrowserCompatMediaItem;
    }
}
