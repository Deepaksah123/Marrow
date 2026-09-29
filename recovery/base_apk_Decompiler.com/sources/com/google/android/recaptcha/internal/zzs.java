package com.google.android.recaptcha.internal;

import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.getMagicModuleStats;
import kotlin.getShowPopup;
import kotlin.getYear;

/* JADX INFO: loaded from: classes3.dex */
final class zzs extends getMagicModuleStats implements MagicModuleSubmissionRequestBody {
    @Override // kotlin.MagicModuleSubmissionRequestBody
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new zzs((SampleVideos) obj2).invokeSuspend(getShowPopup.INSTANCE);
    }

    @Override // kotlin.getMonthName
    public final Object invokeSuspend(Object obj) {
        getYear.IconCompatParcelizer();
        SdkPayloadData.IconCompatParcelizer(obj);
        Thread.currentThread().setPriority(8);
        return getShowPopup.INSTANCE;
    }

    zzs(SampleVideos sampleVideos) {
        super(2, sampleVideos);
    }

    @Override // kotlin.getMonthName
    public final SampleVideos create(Object obj, SampleVideos sampleVideos) {
        return new zzs(sampleVideos);
    }
}
