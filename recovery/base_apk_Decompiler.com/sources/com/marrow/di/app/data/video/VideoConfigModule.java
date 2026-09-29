package com.marrow.di.app.data.video;

import kotlin.BundledChunkExtractor;
import kotlin.DashChunkSourceFactory;
import kotlin.DashManifestStaleException;
import kotlin.DefaultDashChunkSourceFactory;
import kotlin.GTNudgeRequestModel;
import kotlin.Metadata;
import kotlin.exclude;
import kotlin.getMagicModuleMeta;
import kotlin.getPriorityCount;
import kotlin.selectBaseUrl;
import kotlin.setGateway;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateManifest;
import kotlin.updateTrackSelection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/marrow/di/app/data/video/VideoConfigModule;", "", "<init>", "()V", "Lo/DefaultDashChunkSourceFactory;", "p0", "Lo/BundledChunkExtractor;", "p1", "Lo/getPriorityCount;", "write", "(Lo/DefaultDashChunkSourceFactory;Lo/BundledChunkExtractor;)Lo/getPriorityCount;", "Lo/selectBaseUrl;", "Lo/updateTrackSelection;", "RemoteActionCompatParcelizer$1c4da2ac", "(Lo/selectBaseUrl;Ljava/lang/Object;)Lo/updateTrackSelection;", "Lo/DashManifestStaleException;", "read", "(Lo/getPriorityCount;Lo/updateTrackSelection;)Lo/DashManifestStaleException;", "Lo/GTNudgeRequestModel;", "IconCompatParcelizer", "(Lo/GTNudgeRequestModel;)Lo/selectBaseUrl;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VideoConfigModule {
    public static final VideoConfigModule INSTANCE = new VideoConfigModule();

    private VideoConfigModule() {
    }

    @getMagicModuleMeta
    public static final getPriorityCount write(DefaultDashChunkSourceFactory p0, BundledChunkExtractor p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new exclude(p0, p1);
    }

    @getMagicModuleMeta
    public static final updateTrackSelection RemoteActionCompatParcelizer$1c4da2ac(selectBaseUrl p0, Object p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new updateManifest(p0, p1);
    }

    @getMagicModuleMeta
    public static final DashManifestStaleException read(getPriorityCount p0, updateTrackSelection p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new DashChunkSourceFactory(p0, p1);
    }

    @getMagicModuleMeta
    public static final selectBaseUrl IconCompatParcelizer(@setGateway(IconCompatParcelizer = "v3.1") GTNudgeRequestModel p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Object obj = p0.read((Class<Object>) selectBaseUrl.class);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj, "");
        return (selectBaseUrl) obj;
    }
}
