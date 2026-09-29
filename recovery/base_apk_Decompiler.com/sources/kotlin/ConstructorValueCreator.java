package kotlin;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ConstructorValueCreator {
    List<IntentFilter> RemoteActionCompatParcelizer;
    final Bundle read;

    ConstructorValueCreator(Bundle bundle, List<IntentFilter> list) {
        this.read = bundle;
        this.RemoteActionCompatParcelizer = list;
    }

    public final String MediaBrowserCompatSearchResultReceiver() {
        return this.read.getString("id");
    }

    public final List<String> AudioAttributesImplApi21Parcelizer() {
        return this.read.getStringArrayList("groupMemberIds");
    }

    public final String MediaBrowserCompatMediaItem() {
        return this.read.getString("name");
    }

    public final String MediaBrowserCompatItemReceiver() {
        return this.read.getString("status");
    }

    public final Uri AudioAttributesImplApi26Parcelizer() {
        String string = this.read.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final boolean onMediaButtonEvent() {
        return this.read.getBoolean("enabled", true);
    }

    @Deprecated
    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.read.getBoolean("connecting", false);
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.read.getInt("connectionState", 0);
    }

    public final boolean IconCompatParcelizer() {
        return this.read.getBoolean("canDisconnect", false);
    }

    public final IntentSender onAddQueueItem() {
        return (IntentSender) this.read.getParcelable("settingsIntent");
    }

    public final List<IntentFilter> read() {
        RemoteActionCompatParcelizer();
        return this.RemoteActionCompatParcelizer;
    }

    final void RemoteActionCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer == null) {
            ArrayList parcelableArrayList = this.read.getParcelableArrayList("controlFilters");
            this.RemoteActionCompatParcelizer = parcelableArrayList;
            if (parcelableArrayList == null) {
                this.RemoteActionCompatParcelizer = Collections.emptyList();
            }
        }
    }

    public final int MediaDescriptionCompat() {
        return this.read.getInt("playbackType", 1);
    }

    public final int RatingCompat() {
        return this.read.getInt("playbackStream", -1);
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.read.getInt("deviceType");
    }

    public final int handleMediaPlayPauseIfPendingOnHandler() {
        return this.read.getInt("volume");
    }

    public final int onCustomAction() {
        return this.read.getInt("volumeMax");
    }

    public final int onCommand() {
        return this.read.getInt("volumeHandling", 0);
    }

    public final int MediaMetadataCompat() {
        return this.read.getInt("presentationDisplayId", -1);
    }

    public final Bundle MediaBrowserCompatCustomActionResultReceiver() {
        return this.read.getBundle("extras");
    }

    private int onPlay() {
        return this.read.getInt("minClientVersion", 1);
    }

    private int onPlayFromMediaId() {
        return this.read.getInt("maxClientVersion", Integer.MAX_VALUE);
    }

    public final boolean onFastForward() {
        RemoteActionCompatParcelizer();
        return (TextUtils.isEmpty(MediaBrowserCompatSearchResultReceiver()) || TextUtils.isEmpty(MediaBrowserCompatMediaItem()) || this.RemoteActionCompatParcelizer.contains(null)) ? false : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouteDescriptor{ id=");
        sb.append(MediaBrowserCompatSearchResultReceiver());
        sb.append(", groupMemberIds=");
        sb.append(AudioAttributesImplApi21Parcelizer());
        sb.append(", name=");
        sb.append(MediaBrowserCompatMediaItem());
        sb.append(", description=");
        sb.append(MediaBrowserCompatItemReceiver());
        sb.append(", iconUri=");
        sb.append(AudioAttributesImplApi26Parcelizer());
        sb.append(", isEnabled=");
        sb.append(onMediaButtonEvent());
        sb.append(", isConnecting=");
        sb.append(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        sb.append(", connectionState=");
        sb.append(AudioAttributesCompatParcelizer());
        sb.append(", controlFilters=");
        sb.append(Arrays.toString(read().toArray()));
        sb.append(", playbackType=");
        sb.append(MediaDescriptionCompat());
        sb.append(", playbackStream=");
        sb.append(RatingCompat());
        sb.append(", deviceType=");
        sb.append(AudioAttributesImplBaseParcelizer());
        sb.append(", volume=");
        sb.append(handleMediaPlayPauseIfPendingOnHandler());
        sb.append(", volumeMax=");
        sb.append(onCustomAction());
        sb.append(", volumeHandling=");
        sb.append(onCommand());
        sb.append(", presentationDisplayId=");
        sb.append(MediaMetadataCompat());
        sb.append(", extras=");
        sb.append(MediaBrowserCompatCustomActionResultReceiver());
        sb.append(", isValid=");
        sb.append(onFastForward());
        sb.append(", minClientVersion=");
        sb.append(onPlay());
        sb.append(", maxClientVersion=");
        sb.append(onPlayFromMediaId());
        sb.append(" }");
        return sb.toString();
    }

    public final Bundle write() {
        return this.read;
    }

    public static ConstructorValueCreator IconCompatParcelizer(Bundle bundle) {
        if (bundle != null) {
            return new ConstructorValueCreator(bundle, null);
        }
        return null;
    }

    public static final class RemoteActionCompatParcelizer {
        private final Bundle AudioAttributesCompatParcelizer;
        private ArrayList<String> read;
        private ArrayList<IntentFilter> write;

        public RemoteActionCompatParcelizer(String str, String str2) {
            this.AudioAttributesCompatParcelizer = new Bundle();
            read(str);
            write(str2);
        }

        public RemoteActionCompatParcelizer(ConstructorValueCreator constructorValueCreator) {
            if (constructorValueCreator == null) {
                throw new IllegalArgumentException("descriptor must not be null");
            }
            this.AudioAttributesCompatParcelizer = new Bundle(constructorValueCreator.read);
            constructorValueCreator.RemoteActionCompatParcelizer();
            if (constructorValueCreator.RemoteActionCompatParcelizer.isEmpty()) {
                return;
            }
            this.write = new ArrayList<>(constructorValueCreator.RemoteActionCompatParcelizer);
        }

        private RemoteActionCompatParcelizer read(String str) {
            this.AudioAttributesCompatParcelizer.putString("id", str);
            return this;
        }

        private RemoteActionCompatParcelizer write(String str) {
            this.AudioAttributesCompatParcelizer.putString("name", str);
            return this;
        }

        public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(String str) {
            this.AudioAttributesCompatParcelizer.putString("status", str);
            return this;
        }

        public final RemoteActionCompatParcelizer write() {
            this.AudioAttributesCompatParcelizer.putBoolean("enabled", false);
            return this;
        }

        @Deprecated
        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.putBoolean("connecting", true);
            return this;
        }

        private RemoteActionCompatParcelizer write(IntentFilter intentFilter) {
            if (intentFilter == null) {
                throw new IllegalArgumentException("filter must not be null");
            }
            if (this.write == null) {
                this.write = new ArrayList<>();
            }
            if (!this.write.contains(intentFilter)) {
                this.write.add(intentFilter);
            }
            return this;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(Collection<IntentFilter> collection) {
            if (collection == null) {
                throw new IllegalArgumentException("filters must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator<IntentFilter> it = collection.iterator();
                while (it.hasNext()) {
                    write(it.next());
                }
            }
            return this;
        }

        public final RemoteActionCompatParcelizer read(int i) {
            this.AudioAttributesCompatParcelizer.putInt("playbackType", i);
            return this;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(int i) {
            this.AudioAttributesCompatParcelizer.putInt("playbackStream", i);
            return this;
        }

        public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(int i) {
            this.AudioAttributesCompatParcelizer.putInt("deviceType", i);
            return this;
        }

        public final RemoteActionCompatParcelizer write(int i) {
            this.AudioAttributesCompatParcelizer.putInt("volume", i);
            return this;
        }

        public final RemoteActionCompatParcelizer MediaBrowserCompatItemReceiver(int i) {
            this.AudioAttributesCompatParcelizer.putInt("volumeMax", i);
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer(int i) {
            this.AudioAttributesCompatParcelizer.putInt("volumeHandling", i);
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(int i) {
            this.AudioAttributesCompatParcelizer.putInt("presentationDisplayId", i);
            return this;
        }

        public final ConstructorValueCreator IconCompatParcelizer() {
            ArrayList<IntentFilter> arrayList = this.write;
            if (arrayList != null) {
                this.AudioAttributesCompatParcelizer.putParcelableArrayList("controlFilters", arrayList);
            }
            return new ConstructorValueCreator(this.AudioAttributesCompatParcelizer, this.write);
        }
    }
}
