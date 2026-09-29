package kotlin;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class BaseTransientBottomBarSnackbarBaseLayout {
    public static final _handleOddName RemoteActionCompatParcelizer(_handleOddName _handleoddname, final setTranslationY settranslationy, final long j, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        toMagicModuleMetaRepoModel.write(_handleoddname, "");
        toMagicModuleMetaRepoModel.write(settranslationy, "");
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(553434546, 0, -1, "com.marrow2.ui.video.downloaded_videos.composable.verticalScrollbar (VerticalScrollbar.kt:31)");
        }
        boolean zAudioAttributesImplApi26Parcelizer = settranslationy.AudioAttributesImplApi26Parcelizer();
        final parseDouble<Float> parsedouble = setHorizontalGravity.read(zAudioAttributesImplApi26Parcelizer ? 1.0f : BitmapDescriptorFactory.HUE_RED, setVerticalGravity.RemoteActionCompatParcelizer$default(zAudioAttributesImplApi26Parcelizer ? 150 : 300, zAudioAttributesImplApi26Parcelizer ? 0 : 600, (setOnQueryTextFocusChangeListener) null, 4, (Object) null), BitmapDescriptorFactory.HUE_RED, "scrollbarAlpha", null, _handleunrecognizedcharacterescape, 3072, 20);
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(settranslationy);
        boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(parsedouble);
        boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(j);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2 | zIconCompatParcelizer) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new getAnswerMap() { // from class: o.SnackbarContentLayout
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return BaseTransientBottomBarSnackbarBaseLayout.write(settranslationy, parsedouble, j, (findSerializer) obj);
                }
            };
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        _handleOddName _handleoddnameAudioAttributesCompatParcelizer = WriterBasedJsonGenerator.AudioAttributesCompatParcelizer(_handleoddname, (getAnswerMap) objOnPause);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return _handleoddnameAudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(setTranslationY settranslationy, parseDouble parsedouble, long j, findSerializer findserializer) {
        toMagicModuleMetaRepoModel.write(findserializer, "");
        findserializer.write();
        int iIconCompatParcelizer = settranslationy.IconCompatParcelizer();
        if (iIconCompatParcelizer <= 0 || iIconCompatParcelizer == Integer.MAX_VALUE) {
            return getShowPopup.INSTANCE;
        }
        if (((Number) parsedouble.getRemoteActionCompatParcelizer()).floatValue() <= BitmapDescriptorFactory.HUE_RED) {
            return getShowPopup.INSTANCE;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) findserializer.MediaBrowserCompatCustomActionResultReceiver());
        float f = iIconCompatParcelizer;
        float fAudioAttributesCompatParcelizer = findserializer.AudioAttributesCompatParcelizer(assignParameter.IconCompatParcelizer(3.0f));
        float f2 = getQues.read((fIntBitsToFloat / (fIntBitsToFloat + f)) * fIntBitsToFloat, findserializer.AudioAttributesCompatParcelizer(assignParameter.IconCompatParcelizer(24.0f)));
        long jAudioAttributesCompatParcelizer$default = switchToNext.AudioAttributesCompatParcelizer$default(j, switchToNext.RemoteActionCompatParcelizer(j) * ((Number) parsedouble.getRemoteActionCompatParcelizer()).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        long j2 = -1;
        long jAudioAttributesCompatParcelizer = getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (findserializer.MediaBrowserCompatCustomActionResultReceiver() >> 32)) - fAudioAttributesCompatParcelizer)) << 32) | (((long) Float.floatToRawIntBits((settranslationy.MediaBrowserCompatItemReceiver() / f) * (fIntBitsToFloat - f2))) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
        long j3 = -1;
        long jWrite = calloc.write((((j3 - ((j3 >> 63) << 32)) | (((long) 0) << 32)) & ((long) Float.floatToRawIntBits(f2))) | (Float.floatToRawIntBits(fAudioAttributesCompatParcelizer) << 32));
        float f3 = fAudioAttributesCompatParcelizer / 2.0f;
        long j4 = -1;
        findSetterInfo.RemoteActionCompatParcelizer$default(findserializer, jAudioAttributesCompatParcelizer$default, jAudioAttributesCompatParcelizer, jWrite, TypeReference.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(f3)) & ((j4 - ((j4 >> 63) << 32)) | (((long) 0) << 32))) | (Float.floatToRawIntBits(f3) << 32)), null, BitmapDescriptorFactory.HUE_RED, null, 0, PsExtractor.VIDEO_STREAM_MASK, null);
        return getShowPopup.INSTANCE;
    }
}
