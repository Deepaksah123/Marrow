package kotlin;

import kotlin.Metadata;
import kotlin.buildCacheKey;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lo/getBounds;", "", "<init>", "()V", "write", "read", "RemoteActionCompatParcelizer", "Lo/getBounds$read;", "Lo/getBounds$write;", "Lo/getBounds$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class getBounds {

    public static final class write extends getBounds {
        private final boolean AudioAttributesCompatParcelizer;
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(String str, boolean z) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = str;
            this.AudioAttributesCompatParcelizer = z;
        }

        public final String read() {
            return this.read;
        }

        public final boolean write() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write writeVar = (write) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) writeVar.read) && this.AudioAttributesCompatParcelizer == writeVar.AudioAttributesCompatParcelizer;
        }

        public final int hashCode() {
            return (this.read.hashCode() * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
        }

        public final String toString() {
            String str = this.read;
            boolean z = this.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("HtmlRun(mergedBody=");
            sb.append(str);
            sb.append(", appendDummyReference=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }
    }

    private getBounds() {
    }

    public static final class read extends getBounds {
        private final buildCacheKey.IconCompatParcelizer write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(buildCacheKey.IconCompatParcelizer iconCompatParcelizer) {
            super(null);
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            this.write = iconCompatParcelizer;
        }

        public final buildCacheKey.IconCompatParcelizer IconCompatParcelizer() {
            return this.write;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, ((read) obj).write);
        }

        public final int hashCode() {
            return this.write.hashCode();
        }

        public final String toString() {
            buildCacheKey.IconCompatParcelizer iconCompatParcelizer = this.write;
            StringBuilder sb = new StringBuilder("Conditional(description=");
            sb.append(iconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }
    }

    public /* synthetic */ getBounds(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class RemoteActionCompatParcelizer extends getBounds {
        private final buildCacheKey.IconCompatParcelizer RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(buildCacheKey.IconCompatParcelizer iconCompatParcelizer) {
            super(null);
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            this.RemoteActionCompatParcelizer = iconCompatParcelizer;
        }

        public final buildCacheKey.IconCompatParcelizer IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ((RemoteActionCompatParcelizer) obj).RemoteActionCompatParcelizer);
        }

        public final int hashCode() {
            return this.RemoteActionCompatParcelizer.hashCode();
        }

        public final String toString() {
            buildCacheKey.IconCompatParcelizer iconCompatParcelizer = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("Image(description=");
            sb.append(iconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }
    }
}
