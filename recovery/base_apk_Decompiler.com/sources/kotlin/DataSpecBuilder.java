package kotlin;

import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.audio.WavUtil;
import kotlin.AbstractDeserializer;

/* JADX INFO: loaded from: classes3.dex */
public final class DataSpecBuilder {
    public static final String write(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str2, "");
        String str3 = str;
        return (str3 == null || str3.length() == 0) ? str2 : str;
    }

    public static final AbstractDeserializer write(CharSequence charSequence) {
        _findPropertyUnwrapper _findpropertyunwrapper;
        toMagicModuleMetaRepoModel.write(charSequence, "");
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned == null) {
            return new AbstractDeserializer(charSequence.toString(), null, 2, null);
        }
        AbstractDeserializer.IconCompatParcelizer iconCompatParcelizer = new AbstractDeserializer.IconCompatParcelizer(0, 1, null);
        iconCompatParcelizer.RemoteActionCompatParcelizer(spanned.toString());
        Object[] spans = spanned.getSpans(0, spanned.length(), StyleSpan.class);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(spans, "");
        for (Object obj : spans) {
            StyleSpan styleSpan = (StyleSpan) obj;
            int style = styleSpan.getStyle();
            if (style == 1) {
                _findpropertyunwrapper = new _findPropertyUnwrapper(0L, 0L, getDataStream.INSTANCE.read(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65531, null);
            } else if (style == 2) {
                _findpropertyunwrapper = new _findPropertyUnwrapper(0L, 0L, null, withValueDeserializer.IconCompatParcelizer(withValueDeserializer.INSTANCE.AudioAttributesCompatParcelizer()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65527, null);
            } else {
                _findpropertyunwrapper = style != 3 ? null : new _findPropertyUnwrapper(0L, 0L, getDataStream.INSTANCE.read(), withValueDeserializer.IconCompatParcelizer(withValueDeserializer.INSTANCE.AudioAttributesCompatParcelizer()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65523, null);
            }
            if (_findpropertyunwrapper != null) {
                iconCompatParcelizer.RemoteActionCompatParcelizer(_findpropertyunwrapper, spanned.getSpanStart(styleSpan), spanned.getSpanEnd(styleSpan));
            }
        }
        return iconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public static final AbstractDeserializer IconCompatParcelizer(Spanned spanned) {
        toMagicModuleMetaRepoModel.write(spanned, "");
        AbstractDeserializer.IconCompatParcelizer iconCompatParcelizer = new AbstractDeserializer.IconCompatParcelizer(0, 1, null);
        iconCompatParcelizer.RemoteActionCompatParcelizer(spanned.toString());
        Object[] spans = spanned.getSpans(0, iconCompatParcelizer.AudioAttributesCompatParcelizer(), Object.class);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(spans, "");
        for (Object obj : spans) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    iconCompatParcelizer.RemoteActionCompatParcelizer(new _findPropertyUnwrapper(0L, 0L, getDataStream.INSTANCE.read(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65531, null), spanStart, spanEnd);
                } else if (style == 2) {
                    iconCompatParcelizer.RemoteActionCompatParcelizer(new _findPropertyUnwrapper(0L, 0L, null, withValueDeserializer.IconCompatParcelizer(withValueDeserializer.INSTANCE.AudioAttributesCompatParcelizer()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65527, null), spanStart, spanEnd);
                } else if (style == 3) {
                    iconCompatParcelizer.RemoteActionCompatParcelizer(new _findPropertyUnwrapper(0L, 0L, getDataStream.INSTANCE.read(), withValueDeserializer.IconCompatParcelizer(withValueDeserializer.INSTANCE.AudioAttributesCompatParcelizer()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65523, null), spanStart, spanEnd);
                }
            } else if (obj instanceof UnderlineSpan) {
                iconCompatParcelizer.RemoteActionCompatParcelizer(new _findPropertyUnwrapper(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, renameAll.INSTANCE.AudioAttributesCompatParcelizer(), null, null, null, 61439, null), spanStart, spanEnd);
            } else if (obj instanceof StrikethroughSpan) {
                iconCompatParcelizer.RemoteActionCompatParcelizer(new _findPropertyUnwrapper(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, renameAll.INSTANCE.RemoteActionCompatParcelizer(), null, null, null, 61439, null), spanStart, spanEnd);
            } else if (obj instanceof ForegroundColorSpan) {
                iconCompatParcelizer.RemoteActionCompatParcelizer(new _findPropertyUnwrapper(RequestPayload.AudioAttributesCompatParcelizer(((ForegroundColorSpan) obj).getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, null), spanStart, spanEnd);
            }
        }
        return iconCompatParcelizer.RemoteActionCompatParcelizer();
    }
}
