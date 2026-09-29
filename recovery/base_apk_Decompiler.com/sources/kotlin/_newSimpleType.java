package kotlin;

import android.content.Context;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import kotlin.AsExternalTypeDeserializer;
import kotlin._fromWellKnownInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class _newSimpleType implements _fromWellKnownInterface, TypeNameIdResolver {
    private static _newSimpleType AudioAttributesImplApi21Parcelizer;
    private final buildTypeDeserializer AudioAttributesImplBaseParcelizer;
    private final _fromWellKnownInterface.IconCompatParcelizer.write MediaBrowserCompatCustomActionResultReceiver;
    private long MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private final boolean MediaBrowserCompatSearchResultReceiver;
    private long MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final onMoovContainerAtomRead<Integer, Long> MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private long RatingCompat;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private long onAddQueueItem;
    private final constructFromCanonical onCommand;
    private long onCustomAction;
    private long onFastForward;
    public static final initExtraTracks<Long> AudioAttributesImplApi26Parcelizer = initExtraTracks.read(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final initExtraTracks<Long> RemoteActionCompatParcelizer = initExtraTracks.read(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final initExtraTracks<Long> read = initExtraTracks.read(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final initExtraTracks<Long> IconCompatParcelizer = initExtraTracks.read(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final initExtraTracks<Long> AudioAttributesCompatParcelizer = initExtraTracks.read(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final initExtraTracks<Long> write = initExtraTracks.read(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    @Override // kotlin._fromWellKnownInterface
    public final TypeNameIdResolver RemoteActionCompatParcelizer() {
        return this;
    }

    /* synthetic */ _newSimpleType(Context context, Map map, int i, buildTypeDeserializer buildtypedeserializer, boolean z, byte b) {
        this(context, map, i, buildtypedeserializer, z);
    }

    public static final class RemoteActionCompatParcelizer {
        private Map<Integer, Long> AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private buildTypeDeserializer RemoteActionCompatParcelizer;
        private final Context read;
        private boolean write;

        public RemoteActionCompatParcelizer(Context context) {
            this.read = context == null ? null : context.getApplicationContext();
            this.AudioAttributesCompatParcelizer = IconCompatParcelizer(LaissezFaireSubTypeValidator.write(context));
            this.IconCompatParcelizer = 2000;
            this.RemoteActionCompatParcelizer = buildTypeDeserializer.write;
            this.write = true;
        }

        public final _newSimpleType write() {
            return new _newSimpleType(this.read, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, (byte) 0);
        }

        private static Map<Integer, Long> IconCompatParcelizer(String str) {
            int[] iArrRemoteActionCompatParcelizer = _newSimpleType.RemoteActionCompatParcelizer(str);
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            map.put(2, _newSimpleType.AudioAttributesImplApi26Parcelizer.get(iArrRemoteActionCompatParcelizer[0]));
            map.put(3, _newSimpleType.RemoteActionCompatParcelizer.get(iArrRemoteActionCompatParcelizer[1]));
            map.put(4, _newSimpleType.read.get(iArrRemoteActionCompatParcelizer[2]));
            map.put(5, _newSimpleType.IconCompatParcelizer.get(iArrRemoteActionCompatParcelizer[3]));
            map.put(10, _newSimpleType.AudioAttributesCompatParcelizer.get(iArrRemoteActionCompatParcelizer[4]));
            map.put(9, _newSimpleType.write.get(iArrRemoteActionCompatParcelizer[5]));
            map.put(7, _newSimpleType.AudioAttributesImplApi26Parcelizer.get(iArrRemoteActionCompatParcelizer[0]));
            return map;
        }
    }

    public static _newSimpleType IconCompatParcelizer(Context context) {
        _newSimpleType _newsimpletype;
        synchronized (_newSimpleType.class) {
            if (AudioAttributesImplApi21Parcelizer == null) {
                AudioAttributesImplApi21Parcelizer = new RemoteActionCompatParcelizer(context).write();
            }
            _newsimpletype = AudioAttributesImplApi21Parcelizer;
        }
        return _newsimpletype;
    }

    private _newSimpleType(Context context, Map<Integer, Long> map, int i, buildTypeDeserializer buildtypedeserializer, boolean z) {
        this.MediaDescriptionCompat = onMoovContainerAtomRead.write(map);
        this.MediaBrowserCompatCustomActionResultReceiver = new _fromWellKnownInterface.IconCompatParcelizer.write();
        this.onCommand = new constructFromCanonical(i);
        this.AudioAttributesImplBaseParcelizer = buildtypedeserializer;
        this.MediaBrowserCompatSearchResultReceiver = z;
        if (context != null) {
            AsExternalTypeDeserializer asExternalTypeDeserializerRemoteActionCompatParcelizer = AsExternalTypeDeserializer.RemoteActionCompatParcelizer(context);
            int i2 = asExternalTypeDeserializerRemoteActionCompatParcelizer.read();
            this.MediaBrowserCompatMediaItem = i2;
            this.MediaBrowserCompatItemReceiver = RemoteActionCompatParcelizer(i2);
            asExternalTypeDeserializerRemoteActionCompatParcelizer.read(new AsExternalTypeDeserializer.AudioAttributesCompatParcelizer() { // from class: o._fromWildcard
                @Override // o.AsExternalTypeDeserializer.AudioAttributesCompatParcelizer
                public final void IconCompatParcelizer(int i3) {
                    this.IconCompatParcelizer.write(i3);
                }
            });
            return;
        }
        this.MediaBrowserCompatMediaItem = 0;
        this.MediaBrowserCompatItemReceiver = RemoteActionCompatParcelizer(0);
    }

    @Override // kotlin._fromWellKnownInterface
    public final long IconCompatParcelizer() {
        long j;
        synchronized (this) {
            j = this.MediaBrowserCompatItemReceiver;
        }
        return j;
    }

    @Override // kotlin._fromWellKnownInterface
    public final void IconCompatParcelizer(Handler handler, _fromWellKnownInterface.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(handler, iconCompatParcelizer);
    }

    @Override // kotlin._fromWellKnownInterface
    public final void IconCompatParcelizer(_fromWellKnownInterface.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(iconCompatParcelizer);
    }

    @Override // kotlin.TypeNameIdResolver
    public final void IconCompatParcelizer(SubTypeValidator subTypeValidator, boolean z) {
        synchronized (this) {
            if (RemoteActionCompatParcelizer(subTypeValidator, z)) {
                if (this.handleMediaPlayPauseIfPendingOnHandler == 0) {
                    this.onCustomAction = this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer();
                }
                this.handleMediaPlayPauseIfPendingOnHandler++;
            }
        }
    }

    @Override // kotlin.TypeNameIdResolver
    public final void read(SubTypeValidator subTypeValidator, boolean z, int i) {
        synchronized (this) {
            if (RemoteActionCompatParcelizer(subTypeValidator, z)) {
                this.onAddQueueItem += (long) i;
            }
        }
    }

    @Override // kotlin.TypeNameIdResolver
    public final void write(SubTypeValidator subTypeValidator, boolean z) {
        synchronized (this) {
            try {
                if (RemoteActionCompatParcelizer(subTypeValidator, z)) {
                    buildTypeSerializer.write(this.handleMediaPlayPauseIfPendingOnHandler > 0);
                    long jRemoteActionCompatParcelizer = this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer();
                    int i = (int) (jRemoteActionCompatParcelizer - this.onCustomAction);
                    this.onFastForward += (long) i;
                    long j = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                    long j2 = this.onAddQueueItem;
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = j + j2;
                    if (i > 0) {
                        this.onCommand.RemoteActionCompatParcelizer((int) Math.sqrt(j2), (j2 * 8000.0f) / i);
                        if (this.onFastForward >= 2000 || this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver >= 524288) {
                            this.MediaBrowserCompatItemReceiver = (long) this.onCommand.IconCompatParcelizer();
                        }
                        write(i, this.onAddQueueItem, this.MediaBrowserCompatItemReceiver);
                        this.onCustomAction = jRemoteActionCompatParcelizer;
                        this.onAddQueueItem = 0L;
                    }
                    this.handleMediaPlayPauseIfPendingOnHandler--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(int i) {
        synchronized (this) {
            int i2 = this.MediaBrowserCompatMediaItem;
            if (i2 == 0 || this.MediaBrowserCompatSearchResultReceiver) {
                if (i2 == i) {
                    return;
                }
                this.MediaBrowserCompatMediaItem = i;
                if (i == 1 || i == 0 || i == 8) {
                    return;
                }
                this.MediaBrowserCompatItemReceiver = RemoteActionCompatParcelizer(i);
                long jRemoteActionCompatParcelizer = this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer();
                write(this.handleMediaPlayPauseIfPendingOnHandler > 0 ? (int) (jRemoteActionCompatParcelizer - this.onCustomAction) : 0, this.onAddQueueItem, this.MediaBrowserCompatItemReceiver);
                this.onCustomAction = jRemoteActionCompatParcelizer;
                this.onAddQueueItem = 0L;
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0L;
                this.onFastForward = 0L;
                this.onCommand.RemoteActionCompatParcelizer();
            }
        }
    }

    private void write(int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.RatingCompat) {
            return;
        }
        this.RatingCompat = j2;
        this.MediaBrowserCompatCustomActionResultReceiver.write(i, j, j2);
    }

    private long RemoteActionCompatParcelizer(int i) {
        Long l = this.MediaDescriptionCompat.get(Integer.valueOf(i));
        if (l == null) {
            l = this.MediaDescriptionCompat.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    private static boolean RemoteActionCompatParcelizer(SubTypeValidator subTypeValidator, boolean z) {
        return z && !subTypeValidator.read(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:742:0x0b5f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] RemoteActionCompatParcelizer(java.lang.String r3) {
        /*
            Method dump skipped, instruction units count: 7954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._newSimpleType.RemoteActionCompatParcelizer(java.lang.String):int[]");
    }
}
