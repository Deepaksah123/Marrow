package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/resetFloat;", "", "Lo/_matchNull;", "p0", "", "p1", "Lo/convertNumberToLong;", "p2", "<init>", "(Lo/_matchNull;ZLo/convertNumberToLong;)V", "IconCompatParcelizer", "()Lo/_matchNull;", "AudioAttributesCompatParcelizer", "Lo/_matchNull;", "RemoteActionCompatParcelizer", "write", "Z", "read", "Lo/convertNumberToLong;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class resetFloat {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public _matchNull RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final convertNumberToLong AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public boolean read;

    public resetFloat(_matchNull _matchnull, boolean z, convertNumberToLong convertnumbertolong) {
        this.RemoteActionCompatParcelizer = _matchnull;
        this.read = z;
        this.AudioAttributesCompatParcelizer = convertnumbertolong;
    }

    public /* synthetic */ resetFloat(_matchNull _matchnull, boolean z, convertNumberToLong convertnumbertolong, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : _matchnull, (i & 2) != 0 ? false : z, convertnumbertolong);
    }

    public final _matchNull IconCompatParcelizer() {
        if (this.read) {
            return this.RemoteActionCompatParcelizer;
        }
        resetFloat resetfloatMediaMetadataCompat = this.AudioAttributesCompatParcelizer.MediaMetadataCompat();
        _matchNull _matchnull = resetfloatMediaMetadataCompat != null ? resetfloatMediaMetadataCompat.RemoteActionCompatParcelizer : null;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_matchnull, this.RemoteActionCompatParcelizer)) {
            this.RemoteActionCompatParcelizer = _matchnull;
        }
        return _matchnull;
    }
}
