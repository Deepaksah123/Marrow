package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H¦@¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H¦@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/performClickableSpanAction;", "Lo/CoordinatorLayout;", "Lo/checkSelfPermission;", "", "p0", "Lkotlin/Function1;", "", "p1", "write", "(Lo/checkSelfPermission;FLo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "(Lo/checkSelfPermission;FLo/SampleVideos;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface performClickableSpanAction extends CoordinatorLayout {
    Object write(checkSelfPermission checkselfpermission, float f, getAnswerMap<? super Float, getShowPopup> getanswermap, SampleVideos<? super Float> sampleVideos);

    static /* synthetic */ Object IconCompatParcelizer(performClickableSpanAction performclickablespanaction, checkSelfPermission checkselfpermission, float f, SampleVideos<? super Float> sampleVideos) {
        return performclickablespanaction.write(checkselfpermission, f, C0207startForegroundService.IconCompatParcelizer, sampleVideos);
    }

    @Override // kotlin.CoordinatorLayout
    default Object AudioAttributesCompatParcelizer(checkSelfPermission checkselfpermission, float f, SampleVideos<? super Float> sampleVideos) {
        return IconCompatParcelizer(this, checkselfpermission, f, sampleVideos);
    }
}
