package kotlin;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class getBitrateEstimate {

    public static class read implements Serializable {
        private boolean AudioAttributesCompatParcelizer;
        private boolean AudioAttributesImplApi21Parcelizer;
        private boolean AudioAttributesImplApi26Parcelizer;
        private boolean AudioAttributesImplBaseParcelizer;
        private boolean MediaBrowserCompatCustomActionResultReceiver;
        private boolean MediaBrowserCompatItemReceiver;
        private boolean write;
        private int RemoteActionCompatParcelizer = 0;
        private long RatingCompat = 0;
        private String IconCompatParcelizer = "";
        private boolean MediaBrowserCompatMediaItem = false;
        private int MediaDescriptionCompat = 1;
        private String MediaMetadataCompat = "";
        private String MediaBrowserCompatSearchResultReceiver = "";
        private RemoteActionCompatParcelizer read = RemoteActionCompatParcelizer.UNSPECIFIED;

        public enum RemoteActionCompatParcelizer {
            /* JADX INFO: Fake field, exist only in values array */
            FROM_NUMBER_WITH_PLUS_SIGN,
            /* JADX INFO: Fake field, exist only in values array */
            FROM_NUMBER_WITH_IDD,
            /* JADX INFO: Fake field, exist only in values array */
            FROM_NUMBER_WITHOUT_PLUS_SIGN,
            /* JADX INFO: Fake field, exist only in values array */
            FROM_DEFAULT_COUNTRY,
            UNSPECIFIED
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final read AudioAttributesCompatParcelizer(int i) {
            this.write = true;
            this.RemoteActionCompatParcelizer = i;
            return this;
        }

        public final long write() {
            return this.RatingCompat;
        }

        public final read RemoteActionCompatParcelizer(long j) {
            this.MediaBrowserCompatCustomActionResultReceiver = true;
            this.RatingCompat = j;
            return this;
        }

        private boolean AudioAttributesImplApi21Parcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        private String MediaBrowserCompatCustomActionResultReceiver() {
            return this.IconCompatParcelizer;
        }

        private boolean MediaBrowserCompatMediaItem() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.MediaBrowserCompatMediaItem;
        }

        private boolean MediaDescriptionCompat() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final int read() {
            return this.MediaDescriptionCompat;
        }

        private String AudioAttributesImplBaseParcelizer() {
            return this.MediaMetadataCompat;
        }

        private boolean MediaBrowserCompatItemReceiver() {
            return this.AudioAttributesCompatParcelizer;
        }

        private RemoteActionCompatParcelizer IconCompatParcelizer() {
            return this.read;
        }

        private boolean MediaBrowserCompatSearchResultReceiver() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        private String AudioAttributesImplApi26Parcelizer() {
            return this.MediaBrowserCompatSearchResultReceiver;
        }

        private boolean write(read readVar) {
            if (readVar == null) {
                return false;
            }
            if (this == readVar) {
                return true;
            }
            if (this.RemoteActionCompatParcelizer == readVar.RemoteActionCompatParcelizer && this.RatingCompat == readVar.RatingCompat && this.IconCompatParcelizer.equals(readVar.IconCompatParcelizer)) {
                boolean z = readVar.MediaBrowserCompatMediaItem;
                if (this.MediaDescriptionCompat == readVar.MediaDescriptionCompat && this.MediaMetadataCompat.equals(readVar.MediaMetadataCompat) && this.read == readVar.read && this.MediaBrowserCompatSearchResultReceiver.equals(readVar.MediaBrowserCompatSearchResultReceiver) && MediaBrowserCompatSearchResultReceiver() == readVar.MediaBrowserCompatSearchResultReceiver()) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof read) && write((read) obj);
        }

        public final int hashCode() {
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            int iHashCode = Long.valueOf(write()).hashCode();
            int iHashCode2 = MediaBrowserCompatCustomActionResultReceiver().hashCode();
            int i = RemoteActionCompatParcelizer() ? 1231 : 1237;
            int i2 = read();
            int iHashCode3 = AudioAttributesImplBaseParcelizer().hashCode();
            int iHashCode4 = IconCompatParcelizer().hashCode();
            return ((((((((((((((((iAudioAttributesCompatParcelizer + 2173) * 53) + iHashCode) * 53) + iHashCode2) * 53) + i) * 53) + i2) * 53) + iHashCode3) * 53) + iHashCode4) * 53) + AudioAttributesImplApi26Parcelizer().hashCode()) * 53) + (MediaBrowserCompatSearchResultReceiver() ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Country Code: ");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(" National Number: ");
            sb.append(this.RatingCompat);
            if (MediaBrowserCompatMediaItem() && RemoteActionCompatParcelizer()) {
                sb.append(" Leading Zero(s): true");
            }
            if (MediaDescriptionCompat()) {
                sb.append(" Number of leading zeros: ");
                sb.append(this.MediaDescriptionCompat);
            }
            if (AudioAttributesImplApi21Parcelizer()) {
                sb.append(" Extension: ");
                sb.append(this.IconCompatParcelizer);
            }
            if (MediaBrowserCompatItemReceiver()) {
                sb.append(" Country Code Source: ");
                sb.append(this.read);
            }
            if (MediaBrowserCompatSearchResultReceiver()) {
                sb.append(" Preferred Domestic Carrier Code: ");
                sb.append(this.MediaBrowserCompatSearchResultReceiver);
            }
            return sb.toString();
        }
    }
}
