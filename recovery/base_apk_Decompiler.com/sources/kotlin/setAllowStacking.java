package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00062\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR,\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/setAllowStacking;", "Lo/setPrecomputedText;", "", "p0", "Lkotlin/Function2;", "Lo/getKey;", "Lo/SwitchCompat;", "p1", "<init>", "(ZLo/MagicModuleSubmissionRequestBody;)V", "RemoteActionCompatParcelizer", "(JJ)Lo/SwitchCompat;", "IconCompatParcelizer", "Z", "read", "()Z", "write", "Lo/MagicModuleSubmissionRequestBody;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setAllowStacking implements setPrecomputedText {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final MagicModuleSubmissionRequestBody<getKey, getKey, SwitchCompat<getKey>> RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public setAllowStacking(boolean z, MagicModuleSubmissionRequestBody<? super getKey, ? super getKey, ? extends SwitchCompat<getKey>> magicModuleSubmissionRequestBody) {
        this.read = z;
        this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody;
    }

    @Override // kotlin.setPrecomputedText
    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    @Override // kotlin.setPrecomputedText
    public final SwitchCompat<getKey> RemoteActionCompatParcelizer(long p0, long p1) {
        return this.RemoteActionCompatParcelizer.invoke(getKey.AudioAttributesCompatParcelizer(p0), getKey.AudioAttributesCompatParcelizer(p1));
    }
}
