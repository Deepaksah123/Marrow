package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class isVideoPlanCtype {
    public static final isVideoPlanCtype write;

    public boolean AudioAttributesCompatParcelizer() {
        return false;
    }

    public abstract setDefault IconCompatParcelizer(getLink getlink);

    public boolean read() {
        return false;
    }

    public boolean write() {
        return false;
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public static final class RemoteActionCompatParcelizer extends isVideoPlanCtype {
        @Override // kotlin.isVideoPlanCtype
        public final boolean read() {
            return true;
        }

        RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.isVideoPlanCtype
        public final /* synthetic */ setDefault IconCompatParcelizer(getLink getlink) {
            RemoteActionCompatParcelizer(getlink);
            return null;
        }

        public final String toString() {
            return "Empty TypeSubstitution";
        }

        private static Void RemoteActionCompatParcelizer(getLink getlink) {
            toMagicModuleMetaRepoModel.write(getlink, "");
            return null;
        }
    }

    static {
        new IconCompatParcelizer((byte) 0);
        write = new RemoteActionCompatParcelizer();
    }

    public final setDesriptionList AudioAttributesImplBaseParcelizer() {
        setDesriptionList setdesriptionlistRemoteActionCompatParcelizer = setDesriptionList.RemoteActionCompatParcelizer(this);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setdesriptionlistRemoteActionCompatParcelizer, "");
        return setdesriptionlistRemoteActionCompatParcelizer;
    }

    public static final class read extends isVideoPlanCtype {
        @Override // kotlin.isVideoPlanCtype
        public final boolean AudioAttributesCompatParcelizer() {
            return false;
        }

        @Override // kotlin.isVideoPlanCtype
        public final boolean write() {
            return false;
        }

        read() {
        }

        @Override // kotlin.isVideoPlanCtype
        public final setDefault IconCompatParcelizer(getLink getlink) {
            toMagicModuleMetaRepoModel.write(getlink, "");
            return isVideoPlanCtype.this.IconCompatParcelizer(getlink);
        }

        @Override // kotlin.isVideoPlanCtype
        public final getQuote read(getQuote getquote) {
            toMagicModuleMetaRepoModel.write(getquote, "");
            return isVideoPlanCtype.this.read(getquote);
        }

        @Override // kotlin.isVideoPlanCtype
        public final getLink RemoteActionCompatParcelizer(getLink getlink, getTotalSubject gettotalsubject) {
            toMagicModuleMetaRepoModel.write(getlink, "");
            toMagicModuleMetaRepoModel.write(gettotalsubject, "");
            return isVideoPlanCtype.this.RemoteActionCompatParcelizer(getlink, gettotalsubject);
        }

        @Override // kotlin.isVideoPlanCtype
        public final boolean read() {
            return isVideoPlanCtype.this.read();
        }
    }

    public final isVideoPlanCtype MediaBrowserCompatCustomActionResultReceiver() {
        return new read();
    }

    public getQuote read(getQuote getquote) {
        toMagicModuleMetaRepoModel.write(getquote, "");
        return getquote;
    }

    public getLink RemoteActionCompatParcelizer(getLink getlink, getTotalSubject gettotalsubject) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        toMagicModuleMetaRepoModel.write(gettotalsubject, "");
        return getlink;
    }
}
