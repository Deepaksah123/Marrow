package kotlin;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes2.dex */
public class configureFromLongCreator implements Spannable {
    private static final Object write = new Object();
    private final PrecomputedText AudioAttributesCompatParcelizer;
    private final Spannable read;

    /* JADX INFO: loaded from: classes4.dex */
    public static final class AudioAttributesCompatParcelizer {
        private final int AudioAttributesCompatParcelizer;
        private final TextDirectionHeuristic IconCompatParcelizer;
        private final TextPaint RemoteActionCompatParcelizer;
        private final int write;

        public final TextPaint write() {
            return this.RemoteActionCompatParcelizer;
        }

        public final TextDirectionHeuristic IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final int read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final boolean IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            if (this.AudioAttributesCompatParcelizer == audioAttributesCompatParcelizer.read() && this.write == audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer() && this.RemoteActionCompatParcelizer.getTextSize() == audioAttributesCompatParcelizer.write().getTextSize() && this.RemoteActionCompatParcelizer.getTextScaleX() == audioAttributesCompatParcelizer.write().getTextScaleX() && this.RemoteActionCompatParcelizer.getTextSkewX() == audioAttributesCompatParcelizer.write().getTextSkewX() && this.RemoteActionCompatParcelizer.getLetterSpacing() == audioAttributesCompatParcelizer.write().getLetterSpacing() && TextUtils.equals(this.RemoteActionCompatParcelizer.getFontFeatureSettings(), audioAttributesCompatParcelizer.write().getFontFeatureSettings()) && this.RemoteActionCompatParcelizer.getFlags() == audioAttributesCompatParcelizer.write().getFlags() && this.RemoteActionCompatParcelizer.getTextLocales().equals(audioAttributesCompatParcelizer.write().getTextLocales())) {
                return this.RemoteActionCompatParcelizer.getTypeface() == null ? audioAttributesCompatParcelizer.write().getTypeface() == null : this.RemoteActionCompatParcelizer.getTypeface().equals(audioAttributesCompatParcelizer.write().getTypeface());
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) obj;
            return IconCompatParcelizer(audioAttributesCompatParcelizer) && this.IconCompatParcelizer == audioAttributesCompatParcelizer.IconCompatParcelizer();
        }

        public final int hashCode() {
            float textSize = this.RemoteActionCompatParcelizer.getTextSize();
            float textScaleX = this.RemoteActionCompatParcelizer.getTextScaleX();
            float textSkewX = this.RemoteActionCompatParcelizer.getTextSkewX();
            float letterSpacing = this.RemoteActionCompatParcelizer.getLetterSpacing();
            int flags = this.RemoteActionCompatParcelizer.getFlags();
            LocaleList textLocales = this.RemoteActionCompatParcelizer.getTextLocales();
            Typeface typeface = this.RemoteActionCompatParcelizer.getTypeface();
            boolean zIsElegantTextHeight = this.RemoteActionCompatParcelizer.isElegantTextHeight();
            return configureFromStringCreator.RemoteActionCompatParcelizer(Float.valueOf(textSize), Float.valueOf(textScaleX), Float.valueOf(textSkewX), Float.valueOf(letterSpacing), Integer.valueOf(flags), textLocales, typeface, Boolean.valueOf(zIsElegantTextHeight), this.IconCompatParcelizer, Integer.valueOf(this.AudioAttributesCompatParcelizer), Integer.valueOf(this.write));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sb2 = new StringBuilder("textSize=");
            sb2.append(this.RemoteActionCompatParcelizer.getTextSize());
            sb.append(sb2.toString());
            StringBuilder sb3 = new StringBuilder(", textScaleX=");
            sb3.append(this.RemoteActionCompatParcelizer.getTextScaleX());
            sb.append(sb3.toString());
            StringBuilder sb4 = new StringBuilder(", textSkewX=");
            sb4.append(this.RemoteActionCompatParcelizer.getTextSkewX());
            sb.append(sb4.toString());
            StringBuilder sb5 = new StringBuilder(", letterSpacing=");
            sb5.append(this.RemoteActionCompatParcelizer.getLetterSpacing());
            sb.append(sb5.toString());
            StringBuilder sb6 = new StringBuilder(", elegantTextHeight=");
            sb6.append(this.RemoteActionCompatParcelizer.isElegantTextHeight());
            sb.append(sb6.toString());
            StringBuilder sb7 = new StringBuilder(", textLocale=");
            sb7.append(this.RemoteActionCompatParcelizer.getTextLocales());
            sb.append(sb7.toString());
            StringBuilder sb8 = new StringBuilder(", typeface=");
            sb8.append(this.RemoteActionCompatParcelizer.getTypeface());
            sb.append(sb8.toString());
            StringBuilder sb9 = new StringBuilder(", variationSettings=");
            sb9.append(this.RemoteActionCompatParcelizer.getFontVariationSettings());
            sb.append(sb9.toString());
            StringBuilder sb10 = new StringBuilder(", textDir=");
            sb10.append(this.IconCompatParcelizer);
            sb.append(sb10.toString());
            StringBuilder sb11 = new StringBuilder(", breakStrategy=");
            sb11.append(this.AudioAttributesCompatParcelizer);
            sb.append(sb11.toString());
            StringBuilder sb12 = new StringBuilder(", hyphenationFrequency=");
            sb12.append(this.write);
            sb.append(sb12.toString());
            sb.append("}");
            return sb.toString();
        }
    }

    public PrecomputedText IconCompatParcelizer() {
        Spannable spannable = this.read;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        this.AudioAttributesCompatParcelizer.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        this.AudioAttributesCompatParcelizer.removeSpan(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.AudioAttributesCompatParcelizer.getSpans(i, i2, cls);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.read.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.read.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.read.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.read.nextSpanTransition(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.read.length();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.read.charAt(i);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.read.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.read.toString();
    }
}
