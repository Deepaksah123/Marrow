package com.marrow2.ui.signup.college.college_confirmation.viewmodel;

import kotlin.IntermediateLoginResponseBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.VerifyNewNumberRequest;
import kotlin.enablePanning;
import kotlin.enableStreetNames;
import kotlin.getInfoWindowAnchorV;
import kotlin.getResolutionSize;
import kotlin.isSeekPending;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00120\u00158\u0007¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018"}, d2 = {"Lcom/marrow2/ui/signup/college/college_confirmation/viewmodel/SignUpSelectedCollegeViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/isSeekPending;", "p0", "<init>", "(Lo/isSeekPending;)V", "", "p1", "", "write", "(Ljava/lang/String;Ljava/lang/String;)V", "Lo/enableStreetNames;", "read", "(Lo/enableStreetNames;)V", "IconCompatParcelizer", "Lo/isSeekPending;", "AudioAttributesCompatParcelizer", "Lo/getResolutionSize;", "Lo/enablePanning;", "Lo/getResolutionSize;", "RemoteActionCompatParcelizer", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SignUpSelectedCollegeViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private String read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setUpdatedStatus<enablePanning> IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<enablePanning> RemoteActionCompatParcelizer;

    @setSdkPayload
    public SignUpSelectedCollegeViewModel(isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.AudioAttributesCompatParcelizer = isseekpending;
        getResolutionSize<enablePanning> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(enablePanning.read.INSTANCE);
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.IconCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        this.read = "";
    }

    public final setUpdatedStatus<enablePanning> IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void write(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        this.read = p0;
        this.RemoteActionCompatParcelizer.write(new enablePanning.AudioAttributesCompatParcelizer(p1));
    }

    public final void read(enableStreetNames p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, enableStreetNames.read.INSTANCE)) {
            isSeekPending isseekpending = this.AudioAttributesCompatParcelizer;
            getInfoWindowAnchorV getinfowindowanchorv = getInfoWindowAnchorV.INSTANCE;
            isseekpending.write(getInfoWindowAnchorV.RemoteActionCompatParcelizer(this.read), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.RemoteActionCompatParcelizer.write(enablePanning.IconCompatParcelizer.INSTANCE);
            return;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, enableStreetNames.IconCompatParcelizer.INSTANCE)) {
            throw new RenewEligibleCreator();
        }
        this.RemoteActionCompatParcelizer.write(enablePanning.read.INSTANCE);
    }
}
