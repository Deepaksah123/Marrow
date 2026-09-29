package kotlin;

import android.graphics.BlendMode;

/* JADX INFO: loaded from: classes2.dex */
final class _verifyNullForPrimitiveCoercion {

    /* JADX INFO: renamed from: o._verifyNullForPrimitiveCoercion$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[_parseString.values().length];
            AudioAttributesCompatParcelizer = iArr;
            try {
                iArr[_parseString.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                AudioAttributesCompatParcelizer[_parseString.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    static class AudioAttributesCompatParcelizer {
        static Object AudioAttributesCompatParcelizer(_parseString _parsestring) {
            switch (AnonymousClass3.AudioAttributesCompatParcelizer[_parsestring.ordinal()]) {
                case 1:
                    return BlendMode.CLEAR;
                case 2:
                    return BlendMode.SRC;
                case 3:
                    return BlendMode.DST;
                case 4:
                    return BlendMode.SRC_OVER;
                case 5:
                    return BlendMode.DST_OVER;
                case 6:
                    return BlendMode.SRC_IN;
                case 7:
                    return BlendMode.DST_IN;
                case 8:
                    return BlendMode.SRC_OUT;
                case 9:
                    return BlendMode.DST_OUT;
                case 10:
                    return BlendMode.SRC_ATOP;
                case 11:
                    return BlendMode.DST_ATOP;
                case 12:
                    return BlendMode.XOR;
                case 13:
                    return BlendMode.PLUS;
                case 14:
                    return BlendMode.MODULATE;
                case 15:
                    return BlendMode.SCREEN;
                case 16:
                    return BlendMode.OVERLAY;
                case 17:
                    return BlendMode.DARKEN;
                case 18:
                    return BlendMode.LIGHTEN;
                case 19:
                    return BlendMode.COLOR_DODGE;
                case 20:
                    return BlendMode.COLOR_BURN;
                case 21:
                    return BlendMode.HARD_LIGHT;
                case 22:
                    return BlendMode.SOFT_LIGHT;
                case 23:
                    return BlendMode.DIFFERENCE;
                case 24:
                    return BlendMode.EXCLUSION;
                case 25:
                    return BlendMode.MULTIPLY;
                case 26:
                    return BlendMode.HUE;
                case 27:
                    return BlendMode.SATURATION;
                case 28:
                    return BlendMode.COLOR;
                case 29:
                    return BlendMode.LUMINOSITY;
                default:
                    return null;
            }
        }
    }
}
