package com.google.android.datatransport.cct;

import kotlin.FrameworkMediaDrmApi31;
import kotlin.adjustUuid;
import kotlin.lambdasetOnEventListener1comgoogleandroidexoplayer2drmFrameworkMediaDrm;
import kotlin.mediaDrmStateExceptionToErrorCode;

/* JADX INFO: loaded from: classes4.dex */
public class CctBackendFactory implements adjustUuid {
    @Override // kotlin.adjustUuid
    public FrameworkMediaDrmApi31 create(lambdasetOnEventListener1comgoogleandroidexoplayer2drmFrameworkMediaDrm lambdasetoneventlistener1comgoogleandroidexoplayer2drmframeworkmediadrm) {
        return new mediaDrmStateExceptionToErrorCode(lambdasetoneventlistener1comgoogleandroidexoplayer2drmframeworkmediadrm.RemoteActionCompatParcelizer(), lambdasetoneventlistener1comgoogleandroidexoplayer2drmframeworkmediadrm.read(), lambdasetoneventlistener1comgoogleandroidexoplayer2drmframeworkmediadrm.AudioAttributesCompatParcelizer());
    }
}
