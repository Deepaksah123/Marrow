package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public interface setReferenceCounted {

    public static final class MediaBrowserCompatCustomActionResultReceiver implements setReferenceCounted {
        private final String RemoteActionCompatParcelizer;
        private final String read;

        public MediaBrowserCompatCustomActionResultReceiver(String str, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.read = str;
            this.RemoteActionCompatParcelizer = str2;
        }

        public final String read() {
            return this.read;
        }

        public final String write() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaBrowserCompatCustomActionResultReceiver)) {
                return false;
            }
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = (MediaBrowserCompatCustomActionResultReceiver) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) mediaBrowserCompatCustomActionResultReceiver.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer);
        }

        public final int hashCode() {
            return (this.read.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode();
        }

        public final String toString() {
            String str = this.read;
            String str2 = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("OnSubjectClicked(subjectId=");
            sb.append(str);
            sb.append(", subjectName=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class MediaDescriptionCompat implements setReferenceCounted {
        private final String IconCompatParcelizer;

        public MediaDescriptionCompat(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        public final String write() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MediaDescriptionCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) ((MediaDescriptionCompat) obj).IconCompatParcelizer);
        }

        public final int hashCode() {
            return this.IconCompatParcelizer.hashCode();
        }

        public final String toString() {
            String str = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("OnTestDetailsClicked(testId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/setReferenceCounted$AudioAttributesImplBaseParcelizer;", "Lo/setReferenceCounted;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AudioAttributesImplBaseParcelizer implements setReferenceCounted {
        public static final AudioAttributesImplBaseParcelizer INSTANCE = new AudioAttributesImplBaseParcelizer();

        public final int hashCode() {
            return -178315685;
        }

        private AudioAttributesImplBaseParcelizer() {
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof AudioAttributesImplBaseParcelizer)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "AudioAttributesImplBaseParcelizer";
        }
    }

    public static final class MediaBrowserCompatItemReceiver implements setReferenceCounted {
        private final PaymentDataRequestBuilder read;

        public MediaBrowserCompatItemReceiver(PaymentDataRequestBuilder paymentDataRequestBuilder) {
            toMagicModuleMetaRepoModel.write(paymentDataRequestBuilder, "");
            this.read = paymentDataRequestBuilder;
        }

        public final PaymentDataRequestBuilder IconCompatParcelizer() {
            return this.read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MediaBrowserCompatItemReceiver) && this.read == ((MediaBrowserCompatItemReceiver) obj).read;
        }

        public final int hashCode() {
            return this.read.hashCode();
        }

        public final String toString() {
            PaymentDataRequestBuilder paymentDataRequestBuilder = this.read;
            StringBuilder sb = new StringBuilder("OnMetricSelected(metric=");
            sb.append(paymentDataRequestBuilder);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class IconCompatParcelizer implements setReferenceCounted {
        private final int AudioAttributesCompatParcelizer;

        public IconCompatParcelizer(int i) {
            this.AudioAttributesCompatParcelizer = i;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IconCompatParcelizer) && this.AudioAttributesCompatParcelizer == ((IconCompatParcelizer) obj).AudioAttributesCompatParcelizer;
        }

        public final int hashCode() {
            return Integer.hashCode(this.AudioAttributesCompatParcelizer);
        }

        public final String toString() {
            int i = this.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("OnLimitSelected(limit=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class write implements setReferenceCounted {
        private final int IconCompatParcelizer;

        public write(int i) {
            this.IconCompatParcelizer = i;
        }

        public final int read() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof write) && this.IconCompatParcelizer == ((write) obj).IconCompatParcelizer;
        }

        public final int hashCode() {
            return Integer.hashCode(this.IconCompatParcelizer);
        }

        public final String toString() {
            int i = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("OnBarSelected(index=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class MediaBrowserCompatMediaItem implements setReferenceCounted {
        private final String IconCompatParcelizer;

        public MediaBrowserCompatMediaItem(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        public final String write() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MediaBrowserCompatMediaItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) ((MediaBrowserCompatMediaItem) obj).IconCompatParcelizer);
        }

        public final int hashCode() {
            return this.IconCompatParcelizer.hashCode();
        }

        public final String toString() {
            String str = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("OnTopicCardClicked(topicId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/setReferenceCounted$AudioAttributesCompatParcelizer;", "Lo/setReferenceCounted;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AudioAttributesCompatParcelizer implements setReferenceCounted {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        public final int hashCode() {
            return 1411660201;
        }

        private AudioAttributesCompatParcelizer() {
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "AudioAttributesCompatParcelizer";
        }
    }

    public static final class RemoteActionCompatParcelizer implements setReferenceCounted {
        private final read AudioAttributesCompatParcelizer;

        public RemoteActionCompatParcelizer(read readVar) {
            toMagicModuleMetaRepoModel.write(readVar, "");
            this.AudioAttributesCompatParcelizer = readVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoteActionCompatParcelizer) && this.AudioAttributesCompatParcelizer == ((RemoteActionCompatParcelizer) obj).AudioAttributesCompatParcelizer;
        }

        public final int hashCode() {
            return this.AudioAttributesCompatParcelizer.hashCode();
        }

        public final String toString() {
            read readVar = this.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("OnInfoSheetDismissed(reason=");
            sb.append(readVar);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/setReferenceCounted$AudioAttributesImplApi26Parcelizer;", "Lo/setReferenceCounted;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AudioAttributesImplApi26Parcelizer implements setReferenceCounted {
        public static final AudioAttributesImplApi26Parcelizer INSTANCE = new AudioAttributesImplApi26Parcelizer();

        public final int hashCode() {
            return -194197631;
        }

        private AudioAttributesImplApi26Parcelizer() {
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof AudioAttributesImplApi26Parcelizer)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "AudioAttributesImplApi26Parcelizer";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/setReferenceCounted$AudioAttributesImplApi21Parcelizer;", "Lo/setReferenceCounted;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AudioAttributesImplApi21Parcelizer implements setReferenceCounted {
        public static final AudioAttributesImplApi21Parcelizer INSTANCE = new AudioAttributesImplApi21Parcelizer();

        public final int hashCode() {
            return -981923325;
        }

        private AudioAttributesImplApi21Parcelizer() {
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof AudioAttributesImplApi21Parcelizer)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "AudioAttributesImplApi21Parcelizer";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/setReferenceCounted$read;", "", "<init>", "(Ljava/lang/String;I)V", "read", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read {
        private static final /* synthetic */ read[] IconCompatParcelizer;
        public static final read read = new read("CTA_GOT_IT", 0);
        public static final read RemoteActionCompatParcelizer = new read("DRAG", 1);

        static {
            read[] readVarArrWrite = write();
            IconCompatParcelizer = readVarArrWrite;
            getMagicModuleTimeline.IconCompatParcelizer(readVarArrWrite);
        }

        private read(String str, int i) {
        }

        private static final /* synthetic */ read[] write() {
            return new read[]{read, RemoteActionCompatParcelizer};
        }

        public static read valueOf(String str) {
            return (read) Enum.valueOf(read.class, str);
        }

        public static read[] values() {
            return (read[]) IconCompatParcelizer.clone();
        }
    }
}
