package kotlin;

import kotlin.VisibilityChecker;

/* JADX INFO: loaded from: classes2.dex */
public final class defaultInstance {
    private final hasMixIns AudioAttributesCompatParcelizer;
    private final VisibilityChecker.RemoteActionCompatParcelizer IconCompatParcelizer;
    private final JDK14UtilRecordAccessor RemoteActionCompatParcelizer;
    private final withFieldVisibility write;

    public defaultInstance(hasMixIns hasmixins, VisibilityChecker.RemoteActionCompatParcelizer remoteActionCompatParcelizer, withFieldVisibility withfieldvisibility) {
        toMagicModuleMetaRepoModel.write(hasmixins, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(withfieldvisibility, "");
        this.AudioAttributesCompatParcelizer = hasmixins;
        this.IconCompatParcelizer = remoteActionCompatParcelizer;
        this.write = withfieldvisibility;
        this.RemoteActionCompatParcelizer = new JDK14UtilRecordAccessor();
    }

    public static /* synthetic */ POJOPropertyBuilderWithMember IconCompatParcelizer(defaultInstance defaultinstance, isHdPlaybackError ishdplaybackerror) {
        itemsFormat itemsformat = itemsFormat.INSTANCE;
        return defaultinstance.IconCompatParcelizer(ishdplaybackerror, itemsFormat.AudioAttributesCompatParcelizer(ishdplaybackerror));
    }

    public final <T extends POJOPropertyBuilderWithMember> T IconCompatParcelizer(isHdPlaybackError<T> ishdplaybackerror, String str) {
        T t;
        toMagicModuleMetaRepoModel.write(ishdplaybackerror, "");
        toMagicModuleMetaRepoModel.write(str, "");
        synchronized (this.RemoteActionCompatParcelizer) {
            t = (T) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(str);
            if (ishdplaybackerror.AudioAttributesCompatParcelizer(t)) {
                if (this.IconCompatParcelizer instanceof VisibilityChecker.IconCompatParcelizer) {
                    VisibilityChecker.IconCompatParcelizer iconCompatParcelizer = (VisibilityChecker.IconCompatParcelizer) this.IconCompatParcelizer;
                    toMagicModuleMetaRepoModel.write(t);
                    iconCompatParcelizer.AudioAttributesCompatParcelizer(t);
                }
                toMagicModuleMetaRepoModel.read(t, "");
            } else {
                _defaultOrOverride _defaultoroverride = new _defaultOrOverride(this.write);
                _defaultoroverride.AudioAttributesCompatParcelizer(VisibilityChecker.IconCompatParcelizer, str);
                t = (T) allPublicInstance.read(this.IconCompatParcelizer, ishdplaybackerror, _defaultoroverride);
                this.AudioAttributesCompatParcelizer.read(str, t);
            }
        }
        return t;
    }
}
