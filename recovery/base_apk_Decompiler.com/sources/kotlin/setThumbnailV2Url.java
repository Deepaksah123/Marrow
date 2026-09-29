package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setThumbnailV2Url extends isVideoPlanCtype {
    private final isVideoPlanCtype IconCompatParcelizer;
    private final isVideoPlanCtype read;

    @Override // kotlin.isVideoPlanCtype
    public final boolean read() {
        return false;
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        @getMagicModuleMeta
        public static isVideoPlanCtype write(isVideoPlanCtype isvideoplanctype, isVideoPlanCtype isvideoplanctype2) {
            toMagicModuleMetaRepoModel.write(isvideoplanctype, "");
            toMagicModuleMetaRepoModel.write(isvideoplanctype2, "");
            return isvideoplanctype.read() ? isvideoplanctype2 : isvideoplanctype2.read() ? isvideoplanctype : new setThumbnailV2Url(isvideoplanctype, isvideoplanctype2, (byte) 0);
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    private setThumbnailV2Url(isVideoPlanCtype isvideoplanctype, isVideoPlanCtype isvideoplanctype2) {
        this.read = isvideoplanctype;
        this.IconCompatParcelizer = isvideoplanctype2;
    }

    @Override // kotlin.isVideoPlanCtype
    public final setDefault IconCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        setDefault setdefaultIconCompatParcelizer = this.read.IconCompatParcelizer(getlink);
        return setdefaultIconCompatParcelizer == null ? this.IconCompatParcelizer.IconCompatParcelizer(getlink) : setdefaultIconCompatParcelizer;
    }

    @Override // kotlin.isVideoPlanCtype
    public final getLink RemoteActionCompatParcelizer(getLink getlink, getTotalSubject gettotalsubject) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        toMagicModuleMetaRepoModel.write(gettotalsubject, "");
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer(this.read.RemoteActionCompatParcelizer(getlink, gettotalsubject), gettotalsubject);
    }

    @Override // kotlin.isVideoPlanCtype
    public final boolean AudioAttributesCompatParcelizer() {
        return this.read.AudioAttributesCompatParcelizer() || this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.isVideoPlanCtype
    public final boolean write() {
        return this.read.write() || this.IconCompatParcelizer.write();
    }

    @Override // kotlin.isVideoPlanCtype
    public final getQuote read(getQuote getquote) {
        toMagicModuleMetaRepoModel.write(getquote, "");
        return this.IconCompatParcelizer.read(this.read.read(getquote));
    }

    static {
        new IconCompatParcelizer((byte) 0);
    }

    public /* synthetic */ setThumbnailV2Url(isVideoPlanCtype isvideoplanctype, isVideoPlanCtype isvideoplanctype2, byte b) {
        this(isvideoplanctype, isvideoplanctype2);
    }

    @getMagicModuleMeta
    public static final isVideoPlanCtype IconCompatParcelizer(isVideoPlanCtype isvideoplanctype, isVideoPlanCtype isvideoplanctype2) {
        return IconCompatParcelizer.write(isvideoplanctype, isvideoplanctype2);
    }
}
