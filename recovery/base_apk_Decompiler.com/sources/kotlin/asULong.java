package kotlin;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.deserializeErzVvmY;

/* JADX INFO: loaded from: classes4.dex */
public final class asULong extends Service {
    private int AudioAttributesCompatParcelizer;
    private final Map<Integer, String> RemoteActionCompatParcelizer = new LinkedHashMap();
    private final RemoteCallbackList<UShortSerializer> IconCompatParcelizer = new read();
    private final deserializeErzVvmY.IconCompatParcelizer write = new write();

    public final int write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void write(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    public final Map<Integer, String> RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static final class read extends RemoteCallbackList<UShortSerializer> {
        read() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.RemoteCallbackList
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(UShortSerializer uShortSerializer, Object obj) {
            toMagicModuleMetaRepoModel.write(uShortSerializer, "");
            toMagicModuleMetaRepoModel.write(obj, "");
            asULong.this.RemoteActionCompatParcelizer().remove((Integer) obj);
        }
    }

    public final RemoteCallbackList<UShortSerializer> read() {
        return this.IconCompatParcelizer;
    }

    public static final class write extends deserializeErzVvmY.IconCompatParcelizer {
        write() {
        }

        @Override // kotlin.deserializeErzVvmY
        public final int IconCompatParcelizer(UShortSerializer uShortSerializer, String str) {
            toMagicModuleMetaRepoModel.write(uShortSerializer, "");
            int i = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList<UShortSerializer> remoteCallbackList = asULong.this.read();
            asULong asulong = asULong.this;
            synchronized (remoteCallbackList) {
                asulong.write(asulong.write() + 1);
                int iWrite = asulong.write();
                if (asulong.read().register(uShortSerializer, Integer.valueOf(iWrite))) {
                    asulong.RemoteActionCompatParcelizer().put(Integer.valueOf(iWrite), str);
                    i = iWrite;
                } else {
                    asulong.write(asulong.write() - 1);
                    asulong.write();
                }
            }
            return i;
        }

        @Override // kotlin.deserializeErzVvmY
        public final void RemoteActionCompatParcelizer(UShortSerializer uShortSerializer, int i) {
            toMagicModuleMetaRepoModel.write(uShortSerializer, "");
            RemoteCallbackList<UShortSerializer> remoteCallbackList = asULong.this.read();
            asULong asulong = asULong.this;
            synchronized (remoteCallbackList) {
                asulong.read().unregister(uShortSerializer);
                asulong.RemoteActionCompatParcelizer().remove(Integer.valueOf(i));
            }
        }

        @Override // kotlin.deserializeErzVvmY
        public final void AudioAttributesCompatParcelizer(int i, String[] strArr) {
            toMagicModuleMetaRepoModel.write(strArr, "");
            RemoteCallbackList<UShortSerializer> remoteCallbackList = asULong.this.read();
            asULong asulong = asULong.this;
            synchronized (remoteCallbackList) {
                String str = asulong.RemoteActionCompatParcelizer().get(Integer.valueOf(i));
                if (str == null) {
                    return;
                }
                int iBeginBroadcast = asulong.read().beginBroadcast();
                for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                    try {
                        Object broadcastCookie = asulong.read().getBroadcastCookie(i2);
                        toMagicModuleMetaRepoModel.read(broadcastCookie, "");
                        int iIntValue = ((Integer) broadcastCookie).intValue();
                        String str2 = asulong.RemoteActionCompatParcelizer().get(Integer.valueOf(iIntValue));
                        if (i != iIntValue && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) str2)) {
                            try {
                                ((UShortSerializer) asulong.read().getBroadcastItem(i2)).write(strArr);
                                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                            } catch (RemoteException e) {
                                RemoteException remoteException = e;
                            }
                        }
                    } catch (Throwable th) {
                        asulong.read().finishBroadcast();
                        throw th;
                    }
                }
                asulong.read().finishBroadcast();
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        toMagicModuleMetaRepoModel.write(intent, "");
        return this.write;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
    }
}
