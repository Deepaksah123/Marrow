package com.marrow2.ui.video.landing.epoxy_rv;

import com.airbnb.epoxy.TypedEpoxyController;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.ClockFaceView;
import kotlin.Metadata;
import kotlin.proceedNonBlocking;
import kotlin.setCursorVisible;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/marrow2/ui/video/landing/epoxy_rv/VideoSubjectsModelController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "Lo/proceedNonBlocking;", "Lo/setCursorVisible$AudioAttributesCompatParcelizer;", "p0", "<init>", "(Lo/setCursorVisible$AudioAttributesCompatParcelizer;)V", "", "buildModels", "(Ljava/util/List;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lo/setCursorVisible$AudioAttributesCompatParcelizer;", "getListener", "()Lo/setCursorVisible$AudioAttributesCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VideoSubjectsModelController extends TypedEpoxyController<List<? extends proceedNonBlocking>> {
    public static final int $stable = 8;
    private final setCursorVisible.AudioAttributesCompatParcelizer listener;

    public VideoSubjectsModelController(setCursorVisible.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        this.listener = audioAttributesCompatParcelizer;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public final /* bridge */ /* synthetic */ void buildModels(List<? extends proceedNonBlocking> list) {
        buildModels2((List<proceedNonBlocking>) list);
    }

    public final setCursorVisible.AudioAttributesCompatParcelizer getListener() {
        return this.listener;
    }

    /* JADX INFO: renamed from: buildModels, reason: avoid collision after fix types in other method */
    protected final void buildModels2(List<proceedNonBlocking> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        for (proceedNonBlocking proceednonblocking : p0) {
            ClockFaceView clockFaceView = new ClockFaceView();
            ClockFaceView clockFaceView2 = clockFaceView;
            clockFaceView2.write(proceednonblocking.getRemoteActionCompatParcelizer());
            clockFaceView2.write(proceednonblocking);
            clockFaceView2.read(this.listener);
            add(clockFaceView);
        }
    }
}
