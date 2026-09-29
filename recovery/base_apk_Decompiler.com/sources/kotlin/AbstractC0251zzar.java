package kotlin;

import kotlin.Metadata;

/* JADX INFO: renamed from: o.zzar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lo/zzar;", "", "<init>", "()V", "AudioAttributesImplBaseParcelizer", "RemoteActionCompatParcelizer", "MediaBrowserCompatItemReceiver", "IconCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesCompatParcelizer", "read", "write", "Lo/zzar$read;", "Lo/zzar$IconCompatParcelizer;", "Lo/zzar$write;", "Lo/zzar$RemoteActionCompatParcelizer;", "Lo/zzar$AudioAttributesCompatParcelizer;", "Lo/zzar$MediaBrowserCompatCustomActionResultReceiver;", "Lo/zzar$MediaBrowserCompatItemReceiver;", "Lo/zzar$AudioAttributesImplBaseParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AbstractC0251zzar {
    private AbstractC0251zzar() {
    }

    /* JADX INFO: renamed from: o.zzar$AudioAttributesImplBaseParcelizer */
    public static final class AudioAttributesImplBaseParcelizer extends AbstractC0251zzar {
        private final String AudioAttributesCompatParcelizer;
        private final String AudioAttributesImplApi21Parcelizer;
        private final String AudioAttributesImplBaseParcelizer;
        private final String IconCompatParcelizer;
        private final Boolean RemoteActionCompatParcelizer;
        private final String read;
        private final Boolean write;

        public AudioAttributesImplBaseParcelizer(String str, String str2, Boolean bool, String str3, String str4, String str5, Boolean bool2) {
            super(null);
            this.IconCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = str2;
            this.write = bool;
            this.read = str3;
            this.AudioAttributesImplBaseParcelizer = str4;
            this.AudioAttributesImplApi21Parcelizer = str5;
            this.RemoteActionCompatParcelizer = bool2;
        }

        public final Boolean read() {
            return this.write;
        }

        public final String write() {
            return this.read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioAttributesImplBaseParcelizer)) {
                return false;
            }
            AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = (AudioAttributesImplBaseParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) audioAttributesImplBaseParcelizer.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, audioAttributesImplBaseParcelizer.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) audioAttributesImplBaseParcelizer.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) audioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) audioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.AudioAttributesCompatParcelizer;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            Boolean bool = this.write;
            int iHashCode3 = bool == null ? 0 : bool.hashCode();
            String str3 = this.read;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.AudioAttributesImplBaseParcelizer;
            int iHashCode5 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.AudioAttributesImplApi21Parcelizer;
            int iHashCode6 = str5 == null ? 0 : str5.hashCode();
            Boolean bool2 = this.RemoteActionCompatParcelizer;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String toString() {
            String str = this.IconCompatParcelizer;
            String str2 = this.AudioAttributesCompatParcelizer;
            Boolean bool = this.write;
            String str3 = this.read;
            String str4 = this.AudioAttributesImplBaseParcelizer;
            String str5 = this.AudioAttributesImplApi21Parcelizer;
            Boolean bool2 = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("QBankTracker(date=");
            sb.append(str);
            sb.append(", info=");
            sb.append(str2);
            sb.append(", live=");
            sb.append(bool);
            sb.append(", liveTitle=");
            sb.append(str3);
            sb.append(", title=");
            sb.append(str4);
            sb.append(", url=");
            sb.append(str5);
            sb.append(", showBanner=");
            sb.append(bool2);
            sb.append(")");
            return sb.toString();
        }
    }

    public /* synthetic */ AbstractC0251zzar(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    /* JADX INFO: renamed from: o.zzar$RemoteActionCompatParcelizer */
    public static final class RemoteActionCompatParcelizer extends AbstractC0251zzar {
        private final String AudioAttributesCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private final boolean write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(boolean z, String str, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.write = z;
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = str2;
        }

        public final boolean read() {
            return this.write;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String write() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            return this.write == remoteActionCompatParcelizer.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) remoteActionCompatParcelizer.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) remoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
        }

        public final int hashCode() {
            return (((Boolean.hashCode(this.write) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
        }

        public final String toString() {
            boolean z = this.write;
            String str = this.RemoteActionCompatParcelizer;
            String str2 = this.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("QBankPlanUpgradeModel(showPlanUpgradeCard=");
            sb.append(z);
            sb.append(", title=");
            sb.append(str);
            sb.append(", description=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: o.zzar$MediaBrowserCompatItemReceiver */
    public static final class MediaBrowserCompatItemReceiver extends AbstractC0251zzar {
        private final String AudioAttributesCompatParcelizer;
        private final int AudioAttributesImplApi21Parcelizer;
        private final int AudioAttributesImplBaseParcelizer;
        private final int IconCompatParcelizer;
        private final float MediaBrowserCompatCustomActionResultReceiver;
        private final String MediaBrowserCompatItemReceiver;
        private final String RemoteActionCompatParcelizer;
        private final int read;
        private final int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatItemReceiver(String str, String str2, int i, int i2, int i3, float f, int i4, int i5, String str3) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            this.AudioAttributesCompatParcelizer = str;
            this.MediaBrowserCompatItemReceiver = str2;
            this.IconCompatParcelizer = i;
            this.AudioAttributesImplBaseParcelizer = i2;
            this.write = i3;
            this.MediaBrowserCompatCustomActionResultReceiver = f;
            this.AudioAttributesImplApi21Parcelizer = i4;
            this.read = i5;
            this.RemoteActionCompatParcelizer = str3;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String read() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final int IconCompatParcelizer() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        public final int write() {
            return this.read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaBrowserCompatItemReceiver)) {
                return false;
            }
            MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = (MediaBrowserCompatItemReceiver) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) mediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver) && this.IconCompatParcelizer == mediaBrowserCompatItemReceiver.IconCompatParcelizer && this.AudioAttributesImplBaseParcelizer == mediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer && this.write == mediaBrowserCompatItemReceiver.write && Float.compare(this.MediaBrowserCompatCustomActionResultReceiver, mediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver) == 0 && this.AudioAttributesImplApi21Parcelizer == mediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer && this.read == mediaBrowserCompatItemReceiver.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer);
        }

        public final int hashCode() {
            return (((((((((((((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.MediaBrowserCompatItemReceiver.hashCode()) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + Integer.hashCode(this.write)) * 31) + Float.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Integer.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Integer.hashCode(this.read)) * 31) + this.RemoteActionCompatParcelizer.hashCode();
        }

        public final String toString() {
            String str = this.AudioAttributesCompatParcelizer;
            String str2 = this.MediaBrowserCompatItemReceiver;
            int i = this.IconCompatParcelizer;
            int i2 = this.AudioAttributesImplBaseParcelizer;
            int i3 = this.write;
            float f = this.MediaBrowserCompatCustomActionResultReceiver;
            int i4 = this.AudioAttributesImplApi21Parcelizer;
            int i5 = this.read;
            String str3 = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("QBankSuggestionModel(id=");
            sb.append(str);
            sb.append(", title=");
            sb.append(str2);
            sb.append(", tag=");
            sb.append(i);
            sb.append(", updatedCount=");
            sb.append(i2);
            sb.append(", newCount=");
            sb.append(i3);
            sb.append(", videoProcess=");
            sb.append(f);
            sb.append(", totalMcqCount=");
            sb.append(i4);
            sb.append(", answeredMcqCount=");
            sb.append(i5);
            sb.append(", subjectId=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: o.zzar$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends AbstractC0251zzar {
        private final int IconCompatParcelizer;
        private final boolean RemoteActionCompatParcelizer;
        private final boolean read;

        public IconCompatParcelizer(boolean z, boolean z2, int i) {
            super(null);
            this.RemoteActionCompatParcelizer = z;
            this.read = z2;
            this.IconCompatParcelizer = i;
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean read() {
            return this.read;
        }

        public final int write() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static IconCompatParcelizer AudioAttributesCompatParcelizer(boolean z, boolean z2, int i) {
            return new IconCompatParcelizer(z, true, i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return this.RemoteActionCompatParcelizer == iconCompatParcelizer.RemoteActionCompatParcelizer && this.read == iconCompatParcelizer.read && this.IconCompatParcelizer == iconCompatParcelizer.IconCompatParcelizer;
        }

        public final int hashCode() {
            return (((Boolean.hashCode(this.RemoteActionCompatParcelizer) * 31) + Boolean.hashCode(this.read)) * 31) + Integer.hashCode(this.IconCompatParcelizer);
        }

        public final String toString() {
            boolean z = this.RemoteActionCompatParcelizer;
            boolean z2 = this.read;
            int i = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("QBankExtraFunctionalityModel(isBookmarkVisible=");
            sb.append(z);
            sb.append(", isCustomModuleVisible=");
            sb.append(z2);
            sb.append(", bookmarkCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: o.zzar$MediaBrowserCompatCustomActionResultReceiver */
    public static final class MediaBrowserCompatCustomActionResultReceiver extends AbstractC0251zzar {
        private String AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private String AudioAttributesImplBaseParcelizer;
        private String IconCompatParcelizer;
        private long RemoteActionCompatParcelizer;
        private int read;
        private int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatCustomActionResultReceiver(String str, String str2, String str3, int i, int i2, long j, int i3) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            this.AudioAttributesCompatParcelizer = str;
            this.AudioAttributesImplBaseParcelizer = str2;
            this.IconCompatParcelizer = str3;
            this.AudioAttributesImplApi21Parcelizer = i;
            this.read = i2;
            this.RemoteActionCompatParcelizer = j;
            this.write = i3;
        }

        public final String read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public final String IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final int write() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaBrowserCompatCustomActionResultReceiver)) {
                return false;
            }
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = (MediaBrowserCompatCustomActionResultReceiver) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) mediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer) && this.AudioAttributesImplApi21Parcelizer == mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer && this.read == mediaBrowserCompatCustomActionResultReceiver.read && this.RemoteActionCompatParcelizer == mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer && this.write == mediaBrowserCompatCustomActionResultReceiver.write;
        }

        public final int hashCode() {
            return (((((((((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Integer.hashCode(this.read)) * 31) + Long.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Integer.hashCode(this.write);
        }

        public final String toString() {
            String str = this.AudioAttributesCompatParcelizer;
            String str2 = this.AudioAttributesImplBaseParcelizer;
            String str3 = this.IconCompatParcelizer;
            int i = this.AudioAttributesImplApi21Parcelizer;
            int i2 = this.read;
            long j = this.RemoteActionCompatParcelizer;
            int i3 = this.write;
            StringBuilder sb = new StringBuilder("QBankSubjectInfoModel(id=");
            sb.append(str);
            sb.append(", title=");
            sb.append(str2);
            sb.append(", imageUrl=");
            sb.append(str3);
            sb.append(", totalLessons=");
            sb.append(i);
            sb.append(", completedCount=");
            sb.append(i2);
            sb.append(", lastOpened=");
            sb.append(j);
            sb.append(", cardType=");
            sb.append(i3);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: o.zzar$AudioAttributesCompatParcelizer */
    public static final class AudioAttributesCompatParcelizer extends AbstractC0251zzar {
        private final boolean AudioAttributesCompatParcelizer;
        private final int RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(int i, boolean z) {
            super(null);
            this.RemoteActionCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = z;
        }

        public final int read() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) obj;
            return this.RemoteActionCompatParcelizer == audioAttributesCompatParcelizer.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        }

        public final int hashCode() {
            return (Integer.hashCode(this.RemoteActionCompatParcelizer) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
        }

        public final String toString() {
            int i = this.RemoteActionCompatParcelizer;
            boolean z = this.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("QBankSchemaModel(schemaCount=");
            sb.append(i);
            sb.append(", isSchemaCompletelySync=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: o.zzar$read */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zzar$read;", "Lo/zzar;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends AbstractC0251zzar {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.zzar$write */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zzar$write;", "Lo/zzar;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends AbstractC0251zzar {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }
}
