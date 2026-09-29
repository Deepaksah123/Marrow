package kotlin;

import android.graphics.RectF;
import android.text.Layout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.addIgnorable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0002\b\b\u001aO\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a]\u0010\u0012\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000f2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001am\u0010\u0019\u001a\u00020\u0007*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000f2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001am\u0010\u001b\u001a\u00020\u0007*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000f2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001a\u001a'\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a'\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001d\u001a#\u0010\u0012\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0012\u0010\u001e"}, d2 = {"Lo/addInjectables;", "Landroid/text/Layout;", "p0", "Lo/addIgnorable;", "p1", "Landroid/graphics/RectF;", "p2", "", "p3", "Lkotlin/Function2;", "", "p4", "", "RemoteActionCompatParcelizer", "(Lo/addInjectables;Landroid/text/Layout;Lo/addIgnorable;Landroid/graphics/RectF;ILo/MagicModuleSubmissionRequestBody;)[I", "Lo/buildBuilderBasedDeserializer;", "p5", "p6", "AudioAttributesCompatParcelizer", "(Lo/addInjectables;Landroid/text/Layout;Lo/addIgnorable;ILandroid/graphics/RectF;Lo/buildBuilderBasedDeserializer;Lo/MagicModuleSubmissionRequestBody;Z)I", "Lo/addIgnorable$IconCompatParcelizer;", "", "", "p7", "p8", "write", "(Lo/addIgnorable$IconCompatParcelizer;Landroid/graphics/RectF;IIIFF[FLo/buildBuilderBasedDeserializer;Lo/MagicModuleSubmissionRequestBody;)I", "IconCompatParcelizer", "read", "(II[F)F", "(Landroid/graphics/RectF;FF)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class addBackReferenceProperties {
    public static final int[] RemoteActionCompatParcelizer(addInjectables addinjectables, Layout layout, addIgnorable addignorable, RectF rectF, int i, MagicModuleSubmissionRequestBody<? super RectF, ? super RectF, Boolean> magicModuleSubmissionRequestBody) {
        filterBeanProps filterbeanpropsRemoteActionCompatParcelizer;
        int iAudioAttributesCompatParcelizer;
        int i2;
        int i3;
        int i4;
        int iAudioAttributesCompatParcelizer2;
        if (i == 1) {
            filterbeanpropsRemoteActionCompatParcelizer = new filterBeanProps(addinjectables.MediaBrowserCompatItemReceiver(), addinjectables.AudioAttributesImplBaseParcelizer());
        } else {
            filterbeanpropsRemoteActionCompatParcelizer = buildThrowableDeserializer.RemoteActionCompatParcelizer(addinjectables.MediaBrowserCompatItemReceiver(), addinjectables.getRead());
        }
        buildBuilderBasedDeserializer buildbuilderbaseddeserializer = filterbeanpropsRemoteActionCompatParcelizer;
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > addinjectables.read(lineForVertical) && (lineForVertical = lineForVertical + 1) >= addinjectables.getAudioAttributesImplBaseParcelizer()) {
            return null;
        }
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < addinjectables.MediaMetadataCompat(0)) {
            return null;
        }
        int i5 = lineForVertical;
        while (true) {
            iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(addinjectables, layout, addignorable, i5, rectF, buildbuilderbaseddeserializer, magicModuleSubmissionRequestBody, true);
            i2 = -1;
            if (iAudioAttributesCompatParcelizer != -1 || i5 >= lineForVertical2) {
                break;
            }
            i5++;
        }
        if (iAudioAttributesCompatParcelizer == -1) {
            return null;
        }
        while (true) {
            i3 = i2;
            i4 = iAudioAttributesCompatParcelizer;
            iAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(addinjectables, layout, addignorable, lineForVertical2, rectF, buildbuilderbaseddeserializer, magicModuleSubmissionRequestBody, false);
            if (iAudioAttributesCompatParcelizer2 != i3 || i5 >= lineForVertical2) {
                break;
            }
            lineForVertical2--;
            i2 = i3;
            iAudioAttributesCompatParcelizer = i4;
        }
        if (iAudioAttributesCompatParcelizer2 == i3) {
            return null;
        }
        return new int[]{buildbuilderbaseddeserializer.AudioAttributesImplApi26Parcelizer(i4 + 1), buildbuilderbaseddeserializer.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer2 - 1)};
    }

    private static final int AudioAttributesCompatParcelizer(addInjectables addinjectables, Layout layout, addIgnorable addignorable, int i, RectF rectF, buildBuilderBasedDeserializer buildbuilderbaseddeserializer, MagicModuleSubmissionRequestBody<? super RectF, ? super RectF, Boolean> magicModuleSubmissionRequestBody, boolean z) {
        newEncryptedObject newencryptedobjectRatingCompat;
        float f;
        float fIconCompatParcelizer;
        int i2;
        addIgnorable.IconCompatParcelizer[] iconCompatParcelizerArr;
        int i3;
        int iIconCompatParcelizer;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        float[] fArr = new float[(lineEnd - lineStart) << 1];
        addinjectables.AudioAttributesCompatParcelizer(i, fArr);
        addIgnorable.IconCompatParcelizer[] iconCompatParcelizerArrAudioAttributesCompatParcelizer = addignorable.AudioAttributesCompatParcelizer(i);
        if (z) {
            newencryptedobjectRatingCompat = getOrderDetails.RatingCompat(iconCompatParcelizerArrAudioAttributesCompatParcelizer);
        } else {
            newencryptedobjectRatingCompat = getQues.read(getOrderDetails.MediaDescriptionCompat(iconCompatParcelizerArrAudioAttributesCompatParcelizer), 0);
        }
        int read = newencryptedobjectRatingCompat.getRead();
        int audioAttributesCompatParcelizer = newencryptedobjectRatingCompat.getAudioAttributesCompatParcelizer();
        int iconCompatParcelizer = newencryptedobjectRatingCompat.getIconCompatParcelizer();
        if ((iconCompatParcelizer <= 0 || read > audioAttributesCompatParcelizer) && (iconCompatParcelizer >= 0 || audioAttributesCompatParcelizer > read)) {
            return -1;
        }
        int i4 = read;
        while (true) {
            addIgnorable.IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizerArrAudioAttributesCompatParcelizer[i4];
            if (iconCompatParcelizer2.getWrite()) {
                f = read(iconCompatParcelizer2.getRead() - 1, lineStart, fArr);
            } else {
                f = read(iconCompatParcelizer2.getRemoteActionCompatParcelizer(), lineStart, fArr);
            }
            float f2 = f;
            if (iconCompatParcelizer2.getWrite()) {
                fIconCompatParcelizer = IconCompatParcelizer(iconCompatParcelizer2.getRemoteActionCompatParcelizer(), lineStart, fArr);
            } else {
                fIconCompatParcelizer = IconCompatParcelizer(iconCompatParcelizer2.getRead() - 1, lineStart, fArr);
            }
            float f3 = fIconCompatParcelizer;
            if (z) {
                i2 = i4;
                iconCompatParcelizerArr = iconCompatParcelizerArrAudioAttributesCompatParcelizer;
                i3 = audioAttributesCompatParcelizer;
                iIconCompatParcelizer = write(iconCompatParcelizer2, rectF, lineStart, lineTop, lineBottom, f2, f3, fArr, buildbuilderbaseddeserializer, magicModuleSubmissionRequestBody);
            } else {
                i2 = i4;
                iconCompatParcelizerArr = iconCompatParcelizerArrAudioAttributesCompatParcelizer;
                i3 = audioAttributesCompatParcelizer;
                iIconCompatParcelizer = IconCompatParcelizer(iconCompatParcelizer2, rectF, lineStart, lineTop, lineBottom, f2, f3, fArr, buildbuilderbaseddeserializer, magicModuleSubmissionRequestBody);
            }
            if (iIconCompatParcelizer >= 0) {
                return iIconCompatParcelizer;
            }
            if (i2 == i3) {
                return -1;
            }
            i4 = i2 + iconCompatParcelizer;
            audioAttributesCompatParcelizer = i3;
            iconCompatParcelizerArrAudioAttributesCompatParcelizer = iconCompatParcelizerArr;
        }
    }

    private static final int write(addIgnorable.IconCompatParcelizer iconCompatParcelizer, RectF rectF, int i, int i2, int i3, float f, float f2, float[] fArr, buildBuilderBasedDeserializer buildbuilderbaseddeserializer, MagicModuleSubmissionRequestBody<? super RectF, ? super RectF, Boolean> magicModuleSubmissionRequestBody) {
        int iWrite;
        int iAudioAttributesImplApi26Parcelizer;
        float f3;
        float fIconCompatParcelizer;
        if (!AudioAttributesCompatParcelizer(rectF, f, f2)) {
            return -1;
        }
        if ((!iconCompatParcelizer.getWrite() && rectF.left <= f) || (iconCompatParcelizer.getWrite() && rectF.right >= f2)) {
            iWrite = iconCompatParcelizer.getRemoteActionCompatParcelizer();
        } else {
            int i4 = iconCompatParcelizer.getRemoteActionCompatParcelizer();
            iWrite = iconCompatParcelizer.getRead();
            while (iWrite - i4 > 1) {
                int i5 = (iWrite + i4) / 2;
                float f4 = read(i5, i, fArr);
                if ((iconCompatParcelizer.getWrite() || f4 <= rectF.left) && (!iconCompatParcelizer.getWrite() || f4 >= rectF.right)) {
                    i4 = i5;
                } else {
                    iWrite = i5;
                }
            }
            if (!iconCompatParcelizer.getWrite()) {
                iWrite = i4;
            }
        }
        int iAudioAttributesCompatParcelizer = buildbuilderbaseddeserializer.AudioAttributesCompatParcelizer(iWrite);
        if (iAudioAttributesCompatParcelizer == -1 || (iAudioAttributesImplApi26Parcelizer = buildbuilderbaseddeserializer.AudioAttributesImplApi26Parcelizer(iAudioAttributesCompatParcelizer)) >= iconCompatParcelizer.getRead()) {
            return -1;
        }
        int iWrite2 = getQues.write(iAudioAttributesImplApi26Parcelizer, iconCompatParcelizer.getRemoteActionCompatParcelizer());
        int iRemoteActionCompatParcelizer = getQues.RemoteActionCompatParcelizer(iAudioAttributesCompatParcelizer, iconCompatParcelizer.getRead());
        RectF rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, i2, BitmapDescriptorFactory.HUE_RED, i3);
        while (true) {
            if (iconCompatParcelizer.getWrite()) {
                f3 = read(iRemoteActionCompatParcelizer - 1, i, fArr);
            } else {
                f3 = read(iWrite2, i, fArr);
            }
            rectF2.left = f3;
            if (iconCompatParcelizer.getWrite()) {
                fIconCompatParcelizer = IconCompatParcelizer(iWrite2, i, fArr);
            } else {
                fIconCompatParcelizer = IconCompatParcelizer(iRemoteActionCompatParcelizer - 1, i, fArr);
            }
            rectF2.right = fIconCompatParcelizer;
            if (magicModuleSubmissionRequestBody.invoke(rectF2, rectF).booleanValue()) {
                return iWrite2;
            }
            iWrite2 = buildbuilderbaseddeserializer.read(iWrite2);
            if (iWrite2 == -1 || iWrite2 >= iconCompatParcelizer.getRead()) {
                break;
            }
            iRemoteActionCompatParcelizer = getQues.RemoteActionCompatParcelizer(buildbuilderbaseddeserializer.AudioAttributesCompatParcelizer(iWrite2), iconCompatParcelizer.getRead());
        }
        return -1;
    }

    private static final int IconCompatParcelizer(addIgnorable.IconCompatParcelizer iconCompatParcelizer, RectF rectF, int i, int i2, int i3, float f, float f2, float[] fArr, buildBuilderBasedDeserializer buildbuilderbaseddeserializer, MagicModuleSubmissionRequestBody<? super RectF, ? super RectF, Boolean> magicModuleSubmissionRequestBody) {
        int iWrite;
        int iAudioAttributesCompatParcelizer;
        float f3;
        float fIconCompatParcelizer;
        if (!AudioAttributesCompatParcelizer(rectF, f, f2)) {
            return -1;
        }
        if ((!iconCompatParcelizer.getWrite() && rectF.right >= f2) || (iconCompatParcelizer.getWrite() && rectF.left <= f)) {
            iWrite = iconCompatParcelizer.getRead() - 1;
        } else {
            int i4 = iconCompatParcelizer.getRemoteActionCompatParcelizer();
            iWrite = iconCompatParcelizer.getRead();
            while (iWrite - i4 > 1) {
                int i5 = (iWrite + i4) / 2;
                float f4 = read(i5, i, fArr);
                if ((iconCompatParcelizer.getWrite() || f4 <= rectF.right) && (!iconCompatParcelizer.getWrite() || f4 >= rectF.left)) {
                    i4 = i5;
                } else {
                    iWrite = i5;
                }
            }
            if (!iconCompatParcelizer.getWrite()) {
                iWrite = i4;
            }
        }
        int iAudioAttributesImplApi26Parcelizer = buildbuilderbaseddeserializer.AudioAttributesImplApi26Parcelizer(iWrite + 1);
        if (iAudioAttributesImplApi26Parcelizer == -1 || (iAudioAttributesCompatParcelizer = buildbuilderbaseddeserializer.AudioAttributesCompatParcelizer(iAudioAttributesImplApi26Parcelizer)) <= iconCompatParcelizer.getRemoteActionCompatParcelizer()) {
            return -1;
        }
        int iWrite2 = getQues.write(iAudioAttributesImplApi26Parcelizer, iconCompatParcelizer.getRemoteActionCompatParcelizer());
        int iRemoteActionCompatParcelizer = getQues.RemoteActionCompatParcelizer(iAudioAttributesCompatParcelizer, iconCompatParcelizer.getRead());
        RectF rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, i2, BitmapDescriptorFactory.HUE_RED, i3);
        while (true) {
            if (iconCompatParcelizer.getWrite()) {
                f3 = read(iRemoteActionCompatParcelizer - 1, i, fArr);
            } else {
                f3 = read(iWrite2, i, fArr);
            }
            rectF2.left = f3;
            if (iconCompatParcelizer.getWrite()) {
                fIconCompatParcelizer = IconCompatParcelizer(iWrite2, i, fArr);
            } else {
                fIconCompatParcelizer = IconCompatParcelizer(iRemoteActionCompatParcelizer - 1, i, fArr);
            }
            rectF2.right = fIconCompatParcelizer;
            if (magicModuleSubmissionRequestBody.invoke(rectF2, rectF).booleanValue()) {
                return iRemoteActionCompatParcelizer;
            }
            iRemoteActionCompatParcelizer = buildbuilderbaseddeserializer.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer);
            if (iRemoteActionCompatParcelizer == -1 || iRemoteActionCompatParcelizer <= iconCompatParcelizer.getRemoteActionCompatParcelizer()) {
                break;
            }
            iWrite2 = getQues.write(buildbuilderbaseddeserializer.AudioAttributesImplApi26Parcelizer(iRemoteActionCompatParcelizer), iconCompatParcelizer.getRemoteActionCompatParcelizer());
        }
        return -1;
    }

    private static final float read(int i, int i2, float[] fArr) {
        return fArr[(i - i2) << 1];
    }

    private static final float IconCompatParcelizer(int i, int i2, float[] fArr) {
        return fArr[((i - i2) << 1) + 1];
    }

    private static final boolean AudioAttributesCompatParcelizer(RectF rectF, float f, float f2) {
        return f2 >= rectF.left && f <= rectF.right;
    }
}
