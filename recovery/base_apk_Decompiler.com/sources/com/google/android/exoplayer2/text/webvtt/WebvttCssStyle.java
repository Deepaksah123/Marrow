package com.google.android.exoplayer2.text.webvtt;

import android.text.TextUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import kotlin.parseMdhd;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class WebvttCssStyle {
    public static final int FONT_SIZE_UNIT_EM = 2;
    public static final int FONT_SIZE_UNIT_PERCENT = 3;
    public static final int FONT_SIZE_UNIT_PIXEL = 1;
    private static final int OFF = 0;
    private static final int ON = 1;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_BOLD_ITALIC = 3;
    public static final int STYLE_ITALIC = 2;
    public static final int STYLE_NORMAL = 0;
    public static final int UNSPECIFIED = -1;
    private int backgroundColor;
    private int fontColor;
    private float fontSize;
    private String targetId = "";
    private String targetTag = "";
    private Set<String> targetClasses = Collections.emptySet();
    private String targetVoice = "";
    private String fontFamily = null;
    private boolean hasFontColor = false;
    private boolean hasBackgroundColor = false;
    private int linethrough = -1;
    private int underline = -1;
    private int bold = -1;
    private int italic = -1;
    private int fontSizeUnit = -1;
    private int rubyPosition = -1;
    private boolean combineUpright = false;

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
    public @interface StyleFlags {
    }

    public final void setTargetId(String str) {
        this.targetId = str;
    }

    public final void setTargetTagName(String str) {
        this.targetTag = str;
    }

    public final void setTargetClasses(String[] strArr) {
        this.targetClasses = new HashSet(Arrays.asList(strArr));
    }

    public final void setTargetVoice(String str) {
        this.targetVoice = str;
    }

    public final int getSpecificityScore(String str, String str2, Set<String> set, String str3) {
        if (this.targetId.isEmpty() && this.targetTag.isEmpty() && this.targetClasses.isEmpty() && this.targetVoice.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iUpdateScoreForMatch = updateScoreForMatch(updateScoreForMatch(updateScoreForMatch(0, this.targetId, str, 1073741824), this.targetTag, str2, 2), this.targetVoice, str3, 4);
        if (iUpdateScoreForMatch == -1 || !set.containsAll(this.targetClasses)) {
            return 0;
        }
        return iUpdateScoreForMatch + (this.targetClasses.size() << 2);
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

    public final WebvttCssStyle setLinethrough(boolean z) {
        this.linethrough = z ? 1 : 0;
        return this;
    }

    public final boolean isUnderline() {
        return this.underline == 1;
    }

    public final WebvttCssStyle setUnderline(boolean z) {
        this.underline = z ? 1 : 0;
        return this;
    }

    public final WebvttCssStyle setBold(boolean z) {
        this.bold = z ? 1 : 0;
        return this;
    }

    public final WebvttCssStyle setItalic(boolean z) {
        this.italic = z ? 1 : 0;
        return this;
    }

    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final WebvttCssStyle setFontFamily(String str) {
        this.fontFamily = str == null ? null : parseMdhd.read(str);
        return this;
    }

    public final int getFontColor() {
        if (!this.hasFontColor) {
            throw new IllegalStateException("Font color not defined");
        }
        return this.fontColor;
    }

    public final WebvttCssStyle setFontColor(int i) {
        this.fontColor = i;
        this.hasFontColor = true;
        return this;
    }

    public final boolean hasFontColor() {
        return this.hasFontColor;
    }

    public final int getBackgroundColor() {
        if (!this.hasBackgroundColor) {
            throw new IllegalStateException("Background color not defined.");
        }
        return this.backgroundColor;
    }

    public final WebvttCssStyle setBackgroundColor(int i) {
        this.backgroundColor = i;
        this.hasBackgroundColor = true;
        return this;
    }

    public final boolean hasBackgroundColor() {
        return this.hasBackgroundColor;
    }

    public final WebvttCssStyle setFontSize(float f) {
        this.fontSize = f;
        return this;
    }

    public final WebvttCssStyle setFontSizeUnit(int i) {
        this.fontSizeUnit = i;
        return this;
    }

    public final int getFontSizeUnit() {
        return this.fontSizeUnit;
    }

    public final float getFontSize() {
        return this.fontSize;
    }

    public final WebvttCssStyle setRubyPosition(int i) {
        this.rubyPosition = i;
        return this;
    }

    public final int getRubyPosition() {
        return this.rubyPosition;
    }

    public final WebvttCssStyle setCombineUpright(boolean z) {
        this.combineUpright = z;
        return this;
    }

    public final boolean getCombineUpright() {
        return this.combineUpright;
    }

    private static int updateScoreForMatch(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}
