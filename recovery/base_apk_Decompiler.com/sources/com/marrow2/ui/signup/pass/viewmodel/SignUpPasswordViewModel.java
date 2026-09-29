package com.marrow2.ui.signup.pass.viewmodel;

import kotlin.InterfaceC0211tileProvider;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.TileOverlay;
import kotlin.VerifyNewNumberRequest;
import kotlin.dispatchTouchEvent;
import kotlin.fadeIn;
import kotlin.getResolutionSize;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\b\u0010\u0016"}, d2 = {"Lcom/marrow2/ui/signup/pass/viewmodel/SignUpPasswordViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/POJOPropertyBuilder5;", "p0", "<init>", "(Lo/POJOPropertyBuilder5;)V", "Lo/TileOverlay;", "", "AudioAttributesCompatParcelizer", "(Lo/TileOverlay;)V", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)V", "Lo/POJOPropertyBuilder5;", "write", "Lo/getResolutionSize;", "Lo/fadeIn;", "Lo/getResolutionSize;", "IconCompatParcelizer", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "read", "()Lo/setUpdatedStatus;", "Lo/tileProvider;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SignUpPasswordViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<fadeIn> IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<InterfaceC0211tileProvider> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final POJOPropertyBuilder5 write;
    private final getResolutionSize<InterfaceC0211tileProvider> read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final setUpdatedStatus<fadeIn> RemoteActionCompatParcelizer;

    @setSdkPayload
    public SignUpPasswordViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        this.write = pOJOPropertyBuilder5;
        getResolutionSize<fadeIn> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new fadeIn(null, false, false, false, false, false, false, 127, null));
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<InterfaceC0211tileProvider> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(InterfaceC0211tileProvider.IconCompatParcelizer.INSTANCE);
        this.read = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
    }

    public final setUpdatedStatus<fadeIn> read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final setUpdatedStatus<InterfaceC0211tileProvider> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(TileOverlay p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TileOverlay.AudioAttributesCompatParcelizer.INSTANCE)) {
            String str = (String) this.write.write("email");
            this.read.write(new InterfaceC0211tileProvider.RemoteActionCompatParcelizer(str != null ? str : "", this.IconCompatParcelizer.IconCompatParcelizer().getRemoteActionCompatParcelizer()));
        } else {
            if (!(p0 instanceof TileOverlay.IconCompatParcelizer)) {
                throw new RenewEligibleCreator();
            }
            RemoteActionCompatParcelizer(((TileOverlay.IconCompatParcelizer) p0).RemoteActionCompatParcelizer());
        }
    }

    private final void RemoteActionCompatParcelizer(String p0) {
        boolean z = p0.length() >= 8;
        boolean zRemoteActionCompatParcelizer = dispatchTouchEvent.RemoteActionCompatParcelizer(p0, dispatchTouchEvent.IconCompatParcelizer);
        boolean zRemoteActionCompatParcelizer2 = dispatchTouchEvent.RemoteActionCompatParcelizer(p0, dispatchTouchEvent.RemoteActionCompatParcelizer);
        boolean zRemoteActionCompatParcelizer3 = dispatchTouchEvent.RemoteActionCompatParcelizer(p0, dispatchTouchEvent.AudioAttributesCompatParcelizer);
        boolean zRemoteActionCompatParcelizer4 = dispatchTouchEvent.RemoteActionCompatParcelizer(p0, dispatchTouchEvent.read);
        boolean z2 = z && zRemoteActionCompatParcelizer && zRemoteActionCompatParcelizer2 && zRemoteActionCompatParcelizer4 && zRemoteActionCompatParcelizer3;
        getResolutionSize<fadeIn> getresolutionsize = this.IconCompatParcelizer;
        getresolutionsize.IconCompatParcelizer();
        getresolutionsize.write(fadeIn.read(p0, z2, z, zRemoteActionCompatParcelizer, zRemoteActionCompatParcelizer2, zRemoteActionCompatParcelizer3, zRemoteActionCompatParcelizer4));
    }
}
