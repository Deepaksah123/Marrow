package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.Set;
import kotlin.setTitleOptional;

/* JADX INFO: loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    static final setTitleOptional<String, Integer> AudioAttributesCompatParcelizer;
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    private static final String[] IconCompatParcelizer;
    private static final String[] RemoteActionCompatParcelizer;
    private static final String[] read;
    private MediaMetadata AudioAttributesImplApi21Parcelizer;
    private MediaDescriptionCompat MediaBrowserCompatCustomActionResultReceiver;
    final Bundle write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        setTitleOptional<String, Integer> settitleoptional = new setTitleOptional<>();
        AudioAttributesCompatParcelizer = settitleoptional;
        settitleoptional.put("android.media.metadata.TITLE", 1);
        settitleoptional.put("android.media.metadata.ARTIST", 1);
        settitleoptional.put("android.media.metadata.DURATION", 0);
        settitleoptional.put("android.media.metadata.ALBUM", 1);
        settitleoptional.put("android.media.metadata.AUTHOR", 1);
        settitleoptional.put("android.media.metadata.WRITER", 1);
        settitleoptional.put("android.media.metadata.COMPOSER", 1);
        settitleoptional.put("android.media.metadata.COMPILATION", 1);
        settitleoptional.put("android.media.metadata.DATE", 1);
        settitleoptional.put("android.media.metadata.YEAR", 0);
        settitleoptional.put("android.media.metadata.GENRE", 1);
        settitleoptional.put("android.media.metadata.TRACK_NUMBER", 0);
        settitleoptional.put("android.media.metadata.NUM_TRACKS", 0);
        settitleoptional.put("android.media.metadata.DISC_NUMBER", 0);
        settitleoptional.put("android.media.metadata.ALBUM_ARTIST", 1);
        settitleoptional.put("android.media.metadata.ART", 2);
        settitleoptional.put("android.media.metadata.ART_URI", 1);
        settitleoptional.put("android.media.metadata.ALBUM_ART", 2);
        settitleoptional.put("android.media.metadata.ALBUM_ART_URI", 1);
        settitleoptional.put("android.media.metadata.USER_RATING", 3);
        settitleoptional.put("android.media.metadata.RATING", 3);
        settitleoptional.put("android.media.metadata.DISPLAY_TITLE", 1);
        settitleoptional.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        settitleoptional.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        settitleoptional.put("android.media.metadata.DISPLAY_ICON", 2);
        settitleoptional.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        settitleoptional.put("android.media.metadata.MEDIA_ID", 1);
        settitleoptional.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        settitleoptional.put("android.media.metadata.MEDIA_URI", 1);
        settitleoptional.put("android.media.metadata.ADVERTISEMENT", 0);
        settitleoptional.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        IconCompatParcelizer = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        RemoteActionCompatParcelizer = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        read = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new Parcelable.Creator<MediaMetadataCompat>() { // from class: android.support.v4.media.MediaMetadataCompat.4
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public MediaMetadataCompat createFromParcel(Parcel parcel) {
                return new MediaMetadataCompat(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public MediaMetadataCompat[] newArray(int i) {
                return new MediaMetadataCompat[i];
            }
        };
    }

    MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.write = bundle2;
        MediaSessionCompat.IconCompatParcelizer(bundle2);
    }

    MediaMetadataCompat(Parcel parcel) {
        this.write = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public final boolean RemoteActionCompatParcelizer(String str) {
        return this.write.containsKey(str);
    }

    public final CharSequence write(String str) {
        return this.write.getCharSequence(str);
    }

    public final String read(String str) {
        CharSequence charSequence = this.write.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final long AudioAttributesCompatParcelizer(String str) {
        return this.write.getLong(str, 0L);
    }

    public final Bitmap IconCompatParcelizer(String str) {
        try {
            return (Bitmap) this.write.getParcelable(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final MediaDescriptionCompat write() {
        Bitmap bitmapIconCompatParcelizer;
        Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.MediaBrowserCompatCustomActionResultReceiver;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String str = read("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence charSequenceWrite = write("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(charSequenceWrite)) {
            int i = 0;
            int i2 = 0;
            while (i < 3) {
                String[] strArr = IconCompatParcelizer;
                if (i2 >= strArr.length) {
                    break;
                }
                CharSequence charSequenceWrite2 = write(strArr[i2]);
                if (!TextUtils.isEmpty(charSequenceWrite2)) {
                    charSequenceArr[i] = charSequenceWrite2;
                    i++;
                }
                i2++;
            }
        } else {
            charSequenceArr[0] = charSequenceWrite;
            charSequenceArr[1] = write("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = write("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i3 = 0;
        while (true) {
            String[] strArr2 = RemoteActionCompatParcelizer;
            if (i3 >= strArr2.length) {
                bitmapIconCompatParcelizer = null;
                break;
            }
            bitmapIconCompatParcelizer = IconCompatParcelizer(strArr2[i3]);
            if (bitmapIconCompatParcelizer != null) {
                break;
            }
            i3++;
        }
        int i4 = 0;
        while (true) {
            String[] strArr3 = read;
            if (i4 >= strArr3.length) {
                uri = null;
                break;
            }
            String str2 = read(strArr3[i4]);
            if (!TextUtils.isEmpty(str2)) {
                uri = Uri.parse(str2);
                break;
            }
            i4++;
        }
        String str3 = read("android.media.metadata.MEDIA_URI");
        Uri uri2 = TextUtils.isEmpty(str3) ? null : Uri.parse(str3);
        MediaDescriptionCompat.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new MediaDescriptionCompat.RemoteActionCompatParcelizer();
        remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(str);
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer(charSequenceArr[0]);
        remoteActionCompatParcelizer.IconCompatParcelizer(charSequenceArr[1]);
        remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(charSequenceArr[2]);
        remoteActionCompatParcelizer.read(bitmapIconCompatParcelizer);
        remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(uri);
        remoteActionCompatParcelizer.write(uri2);
        Bundle bundle = new Bundle();
        if (this.write.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", AudioAttributesCompatParcelizer("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (this.write.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", AudioAttributesCompatParcelizer("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (!bundle.isEmpty()) {
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer(bundle);
        }
        MediaDescriptionCompat mediaDescriptionCompat2 = remoteActionCompatParcelizer.read();
        this.MediaBrowserCompatCustomActionResultReceiver = mediaDescriptionCompat2;
        return mediaDescriptionCompat2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.write);
    }

    public final int read() {
        return this.write.size();
    }

    public final Set<String> AudioAttributesCompatParcelizer() {
        return this.write.keySet();
    }

    public final Bundle RemoteActionCompatParcelizer() {
        return new Bundle(this.write);
    }

    public static MediaMetadataCompat read(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        mediaMetadataCompatCreateFromParcel.AudioAttributesImplApi21Parcelizer = mediaMetadata;
        return mediaMetadataCompatCreateFromParcel;
    }

    public final Object IconCompatParcelizer() {
        if (this.AudioAttributesImplApi21Parcelizer == null) {
            Parcel parcelObtain = Parcel.obtain();
            writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            this.AudioAttributesImplApi21Parcelizer = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public static final class read {
        private final Bundle read = new Bundle();

        public final read AudioAttributesCompatParcelizer(String str, CharSequence charSequence) {
            if (MediaMetadataCompat.AudioAttributesCompatParcelizer.containsKey(str) && MediaMetadataCompat.AudioAttributesCompatParcelizer.get(str).intValue() != 1) {
                StringBuilder sb = new StringBuilder("The ");
                sb.append(str);
                sb.append(" key cannot be used to put a CharSequence");
                throw new IllegalArgumentException(sb.toString());
            }
            this.read.putCharSequence(str, charSequence);
            return this;
        }

        public final read RemoteActionCompatParcelizer(String str, String str2) {
            if (MediaMetadataCompat.AudioAttributesCompatParcelizer.containsKey(str) && MediaMetadataCompat.AudioAttributesCompatParcelizer.get(str).intValue() != 1) {
                StringBuilder sb = new StringBuilder("The ");
                sb.append(str);
                sb.append(" key cannot be used to put a String");
                throw new IllegalArgumentException(sb.toString());
            }
            this.read.putCharSequence(str, str2);
            return this;
        }

        public final read RemoteActionCompatParcelizer(String str, long j) {
            if (MediaMetadataCompat.AudioAttributesCompatParcelizer.containsKey(str) && MediaMetadataCompat.AudioAttributesCompatParcelizer.get(str).intValue() != 0) {
                StringBuilder sb = new StringBuilder("The ");
                sb.append(str);
                sb.append(" key cannot be used to put a long");
                throw new IllegalArgumentException(sb.toString());
            }
            this.read.putLong(str, j);
            return this;
        }

        public final read AudioAttributesCompatParcelizer(String str, RatingCompat ratingCompat) {
            if (MediaMetadataCompat.AudioAttributesCompatParcelizer.containsKey(str) && MediaMetadataCompat.AudioAttributesCompatParcelizer.get(str).intValue() != 3) {
                StringBuilder sb = new StringBuilder("The ");
                sb.append(str);
                sb.append(" key cannot be used to put a Rating");
                throw new IllegalArgumentException(sb.toString());
            }
            this.read.putParcelable(str, (Parcelable) ratingCompat.read());
            return this;
        }

        public final read AudioAttributesCompatParcelizer(String str, Bitmap bitmap) {
            if (MediaMetadataCompat.AudioAttributesCompatParcelizer.containsKey(str) && MediaMetadataCompat.AudioAttributesCompatParcelizer.get(str).intValue() != 2) {
                StringBuilder sb = new StringBuilder("The ");
                sb.append(str);
                sb.append(" key cannot be used to put a Bitmap");
                throw new IllegalArgumentException(sb.toString());
            }
            this.read.putParcelable(str, bitmap);
            return this;
        }

        public final MediaMetadataCompat AudioAttributesCompatParcelizer() {
            return new MediaMetadataCompat(this.read);
        }
    }
}
