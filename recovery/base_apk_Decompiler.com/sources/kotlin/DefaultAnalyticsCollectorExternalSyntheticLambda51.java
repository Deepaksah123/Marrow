package kotlin;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0003\n\f\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR(\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\u0007\u0010\u0006R(\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\b\u0010\u0006R\u0016\u0010\u0005\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u000f\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda51;", "", "<init>", "()V", "", "RemoteActionCompatParcelizer", "()Ljava/lang/String;", "read", "write", "Ljava/lang/String;", "IconCompatParcelizer", "p0", "AudioAttributesCompatParcelizer", "AudioAttributesImplBaseParcelizer", "", "AudioAttributesImplApi21Parcelizer", "J", "", "MediaBrowserCompatItemReceiver", "Z", "MediaBrowserCompatCustomActionResultReceiver", "()Z"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda51 {
    private static DefaultAnalyticsCollectorExternalSyntheticLambda51 RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private String write;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private String IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String AudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda51.class.getCanonicalName();

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final boolean getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        if (lambdaonMediaMetadataChanged48.onAddQueueItem() && lambdaonMediaMetadataChanged48.RemoteActionCompatParcelizer()) {
            return this.IconCompatParcelizer;
        }
        return null;
    }

    /* JADX INFO: renamed from: o.DefaultAnalyticsCollectorExternalSyntheticLambda51$IconCompatParcelizer, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0006\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0012R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R.\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@CX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0013\u0010\u0016\"\u0004\b\f\u0010\u0017"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda51$IconCompatParcelizer;", "", "<init>", "()V", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda51;", "p0", "write", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda51;)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda51;", "Landroid/content/Context;", "read", "(Landroid/content/Context;)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda51;", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "", "AudioAttributesImplApi21Parcelizer", "(Landroid/content/Context;)Ljava/lang/String;", "", "MediaBrowserCompatItemReceiver", "(Landroid/content/Context;)Z", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda51;", "()Lo/DefaultAnalyticsCollectorExternalSyntheticLambda51;", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda51;)V"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        private static void AudioAttributesCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda51 defaultAnalyticsCollectorExternalSyntheticLambda51) {
            DefaultAnalyticsCollectorExternalSyntheticLambda51.RemoteActionCompatParcelizer = defaultAnalyticsCollectorExternalSyntheticLambda51;
        }

        private static DefaultAnalyticsCollectorExternalSyntheticLambda51 RemoteActionCompatParcelizer() {
            return DefaultAnalyticsCollectorExternalSyntheticLambda51.RemoteActionCompatParcelizer;
        }

        private final DefaultAnalyticsCollectorExternalSyntheticLambda51 read(Context p0) {
            DefaultAnalyticsCollectorExternalSyntheticLambda51 defaultAnalyticsCollectorExternalSyntheticLambda51Write = write(p0);
            if (defaultAnalyticsCollectorExternalSyntheticLambda51Write != null) {
                return defaultAnalyticsCollectorExternalSyntheticLambda51Write;
            }
            DefaultAnalyticsCollectorExternalSyntheticLambda51 defaultAnalyticsCollectorExternalSyntheticLambda51IconCompatParcelizer = IconCompatParcelizer(p0);
            return defaultAnalyticsCollectorExternalSyntheticLambda51IconCompatParcelizer == null ? new DefaultAnalyticsCollectorExternalSyntheticLambda51() : defaultAnalyticsCollectorExternalSyntheticLambda51IconCompatParcelizer;
        }

        private final DefaultAnalyticsCollectorExternalSyntheticLambda51 write(Context p0) {
            Object obj;
            try {
                Companion companion = this;
                if (!MediaBrowserCompatItemReceiver(p0)) {
                    return null;
                }
                Method method = DefaultAnalyticsCollectorMediaPeriodQueueTracker.read("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", (Class<?>[]) new Class[]{Context.class});
                if (method != null && (obj = DefaultAnalyticsCollectorMediaPeriodQueueTracker.read((Object) null, method, p0)) != null) {
                    Method methodRemoteActionCompatParcelizer = DefaultAnalyticsCollectorMediaPeriodQueueTracker.RemoteActionCompatParcelizer(obj.getClass(), "getId", new Class[0]);
                    Method methodRemoteActionCompatParcelizer2 = DefaultAnalyticsCollectorMediaPeriodQueueTracker.RemoteActionCompatParcelizer(obj.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                    if (methodRemoteActionCompatParcelizer != null && methodRemoteActionCompatParcelizer2 != null) {
                        DefaultAnalyticsCollectorExternalSyntheticLambda51 defaultAnalyticsCollectorExternalSyntheticLambda51 = new DefaultAnalyticsCollectorExternalSyntheticLambda51();
                        defaultAnalyticsCollectorExternalSyntheticLambda51.IconCompatParcelizer = (String) DefaultAnalyticsCollectorMediaPeriodQueueTracker.read(obj, methodRemoteActionCompatParcelizer, new Object[0]);
                        Boolean bool = (Boolean) DefaultAnalyticsCollectorMediaPeriodQueueTracker.read(obj, methodRemoteActionCompatParcelizer2, new Object[0]);
                        defaultAnalyticsCollectorExternalSyntheticLambda51.AudioAttributesImplApi21Parcelizer = bool != null ? bool.booleanValue() : false;
                        return defaultAnalyticsCollectorExternalSyntheticLambda51;
                    }
                }
                return null;
            } catch (Exception e) {
                DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer("android_id", e);
                return null;
            }
        }

        @getMagicModuleMeta
        public final boolean RemoteActionCompatParcelizer(Context p0) throws Throwable {
            toMagicModuleMetaRepoModel.write(p0, "");
            DefaultAnalyticsCollectorExternalSyntheticLambda51 defaultAnalyticsCollectorExternalSyntheticLambda51AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0);
            return defaultAnalyticsCollectorExternalSyntheticLambda51AudioAttributesCompatParcelizer != null && defaultAnalyticsCollectorExternalSyntheticLambda51AudioAttributesCompatParcelizer.getAudioAttributesImplApi21Parcelizer();
        }

        private static boolean MediaBrowserCompatItemReceiver(Context p0) {
            Method method = DefaultAnalyticsCollectorMediaPeriodQueueTracker.read("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", (Class<?>[]) new Class[]{Context.class});
            if (method != null) {
                Object obj = DefaultAnalyticsCollectorMediaPeriodQueueTracker.read((Object) null, method, p0);
                if ((obj instanceof Integer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, (Object) 0)) {
                    return true;
                }
            }
            return false;
        }

        private static DefaultAnalyticsCollectorExternalSyntheticLambda51 IconCompatParcelizer(Context p0) {
            read readVar = new read();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            read readVar2 = readVar;
            if (!p0.bindService(intent, readVar2, 1)) {
                return null;
            }
            try {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(readVar.RemoteActionCompatParcelizer());
                DefaultAnalyticsCollectorExternalSyntheticLambda51 defaultAnalyticsCollectorExternalSyntheticLambda51 = new DefaultAnalyticsCollectorExternalSyntheticLambda51();
                defaultAnalyticsCollectorExternalSyntheticLambda51.IconCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                defaultAnalyticsCollectorExternalSyntheticLambda51.AudioAttributesImplApi21Parcelizer = audioAttributesCompatParcelizer.write();
                return defaultAnalyticsCollectorExternalSyntheticLambda51;
            } catch (Exception e) {
                DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer("android_id", e);
                return null;
            } finally {
                p0.unbindService(readVar2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008e A[Catch: all -> 0x00ff, Exception -> 0x0101, TryCatch #4 {Exception -> 0x0101, all -> 0x00ff, blocks: (B:3:0x0013, B:5:0x0021, B:7:0x002a, B:10:0x003b, B:12:0x005d, B:14:0x0068, B:21:0x0085, B:23:0x008e, B:25:0x0093, B:27:0x009b, B:17:0x0072, B:19:0x007d, B:46:0x00f5, B:47:0x00fe), top: B:61:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0093 A[Catch: all -> 0x00ff, Exception -> 0x0101, TryCatch #4 {Exception -> 0x0101, all -> 0x00ff, blocks: (B:3:0x0013, B:5:0x0021, B:7:0x002a, B:10:0x003b, B:12:0x005d, B:14:0x0068, B:21:0x0085, B:23:0x008e, B:25:0x0093, B:27:0x009b, B:17:0x0072, B:19:0x007d, B:46:0x00f5, B:47:0x00fe), top: B:61:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009b A[Catch: all -> 0x00ff, Exception -> 0x0101, TRY_LEAVE, TryCatch #4 {Exception -> 0x0101, all -> 0x00ff, blocks: (B:3:0x0013, B:5:0x0021, B:7:0x002a, B:10:0x003b, B:12:0x005d, B:14:0x0068, B:21:0x0085, B:23:0x008e, B:25:0x0093, B:27:0x009b, B:17:0x0072, B:19:0x007d, B:46:0x00f5, B:47:0x00fe), top: B:61:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0116  */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
        /* JADX WARN: Type inference failed for: r5v2 */
        @kotlin.getMagicModuleMeta
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda51 AudioAttributesCompatParcelizer(android.content.Context r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 282
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda51.Companion.AudioAttributesCompatParcelizer(android.content.Context):o.DefaultAnalyticsCollectorExternalSyntheticLambda51");
        }

        private final DefaultAnalyticsCollectorExternalSyntheticLambda51 write(DefaultAnalyticsCollectorExternalSyntheticLambda51 p0) {
            p0.RemoteActionCompatParcelizer = System.currentTimeMillis();
            AudioAttributesCompatParcelizer(p0);
            return p0;
        }

        private static String AudioAttributesImplApi21Parcelizer(Context p0) {
            PackageManager packageManager = p0.getPackageManager();
            if (packageManager != null) {
                return packageManager.getInstallerPackageName(p0.getPackageName());
            }
            return null;
        }
    }

    @getMagicModuleMeta
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda51 write(Context context) {
        return INSTANCE.AudioAttributesCompatParcelizer(context);
    }

    @getMagicModuleMeta
    public static final boolean IconCompatParcelizer(Context context) {
        return INSTANCE.RemoteActionCompatParcelizer(context);
    }

    /* JADX INFO: loaded from: classes2.dex */
    static final class read implements ServiceConnection {
        private final AtomicBoolean RemoteActionCompatParcelizer = new AtomicBoolean(false);
        private final BlockingQueue<IBinder> AudioAttributesCompatParcelizer = new LinkedBlockingDeque();

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.AudioAttributesCompatParcelizer.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        public final IBinder RemoteActionCompatParcelizer() throws InterruptedException {
            if (this.RemoteActionCompatParcelizer.compareAndSet(true, true)) {
                throw new IllegalStateException("Binder already consumed".toString());
            }
            IBinder iBinderTake = this.AudioAttributesCompatParcelizer.take();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iBinderTake, "");
            return iBinderTake;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0011\u0010\t\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000f"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda51$AudioAttributesCompatParcelizer;", "Landroid/os/IInterface;", "Landroid/os/IBinder;", "p0", "<init>", "(Landroid/os/IBinder;)V", "asBinder", "()Landroid/os/IBinder;", "", "RemoteActionCompatParcelizer", "()Ljava/lang/String;", "IconCompatParcelizer", "Landroid/os/IBinder;", "write", "", "()Z"}, k = 1, mv = {1, 4, 0})
    static final class AudioAttributesCompatParcelizer implements IInterface {

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final IBinder write;

        public AudioAttributesCompatParcelizer(IBinder iBinder) {
            toMagicModuleMetaRepoModel.write(iBinder, "");
            this.write = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.write;
        }

        public final String RemoteActionCompatParcelizer() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parcelObtain, "");
            Parcel parcelObtain2 = Parcel.obtain();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parcelObtain2, "");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.write.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public final boolean write() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parcelObtain, "");
            Parcel parcelObtain2 = Parcel.obtain();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parcelObtain2, "");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.write.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }
}
