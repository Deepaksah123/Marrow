package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a_\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0083\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0018\u001aS\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u001a\u001aw\u0010\u0019\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u001b\u001a]\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0081\u0001\u0010\u001c\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u001d"}, d2 = {"Card", "", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/CardColors;", "elevation", "Landroidx/compose/material3/CardElevation;", "border", "Landroidx/compose/foundation/BorderStroke;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "onClick", "Lkotlin/Function0;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ElevatedCard", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OutlinedCard", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class writeRawValue {
    public static final void read(_handleOddName _handleoddname, findAndAddVirtualProperties findandaddvirtualproperties, writeObjectId writeobjectid, writeObjectRef writeobjectref, setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui, final getModuleData<? super DrawerLayoutLayoutParams, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmoduledata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        findAndAddVirtualProperties findandaddvirtualproperties2;
        writeObjectId writeobjectid2;
        writeObjectRef writeobjectref2;
        setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui2;
        _handleOddName.Companion companion;
        findAndAddVirtualProperties findandaddvirtualpropertiesAudioAttributesCompatParcelizer;
        final writeObjectRef writeobjectref3;
        final setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui3;
        writeObjectId writeobjectid3;
        writeObjectRef writeobjectrefIconCompatParcelizer;
        setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui4;
        int i4;
        writeObjectRef writeobjectref4;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1359693790);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            _handleoddname2 = _handleoddname;
        } else if ((i & 6) == 0) {
            _handleoddname2 = _handleoddname;
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname2) ? 4 : 2) | i;
        } else {
            _handleoddname2 = _handleoddname;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                findandaddvirtualproperties2 = findandaddvirtualproperties;
                int i6 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(findandaddvirtualproperties2) ? 32 : 16;
                i3 |= i6;
            } else {
                findandaddvirtualproperties2 = findandaddvirtualproperties;
            }
            i3 |= i6;
        } else {
            findandaddvirtualproperties2 = findandaddvirtualproperties;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            if ((i2 & 4) == 0) {
                writeobjectid2 = writeobjectid;
                int i7 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(writeobjectid2) ? 256 : 128;
                i3 |= i7;
            } else {
                writeobjectid2 = writeobjectid;
            }
            i3 |= i7;
        } else {
            writeobjectid2 = writeobjectid;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                writeobjectref2 = writeobjectref;
                int i8 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(writeobjectref2) ? 2048 : 1024;
                i3 |= i8;
            } else {
                writeobjectref2 = writeobjectref;
            }
            i3 |= i8;
        } else {
            writeobjectref2 = writeobjectref;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= CpioConstants.C_ISBLK;
            setuncaughtexceptionhandlerui2 = setuncaughtexceptionhandlerui;
        } else {
            setuncaughtexceptionhandlerui2 = setuncaughtexceptionhandlerui;
            if ((i & CpioConstants.C_ISBLK) == 0) {
                i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(setuncaughtexceptionhandlerui2) ? 16384 : 8192;
            }
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getmoduledata) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((74899 & i3) != 74898, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepare();
            if ((i & 1) != 0 && !_handleunrecognizedcharacterescapeWrite.onFastForward()) {
                _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                companion = _handleoddname2;
                findandaddvirtualpropertiesAudioAttributesCompatParcelizer = findandaddvirtualproperties2;
                writeobjectid3 = writeobjectid2;
                setuncaughtexceptionhandlerui4 = setuncaughtexceptionhandlerui2;
                i4 = i3;
                writeobjectref4 = writeobjectref2;
            } else {
                companion = i5 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
                if ((i2 & 2) != 0) {
                    findandaddvirtualpropertiesAudioAttributesCompatParcelizer = writeObject.IconCompatParcelizer.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 6);
                    i3 &= -113;
                } else {
                    findandaddvirtualpropertiesAudioAttributesCompatParcelizer = findandaddvirtualproperties2;
                }
                if ((i2 & 4) != 0) {
                    writeobjectid3 = writeObject.IconCompatParcelizer.read(_handleunrecognizedcharacterescapeWrite, 6);
                    i3 &= -897;
                } else {
                    writeobjectid3 = writeobjectid2;
                }
                if ((i2 & 8) != 0) {
                    writeobjectrefIconCompatParcelizer = writeObject.IconCompatParcelizer.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, _handleunrecognizedcharacterescapeWrite, 1572864, 63);
                    i3 &= -7169;
                } else {
                    writeobjectrefIconCompatParcelizer = writeobjectref2;
                }
                setuncaughtexceptionhandlerui4 = i9 != 0 ? null : setuncaughtexceptionhandlerui;
                writeObjectRef writeobjectref5 = writeobjectrefIconCompatParcelizer;
                i4 = i3;
                writeobjectref4 = writeobjectref5;
            }
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1359693790, i4, -1, "androidx.compose.material3.Card (Card.kt:86)");
            }
            writeObjectRef writeobjectref6 = writeobjectref4;
            JsonParserFeature.RemoteActionCompatParcelizer(companion, findandaddvirtualpropertiesAudioAttributesCompatParcelizer, writeobjectid3.read(true), writeobjectid3.write(true), BitmapDescriptorFactory.HUE_RED, writeobjectref4.RemoteActionCompatParcelizer(true, null, _handleunrecognizedcharacterescapeWrite, ((i4 >> 3) & 896) | 54).getRemoteActionCompatParcelizer().getRemoteActionCompatParcelizer(), setuncaughtexceptionhandlerui4, multiplyFft.AudioAttributesCompatParcelizer(-97109725, true, new AudioAttributesCompatParcelizer(getmoduledata), _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, (i4 & 14) | 12582912 | (i4 & 112) | (3670016 & (i4 << 6)), 16);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            writeobjectid2 = writeobjectid3;
            setuncaughtexceptionhandlerui3 = setuncaughtexceptionhandlerui4;
            writeobjectref3 = writeobjectref6;
        } else {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
            companion = _handleoddname2;
            findandaddvirtualpropertiesAudioAttributesCompatParcelizer = findandaddvirtualproperties2;
            writeobjectref3 = writeobjectref2;
            setuncaughtexceptionhandlerui3 = setuncaughtexceptionhandlerui;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname3 = companion;
            final findAndAddVirtualProperties findandaddvirtualproperties3 = findandaddvirtualpropertiesAudioAttributesCompatParcelizer;
            final writeObjectId writeobjectid4 = writeobjectid2;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.writeRaw
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return writeRawValue.AudioAttributesCompatParcelizer(_handleoddname3, findandaddvirtualproperties3, writeobjectid4, writeobjectref3, setuncaughtexceptionhandlerui3, getmoduledata, i, i2, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ getModuleData<DrawerLayoutLayoutParams, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> RemoteActionCompatParcelizer;

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
                return;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-97109725, i, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:95)");
            }
            getModuleData<DrawerLayoutLayoutParams, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> getmoduledata = this.RemoteActionCompatParcelizer;
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape, 0);
            int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 0);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, companion);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getmoduledata.AudioAttributesCompatParcelizer(DrawerLayoutSavedState.INSTANCE, _handleunrecognizedcharacterescape, 6);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(getModuleData<? super DrawerLayoutLayoutParams, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmoduledata) {
            this.RemoteActionCompatParcelizer = getmoduledata;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void read(final kotlin.getCreatedOnDateMs<kotlin.getShowPopup> r30, kotlin._handleOddName r31, boolean r32, kotlin.findAndAddVirtualProperties r33, kotlin.writeObjectId r34, kotlin.writeObjectRef r35, kotlin.setUncaughtExceptionHandlerui r36, kotlin.hashCode r37, final kotlin.getModuleData<? super kotlin.DrawerLayoutLayoutParams, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r38, kotlin._handleUnrecognizedCharacterEscape r39, final int r40, final int r41) {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeRawValue.read(o.getCreatedOnDateMs, o._handleOddName, boolean, o.findAndAddVirtualProperties, o.writeObjectId, o.writeObjectRef, o.setUncaughtExceptionHandlerui, o.hashCode, o.getModuleData, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ getModuleData<DrawerLayoutLayoutParams, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> write;

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
                return;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1347531112, i, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:159)");
            }
            getModuleData<DrawerLayoutLayoutParams, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> getmoduledata = this.write;
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape, 0);
            int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 0);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, companion);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getmoduledata.AudioAttributesCompatParcelizer(DrawerLayoutSavedState.INSTANCE, _handleunrecognizedcharacterescape, 6);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(getModuleData<? super DrawerLayoutLayoutParams, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmoduledata) {
            this.write = getmoduledata;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_handleOddName _handleoddname, findAndAddVirtualProperties findandaddvirtualproperties, writeObjectId writeobjectid, writeObjectRef writeobjectref, setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui, getModuleData getmoduledata, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        read(_handleoddname, findandaddvirtualproperties, writeobjectid, writeobjectref, setuncaughtexceptionhandlerui, getmoduledata, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getCreatedOnDateMs getcreatedondatems, _handleOddName _handleoddname, boolean z, findAndAddVirtualProperties findandaddvirtualproperties, writeObjectId writeobjectid, writeObjectRef writeobjectref, setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui, hashCode hashcode, getModuleData getmoduledata, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        read(getcreatedondatems, _handleoddname, z, findandaddvirtualproperties, writeobjectid, writeobjectref, setuncaughtexceptionhandlerui, hashcode, getmoduledata, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
