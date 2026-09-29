package kotlin;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin._coercedTypeDesc;
import kotlin.isAdaptiveV19;

/* JADX INFO: loaded from: classes5.dex */
public final class isSecureV21 {
    private final ExecutorService AudioAttributesCompatParcelizer;
    private final Context IconCompatParcelizer;
    private final bypassRead write;

    public isSecureV21(Context context, bypassRead bypassread, ExecutorService executorService) {
        this.AudioAttributesCompatParcelizer = executorService;
        this.IconCompatParcelizer = context;
        this.write = bypassread;
    }

    private boolean AudioAttributesCompatParcelizer() {
        if (((KeyguardManager) this.IconCompatParcelizer.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.isAtLeastLollipop()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.IconCompatParcelizer.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == iMyPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean IconCompatParcelizer() {
        if (this.write.RemoteActionCompatParcelizer("gcm.n.noui")) {
            return true;
        }
        if (AudioAttributesCompatParcelizer()) {
            return false;
        }
        isHdr10PlusOutOfBandMetadataSupported ishdr10plusoutofbandmetadatasupported = read();
        isAdaptiveV19.read readVarAudioAttributesCompatParcelizer = isAdaptiveV19.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this.write);
        AudioAttributesCompatParcelizer(readVarAudioAttributesCompatParcelizer.read, ishdr10plusoutofbandmetadatasupported);
        AudioAttributesCompatParcelizer(readVarAudioAttributesCompatParcelizer);
        return true;
    }

    private isHdr10PlusOutOfBandMetadataSupported read() {
        isHdr10PlusOutOfBandMetadataSupported ishdr10plusoutofbandmetadatasupportedIconCompatParcelizer = isHdr10PlusOutOfBandMetadataSupported.IconCompatParcelizer(this.write.write("gcm.n.image"));
        if (ishdr10plusoutofbandmetadatasupportedIconCompatParcelizer != null) {
            ishdr10plusoutofbandmetadatasupportedIconCompatParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
        }
        return ishdr10plusoutofbandmetadatasupportedIconCompatParcelizer;
    }

    private static void AudioAttributesCompatParcelizer(_coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, isHdr10PlusOutOfBandMetadataSupported ishdr10plusoutofbandmetadatasupported) {
        if (ishdr10plusoutofbandmetadatasupported != null) {
            try {
                Bitmap bitmap = (Bitmap) Tasks.await(ishdr10plusoutofbandmetadatasupported.read(), 5L, TimeUnit.SECONDS);
                audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(bitmap);
                audioAttributesImplBaseParcelizer.read(new _coercedTypeDesc.read().write(bitmap).read((Bitmap) null));
            } catch (InterruptedException unused) {
                ishdr10plusoutofbandmetadatasupported.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                Objects.toString(e.getCause());
            } catch (TimeoutException unused2) {
                ishdr10plusoutofbandmetadatasupported.close();
            }
        }
    }

    private void AudioAttributesCompatParcelizer(isAdaptiveV19.read readVar) {
        ((NotificationManager) this.IconCompatParcelizer.getSystemService("notification")).notify(readVar.RemoteActionCompatParcelizer, readVar.AudioAttributesCompatParcelizer, readVar.read.RemoteActionCompatParcelizer());
    }
}
