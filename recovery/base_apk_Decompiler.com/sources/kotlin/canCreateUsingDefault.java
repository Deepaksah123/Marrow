package kotlin;

import android.graphics.Matrix;
import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aQ\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aQ\u0010\u0012\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011"}, d2 = {"Lo/_checkImplicitlyNamedConstructors;", "Lo/JsonParserDelegate;", "p0", "Lo/Instantiatable;", "p1", "", "p2", "Lo/nopInstance;", "p3", "Lo/renameAll;", "p4", "Lo/findViews;", "p5", "Lo/createInstance;", "p6", "", "AudioAttributesCompatParcelizer", "(Lo/_checkImplicitlyNamedConstructors;Lo/JsonParserDelegate;Lo/Instantiatable;FLo/nopInstance;Lo/renameAll;Lo/findViews;I)V", "write"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class canCreateUsingDefault {
    public static final void AudioAttributesCompatParcelizer(_checkImplicitlyNamedConstructors _checkimplicitlynamedconstructors, JsonParserDelegate jsonParserDelegate, Instantiatable instantiatable, float f, nopInstance nopinstance, renameAll renameall, findViews findviews, int i) {
        jsonParserDelegate.IconCompatParcelizer();
        if (_checkimplicitlynamedconstructors.MediaBrowserCompatItemReceiver().size() <= 1 || (instantiatable instanceof _hasOneOf)) {
            write(_checkimplicitlynamedconstructors, jsonParserDelegate, instantiatable, f, nopinstance, renameall, findviews, i);
        } else {
            if (!(instantiatable instanceof throwInternal)) {
                throw new RenewEligibleCreator();
            }
            List<_findCustomArrayDeserializer> listMediaBrowserCompatItemReceiver = _checkimplicitlynamedconstructors.MediaBrowserCompatItemReceiver();
            int size = listMediaBrowserCompatItemReceiver.size();
            float fMax = 0.0f;
            float f2 = 0.0f;
            for (int i2 = 0; i2 < size; i2++) {
                _findCustomArrayDeserializer _findcustomarraydeserializer = listMediaBrowserCompatItemReceiver.get(i2);
                f2 += _findcustomarraydeserializer.getAudioAttributesCompatParcelizer().read();
                fMax = Math.max(fMax, _findcustomarraydeserializer.getAudioAttributesCompatParcelizer().MediaBrowserCompatItemReceiver());
            }
            long j = -1;
            Shader shaderIconCompatParcelizer = ((throwInternal) instantiatable).IconCompatParcelizer(calloc.write((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(f2)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))));
            Matrix matrix = new Matrix();
            shaderIconCompatParcelizer.getLocalMatrix(matrix);
            List<_findCustomArrayDeserializer> listMediaBrowserCompatItemReceiver2 = _checkimplicitlynamedconstructors.MediaBrowserCompatItemReceiver();
            int size2 = listMediaBrowserCompatItemReceiver2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                _findCustomArrayDeserializer _findcustomarraydeserializer2 = listMediaBrowserCompatItemReceiver2.get(i3);
                _findcustomarraydeserializer2.getAudioAttributesCompatParcelizer().read(jsonParserDelegate, InternCache.IconCompatParcelizer(shaderIconCompatParcelizer), f, nopinstance, renameall, findviews, i);
                jsonParserDelegate.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, _findcustomarraydeserializer2.getAudioAttributesCompatParcelizer().read());
                matrix.setTranslate(BitmapDescriptorFactory.HUE_RED, -_findcustomarraydeserializer2.getAudioAttributesCompatParcelizer().read());
                shaderIconCompatParcelizer.setLocalMatrix(matrix);
            }
        }
        jsonParserDelegate.AudioAttributesCompatParcelizer();
    }

    private static final void write(_checkImplicitlyNamedConstructors _checkimplicitlynamedconstructors, JsonParserDelegate jsonParserDelegate, Instantiatable instantiatable, float f, nopInstance nopinstance, renameAll renameall, findViews findviews, int i) {
        List<_findCustomArrayDeserializer> listMediaBrowserCompatItemReceiver = _checkimplicitlynamedconstructors.MediaBrowserCompatItemReceiver();
        int size = listMediaBrowserCompatItemReceiver.size();
        for (int i2 = 0; i2 < size; i2++) {
            _findCustomArrayDeserializer _findcustomarraydeserializer = listMediaBrowserCompatItemReceiver.get(i2);
            _findcustomarraydeserializer.getAudioAttributesCompatParcelizer().read(jsonParserDelegate, instantiatable, f, nopinstance, renameall, findviews, i);
            jsonParserDelegate.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, _findcustomarraydeserializer.getAudioAttributesCompatParcelizer().read());
        }
    }
}
