package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lo/getEditedValues;", "", "<init>", "()V", "read", "IconCompatParcelizer", "Lo/getEditedValues$read;", "Lo/getEditedValues$IconCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class getEditedValues {

    public static final class read extends getEditedValues {
        private final String AudioAttributesCompatParcelizer;
        private final int IconCompatParcelizer;
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str, String str2, int i) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.AudioAttributesCompatParcelizer = str;
            this.read = str2;
            this.IconCompatParcelizer = i;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String write() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read readVar = (read) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) readVar.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) readVar.read) && this.IconCompatParcelizer == readVar.IconCompatParcelizer;
        }

        public final int hashCode() {
            return (((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + Integer.hashCode(this.IconCompatParcelizer);
        }

        public final String toString() {
            String str = this.AudioAttributesCompatParcelizer;
            String str2 = this.read;
            int i = this.IconCompatParcelizer;
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

    private getEditedValues() {
    }

    public static final class IconCompatParcelizer extends getEditedValues {
        private final String AudioAttributesCompatParcelizer;
        private final String IconCompatParcelizer;
        private final String MediaBrowserCompatItemReceiver;
        private final String RemoteActionCompatParcelizer;
        private final String read;
        private final int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str, String str2, String str3, String str4, int i, String str5) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(str4, "");
            toMagicModuleMetaRepoModel.write(str5, "");
            this.IconCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = str2;
            this.AudioAttributesCompatParcelizer = str3;
            this.read = str4;
            this.write = i;
            this.MediaBrowserCompatItemReceiver = str5;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String IconCompatParcelizer() {
            return this.read;
        }

        public final int MediaBrowserCompatCustomActionResultReceiver() {
            return this.write;
        }

        public final String write() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) iconCompatParcelizer.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) iconCompatParcelizer.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) iconCompatParcelizer.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) iconCompatParcelizer.read) && this.write == iconCompatParcelizer.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) iconCompatParcelizer.MediaBrowserCompatItemReceiver);
        }

        public final int hashCode() {
            return (((((((((this.IconCompatParcelizer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + Integer.hashCode(this.write)) * 31) + this.MediaBrowserCompatItemReceiver.hashCode();
        }

        public final String toString() {
            String str = this.IconCompatParcelizer;
            String str2 = this.RemoteActionCompatParcelizer;
            String str3 = this.AudioAttributesCompatParcelizer;
            String str4 = this.read;
            int i = this.write;
            String str5 = this.MediaBrowserCompatItemReceiver;
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

    public /* synthetic */ getEditedValues(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }
}
