package kotlin;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5 {

    public static final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7.values().length];
            try {
                iArr[VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    public static final VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7 RemoteActionCompatParcelizer(assignParameter assignparameter, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int iIntValue;
        VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7 videoRendererEventListenerEventDispatcherExternalSyntheticLambda7;
        if ((i & 1) != 0) {
            assignparameter = null;
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1208802641, 0, -1, "com.marrow2.ui.common.composeUtilis.getWindowSizeClass (TabletUtils.kt:18)");
        }
        Integer numValueOf = assignparameter != null ? Integer.valueOf((int) assignparameter.getRemoteActionCompatParcelizer()) : null;
        if (numValueOf == null) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(2018171497);
            iIntValue = write(_handleunrecognizedcharacterescape);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(2018170567);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            iIntValue = numValueOf.intValue();
        }
        if (iIntValue < 600) {
            videoRendererEventListenerEventDispatcherExternalSyntheticLambda7 = VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7.IconCompatParcelizer;
        } else if (iIntValue < 840) {
            videoRendererEventListenerEventDispatcherExternalSyntheticLambda7 = VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7.RemoteActionCompatParcelizer;
        } else {
            videoRendererEventListenerEventDispatcherExternalSyntheticLambda7 = VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7.AudioAttributesCompatParcelizer;
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return videoRendererEventListenerEventDispatcherExternalSyntheticLambda7;
    }

    private static _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, final assignParameter assignparameter, final float f, final float f2, final float f3) {
        toMagicModuleMetaRepoModel.write(_handleoddname, "");
        return _verifyNLZ2.AudioAttributesCompatParcelizer$default(_handleoddname, null, new getModuleData() { // from class: o.VideoRendererEventListenerEventDispatcherExternalSyntheticLambda3
            @Override // kotlin.getModuleData
            public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                return VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.write(assignparameter, f, f2, f3, (_handleOddName) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _handleOddName write(assignParameter assignparameter, float f, float f2, float f3, _handleOddName _handleoddname, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(_handleoddname, "");
        _handleunrecognizedcharacterescape.IconCompatParcelizer(-328770676);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-328770676, i, -1, "com.marrow2.ui.common.composeUtilis.applyTabletPadding.<anonymous> (TabletUtils.kt:35)");
        }
        _handleOddName _handleoddnameWrite$default = getParentFragment.write$default(_handleoddname, RemoteActionCompatParcelizer(assignparameter, f, f2, f3, _handleunrecognizedcharacterescape, 0, 0), BitmapDescriptorFactory.HUE_RED, 2, null);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return _handleoddnameWrite$default;
    }

    private static final int write(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(2052067798, 0, -1, "com.marrow2.ui.common.composeUtilis.getUsableScreenWidthDp (TabletUtils.kt:69)");
        }
        bufferMapProperty buffermapproperty = (bufferMapProperty) _handleunrecognizedcharacterescape.write(getDefaultNullValueSerializer.IconCompatParcelizer());
        Configuration configuration = (Configuration) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.read());
        getReturnTransition getreturntransitionWrite = onDestroy.write(onPrimaryNavigationFragmentChanged.read(onCreateView.INSTANCE, _handleunrecognizedcharacterescape, 6), _handleunrecognizedcharacterescape, 0);
        int iAudioAttributesCompatParcelizer = (int) (((buffermapproperty.AudioAttributesCompatParcelizer(assignParameter.IconCompatParcelizer(configuration.screenWidthDp)) - buffermapproperty.AudioAttributesCompatParcelizer(getreturntransitionWrite.read(tryToResolveUnresolved.write))) - buffermapproperty.AudioAttributesCompatParcelizer(getreturntransitionWrite.RemoteActionCompatParcelizer(tryToResolveUnresolved.write))) / buffermapproperty.getRead());
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return iAudioAttributesCompatParcelizer;
    }

    public static /* synthetic */ _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, assignParameter assignparameter, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            assignparameter = null;
        }
        if ((i & 2) != 0) {
            f = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
        if ((i & 4) != 0) {
            f2 = 0.07f;
        }
        if ((i & 8) != 0) {
            f3 = 0.18f;
        }
        return AudioAttributesCompatParcelizer(_handleoddname, assignparameter, f, f2, f3);
    }

    public static final float RemoteActionCompatParcelizer(assignParameter assignparameter, float f, float f2, float f3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        int iIntValue;
        if ((i2 & 1) != 0) {
            assignparameter = null;
        }
        if ((i2 & 2) != 0) {
            f = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
        if ((i2 & 4) != 0) {
            f2 = 0.07f;
        }
        if ((i2 & 8) != 0) {
            f3 = 0.18f;
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1026101820, i, -1, "com.marrow2.ui.common.composeUtilis.getTabletPadding (TabletUtils.kt:48)");
        }
        Integer numValueOf = assignparameter != null ? Integer.valueOf((int) assignparameter.getRemoteActionCompatParcelizer()) : null;
        if (numValueOf == null) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1758621868);
            iIntValue = write(_handleunrecognizedcharacterescape);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1758622643);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            iIntValue = numValueOf.intValue();
        }
        float f4 = iIntValue;
        int iRemoteActionCompatParcelizer = getOnline.RemoteActionCompatParcelizer(f3 * f4);
        int iRemoteActionCompatParcelizer2 = getOnline.RemoteActionCompatParcelizer(f2 * f4);
        int i3 = IconCompatParcelizer.IconCompatParcelizer[RemoteActionCompatParcelizer(assignParameter.read(assignParameter.IconCompatParcelizer(f4)), _handleunrecognizedcharacterescape, 0).ordinal()];
        if (i3 != 1) {
            iRemoteActionCompatParcelizer = i3 != 2 ? (int) f : iRemoteActionCompatParcelizer2;
        }
        float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(iRemoteActionCompatParcelizer);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return fIconCompatParcelizer;
    }
}
