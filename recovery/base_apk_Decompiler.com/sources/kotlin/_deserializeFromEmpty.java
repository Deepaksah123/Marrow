package kotlin;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.write;

/* JADX INFO: loaded from: classes2.dex */
public final class _deserializeFromEmpty {
    private static read IconCompatParcelizer;
    private static String write;
    private final NotificationManager AudioAttributesImplApi26Parcelizer;
    private final Context AudioAttributesImplBaseParcelizer;
    private static final Object read = new Object();
    private static Set<String> RemoteActionCompatParcelizer = new HashSet();
    private static final Object AudioAttributesCompatParcelizer = new Object();

    /* JADX INFO: loaded from: classes4.dex */
    interface IconCompatParcelizer {
        void read(kotlin.write writeVar) throws RemoteException;
    }

    public static _deserializeFromEmpty write(Context context) {
        return new _deserializeFromEmpty(context);
    }

    private _deserializeFromEmpty(Context context) {
        this.AudioAttributesImplBaseParcelizer = context;
        this.AudioAttributesImplApi26Parcelizer = (NotificationManager) context.getSystemService("notification");
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        IconCompatParcelizer(null, i);
    }

    public final void IconCompatParcelizer(String str, int i) {
        this.AudioAttributesImplApi26Parcelizer.cancel(str, i);
    }

    public final void AudioAttributesCompatParcelizer(int i, Notification notification) {
        read(null, i, notification);
    }

    public final void read(String str, int i, Notification notification) {
        if (read(notification)) {
            RemoteActionCompatParcelizer(new write(this.AudioAttributesImplBaseParcelizer.getPackageName(), i, str, notification));
            this.AudioAttributesImplApi26Parcelizer.cancel(str, i);
        } else {
            this.AudioAttributesImplApi26Parcelizer.notify(str, i, notification);
        }
    }

    public final boolean read() {
        return RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
    }

    public static Set<String> read(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (read) {
            if (string != null) {
                if (!string.equals(write)) {
                    String[] strArrSplit = string.split(":", -1);
                    HashSet hashSet = new HashSet(strArrSplit.length);
                    for (String str : strArrSplit) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString != null) {
                            hashSet.add(componentNameUnflattenFromString.getPackageName());
                        }
                    }
                    RemoteActionCompatParcelizer = hashSet;
                    write = string;
                }
                set = RemoteActionCompatParcelizer;
            } else {
                set = RemoteActionCompatParcelizer;
            }
        }
        return set;
    }

    private static boolean read(Notification notification) {
        Bundle bundleMediaMetadataCompat = _coercedTypeDesc.MediaMetadataCompat(notification);
        return bundleMediaMetadataCompat != null && bundleMediaMetadataCompat.getBoolean("android.support.useSideChannel");
    }

    private void RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        synchronized (AudioAttributesCompatParcelizer) {
            if (IconCompatParcelizer == null) {
                IconCompatParcelizer = new read(this.AudioAttributesImplBaseParcelizer.getApplicationContext());
            }
            IconCompatParcelizer.RemoteActionCompatParcelizer(iconCompatParcelizer);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class read implements Handler.Callback, ServiceConnection {
        private final Map<ComponentName, write> AudioAttributesCompatParcelizer = new HashMap();
        private Set<String> IconCompatParcelizer = new HashSet();
        private final Handler RemoteActionCompatParcelizer;
        private final HandlerThread read;
        private final Context write;

        read(Context context) {
            this.write = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.read = handlerThread;
            handlerThread.start();
            this.RemoteActionCompatParcelizer = new Handler(handlerThread.getLooper(), this);
        }

        public void RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
            this.RemoteActionCompatParcelizer.obtainMessage(0, iconCompatParcelizer).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                read((IconCompatParcelizer) message.obj);
                return true;
            }
            if (i == 1) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) message.obj;
                RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.IconCompatParcelizer, audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
                return true;
            }
            if (i == 2) {
                IconCompatParcelizer((ComponentName) message.obj);
                return true;
            }
            if (i != 3) {
                return false;
            }
            read((ComponentName) message.obj);
            return true;
        }

        private void read(IconCompatParcelizer iconCompatParcelizer) {
            AudioAttributesCompatParcelizer();
            for (write writeVar : this.AudioAttributesCompatParcelizer.values()) {
                writeVar.write.add(iconCompatParcelizer);
                IconCompatParcelizer(writeVar);
            }
        }

        private void RemoteActionCompatParcelizer(ComponentName componentName, IBinder iBinder) {
            write writeVar = this.AudioAttributesCompatParcelizer.get(componentName);
            if (writeVar != null) {
                writeVar.IconCompatParcelizer = write.read.RemoteActionCompatParcelizer(iBinder);
                writeVar.AudioAttributesCompatParcelizer = 0;
                IconCompatParcelizer(writeVar);
            }
        }

        private void IconCompatParcelizer(ComponentName componentName) {
            write writeVar = this.AudioAttributesCompatParcelizer.get(componentName);
            if (writeVar != null) {
                read(writeVar);
            }
        }

        private void read(ComponentName componentName) {
            write writeVar = this.AudioAttributesCompatParcelizer.get(componentName);
            if (writeVar != null) {
                IconCompatParcelizer(writeVar);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
            }
            this.RemoteActionCompatParcelizer.obtainMessage(1, new AudioAttributesCompatParcelizer(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
            }
            this.RemoteActionCompatParcelizer.obtainMessage(2, componentName).sendToTarget();
        }

        private void AudioAttributesCompatParcelizer() {
            Set<String> set = _deserializeFromEmpty.read(this.write);
            if (set.equals(this.IconCompatParcelizer)) {
                return;
            }
            this.IconCompatParcelizer = set;
            List<ResolveInfo> listQueryIntentServices = this.write.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (set.contains(((PackageItemInfo) resolveInfo.serviceInfo).packageName)) {
                    ComponentName componentName = new ComponentName(((PackageItemInfo) resolveInfo.serviceInfo).packageName, ((PackageItemInfo) resolveInfo.serviceInfo).name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        componentName.toString();
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.AudioAttributesCompatParcelizer.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(componentName2);
                    }
                    this.AudioAttributesCompatParcelizer.put(componentName2, new write(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, write>> it = this.AudioAttributesCompatParcelizer.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, write> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(next.getKey());
                    }
                    read(next.getValue());
                    it.remove();
                }
            }
        }

        private boolean AudioAttributesCompatParcelizer(write writeVar) {
            if (writeVar.read) {
                return true;
            }
            writeVar.read = this.write.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(writeVar.RemoteActionCompatParcelizer), this, 33);
            if (writeVar.read) {
                writeVar.AudioAttributesCompatParcelizer = 0;
            } else {
                Objects.toString(writeVar.RemoteActionCompatParcelizer);
                this.write.unbindService(this);
            }
            return writeVar.read;
        }

        private void read(write writeVar) {
            if (writeVar.read) {
                this.write.unbindService(this);
                writeVar.read = false;
            }
            writeVar.IconCompatParcelizer = null;
        }

        private void RemoteActionCompatParcelizer(write writeVar) {
            if (this.RemoteActionCompatParcelizer.hasMessages(3, writeVar.RemoteActionCompatParcelizer)) {
                return;
            }
            writeVar.AudioAttributesCompatParcelizer++;
            if (writeVar.AudioAttributesCompatParcelizer > 6) {
                writeVar.write.size();
                Objects.toString(writeVar.RemoteActionCompatParcelizer);
                int i = writeVar.AudioAttributesCompatParcelizer;
                writeVar.write.clear();
                return;
            }
            int i2 = (1 << (writeVar.AudioAttributesCompatParcelizer - 1)) * 1000;
            Log.isLoggable("NotifManCompat", 3);
            this.RemoteActionCompatParcelizer.sendMessageDelayed(this.RemoteActionCompatParcelizer.obtainMessage(3, writeVar.RemoteActionCompatParcelizer), i2);
        }

        private void IconCompatParcelizer(write writeVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(writeVar.RemoteActionCompatParcelizer);
                writeVar.write.size();
            }
            if (writeVar.write.isEmpty()) {
                return;
            }
            if (!AudioAttributesCompatParcelizer(writeVar) || writeVar.IconCompatParcelizer == null) {
                RemoteActionCompatParcelizer(writeVar);
                return;
            }
            while (true) {
                IconCompatParcelizer iconCompatParcelizerPeek = writeVar.write.peek();
                if (iconCompatParcelizerPeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(iconCompatParcelizerPeek);
                    }
                    iconCompatParcelizerPeek.read(writeVar.IconCompatParcelizer);
                    writeVar.write.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(writeVar.RemoteActionCompatParcelizer);
                    }
                } catch (RemoteException unused2) {
                    Objects.toString(writeVar.RemoteActionCompatParcelizer);
                }
            }
            if (writeVar.write.isEmpty()) {
                return;
            }
            RemoteActionCompatParcelizer(writeVar);
        }

        static class write {
            kotlin.write IconCompatParcelizer;
            final ComponentName RemoteActionCompatParcelizer;
            boolean read = false;
            ArrayDeque<IconCompatParcelizer> write = new ArrayDeque<>();
            int AudioAttributesCompatParcelizer = 0;

            write(ComponentName componentName) {
                this.RemoteActionCompatParcelizer = componentName;
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class AudioAttributesCompatParcelizer {
        final IBinder AudioAttributesCompatParcelizer;
        final ComponentName IconCompatParcelizer;

        AudioAttributesCompatParcelizer(ComponentName componentName, IBinder iBinder) {
            this.IconCompatParcelizer = componentName;
            this.AudioAttributesCompatParcelizer = iBinder;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class write implements IconCompatParcelizer {
        final Notification AudioAttributesCompatParcelizer;
        final String IconCompatParcelizer;
        final String RemoteActionCompatParcelizer;
        final int write;

        write(String str, int i, String str2, Notification notification) {
            this.IconCompatParcelizer = str;
            this.write = i;
            this.RemoteActionCompatParcelizer = str2;
            this.AudioAttributesCompatParcelizer = notification;
        }

        @Override // o._deserializeFromEmpty.IconCompatParcelizer
        public void read(kotlin.write writeVar) throws RemoteException {
            writeVar.IconCompatParcelizer(this.IconCompatParcelizer, this.write, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
            sb.append(this.IconCompatParcelizer);
            sb.append(", id:");
            sb.append(this.write);
            sb.append(", tag:");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append("]");
            return sb.toString();
        }
    }

    static class RemoteActionCompatParcelizer {
        static boolean AudioAttributesCompatParcelizer(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }
}
