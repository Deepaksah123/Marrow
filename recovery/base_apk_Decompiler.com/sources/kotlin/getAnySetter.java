package kotlin;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0002\u0010\t\"\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"", "p0", "RemoteActionCompatParcelizer", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "", "p1", "Landroid/text/TextPaint;", "p2", "", "(FLjava/lang/CharSequence;Landroid/text/TextPaint;)Z", "AudioAttributesCompatParcelizer", "Z", "read"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getAnySetter {
    private static final boolean AudioAttributesCompatParcelizer = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence RemoteActionCompatParcelizer(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (buildAbstract.RemoteActionCompatParcelizer(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        return spannableString;
                    }
                }
            }
        }
        return charSequence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(float f, CharSequence charSequence, TextPaint textPaint) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return false;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (buildAbstract.RemoteActionCompatParcelizer(spanned, modifyArrayDeserializer.class) || buildAbstract.RemoteActionCompatParcelizer(spanned, isPotentialBeanType.class)) {
                return true;
            }
        }
        return textPaint.getLetterSpacing() != BitmapDescriptorFactory.HUE_RED;
    }
}
