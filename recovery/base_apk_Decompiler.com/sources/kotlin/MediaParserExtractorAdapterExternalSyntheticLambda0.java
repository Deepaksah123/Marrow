package kotlin;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Glide;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaParserExtractorAdapterExternalSyntheticLambda0 extends ForwardingPlayer {
    public MediaParserExtractorAdapterExternalSyntheticLambda0(Glide glide, setRendererOffset setrendereroffset, copyWithRequestedContentPositionUs copywithrequestedcontentpositionus, Context context) {
        super(glide, setrendereroffset, copywithrequestedcontentpositionus, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.ForwardingPlayer
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public <ResourceType> createWithPlaceholderTimeline<ResourceType> read(Class<ResourceType> cls) {
        return new createWithPlaceholderTimeline<>(this.write, this, cls, this.read);
    }

    @Override // kotlin.ForwardingPlayer
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] */
    public final createWithPlaceholderTimeline<Bitmap> RemoteActionCompatParcelizer() {
        return (createWithPlaceholderTimeline) super.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.ForwardingPlayer
    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: merged with bridge method [inline-methods] */
    public final createWithPlaceholderTimeline<setYear> AudioAttributesCompatParcelizer() {
        return (createWithPlaceholderTimeline) super.AudioAttributesCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.ForwardingPlayer
    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: merged with bridge method [inline-methods] */
    public createWithPlaceholderTimeline<Drawable> read() {
        return (createWithPlaceholderTimeline) super.read();
    }

    @Override // kotlin.ForwardingPlayer
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final createWithPlaceholderTimeline<Drawable> RemoteActionCompatParcelizer(String str) {
        return (createWithPlaceholderTimeline) super.RemoteActionCompatParcelizer(str);
    }

    @Override // kotlin.ForwardingPlayer
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final createWithPlaceholderTimeline<Drawable> IconCompatParcelizer(Integer num) {
        return (createWithPlaceholderTimeline) super.IconCompatParcelizer(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.ForwardingPlayer
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public createWithPlaceholderTimeline<Drawable> IconCompatParcelizer(Object obj) {
        return (createWithPlaceholderTimeline) super.IconCompatParcelizer(obj);
    }

    @Override // kotlin.ForwardingPlayer
    public final void read(getPlayingPeriod getplayingperiod) {
        if (getplayingperiod instanceof MaskingMediaSourceMaskingTimeline) {
            super.read(getplayingperiod);
        } else {
            super.read((getPlayingPeriod) new MaskingMediaSourceMaskingTimeline().AudioAttributesCompatParcelizer(getplayingperiod));
        }
    }
}
