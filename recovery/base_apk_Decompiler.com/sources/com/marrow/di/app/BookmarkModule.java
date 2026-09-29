package com.marrow.di.app;

import kotlin.BaseMediaChunkOutput;
import kotlin.BundledChunkExtractorExternalSyntheticLambda0;
import kotlin.GTNudgeRequestModel;
import kotlin.Metadata;
import kotlin.SingleSampleMediaPeriod1;
import kotlin.bytesLoaded;
import kotlin.checkInBounds;
import kotlin.createEmptyAdGroups;
import kotlin.getPlanOldPrice;
import kotlin.setGateway;
import kotlin.setManifestParser;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/marrow/di/app/BookmarkModule;", "", "<init>", "()V", "Lo/GTNudgeRequestModel;", "p0", "Lo/SingleSampleMediaPeriod1;", "read", "(Lo/GTNudgeRequestModel;)Lo/SingleSampleMediaPeriod1;", "Lo/BundledChunkExtractorExternalSyntheticLambda0;", "Lo/createEmptyAdGroups;", "p1", "Lo/setManifestParser;", "p2", "Lo/bytesLoaded;", "write", "(Lo/BundledChunkExtractorExternalSyntheticLambda0;Lo/createEmptyAdGroups;Lo/setManifestParser;)Lo/bytesLoaded;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BookmarkModule {
    public static final BookmarkModule INSTANCE = new BookmarkModule();

    private BookmarkModule() {
    }

    public final SingleSampleMediaPeriod1 read(@setGateway(IconCompatParcelizer = "v3.1") GTNudgeRequestModel p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Object obj = p0.read((Class<Object>) SingleSampleMediaPeriod1.class);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj, "");
        return (SingleSampleMediaPeriod1) obj;
    }

    @getPlanOldPrice
    public final bytesLoaded write(BundledChunkExtractorExternalSyntheticLambda0 p0, createEmptyAdGroups p1, setManifestParser p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new BaseMediaChunkOutput(new checkInBounds(p0, p1, p2));
    }
}
