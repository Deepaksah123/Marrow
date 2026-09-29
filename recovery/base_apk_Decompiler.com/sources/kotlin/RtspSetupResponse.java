package kotlin;

import kotlin.MediaBrowserCompatMediaItem;
import kotlin.Metadata;
import kotlin.getApplicationLabel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\n\b\u0001\u0010\u0004 \u0001*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B9\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013"}, d2 = {"Lo/RtspSetupResponse;", "Lo/MediaBrowserCompatMediaItem;", "A", "Lo/getApplicationLabel;", "T", "Lo/addMediaDescription;", "Lkotlin/Function1;", "", "p0", "", "p1", "p2", "<init>", "(Lo/getAnswerMap;ZLo/getAnswerMap;)V", "Lo/hasGetter;", "write", "(Lo/MediaBrowserCompatMediaItem;)Lo/hasGetter;", "read", "(Lo/MediaBrowserCompatMediaItem;)Z", "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class RtspSetupResponse<A extends MediaBrowserCompatMediaItem, T extends getApplicationLabel> extends addMediaDescription<A, T> {
    private final boolean read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private RtspSetupResponse(getAnswerMap<? super T, getShowPopup> getanswermap, boolean z, getAnswerMap<? super A, ? extends T> getanswermap2) {
        super(getanswermap2, getanswermap);
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        this.read = z;
    }

    @Override // kotlin.addMediaDescription
    public final /* synthetic */ hasGetter AudioAttributesCompatParcelizer(Object obj) {
        return write((MediaBrowserCompatMediaItem) obj);
    }

    public /* synthetic */ RtspSetupResponse(getAnswerMap getanswermap, boolean z, getAnswerMap getanswermap2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(getanswermap, (i & 2) != 0 ? true : z, getanswermap2);
    }

    private static hasGetter write(A p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.addMediaDescription
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public boolean RemoteActionCompatParcelizer(A p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (this.read && p0.getWindow() == null) ? false : true;
    }
}
