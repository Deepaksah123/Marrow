package kotlin;

import android.os.Build;
import android.text.StaticLayout;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/getProperties;", "Lo/setObjectIdReader;", "<init>", "()V", "Lo/setValueInstantiator;", "p0", "Landroid/text/StaticLayout;", "AudioAttributesCompatParcelizer", "(Lo/setValueInstantiator;)Landroid/text/StaticLayout;", "", "p1", "IconCompatParcelizer", "(Landroid/text/StaticLayout;Z)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getProperties implements setObjectIdReader {
    @Override // kotlin.setObjectIdReader
    public final StaticLayout AudioAttributesCompatParcelizer(setValueInstantiator p0) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(p0.getRead(), p0.getWrite(), p0.getRemoteActionCompatParcelizer(), p0.getIconCompatParcelizer(), p0.getAudioAttributesCompatParcelizer());
        builderObtain.setTextDirection(p0.getMediaBrowserCompatCustomActionResultReceiver());
        builderObtain.setAlignment(p0.getAudioAttributesImplApi21Parcelizer());
        builderObtain.setMaxLines(p0.getAudioAttributesImplApi26Parcelizer());
        builderObtain.setEllipsize(p0.getMediaBrowserCompatItemReceiver());
        builderObtain.setEllipsizedWidth(p0.getAudioAttributesImplBaseParcelizer());
        builderObtain.setLineSpacing(p0.getMediaDescriptionCompat(), p0.getMediaBrowserCompatMediaItem());
        builderObtain.setIncludePad(p0.getMediaBrowserCompatSearchResultReceiver());
        builderObtain.setBreakStrategy(p0.getOnCustomAction());
        builderObtain.setHyphenationFrequency(p0.getHandleMediaPlayPauseIfPendingOnHandler());
        builderObtain.setIndents(p0.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), p0.getOnPause());
        getInjectables.IconCompatParcelizer(builderObtain, p0.getRatingCompat());
        setAnySetter.IconCompatParcelizer(builderObtain, p0.getMediaMetadataCompat());
        if (Build.VERSION.SDK_INT >= 33) {
            setIgnoreUnknownProperties.write(builderObtain, p0.getOnAddQueueItem(), p0.getOnCommand());
        }
        if (Build.VERSION.SDK_INT >= 35) {
            BeanDeserializerFactory.write(builderObtain);
        }
        return builderObtain.build();
    }

    @Override // kotlin.setObjectIdReader
    public final boolean IconCompatParcelizer(StaticLayout p0, boolean p1) {
        return Build.VERSION.SDK_INT >= 33 ? setIgnoreUnknownProperties.AudioAttributesCompatParcelizer(p0) : p1;
    }
}
