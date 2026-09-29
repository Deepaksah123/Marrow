package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lo/registerDeadlineEvent;", "", "<init>", "()V", "write", "RemoteActionCompatParcelizer", "Lo/registerDeadlineEvent$write;", "Lo/registerDeadlineEvent$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class registerDeadlineEvent {

    public static final class write extends registerDeadlineEvent {
        private final String IconCompatParcelizer;
        private final int RemoteActionCompatParcelizer;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(String str, String str2, int i) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.write = str;
            this.IconCompatParcelizer = str2;
            this.RemoteActionCompatParcelizer = i;
        }

        public final int IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String read() {
            return this.write;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write writeVar = (write) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) writeVar.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) writeVar.IconCompatParcelizer) && this.RemoteActionCompatParcelizer == writeVar.RemoteActionCompatParcelizer;
        }

        public final int hashCode() {
            return (((this.write.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer);
        }

        public final String toString() {
            String str = this.write;
            String str2 = this.IconCompatParcelizer;
            int i = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("Header(id=");
            sb.append(str);
            sb.append(", title=");
            sb.append(str2);
            sb.append(", count=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }
    }

    private registerDeadlineEvent() {
    }

    public static final class RemoteActionCompatParcelizer extends registerDeadlineEvent {
        private int AudioAttributesCompatParcelizer;
        private String AudioAttributesImplBaseParcelizer;
        private final String IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private final String read;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str, String str2, String str3, String str4, int i, String str5) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(str4, "");
            toMagicModuleMetaRepoModel.write(str5, "");
            this.write = str;
            this.read = str2;
            this.IconCompatParcelizer = str3;
            this.RemoteActionCompatParcelizer = str4;
            this.AudioAttributesCompatParcelizer = i;
            this.AudioAttributesImplBaseParcelizer = str5;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.write;
        }

        public final String read() {
            return this.read;
        }

        public final String IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final void AudioAttributesCompatParcelizer(int i) {
            this.AudioAttributesCompatParcelizer = i;
        }

        public final int MediaBrowserCompatCustomActionResultReceiver() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String write() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) remoteActionCompatParcelizer.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) remoteActionCompatParcelizer.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) remoteActionCompatParcelizer.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) remoteActionCompatParcelizer.RemoteActionCompatParcelizer) && this.AudioAttributesCompatParcelizer == remoteActionCompatParcelizer.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer);
        }

        public final int hashCode() {
            return (((((((((this.write.hashCode() * 31) + this.read.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode();
        }

        public final String toString() {
            String str = this.write;
            String str2 = this.read;
            String str3 = this.IconCompatParcelizer;
            String str4 = this.RemoteActionCompatParcelizer;
            int i = this.AudioAttributesCompatParcelizer;
            String str5 = this.AudioAttributesImplBaseParcelizer;
            StringBuilder sb = new StringBuilder("Pearl(subjectId=");
            sb.append(str);
            sb.append(", pearlId=");
            sb.append(str2);
            sb.append(", pearlDisplayId=");
            sb.append(str3);
            sb.append(", pearlTitle=");
            sb.append(str4);
            sb.append(", isBookmarked=");
            sb.append(i);
            sb.append(", subjectTitle=");
            sb.append(str5);
            sb.append(")");
            return sb.toString();
        }
    }

    public /* synthetic */ registerDeadlineEvent(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }
}
