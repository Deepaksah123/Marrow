package kotlin;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.setMediaItems;

/* JADX INFO: loaded from: classes2.dex */
public final class BundleListRetriever implements getMediaClock, AudioBecomingNoisyManagerAudioBecomingNoisyReceiver {
    final Map<CProjection, eb> AudioAttributesCompatParcelizer;
    private Context AudioAttributesImplApi21Parcelizer;
    private hasPrevious AudioAttributesImplApi26Parcelizer;
    private final setEnableDecoderFallback AudioAttributesImplBaseParcelizer;
    final Map<CProjection, setPassingYear> IconCompatParcelizer;
    private CProjection MediaBrowserCompatCustomActionResultReceiver;
    private read MediaBrowserCompatItemReceiver;
    final getState RemoteActionCompatParcelizer;
    final Map<CProjection, CVideoChangeFrameRateStrategy> read;
    final Object write = new Object();

    interface read {
        void RemoteActionCompatParcelizer(int i);

        void RemoteActionCompatParcelizer(int i, Notification notification);

        void read(int i);

        void write(int i, int i2, Notification notification);
    }

    static {
        n.write("SystemFgDispatcher");
    }

    BundleListRetriever(Context context) {
        this.AudioAttributesImplApi21Parcelizer = context;
        hasPrevious hasprevious = hasPrevious.read(this.AudioAttributesImplApi21Parcelizer);
        this.AudioAttributesImplApi26Parcelizer = hasprevious;
        this.AudioAttributesImplBaseParcelizer = hasprevious.MediaBrowserCompatCustomActionResultReceiver();
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        this.AudioAttributesCompatParcelizer = new LinkedHashMap();
        this.IconCompatParcelizer = new HashMap();
        this.read = new HashMap();
        this.RemoteActionCompatParcelizer = new getState(this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver());
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer().IconCompatParcelizer(this);
    }

    @Override // kotlin.AudioBecomingNoisyManagerAudioBecomingNoisyReceiver
    public final void RemoteActionCompatParcelizer(CProjection cProjection, boolean z) {
        Map.Entry<CProjection, eb> entry;
        synchronized (this.write) {
            setPassingYear setpassingyearRemove = this.read.remove(cProjection) != null ? this.IconCompatParcelizer.remove(cProjection) : null;
            if (setpassingyearRemove != null) {
                setpassingyearRemove.RemoteActionCompatParcelizer((CancellationException) null);
            }
        }
        eb ebVarRemove = this.AudioAttributesCompatParcelizer.remove(cProjection);
        if (cProjection.equals(this.MediaBrowserCompatCustomActionResultReceiver)) {
            if (this.AudioAttributesCompatParcelizer.size() > 0) {
                Iterator<Map.Entry<CProjection, eb>> it = this.AudioAttributesCompatParcelizer.entrySet().iterator();
                Map.Entry<CProjection, eb> next = it.next();
                while (true) {
                    entry = next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.MediaBrowserCompatCustomActionResultReceiver = entry.getKey();
                if (this.MediaBrowserCompatItemReceiver != null) {
                    eb value = entry.getValue();
                    this.MediaBrowserCompatItemReceiver.write(value.RemoteActionCompatParcelizer(), value.read(), value.IconCompatParcelizer());
                    this.MediaBrowserCompatItemReceiver.read(value.RemoteActionCompatParcelizer());
                }
            } else {
                this.MediaBrowserCompatCustomActionResultReceiver = null;
            }
        }
        read readVar = this.MediaBrowserCompatItemReceiver;
        if (ebVarRemove == null || readVar == null) {
            return;
        }
        n.write();
        ebVarRemove.RemoteActionCompatParcelizer();
        Objects.toString(cProjection);
        ebVarRemove.read();
        readVar.read(ebVarRemove.RemoteActionCompatParcelizer());
    }

    final void IconCompatParcelizer(read readVar) {
        if (this.MediaBrowserCompatItemReceiver != null) {
            n.write();
        } else {
            this.MediaBrowserCompatItemReceiver = readVar;
        }
    }

    final void AudioAttributesCompatParcelizer(Intent intent, int i) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            RemoteActionCompatParcelizer(intent);
            AudioAttributesCompatParcelizer(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            AudioAttributesCompatParcelizer(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            write(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            RemoteActionCompatParcelizer(i);
        }
    }

    final void RemoteActionCompatParcelizer() {
        this.MediaBrowserCompatItemReceiver = null;
        synchronized (this.write) {
            Iterator<setPassingYear> it = this.IconCompatParcelizer.values().iterator();
            while (it.hasNext()) {
                it.next().RemoteActionCompatParcelizer((CancellationException) null);
            }
        }
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer().read(this);
    }

    final void AudioAttributesCompatParcelizer(int i, int i2) {
        n.write();
        for (Map.Entry<CProjection, eb> entry : this.AudioAttributesCompatParcelizer.entrySet()) {
            if (entry.getValue().read() == i2) {
                this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(entry.getKey(), -128);
            }
        }
        read readVar = this.MediaBrowserCompatItemReceiver;
        if (readVar != null) {
            readVar.RemoteActionCompatParcelizer(i);
        }
    }

    private void RemoteActionCompatParcelizer(Intent intent) {
        n.write();
        Objects.toString(intent);
        final String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(new Runnable() { // from class: o.BundleListRetriever.4
            @Override // java.lang.Runnable
            public final void run() {
                CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy = BundleListRetriever.this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer().read(stringExtra);
                if (cVideoChangeFrameRateStrategy == null || !cVideoChangeFrameRateStrategy.AudioAttributesImplBaseParcelizer()) {
                    return;
                }
                synchronized (BundleListRetriever.this.write) {
                    BundleListRetriever.this.read.put(onReleased.read(cVideoChangeFrameRateStrategy), cVideoChangeFrameRateStrategy);
                    BundleListRetriever.this.IconCompatParcelizer.put(onReleased.read(cVideoChangeFrameRateStrategy), getTrackType.RemoteActionCompatParcelizer(BundleListRetriever.this.RemoteActionCompatParcelizer, cVideoChangeFrameRateStrategy, BundleListRetriever.this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(), BundleListRetriever.this));
                }
            }
        });
    }

    private void AudioAttributesCompatParcelizer(Intent intent) {
        if (this.MediaBrowserCompatItemReceiver == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        CProjection cProjection = new CProjection(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        n.write();
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        eb ebVar = new eb(intExtra, notification, intExtra2);
        this.AudioAttributesCompatParcelizer.put(cProjection, ebVar);
        eb ebVar2 = this.AudioAttributesCompatParcelizer.get(this.MediaBrowserCompatCustomActionResultReceiver);
        if (ebVar2 == null) {
            this.MediaBrowserCompatCustomActionResultReceiver = cProjection;
        } else {
            this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(intExtra, notification);
            Iterator<Map.Entry<CProjection, eb>> it = this.AudioAttributesCompatParcelizer.entrySet().iterator();
            while (it.hasNext()) {
                i |= it.next().getValue().read();
            }
            ebVar = new eb(ebVar2.RemoteActionCompatParcelizer(), ebVar2.IconCompatParcelizer(), i);
        }
        this.MediaBrowserCompatItemReceiver.write(ebVar.RemoteActionCompatParcelizer(), ebVar.read(), ebVar.IconCompatParcelizer());
    }

    private void RemoteActionCompatParcelizer(int i) {
        n.write();
        read readVar = this.MediaBrowserCompatItemReceiver;
        if (readVar != null) {
            readVar.RemoteActionCompatParcelizer(i);
        }
    }

    private void write(Intent intent) {
        n.write();
        Objects.toString(intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.AudioAttributesImplApi26Parcelizer.read(UUID.fromString(stringExtra));
    }

    @Override // kotlin.getMediaClock
    public final void write(CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy, setMediaItems setmediaitems) {
        if (setmediaitems instanceof setMediaItems.RemoteActionCompatParcelizer) {
            String str = cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer;
            n.write();
            this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(onReleased.read(cVideoChangeFrameRateStrategy), ((setMediaItems.RemoteActionCompatParcelizer) setmediaitems).write());
        }
    }

    public static Intent RemoteActionCompatParcelizer(Context context, CProjection cProjection, eb ebVar) {
        Intent intent = new Intent(context, (Class<?>) BundleableCreator.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", cProjection.AudioAttributesCompatParcelizer());
        intent.putExtra("KEY_GENERATION", cProjection.RemoteActionCompatParcelizer());
        intent.putExtra("KEY_NOTIFICATION_ID", ebVar.RemoteActionCompatParcelizer());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ebVar.read());
        intent.putExtra("KEY_NOTIFICATION", ebVar.IconCompatParcelizer());
        return intent;
    }

    public static Intent AudioAttributesCompatParcelizer(Context context, CProjection cProjection, eb ebVar) {
        Intent intent = new Intent(context, (Class<?>) BundleableCreator.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", ebVar.RemoteActionCompatParcelizer());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ebVar.read());
        intent.putExtra("KEY_NOTIFICATION", ebVar.IconCompatParcelizer());
        intent.putExtra("KEY_WORKSPEC_ID", cProjection.AudioAttributesCompatParcelizer());
        intent.putExtra("KEY_GENERATION", cProjection.RemoteActionCompatParcelizer());
        return intent;
    }

    public static Intent read(Context context) {
        Intent intent = new Intent(context, (Class<?>) BundleableCreator.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }
}
