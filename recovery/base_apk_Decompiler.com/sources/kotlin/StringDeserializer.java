package kotlin;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class StringDeserializer {
    private final RemoteActionCompatParcelizer read;

    interface IconCompatParcelizer {
        StringDeserializer AudioAttributesCompatParcelizer();

        void AudioAttributesCompatParcelizer(int i);

        void AudioAttributesCompatParcelizer(Bundle bundle);

        void read(Uri uri);
    }

    interface RemoteActionCompatParcelizer {
        ClipData AudioAttributesCompatParcelizer();

        int IconCompatParcelizer();

        ContentInfo cw_();

        int write();
    }

    static String read(int i) {
        if (i == 0) {
            return "SOURCE_APP";
        }
        if (i == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i == 4) {
            return "SOURCE_AUTOFILL";
        }
        if (i == 5) {
            return "SOURCE_PROCESS_TEXT";
        }
        return String.valueOf(i);
    }

    static String IconCompatParcelizer(int i) {
        if ((i & 1) != 0) {
            return "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        return String.valueOf(i);
    }

    StringDeserializer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.read = remoteActionCompatParcelizer;
    }

    public static StringDeserializer cs_(ContentInfo contentInfo) {
        return new StringDeserializer(new AudioAttributesImplApi26Parcelizer(contentInfo));
    }

    public final ContentInfo ct_() {
        return (ContentInfo) Objects.requireNonNull(this.read.cw_());
    }

    public final String toString() {
        return this.read.toString();
    }

    public final ClipData AudioAttributesCompatParcelizer() {
        return this.read.AudioAttributesCompatParcelizer();
    }

    public final int read() {
        return this.read.write();
    }

    public final int write() {
        return this.read.IconCompatParcelizer();
    }

    static final class AudioAttributesImplApi21Parcelizer implements RemoteActionCompatParcelizer {
        private final Bundle AudioAttributesCompatParcelizer;
        private final int IconCompatParcelizer;
        private final Uri RemoteActionCompatParcelizer;
        private final int read;
        private final ClipData write;

        @Override // o.StringDeserializer.RemoteActionCompatParcelizer
        public final ContentInfo cw_() {
            return null;
        }

        AudioAttributesImplApi21Parcelizer(write writeVar) {
            this.write = (ClipData) StringCollectionDeserializer.RemoteActionCompatParcelizer(writeVar.AudioAttributesCompatParcelizer);
            this.read = StringCollectionDeserializer.IconCompatParcelizer(writeVar.IconCompatParcelizer, "source");
            this.IconCompatParcelizer = StringCollectionDeserializer.read(writeVar.write);
            this.RemoteActionCompatParcelizer = writeVar.RemoteActionCompatParcelizer;
            this.AudioAttributesCompatParcelizer = writeVar.read;
        }

        @Override // o.StringDeserializer.RemoteActionCompatParcelizer
        public final ClipData AudioAttributesCompatParcelizer() {
            return this.write;
        }

        @Override // o.StringDeserializer.RemoteActionCompatParcelizer
        public final int write() {
            return this.read;
        }

        @Override // o.StringDeserializer.RemoteActionCompatParcelizer
        public final int IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String toString() {
            String string;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.write.getDescription());
            sb.append(", source=");
            sb.append(StringDeserializer.read(this.read));
            sb.append(", flags=");
            sb.append(StringDeserializer.IconCompatParcelizer(this.IconCompatParcelizer));
            if (this.RemoteActionCompatParcelizer == null) {
                string = "";
            } else {
                StringBuilder sb2 = new StringBuilder(", hasLinkUri(");
                sb2.append(this.RemoteActionCompatParcelizer.toString().length());
                sb2.append(")");
                string = sb2.toString();
            }
            sb.append(string);
            sb.append(this.AudioAttributesCompatParcelizer != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    static final class AudioAttributesImplApi26Parcelizer implements RemoteActionCompatParcelizer {
        private final ContentInfo RemoteActionCompatParcelizer;

        AudioAttributesImplApi26Parcelizer(ContentInfo contentInfo) {
            this.RemoteActionCompatParcelizer = (ContentInfo) StringCollectionDeserializer.RemoteActionCompatParcelizer(contentInfo);
        }

        @Override // o.StringDeserializer.RemoteActionCompatParcelizer
        public final ContentInfo cw_() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // o.StringDeserializer.RemoteActionCompatParcelizer
        public final ClipData AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer.getClip();
        }

        @Override // o.StringDeserializer.RemoteActionCompatParcelizer
        public final int write() {
            return this.RemoteActionCompatParcelizer.getSource();
        }

        @Override // o.StringDeserializer.RemoteActionCompatParcelizer
        public final int IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer.getFlags();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ContentInfoCompat{");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class read {
        private final IconCompatParcelizer read;

        public read(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.read = new AudioAttributesCompatParcelizer(clipData, i);
            } else {
                this.read = new write(clipData, i);
            }
        }

        public final read IconCompatParcelizer(int i) {
            this.read.AudioAttributesCompatParcelizer(i);
            return this;
        }

        public final read RemoteActionCompatParcelizer(Uri uri) {
            this.read.read(uri);
            return this;
        }

        public final read write(Bundle bundle) {
            this.read.AudioAttributesCompatParcelizer(bundle);
            return this;
        }

        public final StringDeserializer write() {
            return this.read.AudioAttributesCompatParcelizer();
        }
    }

    static final class write implements IconCompatParcelizer {
        ClipData AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        Uri RemoteActionCompatParcelizer;
        Bundle read;
        int write;

        write(ClipData clipData, int i) {
            this.AudioAttributesCompatParcelizer = clipData;
            this.IconCompatParcelizer = i;
        }

        @Override // o.StringDeserializer.IconCompatParcelizer
        public final void AudioAttributesCompatParcelizer(int i) {
            this.write = i;
        }

        @Override // o.StringDeserializer.IconCompatParcelizer
        public final void read(Uri uri) {
            this.RemoteActionCompatParcelizer = uri;
        }

        @Override // o.StringDeserializer.IconCompatParcelizer
        public final void AudioAttributesCompatParcelizer(Bundle bundle) {
            this.read = bundle;
        }

        @Override // o.StringDeserializer.IconCompatParcelizer
        public final StringDeserializer AudioAttributesCompatParcelizer() {
            return new StringDeserializer(new AudioAttributesImplApi21Parcelizer(this));
        }
    }

    static final class AudioAttributesCompatParcelizer implements IconCompatParcelizer {
        private final ContentInfo.Builder AudioAttributesCompatParcelizer;

        AudioAttributesCompatParcelizer(ClipData clipData, int i) {
            this.AudioAttributesCompatParcelizer = new ContentInfo.Builder(clipData, i);
        }

        @Override // o.StringDeserializer.IconCompatParcelizer
        public final void AudioAttributesCompatParcelizer(int i) {
            this.AudioAttributesCompatParcelizer.setFlags(i);
        }

        @Override // o.StringDeserializer.IconCompatParcelizer
        public final void read(Uri uri) {
            this.AudioAttributesCompatParcelizer.setLinkUri(uri);
        }

        @Override // o.StringDeserializer.IconCompatParcelizer
        public final void AudioAttributesCompatParcelizer(Bundle bundle) {
            this.AudioAttributesCompatParcelizer.setExtras(bundle);
        }

        @Override // o.StringDeserializer.IconCompatParcelizer
        public final StringDeserializer AudioAttributesCompatParcelizer() {
            return new StringDeserializer(new AudioAttributesImplApi26Parcelizer(this.AudioAttributesCompatParcelizer.build()));
        }
    }
}
