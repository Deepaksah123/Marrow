package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class isDefault {
    public static final boolean AudioAttributesCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        Preference preferenceMediaBrowserCompatMediaItem = getlink.MediaBrowserCompatMediaItem();
        setRootSubjectIds setrootsubjectids = preferenceMediaBrowserCompatMediaItem instanceof setRootSubjectIds ? (setRootSubjectIds) preferenceMediaBrowserCompatMediaItem : null;
        if (setrootsubjectids != null) {
            return setrootsubjectids.AudioAttributesCompatParcelizer();
        }
        return false;
    }

    public static final setRootSubjectIds RemoteActionCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        Preference preferenceMediaBrowserCompatMediaItem = getlink.MediaBrowserCompatMediaItem();
        setRootSubjectIds setrootsubjectids = preferenceMediaBrowserCompatMediaItem instanceof setRootSubjectIds ? (setRootSubjectIds) preferenceMediaBrowserCompatMediaItem : null;
        if (setrootsubjectids == null || !setrootsubjectids.AudioAttributesCompatParcelizer()) {
            return null;
        }
        return setrootsubjectids;
    }
}
