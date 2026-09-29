package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0012\u0014B9\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\u000f\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0013\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0001\u0002\u001b\u001c"}, d2 = {"Lo/IntegrityManagerFactory;", "", "", "p0", "p1", "p2", "p3", "", "p4", "", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "AudioAttributesImplBaseParcelizer", "Ljava/lang/String;", "write", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "read", "IconCompatParcelizer", "I", "()I", "Z", "MediaBrowserCompatCustomActionResultReceiver", "()Z", "AudioAttributesImplApi21Parcelizer", "Lo/IntegrityManagerFactory$RemoteActionCompatParcelizer;", "Lo/IntegrityManagerFactory$IconCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class IntegrityManagerFactory {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String IconCompatParcelizer;
    private final int write;

    private IntegrityManagerFactory(String str, String str2, String str3, String str4, int i, boolean z) {
        this.AudioAttributesCompatParcelizer = str;
        this.read = str2;
        this.IconCompatParcelizer = str3;
        this.RemoteActionCompatParcelizer = str4;
        this.write = i;
        this.AudioAttributesImplApi21Parcelizer = z;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public boolean getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public static final class RemoteActionCompatParcelizer extends IntegrityManagerFactory {
        private final String AudioAttributesCompatParcelizer;
        private final int AudioAttributesImplApi21Parcelizer;
        private final String AudioAttributesImplApi26Parcelizer;
        private final String IconCompatParcelizer;
        private final int MediaBrowserCompatCustomActionResultReceiver;
        private final String MediaBrowserCompatItemReceiver;
        private final boolean RemoteActionCompatParcelizer;
        private final String read;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, boolean z) {
            super(str3, str4, str5, str6, i2, z, null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(str4, "");
            toMagicModuleMetaRepoModel.write(str5, "");
            toMagicModuleMetaRepoModel.write(str6, "");
            this.AudioAttributesImplApi26Parcelizer = str;
            this.MediaBrowserCompatCustomActionResultReceiver = i;
            this.read = str2;
            this.MediaBrowserCompatItemReceiver = str3;
            this.write = str4;
            this.AudioAttributesCompatParcelizer = str5;
            this.IconCompatParcelizer = str6;
            this.AudioAttributesImplApi21Parcelizer = i2;
            this.RemoteActionCompatParcelizer = z;
        }

        public final String AudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final int MediaBrowserCompatItemReceiver() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final String AudioAttributesImplApi26Parcelizer() {
            return this.read;
        }

        @Override // kotlin.IntegrityManagerFactory
        /* JADX INFO: renamed from: write */
        public final String getAudioAttributesCompatParcelizer() {
            return this.MediaBrowserCompatItemReceiver;
        }

        @Override // kotlin.IntegrityManagerFactory
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
        public final String getRead() {
            return this.write;
        }

        @Override // kotlin.IntegrityManagerFactory
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
        public final String getIconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // kotlin.IntegrityManagerFactory
        /* JADX INFO: renamed from: IconCompatParcelizer */
        public final String getRemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        @Override // kotlin.IntegrityManagerFactory
        /* JADX INFO: renamed from: read */
        public final int getWrite() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        @Override // kotlin.IntegrityManagerFactory
        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver */
        public final boolean getAudioAttributesImplApi21Parcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer) && this.MediaBrowserCompatCustomActionResultReceiver == remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) remoteActionCompatParcelizer.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) remoteActionCompatParcelizer.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) remoteActionCompatParcelizer.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) remoteActionCompatParcelizer.IconCompatParcelizer) && this.AudioAttributesImplApi21Parcelizer == remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer && this.RemoteActionCompatParcelizer == remoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        }

        public final int hashCode() {
            return (((((((((((((((this.AudioAttributesImplApi26Parcelizer.hashCode() * 31) + Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + this.read.hashCode()) * 31) + this.MediaBrowserCompatItemReceiver.hashCode()) * 31) + this.write.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer);
        }

        public final String toString() {
            String str = this.AudioAttributesImplApi26Parcelizer;
            int i = this.MediaBrowserCompatCustomActionResultReceiver;
            String str2 = this.read;
            String str3 = this.MediaBrowserCompatItemReceiver;
            String str4 = this.write;
            String str5 = this.AudioAttributesCompatParcelizer;
            String str6 = this.IconCompatParcelizer;
            int i2 = this.AudioAttributesImplApi21Parcelizer;
            boolean z = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("ContinueWatchingVideoSuggestion(thumbnailUrl=");
            sb.append(str);
            sb.append(", videoProgress=");
            sb.append(i);
            sb.append(", remainingTimeText=");
            sb.append(str2);
            sb.append(", title=");
            sb.append(str3);
            sb.append(", id=");
            sb.append(str4);
            sb.append(", rootSubjectId=");
            sb.append(str5);
            sb.append(", subjectId=");
            sb.append(str6);
            sb.append(", suggestionReason=");
            sb.append(i2);
            sb.append(", isLessonUnlocked=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }
    }

    public /* synthetic */ IntegrityManagerFactory(String str, String str2, String str3, String str4, int i, boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2, str3, str4, i, z);
    }

    public static final class IconCompatParcelizer extends IntegrityManagerFactory {
        private final String AudioAttributesCompatParcelizer;
        private final String AudioAttributesImplBaseParcelizer;
        private final String IconCompatParcelizer;
        private final int MediaBrowserCompatCustomActionResultReceiver;
        private final boolean RemoteActionCompatParcelizer;
        private final String read;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str, String str2, String str3, String str4, String str5, int i, boolean z) {
            super(str2, str3, str4, str5, i, z, null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(str4, "");
            toMagicModuleMetaRepoModel.write(str5, "");
            this.IconCompatParcelizer = str;
            this.AudioAttributesImplBaseParcelizer = str2;
            this.read = str3;
            this.write = str4;
            this.AudioAttributesCompatParcelizer = str5;
            this.MediaBrowserCompatCustomActionResultReceiver = i;
            this.RemoteActionCompatParcelizer = z;
        }

        public final String MediaBrowserCompatItemReceiver() {
            return this.IconCompatParcelizer;
        }

        @Override // kotlin.IntegrityManagerFactory
        /* JADX INFO: renamed from: write */
        public final String getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        @Override // kotlin.IntegrityManagerFactory
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
        public final String getRead() {
            return this.read;
        }

        @Override // kotlin.IntegrityManagerFactory
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
        public final String getIconCompatParcelizer() {
            return this.write;
        }

        @Override // kotlin.IntegrityManagerFactory
        /* JADX INFO: renamed from: IconCompatParcelizer */
        public final String getRemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // kotlin.IntegrityManagerFactory
        /* JADX INFO: renamed from: read */
        public final int getWrite() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        @Override // kotlin.IntegrityManagerFactory
        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver */
        public final boolean getAudioAttributesImplApi21Parcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) iconCompatParcelizer.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) iconCompatParcelizer.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) iconCompatParcelizer.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) iconCompatParcelizer.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) iconCompatParcelizer.AudioAttributesCompatParcelizer) && this.MediaBrowserCompatCustomActionResultReceiver == iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver && this.RemoteActionCompatParcelizer == iconCompatParcelizer.RemoteActionCompatParcelizer;
        }

        public final int hashCode() {
            return (((((((((((this.IconCompatParcelizer.hashCode() * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + this.write.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer);
        }

        public final String toString() {
            String str = this.IconCompatParcelizer;
            String str2 = this.AudioAttributesImplBaseParcelizer;
            String str3 = this.read;
            String str4 = this.write;
            String str5 = this.AudioAttributesCompatParcelizer;
            int i = this.MediaBrowserCompatCustomActionResultReceiver;
            boolean z = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("WatchNextVideoSuggestion(durationText=");
            sb.append(str);
            sb.append(", title=");
            sb.append(str2);
            sb.append(", id=");
            sb.append(str3);
            sb.append(", rootSubjectId=");
            sb.append(str4);
            sb.append(", subjectId=");
            sb.append(str5);
            sb.append(", suggestionReason=");
            sb.append(i);
            sb.append(", isLessonUnlocked=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }
    }
}
