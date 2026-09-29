package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.AudioAttributesImplBaseParcelizer;
import kotlin.JsonFormatVisitorWrapper;
import kotlin._checkFromStringCoercion;
import kotlin.setTitleOptional;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowserCompat {
    static final boolean IconCompatParcelizer = Log.isLoggable("MediaBrowserCompat", 3);
    private final AudioAttributesImplApi26Parcelizer AudioAttributesCompatParcelizer;

    interface AudioAttributesImplApi26Parcelizer {
        MediaSessionCompat.Token MediaBrowserCompatCustomActionResultReceiver();

        void RemoteActionCompatParcelizer();

        void read();
    }

    interface AudioAttributesImplBaseParcelizer {
        void IconCompatParcelizer(Messenger messenger);

        void RemoteActionCompatParcelizer(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        void read(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static abstract class MediaBrowserCompatSearchResultReceiver {
        public void IconCompatParcelizer(String str, Bundle bundle, List<MediaItem> list) {
        }

        public void write(String str, Bundle bundle) {
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static abstract class RemoteActionCompatParcelizer {
        public void AudioAttributesCompatParcelizer(String str, Bundle bundle, Bundle bundle2) {
        }

        public void RemoteActionCompatParcelizer(String str, Bundle bundle, Bundle bundle2) {
        }

        public void write(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, IconCompatParcelizer iconCompatParcelizer, Bundle bundle) {
        this.AudioAttributesCompatParcelizer = new AudioAttributesImplApi21Parcelizer(context, componentName, iconCompatParcelizer, bundle);
    }

    public final void write() {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public final void IconCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.read();
    }

    public final MediaSessionCompat.Token RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() { // from class: android.support.v4.media.MediaBrowserCompat.MediaItem.3
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };
        private final android.support.v4.media.MediaDescriptionCompat read;
        private final int write;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static MediaItem read(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
            return new MediaItem(android.support.v4.media.MediaDescriptionCompat.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer.write(mediaItem)), AudioAttributesCompatParcelizer.read(mediaItem));
        }

        public static List<MediaItem> read(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(read(it.next()));
            }
            return arrayList;
        }

        public MediaItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.AudioAttributesImplApi26Parcelizer())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.write = i;
            this.read = mediaDescriptionCompat;
        }

        MediaItem(Parcel parcel) {
            this.write = parcel.readInt();
            this.read = android.support.v4.media.MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.write);
            this.read.writeToParcel(parcel, i);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MediaItem{mFlags=");
            sb.append(this.write);
            sb.append(", mDescription=");
            sb.append(this.read);
            sb.append('}');
            return sb.toString();
        }
    }

    public static class IconCompatParcelizer {
        read RemoteActionCompatParcelizer;
        final MediaBrowser.ConnectionCallback read = new C0000IconCompatParcelizer();

        interface read {
            void AudioAttributesCompatParcelizer();

            void IconCompatParcelizer();

            void write();
        }

        public void IconCompatParcelizer() {
        }

        public void RemoteActionCompatParcelizer() {
        }

        public void write() {
        }

        void AudioAttributesCompatParcelizer(read readVar) {
            this.RemoteActionCompatParcelizer = readVar;
        }

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$IconCompatParcelizer$IconCompatParcelizer, reason: collision with other inner class name */
        class C0000IconCompatParcelizer extends MediaBrowser.ConnectionCallback {
            C0000IconCompatParcelizer() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
                if (IconCompatParcelizer.this.RemoteActionCompatParcelizer != null) {
                    IconCompatParcelizer.this.RemoteActionCompatParcelizer.write();
                }
                IconCompatParcelizer.this.RemoteActionCompatParcelizer();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                if (IconCompatParcelizer.this.RemoteActionCompatParcelizer != null) {
                    IconCompatParcelizer.this.RemoteActionCompatParcelizer.IconCompatParcelizer();
                }
                IconCompatParcelizer.this.write();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                if (IconCompatParcelizer.this.RemoteActionCompatParcelizer != null) {
                    IconCompatParcelizer.this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
                }
                IconCompatParcelizer.this.IconCompatParcelizer();
            }
        }
    }

    public static abstract class MediaDescriptionCompat {
        WeakReference<MediaBrowserCompatMediaItem> RemoteActionCompatParcelizer;
        final IBinder IconCompatParcelizer = new Binder();
        final MediaBrowser.SubscriptionCallback read = new RemoteActionCompatParcelizer();

        public void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
        }

        public void AudioAttributesCompatParcelizer(String str, List<MediaItem> list) {
        }

        public void AudioAttributesCompatParcelizer(String str, List<MediaItem> list, Bundle bundle) {
        }

        public void read(String str) {
        }

        class IconCompatParcelizer extends MediaBrowser.SubscriptionCallback {
            IconCompatParcelizer() {
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = MediaDescriptionCompat.this.RemoteActionCompatParcelizer == null ? null : MediaDescriptionCompat.this.RemoteActionCompatParcelizer.get();
                if (mediaBrowserCompatMediaItem == null) {
                    MediaDescriptionCompat.this.AudioAttributesCompatParcelizer(str, MediaItem.read((List<?>) list));
                    return;
                }
                List<MediaItem> list2 = MediaItem.read((List<?>) list);
                List<MediaDescriptionCompat> list3 = mediaBrowserCompatMediaItem.read();
                List<Bundle> listAudioAttributesCompatParcelizer = mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer();
                for (int i = 0; i < list3.size(); i++) {
                    Bundle bundle = listAudioAttributesCompatParcelizer.get(i);
                    if (bundle == null) {
                        MediaDescriptionCompat.this.AudioAttributesCompatParcelizer(str, list2);
                    } else {
                        MediaDescriptionCompat.this.AudioAttributesCompatParcelizer(str, read(list2, bundle), bundle);
                    }
                }
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str) {
                MediaDescriptionCompat.this.read(str);
            }

            List<MediaItem> read(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int size = i3 + i2;
                if (i < 0 || i2 <= 0 || i3 >= list.size()) {
                    return Collections.emptyList();
                }
                if (size > list.size()) {
                    size = list.size();
                }
                return list.subList(i3, size);
            }
        }

        class RemoteActionCompatParcelizer extends IconCompatParcelizer {
            RemoteActionCompatParcelizer() {
                super();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.IconCompatParcelizer(bundle);
                MediaDescriptionCompat.this.AudioAttributesCompatParcelizer(str, MediaItem.read((List<?>) list), bundle);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str, Bundle bundle) {
                MediaSessionCompat.IconCompatParcelizer(bundle);
                MediaDescriptionCompat.this.AudioAttributesCompatParcelizer(str, bundle);
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static abstract class read {
        final MediaBrowser.ItemCallback write = new write();

        public void AudioAttributesCompatParcelizer(MediaItem mediaItem) {
        }

        public void AudioAttributesCompatParcelizer(String str) {
        }

        class write extends MediaBrowser.ItemCallback {
            write() {
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
                read.this.AudioAttributesCompatParcelizer(MediaItem.read(mediaItem));
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onError(String str) {
                read.this.AudioAttributesCompatParcelizer(str);
            }
        }
    }

    static class MediaBrowserCompatItemReceiver implements AudioAttributesImplApi26Parcelizer, AudioAttributesImplBaseParcelizer, IconCompatParcelizer.read {
        protected final MediaBrowser AudioAttributesCompatParcelizer;
        private MediaSessionCompat.Token AudioAttributesImplApi21Parcelizer;
        protected int AudioAttributesImplBaseParcelizer;
        protected Messenger IconCompatParcelizer;
        private Bundle MediaBrowserCompatCustomActionResultReceiver;
        protected MediaMetadataCompat MediaBrowserCompatItemReceiver;
        final Context RemoteActionCompatParcelizer;
        protected final Bundle read;
        protected final write write = new write(this);
        private final setTitleOptional<String, MediaBrowserCompatMediaItem> AudioAttributesImplApi26Parcelizer = new setTitleOptional<>();

        @Override // android.support.v4.media.MediaBrowserCompat.IconCompatParcelizer.read
        public void AudioAttributesCompatParcelizer() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.AudioAttributesImplBaseParcelizer
        public void IconCompatParcelizer(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.AudioAttributesImplBaseParcelizer
        public void RemoteActionCompatParcelizer(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        MediaBrowserCompatItemReceiver(Context context, ComponentName componentName, IconCompatParcelizer iconCompatParcelizer, Bundle bundle) {
            this.RemoteActionCompatParcelizer = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.read = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            iconCompatParcelizer.AudioAttributesCompatParcelizer(this);
            this.AudioAttributesCompatParcelizer = new MediaBrowser(context, componentName, iconCompatParcelizer.read, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.AudioAttributesImplApi26Parcelizer
        public void RemoteActionCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.connect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.AudioAttributesImplApi26Parcelizer
        public void read() {
            Messenger messenger;
            MediaMetadataCompat mediaMetadataCompat = this.MediaBrowserCompatItemReceiver;
            if (mediaMetadataCompat != null && (messenger = this.IconCompatParcelizer) != null) {
                try {
                    mediaMetadataCompat.write(messenger);
                } catch (RemoteException unused) {
                }
            }
            this.AudioAttributesCompatParcelizer.disconnect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.AudioAttributesImplApi26Parcelizer
        public MediaSessionCompat.Token MediaBrowserCompatCustomActionResultReceiver() {
            if (this.AudioAttributesImplApi21Parcelizer == null) {
                this.AudioAttributesImplApi21Parcelizer = MediaSessionCompat.Token.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.getSessionToken());
            }
            return this.AudioAttributesImplApi21Parcelizer;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.IconCompatParcelizer.read
        public void write() {
            try {
                Bundle extras = this.AudioAttributesCompatParcelizer.getExtras();
                if (extras != null) {
                    this.AudioAttributesImplBaseParcelizer = extras.getInt("extra_service_version", 0);
                    IBinder iBinder = _checkFromStringCoercion.read(extras, "extra_messenger");
                    if (iBinder != null) {
                        this.MediaBrowserCompatItemReceiver = new MediaMetadataCompat(iBinder, this.read);
                        Messenger messenger = new Messenger(this.write);
                        this.IconCompatParcelizer = messenger;
                        this.write.RemoteActionCompatParcelizer(messenger);
                        try {
                            this.MediaBrowserCompatItemReceiver.read(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
                        } catch (RemoteException unused) {
                        }
                    }
                    kotlin.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizerRemoteActionCompatParcelizer = AudioAttributesImplBaseParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer(_checkFromStringCoercion.read(extras, "extra_session_binder"));
                    if (audioAttributesImplBaseParcelizerRemoteActionCompatParcelizer != null) {
                        this.AudioAttributesImplApi21Parcelizer = MediaSessionCompat.Token.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.getSessionToken(), audioAttributesImplBaseParcelizerRemoteActionCompatParcelizer);
                    }
                }
            } catch (IllegalStateException unused2) {
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.IconCompatParcelizer.read
        public void IconCompatParcelizer() {
            this.MediaBrowserCompatItemReceiver = null;
            this.IconCompatParcelizer = null;
            this.AudioAttributesImplApi21Parcelizer = null;
            this.write.RemoteActionCompatParcelizer(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.AudioAttributesImplBaseParcelizer
        public void read(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.IconCompatParcelizer == messenger) {
                MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = this.AudioAttributesImplApi26Parcelizer.get(str);
                if (mediaBrowserCompatMediaItem == null) {
                    boolean z = MediaBrowserCompat.IconCompatParcelizer;
                    return;
                }
                MediaDescriptionCompat mediaDescriptionCompatWrite = mediaBrowserCompatMediaItem.write(bundle);
                if (mediaDescriptionCompatWrite != null) {
                    if (bundle == null) {
                        if (list == null) {
                            mediaDescriptionCompatWrite.read(str);
                            return;
                        }
                        this.MediaBrowserCompatCustomActionResultReceiver = bundle2;
                        mediaDescriptionCompatWrite.AudioAttributesCompatParcelizer(str, list);
                        this.MediaBrowserCompatCustomActionResultReceiver = null;
                        return;
                    }
                    if (list == null) {
                        mediaDescriptionCompatWrite.AudioAttributesCompatParcelizer(str, bundle);
                        return;
                    }
                    this.MediaBrowserCompatCustomActionResultReceiver = bundle2;
                    mediaDescriptionCompatWrite.AudioAttributesCompatParcelizer(str, list, bundle);
                    this.MediaBrowserCompatCustomActionResultReceiver = null;
                }
            }
        }
    }

    static class MediaBrowserCompatCustomActionResultReceiver extends MediaBrowserCompatItemReceiver {
        MediaBrowserCompatCustomActionResultReceiver(Context context, ComponentName componentName, IconCompatParcelizer iconCompatParcelizer, Bundle bundle) {
            super(context, componentName, iconCompatParcelizer, bundle);
        }
    }

    static class AudioAttributesImplApi21Parcelizer extends MediaBrowserCompatCustomActionResultReceiver {
        AudioAttributesImplApi21Parcelizer(Context context, ComponentName componentName, IconCompatParcelizer iconCompatParcelizer, Bundle bundle) {
            super(context, componentName, iconCompatParcelizer, bundle);
        }
    }

    static class MediaBrowserCompatMediaItem {
        private final List<MediaDescriptionCompat> write = new ArrayList();
        private final List<Bundle> RemoteActionCompatParcelizer = new ArrayList();

        public List<Bundle> AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public List<MediaDescriptionCompat> read() {
            return this.write;
        }

        public MediaDescriptionCompat write(Bundle bundle) {
            for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
                if (JsonFormatVisitorWrapper.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.get(i), bundle)) {
                    return this.write.get(i);
                }
            }
            return null;
        }
    }

    static class write extends Handler {
        private final WeakReference<AudioAttributesImplBaseParcelizer> IconCompatParcelizer;
        private WeakReference<Messenger> RemoteActionCompatParcelizer;

        write(AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
            this.IconCompatParcelizer = new WeakReference<>(audioAttributesImplBaseParcelizer);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.RemoteActionCompatParcelizer;
            if (weakReference == null || weakReference.get() == null || this.IconCompatParcelizer.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.IconCompatParcelizer(data);
            AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = this.IconCompatParcelizer.get();
            Messenger messenger = this.RemoteActionCompatParcelizer.get();
            try {
                int i = message.what;
                if (i == 1) {
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.IconCompatParcelizer(bundle);
                    audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                } else {
                    if (i == 2) {
                        audioAttributesImplBaseParcelizer.IconCompatParcelizer(messenger);
                        return;
                    }
                    if (i == 3) {
                        Bundle bundle2 = data.getBundle("data_options");
                        MediaSessionCompat.IconCompatParcelizer(bundle2);
                        Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                        MediaSessionCompat.IconCompatParcelizer(bundle3);
                        audioAttributesImplBaseParcelizer.read(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                        return;
                    }
                    Objects.toString(message);
                    int i2 = message.arg1;
                }
            } catch (BadParcelableException unused) {
                if (message.what == 1) {
                    audioAttributesImplBaseParcelizer.IconCompatParcelizer(messenger);
                }
            }
        }

        void RemoteActionCompatParcelizer(Messenger messenger) {
            this.RemoteActionCompatParcelizer = new WeakReference<>(messenger);
        }
    }

    static class MediaMetadataCompat {
        private Bundle AudioAttributesCompatParcelizer;
        private Messenger RemoteActionCompatParcelizer;

        public MediaMetadataCompat(IBinder iBinder, Bundle bundle) {
            this.RemoteActionCompatParcelizer = new Messenger(iBinder);
            this.AudioAttributesCompatParcelizer = bundle;
        }

        void read(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.AudioAttributesCompatParcelizer);
            RemoteActionCompatParcelizer(6, bundle, messenger);
        }

        void write(Messenger messenger) throws RemoteException {
            RemoteActionCompatParcelizer(7, null, messenger);
        }

        private void RemoteActionCompatParcelizer(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 1;
            messageObtain.setData(bundle);
            messageObtain.replyTo = messenger;
            this.RemoteActionCompatParcelizer.send(messageObtain);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class ItemReceiver extends ResultReceiver {
        private final String AudioAttributesCompatParcelizer;
        private final read RemoteActionCompatParcelizer;

        @Override // android.support.v4.os.ResultReceiver
        public void AudioAttributesCompatParcelizer(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.AudioAttributesCompatParcelizer(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((MediaItem) parcelable);
            } else {
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class SearchResultReceiver extends ResultReceiver {
        private final Bundle AudioAttributesCompatParcelizer;
        private final String AudioAttributesImplApi21Parcelizer;
        private final MediaBrowserCompatSearchResultReceiver RemoteActionCompatParcelizer;

        @Override // android.support.v4.os.ResultReceiver
        public void AudioAttributesCompatParcelizer(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.AudioAttributesCompatParcelizer(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.RemoteActionCompatParcelizer.write(this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesCompatParcelizer);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            if (parcelableArray != null) {
                ArrayList arrayList = new ArrayList(parcelableArray.length);
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesCompatParcelizer, arrayList);
                return;
            }
            this.RemoteActionCompatParcelizer.write(this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesCompatParcelizer);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class CustomActionResultReceiver extends ResultReceiver {
        private final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
        private final Bundle AudioAttributesImplBaseParcelizer;
        private final String RemoteActionCompatParcelizer;

        @Override // android.support.v4.os.ResultReceiver
        public void AudioAttributesCompatParcelizer(int i, Bundle bundle) {
            if (this.AudioAttributesCompatParcelizer == null) {
                return;
            }
            MediaSessionCompat.IconCompatParcelizer(bundle);
            if (i == -1) {
                this.AudioAttributesCompatParcelizer.write(this.RemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer, bundle);
                return;
            }
            if (i == 0) {
                this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer, bundle);
            } else if (i == 1) {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer, bundle);
            } else {
                Objects.toString(this.AudioAttributesImplBaseParcelizer);
                Objects.toString(bundle);
            }
        }
    }

    static class AudioAttributesCompatParcelizer {
        static MediaDescription write(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        static int read(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }
}
