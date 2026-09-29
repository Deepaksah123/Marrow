package kotlin;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0017R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/KeyDeserializer;", "Lo/isTypeOrSuperTypeOf;", "", "MediaBrowserCompatCustomActionResultReceiver", "()V", "", "Lo/weirdNumberException;", "", "RemoteActionCompatParcelizer", "()Ljava/util/Map;", "Lkotlin/Function1;", "p0", "IconCompatParcelizer", "(Lo/getAnswerMap;)V", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi26Parcelizer", "()I", "AudioAttributesCompatParcelizer", "Lo/_bindAndClose;", "write", "()Lo/_bindAndClose;", "Lo/properties;", "()Lo/properties;", "()Lo/KeyDeserializer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface KeyDeserializer extends isTypeOrSuperTypeOf {
    KeyDeserializer AudioAttributesCompatParcelizer();

    void AudioAttributesImplApi21Parcelizer();

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer */
    int getAudioAttributesImplBaseParcelizer();

    /* JADX INFO: renamed from: IconCompatParcelizer */
    properties getOnPause();

    void IconCompatParcelizer(getAnswerMap<? super KeyDeserializer, getShowPopup> p0);

    void MediaBrowserCompatCustomActionResultReceiver();

    void MediaBrowserCompatItemReceiver();

    Map<weirdNumberException, Integer> RemoteActionCompatParcelizer();

    _bindAndClose write();
}
