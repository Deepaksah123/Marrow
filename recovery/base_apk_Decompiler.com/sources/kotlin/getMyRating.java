package kotlin;

import kotlin.getSchemaTitle;
import kotlin.toHomeLessonIndex;

/* JADX INFO: loaded from: classes4.dex */
public final class getMyRating {
    public static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer(0);
    private final String read;

    private getMyRating(String str) {
        this.read = str;
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        @getMagicModuleMeta
        public static getMyRating write(setRatingCount setratingcount, toHomeLessonIndex.IconCompatParcelizer iconCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(setratingcount, "");
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            return write(setratingcount.AudioAttributesCompatParcelizer(iconCompatParcelizer.IconCompatParcelizer()), setratingcount.AudioAttributesCompatParcelizer(iconCompatParcelizer.AudioAttributesCompatParcelizer()));
        }

        @getMagicModuleMeta
        public static getMyRating write(String str, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return new getMyRating(sb.toString(), (byte) 0);
        }

        @getMagicModuleMeta
        public static getMyRating IconCompatParcelizer(String str, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('#');
            sb.append(str2);
            return new getMyRating(sb.toString(), (byte) 0);
        }

        @getMagicModuleMeta
        public static getMyRating read(getSchemaTitle getschematitle) {
            toMagicModuleMetaRepoModel.write(getschematitle, "");
            if (getschematitle instanceof getSchemaTitle.IconCompatParcelizer) {
                return write(getschematitle.AudioAttributesCompatParcelizer(), getschematitle.write());
            }
            if (getschematitle instanceof getSchemaTitle.write) {
                return IconCompatParcelizer(getschematitle.AudioAttributesCompatParcelizer(), getschematitle.write());
            }
            throw new RenewEligibleCreator();
        }

        @getMagicModuleMeta
        public static getMyRating RemoteActionCompatParcelizer(getMyRating getmyrating, int i) {
            toMagicModuleMetaRepoModel.write(getmyrating, "");
            StringBuilder sb = new StringBuilder();
            sb.append(getmyrating.IconCompatParcelizer());
            sb.append('@');
            sb.append(i);
            return new getMyRating(sb.toString(), (byte) 0);
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public /* synthetic */ getMyRating(String str, byte b) {
        this(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getMyRating) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) ((getMyRating) obj).read);
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MemberSignature(signature=");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }
}
