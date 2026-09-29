package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator<PlaybackStateCompat>() { // from class: android.support.v4.media.session.PlaybackStateCompat.5
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    };
    final long AudioAttributesCompatParcelizer;
    final long AudioAttributesImplApi21Parcelizer;
    final int AudioAttributesImplApi26Parcelizer;
    final float AudioAttributesImplBaseParcelizer;
    final long IconCompatParcelizer;
    final CharSequence MediaBrowserCompatCustomActionResultReceiver;
    final Bundle MediaBrowserCompatItemReceiver;
    private PlaybackState MediaDescriptionCompat;
    final long RatingCompat;
    List<CustomAction> RemoteActionCompatParcelizer;
    final int read;
    final long write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.AudioAttributesImplApi26Parcelizer = i;
        this.AudioAttributesImplApi21Parcelizer = j;
        this.IconCompatParcelizer = j2;
        this.AudioAttributesImplBaseParcelizer = f;
        this.AudioAttributesCompatParcelizer = j3;
        this.read = i2;
        this.MediaBrowserCompatCustomActionResultReceiver = charSequence;
        this.RatingCompat = j4;
        this.RemoteActionCompatParcelizer = new ArrayList(list);
        this.write = j5;
        this.MediaBrowserCompatItemReceiver = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.AudioAttributesImplApi26Parcelizer = parcel.readInt();
        this.AudioAttributesImplApi21Parcelizer = parcel.readLong();
        this.AudioAttributesImplBaseParcelizer = parcel.readFloat();
        this.RatingCompat = parcel.readLong();
        this.IconCompatParcelizer = parcel.readLong();
        this.AudioAttributesCompatParcelizer = parcel.readLong();
        this.MediaBrowserCompatCustomActionResultReceiver = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.RemoteActionCompatParcelizer = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.write = parcel.readLong();
        this.MediaBrowserCompatItemReceiver = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.read = parcel.readInt();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", position=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", buffered position=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", speed=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", updated=");
        sb.append(this.RatingCompat);
        sb.append(", actions=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", error code=");
        sb.append(this.read);
        sb.append(", error message=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", custom actions=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", active item id=");
        sb.append(this.write);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.AudioAttributesImplApi26Parcelizer);
        parcel.writeLong(this.AudioAttributesImplApi21Parcelizer);
        parcel.writeFloat(this.AudioAttributesImplBaseParcelizer);
        parcel.writeLong(this.RatingCompat);
        parcel.writeLong(this.IconCompatParcelizer);
        parcel.writeLong(this.AudioAttributesCompatParcelizer);
        TextUtils.writeToParcel(this.MediaBrowserCompatCustomActionResultReceiver, parcel, i);
        parcel.writeTypedList(this.RemoteActionCompatParcelizer);
        parcel.writeLong(this.write);
        parcel.writeBundle(this.MediaBrowserCompatItemReceiver);
        parcel.writeInt(this.read);
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final long MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final long AudioAttributesCompatParcelizer() {
        return this.RatingCompat;
    }

    public final float RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final long IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final long write() {
        return this.write;
    }

    public static PlaybackStateCompat write(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> list = write.read(playbackState);
        if (list != null) {
            arrayList = new ArrayList(list.size());
            Iterator<PlaybackState.CustomAction> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(CustomAction.write(it.next()));
            }
        }
        ArrayList arrayList2 = arrayList;
        Bundle bundle = IconCompatParcelizer.read(playbackState);
        MediaSessionCompat.IconCompatParcelizer(bundle);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(write.AudioAttributesImplApi26Parcelizer(playbackState), write.AudioAttributesImplBaseParcelizer(playbackState), write.write(playbackState), write.MediaBrowserCompatCustomActionResultReceiver(playbackState), write.IconCompatParcelizer(playbackState), 0, write.AudioAttributesCompatParcelizer(playbackState), write.MediaBrowserCompatItemReceiver(playbackState), arrayList2, write.RemoteActionCompatParcelizer(playbackState), bundle);
        playbackStateCompat.MediaDescriptionCompat = playbackState;
        return playbackStateCompat;
    }

    public final Object read() {
        if (this.MediaDescriptionCompat == null) {
            PlaybackState.Builder builderAudioAttributesCompatParcelizer = write.AudioAttributesCompatParcelizer();
            write.write(builderAudioAttributesCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplBaseParcelizer, this.RatingCompat);
            write.write(builderAudioAttributesCompatParcelizer, this.IconCompatParcelizer);
            write.read(builderAudioAttributesCompatParcelizer, this.AudioAttributesCompatParcelizer);
            write.RemoteActionCompatParcelizer(builderAudioAttributesCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver);
            Iterator<CustomAction> it = this.RemoteActionCompatParcelizer.iterator();
            while (it.hasNext()) {
                write.AudioAttributesCompatParcelizer(builderAudioAttributesCompatParcelizer, (PlaybackState.CustomAction) it.next().RemoteActionCompatParcelizer());
            }
            write.RemoteActionCompatParcelizer(builderAudioAttributesCompatParcelizer, this.write);
            IconCompatParcelizer.write(builderAudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver);
            this.MediaDescriptionCompat = write.IconCompatParcelizer(builderAudioAttributesCompatParcelizer);
        }
        return this.MediaDescriptionCompat;
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator<CustomAction>() { // from class: android.support.v4.media.session.PlaybackStateCompat.CustomAction.5
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        };
        private final String AudioAttributesCompatParcelizer;
        private final int IconCompatParcelizer;
        private PlaybackState.CustomAction RemoteActionCompatParcelizer;
        private final Bundle read;
        private final CharSequence write;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.AudioAttributesCompatParcelizer = str;
            this.write = charSequence;
            this.IconCompatParcelizer = i;
            this.read = bundle;
        }

        CustomAction(Parcel parcel) {
            this.AudioAttributesCompatParcelizer = parcel.readString();
            this.write = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.IconCompatParcelizer = parcel.readInt();
            this.read = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.AudioAttributesCompatParcelizer);
            TextUtils.writeToParcel(this.write, parcel, i);
            parcel.writeInt(this.IconCompatParcelizer);
            parcel.writeBundle(this.read);
        }

        public static CustomAction write(Object obj) {
            if (obj == null) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle bundleWrite = write.write(customAction);
            MediaSessionCompat.IconCompatParcelizer(bundleWrite);
            CustomAction customAction2 = new CustomAction(write.RemoteActionCompatParcelizer(customAction), write.AudioAttributesCompatParcelizer(customAction), write.read(customAction), bundleWrite);
            customAction2.RemoteActionCompatParcelizer = customAction;
            return customAction2;
        }

        public final Object RemoteActionCompatParcelizer() {
            PlaybackState.CustomAction customAction = this.RemoteActionCompatParcelizer;
            if (customAction != null) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder builder = write.read(this.AudioAttributesCompatParcelizer, this.write, this.IconCompatParcelizer);
            write.RemoteActionCompatParcelizer(builder, this.read);
            return write.read(builder);
        }

        public final String IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Action:mName='");
            sb.append((Object) this.write);
            sb.append(", mIcon=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", mExtras=");
            sb.append(this.read);
            return sb.toString();
        }

        /* JADX INFO: loaded from: classes4.dex */
        public static final class write {
            private final int AudioAttributesCompatParcelizer;
            private Bundle RemoteActionCompatParcelizer;
            private final String read;
            private final CharSequence write;

            public write(String str, CharSequence charSequence, int i) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(charSequence)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                this.read = str;
                this.write = charSequence;
                this.AudioAttributesCompatParcelizer = i;
            }

            public final CustomAction IconCompatParcelizer() {
                return new CustomAction(this.read, this.write, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer);
            }
        }
    }

    public static final class read {
        private long AudioAttributesCompatParcelizer;
        private Bundle AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private float AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private CharSequence MediaBrowserCompatCustomActionResultReceiver;
        private long MediaBrowserCompatItemReceiver;
        private long MediaBrowserCompatMediaItem;
        private final List<CustomAction> RemoteActionCompatParcelizer;
        private long read;
        private long write;

        public read() {
            this.RemoteActionCompatParcelizer = new ArrayList();
            this.write = -1L;
        }

        public read(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.RemoteActionCompatParcelizer = arrayList;
            this.write = -1L;
            this.AudioAttributesImplApi26Parcelizer = playbackStateCompat.AudioAttributesImplApi26Parcelizer;
            this.MediaBrowserCompatItemReceiver = playbackStateCompat.AudioAttributesImplApi21Parcelizer;
            this.AudioAttributesImplBaseParcelizer = playbackStateCompat.AudioAttributesImplBaseParcelizer;
            this.MediaBrowserCompatMediaItem = playbackStateCompat.RatingCompat;
            this.read = playbackStateCompat.IconCompatParcelizer;
            this.AudioAttributesCompatParcelizer = playbackStateCompat.AudioAttributesCompatParcelizer;
            this.IconCompatParcelizer = playbackStateCompat.read;
            this.MediaBrowserCompatCustomActionResultReceiver = playbackStateCompat.MediaBrowserCompatCustomActionResultReceiver;
            if (playbackStateCompat.RemoteActionCompatParcelizer != null) {
                arrayList.addAll(playbackStateCompat.RemoteActionCompatParcelizer);
            }
            this.write = playbackStateCompat.write;
            this.AudioAttributesImplApi21Parcelizer = playbackStateCompat.MediaBrowserCompatItemReceiver;
        }

        public final read write(int i, long j, float f, long j2) {
            this.AudioAttributesImplApi26Parcelizer = i;
            this.MediaBrowserCompatItemReceiver = j;
            this.MediaBrowserCompatMediaItem = j2;
            this.AudioAttributesImplBaseParcelizer = f;
            return this;
        }

        public final read RemoteActionCompatParcelizer(long j) {
            this.read = j;
            return this;
        }

        public final read write(long j) {
            this.AudioAttributesCompatParcelizer = j;
            return this;
        }

        public final read write(CustomAction customAction) {
            if (customAction == null) {
                throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
            }
            this.RemoteActionCompatParcelizer.add(customAction);
            return this;
        }

        public final read AudioAttributesCompatParcelizer(long j) {
            this.write = j;
            return this;
        }

        public final read IconCompatParcelizer(int i, CharSequence charSequence) {
            this.IconCompatParcelizer = i;
            this.MediaBrowserCompatCustomActionResultReceiver = charSequence;
            return this;
        }

        public final read RemoteActionCompatParcelizer(Bundle bundle) {
            this.AudioAttributesImplApi21Parcelizer = bundle;
            return this;
        }

        public final PlaybackStateCompat IconCompatParcelizer() {
            return new PlaybackStateCompat(this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatItemReceiver, this.read, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer, this.write, this.AudioAttributesImplApi21Parcelizer);
        }
    }

    static class write {
        static PlaybackState.Builder AudioAttributesCompatParcelizer() {
            return new PlaybackState.Builder();
        }

        static void write(PlaybackState.Builder builder, int i, long j, float f, long j2) {
            builder.setState(i, j, f, j2);
        }

        static void write(PlaybackState.Builder builder, long j) {
            builder.setBufferedPosition(j);
        }

        static void read(PlaybackState.Builder builder, long j) {
            builder.setActions(j);
        }

        static void RemoteActionCompatParcelizer(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        static void AudioAttributesCompatParcelizer(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        static void RemoteActionCompatParcelizer(PlaybackState.Builder builder, long j) {
            builder.setActiveQueueItemId(j);
        }

        static List<PlaybackState.CustomAction> read(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        static PlaybackState IconCompatParcelizer(PlaybackState.Builder builder) {
            return builder.build();
        }

        static int AudioAttributesImplApi26Parcelizer(PlaybackState playbackState) {
            return playbackState.getState();
        }

        static long AudioAttributesImplBaseParcelizer(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        static long write(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        static float MediaBrowserCompatCustomActionResultReceiver(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        static long IconCompatParcelizer(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        static CharSequence AudioAttributesCompatParcelizer(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        static long MediaBrowserCompatItemReceiver(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        static long RemoteActionCompatParcelizer(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        static PlaybackState.CustomAction.Builder read(String str, CharSequence charSequence, int i) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i);
        }

        static void RemoteActionCompatParcelizer(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static PlaybackState.CustomAction read(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        static Bundle write(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        static String RemoteActionCompatParcelizer(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        static CharSequence AudioAttributesCompatParcelizer(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        static int read(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }
    }

    static class IconCompatParcelizer {
        static void write(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static Bundle read(PlaybackState playbackState) {
            return playbackState.getExtras();
        }
    }
}
