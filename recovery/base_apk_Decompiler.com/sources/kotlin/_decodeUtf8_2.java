package kotlin;

import kotlin.Metadata;
import kotlin.createForPropertyOverride;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a1\u0010\u000f\u001a\u00020\u0003\"\b\b\u0000\u0010\f*\u00020\u000b*\u00028\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/_skipUtf8_3;", "Lo/_closeArrayScope;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/_skipUtf8_3;Lo/_closeArrayScope;)V", "Lo/_decodeUtf8_3;", "Lo/getReferencedType;", "", "IconCompatParcelizer", "(Lo/_decodeUtf8_3;J)Z", "Lo/createForPropertyOverride;", "T", "Lkotlin/Function1;", "Lo/createForPropertyOverride$write$IconCompatParcelizer;", "read", "(Lo/createForPropertyOverride;Lo/getAnswerMap;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _decodeUtf8_2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(_skipUtf8_3 _skiputf8_3, _closeArrayScope _closearrayscope) {
        _skiputf8_3.read(_closearrayscope);
        _skiputf8_3.AudioAttributesImplApi21Parcelizer(_closearrayscope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IconCompatParcelizer(_decodeUtf8_3 _decodeutf8_3, long j) {
        if (!_decodeutf8_3.getRead().getRatingCompat()) {
            return false;
        }
        isAbstract isabstractRemoteActionCompatParcelizer = collectLongDefaults.AudioAttributesImplApi26Parcelizer(_decodeutf8_3).RemoteActionCompatParcelizer();
        if (!isabstractRemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver()) {
            return false;
        }
        long jAudioAttributesCompatParcelizer = hasRawClass.AudioAttributesCompatParcelizer(isabstractRemoteActionCompatParcelizer);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jAudioAttributesCompatParcelizer >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) jAudioAttributesCompatParcelizer);
        float f = (int) (_decodeutf8_3.getAudioAttributesImplBaseParcelizer() >> 32);
        float f2 = (int) _decodeutf8_3.getAudioAttributesImplBaseParcelizer();
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat <= fIntBitsToFloat3 && fIntBitsToFloat3 <= f + fIntBitsToFloat) {
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) j);
            if (fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2 + fIntBitsToFloat2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends createForPropertyOverride> void read(T t, getAnswerMap<? super T, ? extends createForPropertyOverride.Companion.IconCompatParcelizer> getanswermap) {
        if (getanswermap.invoke(t) != createForPropertyOverride.Companion.IconCompatParcelizer.read) {
            return;
        }
        PropertyName.read((createForPropertyOverride) t, (getAnswerMap) getanswermap);
    }
}
