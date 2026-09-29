package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getSchemaTitle {
    public abstract String AudioAttributesCompatParcelizer();

    public abstract String IconCompatParcelizer();

    public abstract String write();

    private getSchemaTitle() {
    }

    public static final class IconCompatParcelizer extends getSchemaTitle {
        private final String AudioAttributesCompatParcelizer;
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str, String str2) {
            super((byte) 0);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = str2;
        }

        @Override // kotlin.getSchemaTitle
        public final String AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.getSchemaTitle
        public final String write() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // kotlin.getSchemaTitle
        public final String IconCompatParcelizer() {
            StringBuilder sb = new StringBuilder();
            sb.append(AudioAttributesCompatParcelizer());
            sb.append(write());
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) iconCompatParcelizer.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) iconCompatParcelizer.AudioAttributesCompatParcelizer);
        }

        public final int hashCode() {
            return (this.RemoteActionCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode();
        }
    }

    public static final class write extends getSchemaTitle {
        private final String AudioAttributesCompatParcelizer;
        private final String IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(String str, String str2) {
            super((byte) 0);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.AudioAttributesCompatParcelizer = str;
            this.IconCompatParcelizer = str2;
        }

        @Override // kotlin.getSchemaTitle
        public final String AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // kotlin.getSchemaTitle
        public final String write() {
            return this.IconCompatParcelizer;
        }

        @Override // kotlin.getSchemaTitle
        public final String IconCompatParcelizer() {
            StringBuilder sb = new StringBuilder();
            sb.append(AudioAttributesCompatParcelizer());
            sb.append(':');
            sb.append(write());
            return sb.toString();
        }

        public final String RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String read() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write writeVar = (write) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) writeVar.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) writeVar.IconCompatParcelizer);
        }

        public final int hashCode() {
            return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.IconCompatParcelizer.hashCode();
        }
    }

    public final String toString() {
        return IconCompatParcelizer();
    }

    public /* synthetic */ getSchemaTitle(byte b) {
        this();
    }
}
