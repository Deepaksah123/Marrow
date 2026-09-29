package kotlin;

import kotlin.getKeyRequest;

/* JADX INFO: loaded from: classes4.dex */
final class getPropertyByteArray extends getKeyRequest {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final String MediaBrowserCompatMediaItem;
    private final Integer MediaMetadataCompat;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    /* synthetic */ getPropertyByteArray(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, byte b) {
        this(num, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    private getPropertyByteArray(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.MediaMetadataCompat = num;
        this.AudioAttributesImplApi21Parcelizer = str;
        this.write = str2;
        this.read = str3;
        this.MediaBrowserCompatMediaItem = str4;
        this.MediaBrowserCompatItemReceiver = str5;
        this.AudioAttributesImplBaseParcelizer = str6;
        this.IconCompatParcelizer = str7;
        this.AudioAttributesImplApi26Parcelizer = str8;
        this.AudioAttributesCompatParcelizer = str9;
        this.MediaBrowserCompatCustomActionResultReceiver = str10;
        this.RemoteActionCompatParcelizer = str11;
    }

    @Override // kotlin.getKeyRequest
    public final Integer MediaBrowserCompatSearchResultReceiver() {
        return this.MediaMetadataCompat;
    }

    @Override // kotlin.getKeyRequest
    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.getKeyRequest
    public final String AudioAttributesImplBaseParcelizer() {
        return this.write;
    }

    @Override // kotlin.getKeyRequest
    public final String read() {
        return this.read;
    }

    @Override // kotlin.getKeyRequest
    public final String MediaMetadataCompat() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // kotlin.getKeyRequest
    public final String MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.getKeyRequest
    public final String MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.getKeyRequest
    public final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.getKeyRequest
    public final String AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.getKeyRequest
    public final String IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getKeyRequest
    public final String AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin.getKeyRequest
    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", model=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", hardware=");
        sb.append(this.write);
        sb.append(", device=");
        sb.append(this.read);
        sb.append(", product=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", osBuild=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", manufacturer=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", fingerprint=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", locale=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", country=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", mccMnc=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", applicationBuild=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getKeyRequest)) {
            return false;
        }
        getKeyRequest getkeyrequest = (getKeyRequest) obj;
        Integer num = this.MediaMetadataCompat;
        if (num == null) {
            if (getkeyrequest.MediaBrowserCompatSearchResultReceiver() != null) {
                return false;
            }
        } else if (!num.equals(getkeyrequest.MediaBrowserCompatSearchResultReceiver())) {
            return false;
        }
        String str = this.AudioAttributesImplApi21Parcelizer;
        if (str == null) {
            if (getkeyrequest.MediaBrowserCompatCustomActionResultReceiver() != null) {
                return false;
            }
        } else if (!str.equals(getkeyrequest.MediaBrowserCompatCustomActionResultReceiver())) {
            return false;
        }
        String str2 = this.write;
        if (str2 == null) {
            if (getkeyrequest.AudioAttributesImplBaseParcelizer() != null) {
                return false;
            }
        } else if (!str2.equals(getkeyrequest.AudioAttributesImplBaseParcelizer())) {
            return false;
        }
        String str3 = this.read;
        if (str3 == null) {
            if (getkeyrequest.read() != null) {
                return false;
            }
        } else if (!str3.equals(getkeyrequest.read())) {
            return false;
        }
        String str4 = this.MediaBrowserCompatMediaItem;
        if (str4 == null) {
            if (getkeyrequest.MediaMetadataCompat() != null) {
                return false;
            }
        } else if (!str4.equals(getkeyrequest.MediaMetadataCompat())) {
            return false;
        }
        String str5 = this.MediaBrowserCompatItemReceiver;
        if (str5 == null) {
            if (getkeyrequest.MediaBrowserCompatMediaItem() != null) {
                return false;
            }
        } else if (!str5.equals(getkeyrequest.MediaBrowserCompatMediaItem())) {
            return false;
        }
        String str6 = this.AudioAttributesImplBaseParcelizer;
        if (str6 == null) {
            if (getkeyrequest.MediaBrowserCompatItemReceiver() != null) {
                return false;
            }
        } else if (!str6.equals(getkeyrequest.MediaBrowserCompatItemReceiver())) {
            return false;
        }
        String str7 = this.IconCompatParcelizer;
        if (str7 == null) {
            if (getkeyrequest.RemoteActionCompatParcelizer() != null) {
                return false;
            }
        } else if (!str7.equals(getkeyrequest.RemoteActionCompatParcelizer())) {
            return false;
        }
        String str8 = this.AudioAttributesImplApi26Parcelizer;
        if (str8 == null) {
            if (getkeyrequest.AudioAttributesImplApi26Parcelizer() != null) {
                return false;
            }
        } else if (!str8.equals(getkeyrequest.AudioAttributesImplApi26Parcelizer())) {
            return false;
        }
        String str9 = this.AudioAttributesCompatParcelizer;
        if (str9 == null) {
            if (getkeyrequest.IconCompatParcelizer() != null) {
                return false;
            }
        } else if (!str9.equals(getkeyrequest.IconCompatParcelizer())) {
            return false;
        }
        String str10 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (str10 == null) {
            if (getkeyrequest.AudioAttributesImplApi21Parcelizer() != null) {
                return false;
            }
        } else if (!str10.equals(getkeyrequest.AudioAttributesImplApi21Parcelizer())) {
            return false;
        }
        String str11 = this.RemoteActionCompatParcelizer;
        if (str11 == null) {
            if (getkeyrequest.write() != null) {
                return false;
            }
        } else if (!str11.equals(getkeyrequest.write())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.MediaMetadataCompat;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.AudioAttributesImplApi21Parcelizer;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.write;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.read;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.MediaBrowserCompatMediaItem;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.MediaBrowserCompatItemReceiver;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.AudioAttributesImplBaseParcelizer;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.IconCompatParcelizer;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.AudioAttributesImplApi26Parcelizer;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.AudioAttributesCompatParcelizer;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.MediaBrowserCompatCustomActionResultReceiver;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.RemoteActionCompatParcelizer;
        return ((((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ iHashCode10) * 1000003) ^ iHashCode11) * 1000003) ^ (str11 != null ? str11.hashCode() : 0);
    }

    static final class AudioAttributesCompatParcelizer extends getKeyRequest.write {
        private String AudioAttributesCompatParcelizer;
        private String AudioAttributesImplApi21Parcelizer;
        private String AudioAttributesImplApi26Parcelizer;
        private String AudioAttributesImplBaseParcelizer;
        private String IconCompatParcelizer;
        private String MediaBrowserCompatCustomActionResultReceiver;
        private String MediaBrowserCompatItemReceiver;
        private String MediaDescriptionCompat;
        private Integer RatingCompat;
        private String RemoteActionCompatParcelizer;
        private String read;
        private String write;

        AudioAttributesCompatParcelizer() {
        }

        @Override // o.getKeyRequest.write
        public final getKeyRequest.write AudioAttributesCompatParcelizer(Integer num) {
            this.RatingCompat = num;
            return this;
        }

        @Override // o.getKeyRequest.write
        public final getKeyRequest.write AudioAttributesImplApi26Parcelizer(String str) {
            this.AudioAttributesImplBaseParcelizer = str;
            return this;
        }

        @Override // o.getKeyRequest.write
        public final getKeyRequest.write IconCompatParcelizer(String str) {
            this.read = str;
            return this;
        }

        @Override // o.getKeyRequest.write
        public final getKeyRequest.write AudioAttributesCompatParcelizer(String str) {
            this.AudioAttributesCompatParcelizer = str;
            return this;
        }

        @Override // o.getKeyRequest.write
        public final getKeyRequest.write MediaBrowserCompatMediaItem(String str) {
            this.MediaDescriptionCompat = str;
            return this;
        }

        @Override // o.getKeyRequest.write
        public final getKeyRequest.write AudioAttributesImplApi21Parcelizer(String str) {
            this.MediaBrowserCompatCustomActionResultReceiver = str;
            return this;
        }

        @Override // o.getKeyRequest.write
        public final getKeyRequest.write AudioAttributesImplBaseParcelizer(String str) {
            this.MediaBrowserCompatItemReceiver = str;
            return this;
        }

        @Override // o.getKeyRequest.write
        public final getKeyRequest.write RemoteActionCompatParcelizer(String str) {
            this.IconCompatParcelizer = str;
            return this;
        }

        @Override // o.getKeyRequest.write
        public final getKeyRequest.write MediaBrowserCompatItemReceiver(String str) {
            this.AudioAttributesImplApi21Parcelizer = str;
            return this;
        }

        @Override // o.getKeyRequest.write
        public final getKeyRequest.write read(String str) {
            this.write = str;
            return this;
        }

        @Override // o.getKeyRequest.write
        public final getKeyRequest.write MediaBrowserCompatCustomActionResultReceiver(String str) {
            this.AudioAttributesImplApi26Parcelizer = str;
            return this;
        }

        @Override // o.getKeyRequest.write
        public final getKeyRequest.write write(String str) {
            this.RemoteActionCompatParcelizer = str;
            return this;
        }

        @Override // o.getKeyRequest.write
        public final getKeyRequest AudioAttributesCompatParcelizer() {
            return new getPropertyByteArray(this.RatingCompat, this.AudioAttributesImplBaseParcelizer, this.read, this.AudioAttributesCompatParcelizer, this.MediaDescriptionCompat, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver, this.IconCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, this.write, this.AudioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer, (byte) 0);
        }
    }
}
