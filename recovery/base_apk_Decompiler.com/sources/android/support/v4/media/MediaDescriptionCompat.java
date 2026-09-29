package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() { // from class: android.support.v4.media.MediaDescriptionCompat.5
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.AudioAttributesCompatParcelizer(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    };
    private MediaDescription AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final Uri AudioAttributesImplBaseParcelizer;
    private final Uri IconCompatParcelizer;
    private final CharSequence MediaBrowserCompatCustomActionResultReceiver;
    private final CharSequence MediaBrowserCompatItemReceiver;
    private final Bundle RemoteActionCompatParcelizer;
    private final Bitmap read;
    private final CharSequence write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.AudioAttributesImplApi21Parcelizer = str;
        this.MediaBrowserCompatItemReceiver = charSequence;
        this.MediaBrowserCompatCustomActionResultReceiver = charSequence2;
        this.write = charSequence3;
        this.read = bitmap;
        this.IconCompatParcelizer = uri;
        this.RemoteActionCompatParcelizer = bundle;
        this.AudioAttributesImplBaseParcelizer = uri2;
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final CharSequence MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final CharSequence MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final CharSequence read() {
        return this.write;
    }

    public final Bitmap write() {
        return this.read;
    }

    public final Uri RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final Bundle AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final Uri AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ((MediaDescription) IconCompatParcelizer()).writeToParcel(parcel, i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.MediaBrowserCompatItemReceiver);
        sb.append(", ");
        sb.append((Object) this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", ");
        sb.append((Object) this.write);
        return sb.toString();
    }

    public final Object IconCompatParcelizer() {
        MediaDescription mediaDescription = this.AudioAttributesCompatParcelizer;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builderWrite = IconCompatParcelizer.write();
        IconCompatParcelizer.write(builderWrite, this.AudioAttributesImplApi21Parcelizer);
        IconCompatParcelizer.RemoteActionCompatParcelizer(builderWrite, this.MediaBrowserCompatItemReceiver);
        IconCompatParcelizer.read(builderWrite, this.MediaBrowserCompatCustomActionResultReceiver);
        IconCompatParcelizer.IconCompatParcelizer(builderWrite, this.write);
        IconCompatParcelizer.read(builderWrite, this.read);
        IconCompatParcelizer.RemoteActionCompatParcelizer(builderWrite, this.IconCompatParcelizer);
        IconCompatParcelizer.IconCompatParcelizer(builderWrite, this.RemoteActionCompatParcelizer);
        read.IconCompatParcelizer(builderWrite, this.AudioAttributesImplBaseParcelizer);
        MediaDescription mediaDescriptionAudioAttributesCompatParcelizer = IconCompatParcelizer.AudioAttributesCompatParcelizer(builderWrite);
        this.AudioAttributesCompatParcelizer = mediaDescriptionAudioAttributesCompatParcelizer;
        return mediaDescriptionAudioAttributesCompatParcelizer;
    }

    public static MediaDescriptionCompat AudioAttributesCompatParcelizer(Object obj) {
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        MediaDescription mediaDescription = (MediaDescription) obj;
        remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(IconCompatParcelizer.RemoteActionCompatParcelizer(mediaDescription));
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer(IconCompatParcelizer.AudioAttributesImplBaseParcelizer(mediaDescription));
        remoteActionCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.AudioAttributesImplApi26Parcelizer(mediaDescription));
        remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(IconCompatParcelizer.IconCompatParcelizer(mediaDescription));
        remoteActionCompatParcelizer.read(IconCompatParcelizer.read(mediaDescription));
        remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(IconCompatParcelizer.write(mediaDescription));
        Bundle bundleAudioAttributesCompatParcelizer = IconCompatParcelizer.AudioAttributesCompatParcelizer(mediaDescription);
        if (bundleAudioAttributesCompatParcelizer != null) {
            bundleAudioAttributesCompatParcelizer = MediaSessionCompat.AudioAttributesCompatParcelizer(bundleAudioAttributesCompatParcelizer);
        }
        Uri uri = bundleAudioAttributesCompatParcelizer != null ? (Uri) bundleAudioAttributesCompatParcelizer.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri == null) {
            bundle = bundleAudioAttributesCompatParcelizer;
        } else if (!bundleAudioAttributesCompatParcelizer.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleAudioAttributesCompatParcelizer.size() != 2) {
            bundleAudioAttributesCompatParcelizer.remove("android.support.v4.media.description.MEDIA_URI");
            bundleAudioAttributesCompatParcelizer.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleAudioAttributesCompatParcelizer;
        }
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer(bundle);
        if (uri != null) {
            remoteActionCompatParcelizer.write(uri);
        } else {
            remoteActionCompatParcelizer.write(read.AudioAttributesCompatParcelizer(mediaDescription));
        }
        MediaDescriptionCompat mediaDescriptionCompat = remoteActionCompatParcelizer.read();
        mediaDescriptionCompat.AudioAttributesCompatParcelizer = mediaDescription;
        return mediaDescriptionCompat;
    }

    public static final class RemoteActionCompatParcelizer {
        private Bundle AudioAttributesCompatParcelizer;
        private CharSequence AudioAttributesImplApi21Parcelizer;
        private Uri AudioAttributesImplApi26Parcelizer;
        private CharSequence AudioAttributesImplBaseParcelizer;
        private CharSequence IconCompatParcelizer;
        private String RemoteActionCompatParcelizer;
        private Bitmap read;
        private Uri write;

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(String str) {
            this.RemoteActionCompatParcelizer = str;
            return this;
        }

        public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(CharSequence charSequence) {
            this.AudioAttributesImplBaseParcelizer = charSequence;
            return this;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(CharSequence charSequence) {
            this.AudioAttributesImplApi21Parcelizer = charSequence;
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(CharSequence charSequence) {
            this.IconCompatParcelizer = charSequence;
            return this;
        }

        public final RemoteActionCompatParcelizer read(Bitmap bitmap) {
            this.read = bitmap;
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(Uri uri) {
            this.write = uri;
            return this;
        }

        public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(Bundle bundle) {
            this.AudioAttributesCompatParcelizer = bundle;
            return this;
        }

        public final RemoteActionCompatParcelizer write(Uri uri) {
            this.AudioAttributesImplApi26Parcelizer = uri;
            return this;
        }

        public final MediaDescriptionCompat read() {
            return new MediaDescriptionCompat(this.RemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi21Parcelizer, this.IconCompatParcelizer, this.read, this.write, this.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi26Parcelizer);
        }
    }

    static class IconCompatParcelizer {
        static MediaDescription.Builder write() {
            return new MediaDescription.Builder();
        }

        static void write(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        static void RemoteActionCompatParcelizer(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }

        static void read(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void IconCompatParcelizer(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void read(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        static void RemoteActionCompatParcelizer(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        static void IconCompatParcelizer(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static MediaDescription AudioAttributesCompatParcelizer(MediaDescription.Builder builder) {
            return builder.build();
        }

        static String RemoteActionCompatParcelizer(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        static CharSequence AudioAttributesImplBaseParcelizer(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        static CharSequence AudioAttributesImplApi26Parcelizer(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        static CharSequence IconCompatParcelizer(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        static Bitmap read(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        static Uri write(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        static Bundle AudioAttributesCompatParcelizer(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }
    }

    static class read {
        static void IconCompatParcelizer(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }

        static Uri AudioAttributesCompatParcelizer(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }
    }
}
