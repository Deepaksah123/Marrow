package kotlin;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.ExtensionsKtkotlinModule1;
import kotlin.jacksonObjectMapper;

/* JADX INFO: loaded from: classes4.dex */
final class accesshasRequiredMarker extends jacksonObjectMapper implements ServiceConnection {
    static final boolean write = Log.isLoggable("MediaRouteProviderProxy", 3);
    final IconCompatParcelizer AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private final ComponentName IconCompatParcelizer;
    private final ArrayList<AudioAttributesCompatParcelizer> MediaBrowserCompatItemReceiver;
    private read RemoteActionCompatParcelizer;
    private boolean read;

    static final class IconCompatParcelizer extends Handler {
    }

    public accesshasRequiredMarker(Context context, ComponentName componentName) {
        super(context, new jacksonObjectMapper.RemoteActionCompatParcelizer(componentName));
        this.MediaBrowserCompatItemReceiver = new ArrayList<>();
        this.IconCompatParcelizer = componentName;
        this.AudioAttributesCompatParcelizer = new IconCompatParcelizer();
    }

    @Override // kotlin.jacksonObjectMapper
    public final jacksonObjectMapper.AudioAttributesCompatParcelizer read(String str) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        return RemoteActionCompatParcelizer(str, null);
    }

    @Override // kotlin.jacksonObjectMapper
    public final jacksonObjectMapper.AudioAttributesCompatParcelizer IconCompatParcelizer(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
        return RemoteActionCompatParcelizer(str, str2);
    }

    @Override // kotlin.jacksonObjectMapper
    public final void IconCompatParcelizer(C0183jsonMapper c0183jsonMapper) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(c0183jsonMapper);
        }
        onCustomAction();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z = write;
        if (z) {
            toString();
        }
        if (this.read) {
            MediaBrowserCompatMediaItem();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (isUnboxableValueClass.AudioAttributesCompatParcelizer(messenger)) {
                read readVar = new read(messenger);
                if (readVar.write()) {
                    this.RemoteActionCompatParcelizer = readVar;
                    return;
                } else {
                    if (z) {
                        toString();
                        return;
                    }
                    return;
                }
            }
            toString();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (write) {
            toString();
        }
        MediaBrowserCompatMediaItem();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Service connection ");
        sb.append(this.IconCompatParcelizer.flattenToShortString());
        return sb.toString();
    }

    public final boolean AudioAttributesCompatParcelizer(String str, String str2) {
        return this.IconCompatParcelizer.getPackageName().equals(str) && this.IconCompatParcelizer.getClassName().equals(str2);
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        if (this.AudioAttributesImplApi21Parcelizer) {
            return;
        }
        if (write) {
            toString();
        }
        this.AudioAttributesImplApi21Parcelizer = true;
        onCustomAction();
    }

    public final void MediaBrowserCompatItemReceiver() {
        if (this.AudioAttributesImplApi21Parcelizer) {
            if (write) {
                toString();
            }
            this.AudioAttributesImplApi21Parcelizer = false;
            onCustomAction();
        }
    }

    public final void AudioAttributesImplBaseParcelizer() {
        if (this.RemoteActionCompatParcelizer == null && MediaDescriptionCompat()) {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            RatingCompat();
        }
    }

    private void onCustomAction() {
        if (MediaDescriptionCompat()) {
            RatingCompat();
        } else {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
    }

    private boolean MediaDescriptionCompat() {
        if (this.AudioAttributesImplApi21Parcelizer) {
            return (RemoteActionCompatParcelizer() == null && this.MediaBrowserCompatItemReceiver.isEmpty()) ? false : true;
        }
        return false;
    }

    private void RatingCompat() {
        if (this.read) {
            return;
        }
        boolean z = write;
        if (z) {
            toString();
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.IconCompatParcelizer);
        try {
            boolean zBindService = AudioAttributesCompatParcelizer().bindService(intent, this, 1);
            this.read = zBindService;
            if (zBindService || !z) {
                return;
            }
            toString();
        } catch (SecurityException unused) {
            if (write) {
                toString();
            }
        }
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        if (this.read) {
            if (write) {
                toString();
            }
            this.read = false;
            MediaBrowserCompatMediaItem();
            AudioAttributesCompatParcelizer().unbindService(this);
        }
    }

    private jacksonObjectMapper.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(String str, String str2) {
        kotlinModuledefault kotlinmoduledefaultIconCompatParcelizer = IconCompatParcelizer();
        if (kotlinmoduledefaultIconCompatParcelizer == null) {
            return null;
        }
        List<ConstructorValueCreator> list = kotlinmoduledefaultIconCompatParcelizer.read();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).MediaBrowserCompatSearchResultReceiver().equals(str)) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(str, str2);
                this.MediaBrowserCompatItemReceiver.add(audioAttributesCompatParcelizer);
                if (this.AudioAttributesImplApi26Parcelizer) {
                    audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
                }
                onCustomAction();
                return audioAttributesCompatParcelizer;
            }
        }
        return null;
    }

    final void write(read readVar) {
        if (this.RemoteActionCompatParcelizer == readVar) {
            this.AudioAttributesImplApi26Parcelizer = true;
            MediaMetadataCompat();
            C0183jsonMapper c0183jsonMapperRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (c0183jsonMapperRemoteActionCompatParcelizer != null) {
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(c0183jsonMapperRemoteActionCompatParcelizer);
            }
        }
    }

    final void read(read readVar) {
        if (this.RemoteActionCompatParcelizer == readVar) {
            if (write) {
                toString();
            }
            MediaBrowserCompatMediaItem();
        }
    }

    final void IconCompatParcelizer(read readVar, String str) {
        if (this.RemoteActionCompatParcelizer == readVar) {
            if (write) {
                toString();
            }
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
    }

    final void AudioAttributesCompatParcelizer(read readVar, kotlinModuledefault kotlinmoduledefault) {
        if (this.RemoteActionCompatParcelizer == readVar) {
            if (write) {
                toString();
                Objects.toString(kotlinmoduledefault);
            }
            write(kotlinmoduledefault);
        }
    }

    private void MediaBrowserCompatMediaItem() {
        if (this.RemoteActionCompatParcelizer != null) {
            write((kotlinModuledefault) null);
            this.AudioAttributesImplApi26Parcelizer = false;
            MediaBrowserCompatSearchResultReceiver();
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            this.RemoteActionCompatParcelizer = null;
        }
    }

    final void write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.MediaBrowserCompatItemReceiver.remove(audioAttributesCompatParcelizer);
        audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        onCustomAction();
    }

    private void MediaMetadataCompat() {
        int size = this.MediaBrowserCompatItemReceiver.size();
        for (int i = 0; i < size; i++) {
            this.MediaBrowserCompatItemReceiver.get(i).AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        int size = this.MediaBrowserCompatItemReceiver.size();
        for (int i = 0; i < size; i++) {
            this.MediaBrowserCompatItemReceiver.get(i).RemoteActionCompatParcelizer();
        }
    }

    final class AudioAttributesCompatParcelizer extends jacksonObjectMapper.AudioAttributesCompatParcelizer {
        private int AudioAttributesCompatParcelizer = -1;
        private final String AudioAttributesImplBaseParcelizer;
        private final String MediaBrowserCompatCustomActionResultReceiver;
        private boolean MediaBrowserCompatItemReceiver;
        private read RemoteActionCompatParcelizer;
        private int read;
        private int write;

        public AudioAttributesCompatParcelizer(String str, String str2) {
            this.MediaBrowserCompatCustomActionResultReceiver = str;
            this.AudioAttributesImplBaseParcelizer = str2;
        }

        public final void AudioAttributesCompatParcelizer(read readVar) {
            this.RemoteActionCompatParcelizer = readVar;
            int iRemoteActionCompatParcelizer = readVar.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer);
            this.read = iRemoteActionCompatParcelizer;
            if (this.MediaBrowserCompatItemReceiver) {
                readVar.IconCompatParcelizer(iRemoteActionCompatParcelizer);
                int i = this.AudioAttributesCompatParcelizer;
                if (i >= 0) {
                    readVar.IconCompatParcelizer(this.read, i);
                    this.AudioAttributesCompatParcelizer = -1;
                }
                int i2 = this.write;
                if (i2 != 0) {
                    readVar.write(this.read, i2);
                    this.write = 0;
                }
            }
        }

        public final void RemoteActionCompatParcelizer() {
            read readVar = this.RemoteActionCompatParcelizer;
            if (readVar != null) {
                readVar.read(this.read);
                this.RemoteActionCompatParcelizer = null;
                this.read = 0;
            }
        }

        @Override // o.jacksonObjectMapper.AudioAttributesCompatParcelizer
        public final void write() {
            accesshasRequiredMarker.this.write(this);
        }

        @Override // o.jacksonObjectMapper.AudioAttributesCompatParcelizer
        public final void read() {
            this.MediaBrowserCompatItemReceiver = true;
            read readVar = this.RemoteActionCompatParcelizer;
            if (readVar != null) {
                readVar.IconCompatParcelizer(this.read);
            }
        }

        @Override // o.jacksonObjectMapper.AudioAttributesCompatParcelizer
        public final void IconCompatParcelizer() {
            RemoteActionCompatParcelizer(0);
        }

        @Override // o.jacksonObjectMapper.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(int i) {
            this.MediaBrowserCompatItemReceiver = false;
            read readVar = this.RemoteActionCompatParcelizer;
            if (readVar != null) {
                readVar.read(this.read, i);
            }
        }

        @Override // o.jacksonObjectMapper.AudioAttributesCompatParcelizer
        public final void AudioAttributesCompatParcelizer(int i) {
            read readVar = this.RemoteActionCompatParcelizer;
            if (readVar != null) {
                readVar.IconCompatParcelizer(this.read, i);
            } else {
                this.AudioAttributesCompatParcelizer = i;
                this.write = 0;
            }
        }

        @Override // o.jacksonObjectMapper.AudioAttributesCompatParcelizer
        public final void write(int i) {
            read readVar = this.RemoteActionCompatParcelizer;
            if (readVar != null) {
                readVar.write(this.read, i);
            } else {
                this.write += i;
            }
        }
    }

    final class read implements IBinder.DeathRecipient {
        private final Messenger AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private final Messenger MediaBrowserCompatCustomActionResultReceiver;
        private final write MediaBrowserCompatItemReceiver;
        private int read = 1;
        private int AudioAttributesCompatParcelizer = 1;
        private final SparseArray<ExtensionsKtkotlinModule1.AudioAttributesCompatParcelizer> RemoteActionCompatParcelizer = new SparseArray<>();

        public read(Messenger messenger) {
            this.MediaBrowserCompatCustomActionResultReceiver = messenger;
            write writeVar = new write(this);
            this.MediaBrowserCompatItemReceiver = writeVar;
            this.AudioAttributesImplApi26Parcelizer = new Messenger(writeVar);
        }

        public final boolean write() {
            int i = this.read;
            this.read = i + 1;
            this.IconCompatParcelizer = i;
            if (!IconCompatParcelizer(1, i, 2, null, null)) {
                return false;
            }
            try {
                this.MediaBrowserCompatCustomActionResultReceiver.getBinder().linkToDeath(this, 0);
                return true;
            } catch (RemoteException unused) {
                binderDied();
                return false;
            }
        }

        public final void RemoteActionCompatParcelizer() {
            IconCompatParcelizer(2, 0, 0, null, null);
            this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
            this.MediaBrowserCompatCustomActionResultReceiver.getBinder().unlinkToDeath(this, 0);
            accesshasRequiredMarker.this.AudioAttributesCompatParcelizer.post(new Runnable() { // from class: o.accesshasRequiredMarker.read.4
                @Override // java.lang.Runnable
                public final void run() {
                    read.this.read();
                }
            });
        }

        final void read() {
            for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
                this.RemoteActionCompatParcelizer.valueAt(i);
            }
            this.RemoteActionCompatParcelizer.clear();
        }

        public final boolean write(int i) {
            if (i == this.IconCompatParcelizer) {
                this.IconCompatParcelizer = 0;
                accesshasRequiredMarker.this.IconCompatParcelizer(this, "Registration failed");
            }
            if (this.RemoteActionCompatParcelizer.get(i) == null) {
                return true;
            }
            this.RemoteActionCompatParcelizer.remove(i);
            return true;
        }

        public final boolean write(int i, int i2, Bundle bundle) {
            if (this.AudioAttributesImplBaseParcelizer != 0 || i != this.IconCompatParcelizer || i2 <= 0) {
                return false;
            }
            this.IconCompatParcelizer = 0;
            this.AudioAttributesImplBaseParcelizer = i2;
            accesshasRequiredMarker.this.AudioAttributesCompatParcelizer(this, kotlinModuledefault.IconCompatParcelizer(bundle));
            accesshasRequiredMarker.this.write(this);
            return true;
        }

        public final boolean IconCompatParcelizer(Bundle bundle) {
            if (this.AudioAttributesImplBaseParcelizer == 0) {
                return false;
            }
            accesshasRequiredMarker.this.AudioAttributesCompatParcelizer(this, kotlinModuledefault.IconCompatParcelizer(bundle));
            return true;
        }

        public final boolean AudioAttributesCompatParcelizer(int i) {
            if (this.RemoteActionCompatParcelizer.get(i) == null) {
                return false;
            }
            this.RemoteActionCompatParcelizer.remove(i);
            return true;
        }

        public final boolean RemoteActionCompatParcelizer(int i) {
            if (this.RemoteActionCompatParcelizer.get(i) == null) {
                return false;
            }
            this.RemoteActionCompatParcelizer.remove(i);
            return true;
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            accesshasRequiredMarker.this.AudioAttributesCompatParcelizer.post(new Runnable() { // from class: o.accesshasRequiredMarker.read.5
                @Override // java.lang.Runnable
                public final void run() {
                    accesshasRequiredMarker.this.read(read.this);
                }
            });
        }

        public final int RemoteActionCompatParcelizer(String str, String str2) {
            int i = this.AudioAttributesCompatParcelizer;
            this.AudioAttributesCompatParcelizer = i + 1;
            Bundle bundle = new Bundle();
            bundle.putString("routeId", str);
            bundle.putString("routeGroupId", str2);
            int i2 = this.read;
            this.read = i2 + 1;
            IconCompatParcelizer(3, i2, i, null, bundle);
            return i;
        }

        public final void read(int i) {
            int i2 = this.read;
            this.read = i2 + 1;
            IconCompatParcelizer(4, i2, i, null, null);
        }

        public final void IconCompatParcelizer(int i) {
            int i2 = this.read;
            this.read = i2 + 1;
            IconCompatParcelizer(5, i2, i, null, null);
        }

        public final void read(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i2);
            int i3 = this.read;
            this.read = i3 + 1;
            IconCompatParcelizer(6, i3, i, null, bundle);
        }

        public final void IconCompatParcelizer(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i2);
            int i3 = this.read;
            this.read = i3 + 1;
            IconCompatParcelizer(7, i3, i, null, bundle);
        }

        public final void write(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i2);
            int i3 = this.read;
            this.read = i3 + 1;
            IconCompatParcelizer(8, i3, i, null, bundle);
        }

        public final void RemoteActionCompatParcelizer(C0183jsonMapper c0183jsonMapper) {
            int i = this.read;
            this.read = i + 1;
            IconCompatParcelizer(10, i, 0, c0183jsonMapper != null ? c0183jsonMapper.RemoteActionCompatParcelizer() : null, null);
        }

        private boolean IconCompatParcelizer(int i, int i2, int i3, Object obj, Bundle bundle) {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = i2;
            messageObtain.arg2 = i3;
            messageObtain.obj = obj;
            messageObtain.setData(bundle);
            messageObtain.replyTo = this.AudioAttributesImplApi26Parcelizer;
            try {
                this.MediaBrowserCompatCustomActionResultReceiver.send(messageObtain);
                return true;
            } catch (DeadObjectException | RemoteException unused) {
                return false;
            }
        }
    }

    static final class write extends Handler {
        private final WeakReference<read> read;

        public write(read readVar) {
            this.read = new WeakReference<>(readVar);
        }

        public final void AudioAttributesCompatParcelizer() {
            this.read.clear();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            read readVar = this.read.get();
            if (readVar == null || write(readVar, message.what, message.arg1, message.arg2, message.obj, message.peekData()) || !accesshasRequiredMarker.write) {
                return;
            }
            Objects.toString(message);
        }

        private static boolean write(read readVar, int i, int i2, int i3, Object obj, Bundle bundle) {
            if (i == 0) {
                readVar.write(i2);
                return true;
            }
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                if (obj == null || (obj instanceof Bundle)) {
                    return readVar.write(i2, i3, (Bundle) obj);
                }
                return false;
            }
            if (i == 3) {
                if (obj != null && !(obj instanceof Bundle)) {
                    return false;
                }
                return readVar.AudioAttributesCompatParcelizer(i2);
            }
            if (i != 4) {
                if (i != 5) {
                    return false;
                }
                if (obj == null || (obj instanceof Bundle)) {
                    return readVar.IconCompatParcelizer((Bundle) obj);
                }
                return false;
            }
            if (obj != null && !(obj instanceof Bundle)) {
                return false;
            }
            if (bundle != null) {
                bundle.getString("error");
            }
            return readVar.RemoteActionCompatParcelizer(i2);
        }
    }
}
