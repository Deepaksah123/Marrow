package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.util.Util;
import java.util.HashMap;
import kotlin.initExtraTracks;
import kotlin.onMoovContainerAtomRead;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class SessionDescription {
    public static final String ATTR_CONTROL = "control";
    public static final String ATTR_FMTP = "fmtp";
    public static final String ATTR_LENGTH = "length";
    public static final String ATTR_RANGE = "range";
    public static final String ATTR_RTPMAP = "rtpmap";
    public static final String ATTR_TOOL = "tool";
    public static final String ATTR_TYPE = "type";
    public static final String SUPPORTED_SDP_VERSION = "0";
    public final onMoovContainerAtomRead<String, String> attributes;
    public final int bitrate;
    public final String connection;
    public final String emailAddress;
    public final String key;
    public final initExtraTracks<MediaDescription> mediaDescriptionList;
    public final String origin;
    public final String phoneNumber;
    public final String sessionInfo;
    public final String sessionName;
    public final String timing;
    public final Uri uri;

    public static final class Builder {
        private String connection;
        private String emailAddress;
        private String key;
        private String origin;
        private String phoneNumber;
        private String sessionInfo;
        private String sessionName;
        private String timing;
        private Uri uri;
        private final HashMap<String, String> attributes = new HashMap<>();
        private final initExtraTracks.IconCompatParcelizer<MediaDescription> mediaDescriptionListBuilder = new initExtraTracks.IconCompatParcelizer<>();
        private int bitrate = -1;

        public final Builder setSessionName(String str) {
            this.sessionName = str;
            return this;
        }

        public final Builder setSessionInfo(String str) {
            this.sessionInfo = str;
            return this;
        }

        public final Builder setUri(Uri uri) {
            this.uri = uri;
            return this;
        }

        public final Builder setOrigin(String str) {
            this.origin = str;
            return this;
        }

        public final Builder setConnection(String str) {
            this.connection = str;
            return this;
        }

        public final Builder setBitrate(int i) {
            this.bitrate = i;
            return this;
        }

        public final Builder setTiming(String str) {
            this.timing = str;
            return this;
        }

        public final Builder setKey(String str) {
            this.key = str;
            return this;
        }

        public final Builder setEmailAddress(String str) {
            this.emailAddress = str;
            return this;
        }

        public final Builder setPhoneNumber(String str) {
            this.phoneNumber = str;
            return this;
        }

        public final Builder addAttribute(String str, String str2) {
            this.attributes.put(str, str2);
            return this;
        }

        public final Builder addMediaDescription(MediaDescription mediaDescription) {
            this.mediaDescriptionListBuilder.read(mediaDescription);
            return this;
        }

        public final SessionDescription build() {
            return new SessionDescription(this);
        }
    }

    private SessionDescription(Builder builder) {
        this.attributes = onMoovContainerAtomRead.write(builder.attributes);
        this.mediaDescriptionList = builder.mediaDescriptionListBuilder.IconCompatParcelizer();
        this.sessionName = (String) Util.castNonNull(builder.sessionName);
        this.origin = (String) Util.castNonNull(builder.origin);
        this.timing = (String) Util.castNonNull(builder.timing);
        this.uri = builder.uri;
        this.connection = builder.connection;
        this.bitrate = builder.bitrate;
        this.key = builder.key;
        this.emailAddress = builder.emailAddress;
        this.phoneNumber = builder.phoneNumber;
        this.sessionInfo = builder.sessionInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SessionDescription sessionDescription = (SessionDescription) obj;
        return this.bitrate == sessionDescription.bitrate && this.attributes.equals(sessionDescription.attributes) && this.mediaDescriptionList.equals(sessionDescription.mediaDescriptionList) && Util.areEqual(this.origin, sessionDescription.origin) && Util.areEqual(this.sessionName, sessionDescription.sessionName) && Util.areEqual(this.timing, sessionDescription.timing) && Util.areEqual(this.sessionInfo, sessionDescription.sessionInfo) && Util.areEqual(this.uri, sessionDescription.uri) && Util.areEqual(this.emailAddress, sessionDescription.emailAddress) && Util.areEqual(this.phoneNumber, sessionDescription.phoneNumber) && Util.areEqual(this.connection, sessionDescription.connection) && Util.areEqual(this.key, sessionDescription.key);
    }

    public final int hashCode() {
        int iHashCode = this.attributes.hashCode();
        int iHashCode2 = this.mediaDescriptionList.hashCode();
        String str = this.origin;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.sessionName;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.timing;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        int i = this.bitrate;
        String str4 = this.sessionInfo;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        Uri uri = this.uri;
        int iHashCode7 = uri == null ? 0 : uri.hashCode();
        String str5 = this.emailAddress;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.phoneNumber;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.connection;
        int iHashCode10 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.key;
        return ((((((((((((((((((((((iHashCode + 217) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + i) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str8 != null ? str8.hashCode() : 0);
    }
}
