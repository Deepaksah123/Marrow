package com.marrow2.ui.feedback.viewmodel;

import kotlin.ConnectionResult;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.VerifyNewNumberRequest;
import kotlin.getErrorResolutionPendingIntent;
import kotlin.getResolutionSize;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0007\u0010\u0010"}, d2 = {"Lcom/marrow2/ui/feedback/viewmodel/ThankYouForFeedbackViewModel;", "Lo/POJOPropertyBuilderWithMember;", "<init>", "()V", "Lo/ConnectionResult;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/ConnectionResult;)V", "Lo/getResolutionSize;", "Lo/getErrorResolutionPendingIntent;", "RemoteActionCompatParcelizer", "Lo/getResolutionSize;", "read", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ThankYouForFeedbackViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<getErrorResolutionPendingIntent> read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setUpdatedStatus<getErrorResolutionPendingIntent> AudioAttributesCompatParcelizer;

    @setSdkPayload
    public ThankYouForFeedbackViewModel() {
        getResolutionSize<getErrorResolutionPendingIntent> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new getErrorResolutionPendingIntent(false, false, 3, null));
        this.read = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getresolutionsizeRemoteActionCompatParcelizer.write(getErrorResolutionPendingIntent.AudioAttributesCompatParcelizer(true, getresolutionsizeRemoteActionCompatParcelizer.IconCompatParcelizer().RemoteActionCompatParcelizer));
    }

    public final setUpdatedStatus<getErrorResolutionPendingIntent> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(ConnectionResult p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, ConnectionResult.AudioAttributesCompatParcelizer.INSTANCE)) {
            throw new RenewEligibleCreator();
        }
        getResolutionSize<getErrorResolutionPendingIntent> getresolutionsize = this.read;
        getresolutionsize.IconCompatParcelizer();
        getresolutionsize.write(getErrorResolutionPendingIntent.AudioAttributesCompatParcelizer(false, true));
    }
}
