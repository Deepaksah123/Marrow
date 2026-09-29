package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class TtmlStyle {
    public static final int FONT_SIZE_UNIT_EM = 2;
    public static final int FONT_SIZE_UNIT_PERCENT = 3;
    public static final int FONT_SIZE_UNIT_PIXEL = 1;
    private static final int OFF = 0;
    private static final int ON = 1;
    public static final int RUBY_TYPE_BASE = 2;
    public static final int RUBY_TYPE_CONTAINER = 1;
    public static final int RUBY_TYPE_DELIMITER = 4;
    public static final int RUBY_TYPE_TEXT = 3;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_BOLD_ITALIC = 3;
    public static final int STYLE_ITALIC = 2;
    public static final int STYLE_NORMAL = 0;
    public static final int UNSPECIFIED = -1;
    public static final float UNSPECIFIED_SHEAR = Float.MAX_VALUE;
    private int backgroundColor;
    private int fontColor;
    private String fontFamily;
    private float fontSize;
    private boolean hasBackgroundColor;
    private boolean hasFontColor;
    private String id;
    private Layout.Alignment multiRowAlign;
    private Layout.Alignment textAlign;
    private TextEmphasis textEmphasis;
    private int linethrough = -1;
    private int underline = -1;
    private int bold = -1;
    private int italic = -1;
    private int fontSizeUnit = -1;
    private int rubyType = -1;
    private int rubyPosition = -1;
    private int textCombine = -1;
    private float shearPercentage = Float.MAX_VALUE;

    /* JADX INFO: loaded from: classes.dex */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    /* JADX INFO: loaded from: classes.dex */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RubyType {
    }

    /* JADX INFO: loaded from: classes.dex */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    public final int getStyle() {
        int i = this.bold;
        if (i == -1 && this.italic == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.italic == 1 ? 2 : 0);
    }

    public final boolean isLinethrough() {
        return this.linethrough == 1;
    }

    public final TtmlStyle setLinethrough(boolean z) {
        this.linethrough = z ? 1 : 0;
        return this;
    }

    public final boolean isUnderline() {
        return this.underline == 1;
    }

    public final TtmlStyle setUnderline(boolean z) {
        this.underline = z ? 1 : 0;
        return this;
    }

    public final TtmlStyle setBold(boolean z) {
        this.bold = z ? 1 : 0;
        return this;
    }

    public final TtmlStyle setItalic(boolean z) {
        this.italic = z ? 1 : 0;
        return this;
    }

    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final TtmlStyle setFontFamily(String str) {
        this.fontFamily = str;
        return this;
    }

    public final int getFontColor() {
        if (!this.hasFontColor) {
            throw new IllegalStateException("Font color has not been defined.");
        }
        return this.fontColor;
    }

    public final TtmlStyle setFontColor(int i) {
        this.fontColor = i;
        this.hasFontColor = true;
        return this;
    }

    public final boolean hasFontColor() {
        return this.hasFontColor;
    }

    public final int getBackgroundColor() {
        if (!this.hasBackgroundColor) {
            throw new IllegalStateException("Background color has not been defined.");
        }
        return this.backgroundColor;
    }

    public final TtmlStyle setBackgroundColor(int i) {
        this.backgroundColor = i;
        this.hasBackgroundColor = true;
        return this;
    }

    public final boolean hasBackgroundColor() {
        return this.hasBackgroundColor;
    }

    public final TtmlStyle setShearPercentage(float f) {
        this.shearPercentage = f;
        return this;
    }

    public final float getShearPercentage() {
        return this.shearPercentage;
    }

    public final TtmlStyle chain(TtmlStyle ttmlStyle) {
        return inherit(ttmlStyle, true);
    }

    public final TtmlStyle inherit(TtmlStyle ttmlStyle) {
        return inherit(ttmlStyle, false);
    }

    private TtmlStyle inherit(TtmlStyle ttmlStyle, boolean z) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (ttmlStyle != null) {
            if (!this.hasFontColor && ttmlStyle.hasFontColor) {
                setFontColor(ttmlStyle.fontColor);
            }
            if (this.bold == -1) {
                this.bold = ttmlStyle.bold;
            }
            if (this.italic == -1) {
                this.italic = ttmlStyle.italic;
            }
            if (this.fontFamily == null && (str = ttmlStyle.fontFamily) != null) {
                this.fontFamily = str;
            }
            if (this.linethrough == -1) {
                this.linethrough = ttmlStyle.linethrough;
            }
            if (this.underline == -1) {
                this.underline = ttmlStyle.underline;
            }
            if (this.rubyPosition == -1) {
                this.rubyPosition = ttmlStyle.rubyPosition;
            }
            if (this.textAlign == null && (alignment2 = ttmlStyle.textAlign) != null) {
                this.textAlign = alignment2;
            }
            if (this.multiRowAlign == null && (alignment = ttmlStyle.multiRowAlign) != null) {
                this.multiRowAlign = alignment;
            }
            if (this.textCombine == -1) {
                this.textCombine = ttmlStyle.textCombine;
            }
            if (this.fontSizeUnit == -1) {
                this.fontSizeUnit = ttmlStyle.fontSizeUnit;
                this.fontSize = ttmlStyle.fontSize;
            }
            if (this.textEmphasis == null) {
                this.textEmphasis = ttmlStyle.textEmphasis;
            }
            if (this.shearPercentage == Float.MAX_VALUE) {
                this.shearPercentage = ttmlStyle.shearPercentage;
            }
            if (z && !this.hasBackgroundColor && ttmlStyle.hasBackgroundColor) {
                setBackgroundColor(ttmlStyle.backgroundColor);
            }
            if (z && this.rubyType == -1 && (i = ttmlStyle.rubyType) != -1) {
                this.rubyType = i;
            }
        }
        return this;
    }

    public final TtmlStyle setId(String str) {
        this.id = str;
        return this;
    }

    public final String getId() {
        return this.id;
    }

    public final TtmlStyle setRubyType(int i) {
        this.rubyType = i;
        return this;
    }

    public final int getRubyType() {
        return this.rubyType;
    }

    public final TtmlStyle setRubyPosition(int i) {
        this.rubyPosition = i;
        return this;
    }

    public final int getRubyPosition() {
        return this.rubyPosition;
    }

    public final Layout.Alignment getTextAlign() {
        return this.textAlign;
    }

    public final TtmlStyle setTextAlign(Layout.Alignment alignment) {
        this.textAlign = alignment;
        return this;
    }

    public final Layout.Alignment getMultiRowAlign() {
        return this.multiRowAlign;
    }

    public final TtmlStyle setMultiRowAlign(Layout.Alignment alignment) {
        this.multiRowAlign = alignment;
        return this;
    }

    public final boolean getTextCombine() {
        return this.textCombine == 1;
    }

    public final TtmlStyle setTextCombine(boolean z) {
        this.textCombine = z ? 1 : 0;
        return this;
    }

    public final TextEmphasis getTextEmphasis() {
        return this.textEmphasis;
    }

    public final TtmlStyle setTextEmphasis(TextEmphasis textEmphasis) {
        this.textEmphasis = textEmphasis;
        return this;
    }

    public final TtmlStyle setFontSize(float f) {
        this.fontSize = f;
        return this;
    }

    public final TtmlStyle setFontSizeUnit(int i) {
        this.fontSizeUnit = i;
        return this;
    }

    public final int getFontSizeUnit() {
        return this.fontSizeUnit;
    }

    public final float getFontSize() {
        return this.fontSize;
    }
}
