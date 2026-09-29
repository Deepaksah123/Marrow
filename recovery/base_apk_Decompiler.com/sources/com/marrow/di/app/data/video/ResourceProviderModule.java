package com.marrow.di.app.data.video;

import com.marrow.data.models.content.VideoInfo;
import com.marrow.data.models.content.VideoInfo.JsonParser;
import kotlin.Metadata;
import kotlin.parseLastSegmentNumberSupplementalProperty;
import kotlin.sendTeardownRequest;
import kotlin.setGateway;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow/di/app/data/video/ResourceProviderModule;", "", "<init>", "()V", "Lo/sendTeardownRequest;", "p0", "Lcom/marrow/data/models/content/VideoInfo;", "write", "(Lo/sendTeardownRequest;)Lcom/marrow/data/models/content/VideoInfo;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ResourceProviderModule {
    public static final ResourceProviderModule INSTANCE = new ResourceProviderModule();

    private ResourceProviderModule() {
    }

    @setGateway(IconCompatParcelizer = "VideoContract_video_info")
    public final VideoInfo write(sendTeardownRequest p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String str = p0.read("VideoContract_video_info");
        VideoInfo videoInfo = new VideoInfo();
        videoInfo.new JsonParser().fromJSON(parseLastSegmentNumberSupplementalProperty.AudioAttributesCompatParcelizer(str));
        return videoInfo;
    }
}
