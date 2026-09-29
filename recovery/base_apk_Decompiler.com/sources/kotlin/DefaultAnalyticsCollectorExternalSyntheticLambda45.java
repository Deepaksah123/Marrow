package kotlin;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.getActiveSessionId;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0007\u0019\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\n\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\n\u0010\u0015J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda45;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;)Landroid/content/Intent;", "", "write", "()Z", "", "", "Lo/lambdaonUpstreamDiscarded27;", "p1", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda45$read;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/util/List;)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda45$read;", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda45$RemoteActionCompatParcelizer;", "p2", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda45$RemoteActionCompatParcelizer;Ljava/lang/String;Ljava/util/List;)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda45$read;", "(Ljava/lang/String;)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda45$read;", "Ljava/lang/String;", "read", "IconCompatParcelizer", "Ljava/lang/Boolean;"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda45 {
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda45 INSTANCE = new DefaultAnalyticsCollectorExternalSyntheticLambda45();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static Boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private static final String read;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda45$read;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "write", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 4, 0})
    public enum read {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR
    }

    static {
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer("RemoteServiceWrapper", "");
        read = "RemoteServiceWrapper";
    }

    private DefaultAnalyticsCollectorExternalSyntheticLambda45() {
    }

    @getMagicModuleMeta
    public static final boolean write() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda45.class)) {
            return false;
        }
        try {
            if (AudioAttributesCompatParcelizer == null) {
                Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
                DefaultAnalyticsCollectorExternalSyntheticLambda45 defaultAnalyticsCollectorExternalSyntheticLambda45 = INSTANCE;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer, "");
                AudioAttributesCompatParcelizer = Boolean.valueOf(defaultAnalyticsCollectorExternalSyntheticLambda45.RemoteActionCompatParcelizer(contextAudioAttributesCompatParcelizer) != null);
            }
            Boolean bool = AudioAttributesCompatParcelizer;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda45.class);
            return false;
        }
    }

    @getMagicModuleMeta
    public static final read AudioAttributesCompatParcelizer(String p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda45.class)) {
            return null;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            return INSTANCE.write(RemoteActionCompatParcelizer.MOBILE_APP_INSTALL, p0, IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda45.class);
            return null;
        }
    }

    @getMagicModuleMeta
    public static final read AudioAttributesCompatParcelizer(String p0, List<lambdaonUpstreamDiscarded27> p1) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda45.class)) {
            return null;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return INSTANCE.write(RemoteActionCompatParcelizer.CUSTOM_APP_EVENTS, p0, p1);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda45.class);
            return null;
        }
    }

    private final read write(RemoteActionCompatParcelizer p0, String p1, List<lambdaonUpstreamDiscarded27> p2) {
        read readVar;
        IconCompatParcelizer iconCompatParcelizer;
        read readVar2;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            read readVar3 = read.SERVICE_NOT_AVAILABLE;
            DefaultAnalyticsCollectorExternalSyntheticLambda29.read();
            Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer, "");
            Intent intentRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(contextAudioAttributesCompatParcelizer);
            if (intentRemoteActionCompatParcelizer == null) {
                return readVar3;
            }
            IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer();
            try {
                if (!contextAudioAttributesCompatParcelizer.bindService(intentRemoteActionCompatParcelizer, iconCompatParcelizer2, 1)) {
                    return read.SERVICE_ERROR;
                }
                try {
                    IBinder iBinder = iconCompatParcelizer2.read();
                    if (iBinder != null) {
                        getActiveSessionId getactivesessionidIconCompatParcelizer = getActiveSessionId.read.IconCompatParcelizer(iBinder);
                        Bundle bundle = DefaultAnalyticsCollectorExternalSyntheticLambda42.read(p0, p1, p2);
                        if (bundle != null) {
                            getactivesessionidIconCompatParcelizer.RemoteActionCompatParcelizer(bundle);
                            Objects.toString(bundle);
                            DefaultAnalyticsCollectorMediaPeriodQueueTracker.AudioAttributesImplApi26Parcelizer();
                        }
                        readVar2 = read.OPERATION_SUCCESS;
                    } else {
                        readVar2 = read.SERVICE_NOT_AVAILABLE;
                    }
                    return readVar2;
                } catch (RemoteException e) {
                    readVar = read.SERVICE_ERROR;
                    DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(read, e);
                    iconCompatParcelizer = iconCompatParcelizer2;
                    contextAudioAttributesCompatParcelizer.unbindService(iconCompatParcelizer);
                    DefaultAnalyticsCollectorMediaPeriodQueueTracker.AudioAttributesImplApi26Parcelizer();
                    return readVar;
                } catch (InterruptedException e2) {
                    readVar = read.SERVICE_ERROR;
                    DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(read, e2);
                    iconCompatParcelizer = iconCompatParcelizer2;
                    contextAudioAttributesCompatParcelizer.unbindService(iconCompatParcelizer);
                    DefaultAnalyticsCollectorMediaPeriodQueueTracker.AudioAttributesImplApi26Parcelizer();
                    return readVar;
                }
            } finally {
                contextAudioAttributesCompatParcelizer.unbindService(iconCompatParcelizer2);
                DefaultAnalyticsCollectorMediaPeriodQueueTracker.AudioAttributesImplApi26Parcelizer();
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }

    private final Intent RemoteActionCompatParcelizer(Context p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            PackageManager packageManager = p0.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && DefaultAnalyticsCollectorExternalSyntheticLambda57.RemoteActionCompatParcelizer(p0, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null) {
                    if (DefaultAnalyticsCollectorExternalSyntheticLambda57.RemoteActionCompatParcelizer(p0, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\n"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda45$RemoteActionCompatParcelizer;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "write", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 4, 0})
    public enum RemoteActionCompatParcelizer {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");


        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final String write;

        RemoteActionCompatParcelizer(String str) {
            this.write = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.write;
        }
    }

    public static final class IconCompatParcelizer implements ServiceConnection {
        private final CountDownLatch AudioAttributesCompatParcelizer = new CountDownLatch(1);
        private IBinder read;

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            toMagicModuleMetaRepoModel.write(componentName, "");
            toMagicModuleMetaRepoModel.write(iBinder, "");
            this.read = iBinder;
            this.AudioAttributesCompatParcelizer.countDown();
        }

        @Override // android.content.ServiceConnection
        public final void onNullBinding(ComponentName componentName) {
            toMagicModuleMetaRepoModel.write(componentName, "");
            this.AudioAttributesCompatParcelizer.countDown();
        }

        public final IBinder read() throws InterruptedException {
            this.AudioAttributesCompatParcelizer.await(5L, TimeUnit.SECONDS);
            return this.read;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            toMagicModuleMetaRepoModel.write(componentName, "");
        }
    }
}
