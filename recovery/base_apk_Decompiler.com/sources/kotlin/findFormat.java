package kotlin;

import kotlin.Metadata;
import kotlin.findKeyDeserializer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u0007\u001a#\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\t2\b\b\u0002\u0010\u0002\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\u000b\u001a?\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a?\u0010\b\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\b\u0010\u0011\u001aO\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0006\u0010\u0014\u001aO\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a?\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0015\u0010\u0011\u001a?\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0016\u0010\u0011\u001a\u001f\u0010\u0006\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0006\u0010\u0018\u001a\u001f\u0010\b\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\b\u0010\u001a\u001a\u0017\u0010\u0006\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u0006\u0010\u001b\u001a\u001f\u0010\u0010\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u0010\u0010\u001c\u001a\u001f\u0010\u0006\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u0006\u0010\u001c\u001a\u001f\u0010\u0015\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u0015\u0010\u001c\u001a'\u0010\u0006\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u0006\u0010\u001d"}, d2 = {"Lo/findImplicitPropertyName;", "p0", "p1", "Lo/findPOJOBuilderConfig;", "p2", "Lo/findKeyDeserializer;", "write", "(Lo/findImplicitPropertyName;Lo/findImplicitPropertyName;I)Lo/findKeyDeserializer;", "AudioAttributesCompatParcelizer", "Lo/findSerializationPropertyOrder;", "Lo/findDeserializationContentConverter;", "(Lo/findImplicitPropertyName;Lo/findSerializationPropertyOrder;Lo/findDeserializationContentConverter;)Lo/findImplicitPropertyName;", "", "p3", "p4", "p5", "read", "(DDDDDD)D", "p6", "p7", "(DDDDDDDD)D", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "", "(Lo/findSerializationPropertyOrder;Lo/findSerializationPropertyOrder;)Z", "", "([F[F)Z", "([F)[F", "([F[F)[F", "([F[F[F)[F"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class findFormat {
    private static final findKeyDeserializer write(findImplicitPropertyName findimplicitpropertyname, findImplicitPropertyName findimplicitpropertyname2, int i) {
        if (findimplicitpropertyname == findimplicitpropertyname2) {
            return findKeyDeserializer.INSTANCE.write(findimplicitpropertyname);
        }
        MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
        if (findEnumAliases.write(findimplicitpropertyname.getAudioAttributesCompatParcelizer(), findEnumAliases.INSTANCE.write()) && findEnumAliases.write(findimplicitpropertyname2.getAudioAttributesCompatParcelizer(), findEnumAliases.INSTANCE.write())) {
            toMagicModuleMetaRepoModel.read(findimplicitpropertyname, "");
            toMagicModuleMetaRepoModel.read(findimplicitpropertyname2, "");
            return new findKeyDeserializer.AudioAttributesCompatParcelizer((findPOJOBuilder) findimplicitpropertyname, (findPOJOBuilder) findimplicitpropertyname2, i, magicModuleRepositoryImplExternalSyntheticLambda0);
        }
        return new findKeyDeserializer(findimplicitpropertyname, findimplicitpropertyname2, i, magicModuleRepositoryImplExternalSyntheticLambda0);
    }

    public static /* synthetic */ findKeyDeserializer AudioAttributesCompatParcelizer$default(findImplicitPropertyName findimplicitpropertyname, findImplicitPropertyName findimplicitpropertyname2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            findimplicitpropertyname2 = findFilterId.INSTANCE.onPlayFromMediaId();
        }
        if ((i2 & 2) != 0) {
            i = findPOJOBuilderConfig.INSTANCE.IconCompatParcelizer();
        }
        return AudioAttributesCompatParcelizer(findimplicitpropertyname, findimplicitpropertyname2, i);
    }

    public static final findKeyDeserializer AudioAttributesCompatParcelizer(findImplicitPropertyName findimplicitpropertyname, findImplicitPropertyName findimplicitpropertyname2, int i) {
        int iAudioAttributesCompatParcelizer = findimplicitpropertyname.getWrite();
        int iAudioAttributesCompatParcelizer2 = findimplicitpropertyname2.getWrite();
        if ((iAudioAttributesCompatParcelizer | iAudioAttributesCompatParcelizer2) < 0) {
            return write(findimplicitpropertyname, findimplicitpropertyname2, i);
        }
        setProvider<findKeyDeserializer> setproviderAudioAttributesCompatParcelizer = findObjectIdInfo.AudioAttributesCompatParcelizer();
        int i2 = iAudioAttributesCompatParcelizer | (iAudioAttributesCompatParcelizer2 << 6) | (i << 12);
        findKeyDeserializer findkeydeserializerAudioAttributesCompatParcelizer = setproviderAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i2);
        if (findkeydeserializerAudioAttributesCompatParcelizer == null) {
            findkeydeserializerAudioAttributesCompatParcelizer = write(findimplicitpropertyname, findimplicitpropertyname2, i);
            setproviderAudioAttributesCompatParcelizer.write(i2, findkeydeserializerAudioAttributesCompatParcelizer);
        }
        return findkeydeserializerAudioAttributesCompatParcelizer;
    }

    public static /* synthetic */ findImplicitPropertyName write$default(findImplicitPropertyName findimplicitpropertyname, findSerializationPropertyOrder findserializationpropertyorder, findDeserializationContentConverter finddeserializationcontentconverter, int i, Object obj) {
        if ((i & 2) != 0) {
            finddeserializationcontentconverter = findDeserializationContentConverter.INSTANCE.AudioAttributesCompatParcelizer();
        }
        return write(findimplicitpropertyname, findserializationpropertyorder, finddeserializationcontentconverter);
    }

    public static final findImplicitPropertyName write(findImplicitPropertyName findimplicitpropertyname, findSerializationPropertyOrder findserializationpropertyorder, findDeserializationContentConverter finddeserializationcontentconverter) {
        if (findEnumAliases.write(findimplicitpropertyname.getAudioAttributesCompatParcelizer(), findEnumAliases.INSTANCE.write())) {
            toMagicModuleMetaRepoModel.read(findimplicitpropertyname, "");
            findPOJOBuilder findpojobuilder = (findPOJOBuilder) findimplicitpropertyname;
            if (!write(findpojobuilder.getRead(), findserializationpropertyorder)) {
                return new findPOJOBuilder(findpojobuilder, read(write(finddeserializationcontentconverter.getRemoteActionCompatParcelizer(), findpojobuilder.getRead().AudioAttributesCompatParcelizer(), findserializationpropertyorder.AudioAttributesCompatParcelizer()), findpojobuilder.getAudioAttributesImplApi26Parcelizer()), findserializationpropertyorder);
            }
        }
        return findimplicitpropertyname;
    }

    public static final double read(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 * d4 ? (Math.pow(d, 1.0d / d6) - d3) / d2 : d / d4;
    }

    public static final double AudioAttributesCompatParcelizer(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d6) : d4 * d;
    }

    public static final double write(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        if (d < d5 * d4) {
            return (d - d7) / d4;
        }
        return (Math.pow(d - d6, 1.0d / d8) - d3) / d2;
    }

    public static final double IconCompatParcelizer(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d8) + d6 : (d4 * d) + d7;
    }

    public static final double IconCompatParcelizer(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.copySign(read(d < 0.0d ? -d : d, d2, d3, d4, d5, d6), d);
    }

    public static final double RemoteActionCompatParcelizer(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.copySign(AudioAttributesCompatParcelizer(d < 0.0d ? -d : d, d2, d3, d4, d5, d6), d);
    }

    public static final boolean write(findSerializationPropertyOrder findserializationpropertyorder, findSerializationPropertyOrder findserializationpropertyorder2) {
        if (findserializationpropertyorder == findserializationpropertyorder2) {
            return true;
        }
        return Math.abs(findserializationpropertyorder.getRemoteActionCompatParcelizer() - findserializationpropertyorder2.getRemoteActionCompatParcelizer()) < 0.001f && Math.abs(findserializationpropertyorder.getAudioAttributesCompatParcelizer() - findserializationpropertyorder2.getAudioAttributesCompatParcelizer()) < 0.001f;
    }

    public static final boolean AudioAttributesCompatParcelizer(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (Float.compare(fArr[i], fArr2[i]) != 0 && Math.abs(fArr[i] - fArr2[i]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final float[] write(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static final float[] read(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length >= 9 && fArr2.length >= 9) {
            float f = fArr[0];
            float f2 = fArr2[0];
            float f3 = fArr[3];
            float f4 = fArr2[1];
            float f5 = fArr[6];
            float f6 = fArr2[2];
            fArr3[0] = (f * f2) + (f3 * f4) + (f5 * f6);
            float f7 = fArr[1];
            float f8 = fArr2[0];
            float f9 = fArr[4];
            float f10 = fArr[7];
            fArr3[1] = (f7 * f8) + (f4 * f9) + (f10 * f6);
            float f11 = fArr[2];
            float f12 = fArr[5];
            float f13 = fArr2[1];
            float f14 = fArr[8];
            fArr3[2] = (f11 * f8) + (f13 * f12) + (f6 * f14);
            float f15 = fArr[0];
            float f16 = fArr2[3];
            float f17 = fArr2[4];
            float f18 = fArr2[5];
            fArr3[3] = (f16 * f15) + (f3 * f17) + (f5 * f18);
            float f19 = fArr[1];
            float f20 = fArr2[3];
            fArr3[4] = (f19 * f20) + (f9 * f17) + (f10 * f18);
            float f21 = fArr[2];
            fArr3[5] = (f20 * f21) + (f12 * fArr2[4]) + (f18 * f14);
            float f22 = fArr2[6];
            float f23 = fArr[3];
            float f24 = fArr2[7];
            float f25 = fArr2[8];
            fArr3[6] = (f15 * f22) + (f23 * f24) + (f5 * f25);
            float f26 = fArr2[6];
            fArr3[7] = (f19 * f26) + (fArr[4] * f24) + (f10 * f25);
            fArr3[8] = (f21 * f26) + (fArr[5] * fArr2[7]) + (f14 * f25);
        }
        return fArr3;
    }

    public static final float[] write(float[] fArr, float[] fArr2) {
        if (fArr.length >= 9 && fArr2.length >= 3) {
            float f = fArr2[0];
            float f2 = fArr2[1];
            float f3 = fArr2[2];
            fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
            fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
            fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
        }
        return fArr2;
    }

    public static final float[] IconCompatParcelizer(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[1];
        float f4 = fArr2[1];
        float f5 = fArr[2];
        return new float[]{f2 * f, f4 * f3, fArr2[2] * f5, fArr2[3] * f, fArr2[4] * f3, fArr2[5] * f5, f * fArr2[6], f3 * fArr2[7], f5 * fArr2[8]};
    }

    public static final float[] write(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArrWrite = write(fArr, fArr2);
        float[] fArrWrite2 = write(fArr, fArr3);
        return read(write(fArr), IconCompatParcelizer(new float[]{fArrWrite2[0] / fArrWrite[0], fArrWrite2[1] / fArrWrite[1], fArrWrite2[2] / fArrWrite[2]}, fArr));
    }
}
