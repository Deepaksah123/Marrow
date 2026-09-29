package kotlin;

import android.graphics.ColorSpace;
import android.os.Build;
import java.util.function.DoubleUnaryOperator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/getArrayValueSeparator;", "", "<init>", "()V", "Lo/findImplicitPropertyName;", "Landroid/graphics/ColorSpace;", "RemoteActionCompatParcelizer", "(Lo/findImplicitPropertyName;)Landroid/graphics/ColorSpace;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getArrayValueSeparator {
    public static final getArrayValueSeparator INSTANCE = new getArrayValueSeparator();

    private getArrayValueSeparator() {
    }

    @getMagicModuleMeta
    public static final ColorSpace RemoteActionCompatParcelizer(findImplicitPropertyName findimplicitpropertyname) {
        ColorSpace.Rgb rgb;
        ColorSpace colorSpaceAudioAttributesCompatParcelizer;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(findimplicitpropertyname, findFilterId.INSTANCE.onPlayFromMediaId())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(findimplicitpropertyname, findFilterId.INSTANCE.read())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(findimplicitpropertyname, findFilterId.INSTANCE.RemoteActionCompatParcelizer())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(findimplicitpropertyname, findFilterId.INSTANCE.write())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(findimplicitpropertyname, findFilterId.INSTANCE.AudioAttributesCompatParcelizer())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(findimplicitpropertyname, findFilterId.INSTANCE.MediaBrowserCompatItemReceiver())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(findimplicitpropertyname, findFilterId.INSTANCE.MediaBrowserCompatCustomActionResultReceiver())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(findimplicitpropertyname, findFilterId.INSTANCE.AudioAttributesImplBaseParcelizer())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(findimplicitpropertyname, findFilterId.INSTANCE.MediaBrowserCompatMediaItem())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(findimplicitpropertyname, findFilterId.INSTANCE.MediaDescriptionCompat())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(findimplicitpropertyname, findFilterId.INSTANCE.MediaMetadataCompat())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(findimplicitpropertyname, findFilterId.INSTANCE.MediaBrowserCompatSearchResultReceiver())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(findimplicitpropertyname, findFilterId.INSTANCE.RatingCompat())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(findimplicitpropertyname, findFilterId.INSTANCE.onAddQueueItem())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(findimplicitpropertyname, findFilterId.INSTANCE.handleMediaPlayPauseIfPendingOnHandler())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(findimplicitpropertyname, findFilterId.INSTANCE.onCommand())) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34 && (colorSpaceAudioAttributesCompatParcelizer = getObjectFieldValueSeparator.AudioAttributesCompatParcelizer(findimplicitpropertyname)) != null) {
            return colorSpaceAudioAttributesCompatParcelizer;
        }
        if (findimplicitpropertyname instanceof findPOJOBuilder) {
            findPOJOBuilder findpojobuilder = (findPOJOBuilder) findimplicitpropertyname;
            float[] fArrAudioAttributesCompatParcelizer = findpojobuilder.getRead().AudioAttributesCompatParcelizer();
            findRootName iconCompatParcelizer = findpojobuilder.getIconCompatParcelizer();
            ColorSpace.Rgb.TransferParameters transferParameters = iconCompatParcelizer != null ? new ColorSpace.Rgb.TransferParameters(iconCompatParcelizer.getRemoteActionCompatParcelizer(), iconCompatParcelizer.getRead(), iconCompatParcelizer.getAudioAttributesCompatParcelizer(), iconCompatParcelizer.getIconCompatParcelizer(), iconCompatParcelizer.getMediaBrowserCompatItemReceiver(), iconCompatParcelizer.getAudioAttributesImplApi26Parcelizer(), iconCompatParcelizer.getWrite()) : null;
            if (transferParameters != null) {
                rgb = new ColorSpace.Rgb(findimplicitpropertyname.getRemoteActionCompatParcelizer(), findpojobuilder.getWrite(), fArrAudioAttributesCompatParcelizer, transferParameters);
            } else {
                String remoteActionCompatParcelizer = findimplicitpropertyname.getRemoteActionCompatParcelizer();
                float[] write = findpojobuilder.getWrite();
                final getAnswerMap<Double, Double> getanswermapAudioAttributesImplBaseParcelizer = findpojobuilder.AudioAttributesImplBaseParcelizer();
                DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: o.createDefaultInstance
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        return getArrayValueSeparator.AudioAttributesCompatParcelizer(getanswermapAudioAttributesImplBaseParcelizer, d);
                    }
                };
                final getAnswerMap<Double, Double> getanswermapMediaBrowserCompatCustomActionResultReceiver = findpojobuilder.MediaBrowserCompatCustomActionResultReceiver();
                rgb = new ColorSpace.Rgb(remoteActionCompatParcelizer, write, fArrAudioAttributesCompatParcelizer, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: o.getObjectEntrySeparator
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        return getArrayValueSeparator.read(getanswermapMediaBrowserCompatCustomActionResultReceiver, d);
                    }
                }, findpojobuilder.RemoteActionCompatParcelizer(0), findpojobuilder.AudioAttributesCompatParcelizer(0));
            }
            return rgb;
        }
        return ColorSpace.get(ColorSpace.Named.SRGB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double AudioAttributesCompatParcelizer(getAnswerMap getanswermap, double d) {
        return ((Number) getanswermap.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double read(getAnswerMap getanswermap, double d) {
        return ((Number) getanswermap.invoke(Double.valueOf(d))).doubleValue();
    }
}
